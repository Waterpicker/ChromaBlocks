package org.waterpicker.chromablocks.client;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.waterpicker.chromablocks.ChromaBlocks;
import org.waterpicker.chromablocks.block.ChromaBlock;
import org.waterpicker.chromablocks.block.ModBlocks;

import java.util.function.ToIntFunction;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = ChromaBlocks.MODID)
public class ModModelManager {
    public static final ModModelManager INSTANCE = new ModModelManager();

    private ModModelManager() {
    }

    /**
     * Register this mod's {@link Block} models.
     *
     * @param event The event
     */
    @SubscribeEvent
    public static void registerAllModels(final ModelRegistryEvent event) {
        INSTANCE.registerBlockModels();
    }

    /**
     * A {@link StateMapperBase} used to create property strings.
     */
    private final StateMapperBase propertyStringMapper = new StateMapperBase() {
        @Override
        protected ModelResourceLocation getModelResourceLocation(final IBlockState state) {
            return new ModelResourceLocation("minecraft:air");
        }
    };

    /**
     * Register this mod's {@link Block} models.
     */
    private void registerBlockModels() {
        registerVariantBlockItemModels(
                ModBlocks.CHROMA.getDefaultState(), ChromaBlock.COLOR, EnumDyeColor::getMetadata
        );
    }

    /**
     * Register a model for a metadata value of the {@link Block}'s {@link Item}.
     * <p>
     * Uses the registry name as the domain/path and the {@link IBlockState} as the variant.
     *
     * @param state    The state to use as the variant
     * @param metadata The item metadata to register the model for
     */
    private void registerBlockItemModelForMeta(final IBlockState state, final int metadata) {
        final Item item = Item.getItemFromBlock(state.getBlock());

        if (item != Items.AIR) {
            registerItemModelForMeta(item, metadata, propertyStringMapper.getPropertyString(state.getProperties()));
        }
    }

    /**
     * Register a model for each metadata value of the {@link Block}'s {@link Item} corresponding to the values of an {@link IProperty}.
     * <p>
     * For each value:
     * <li>The domain/path is the registry name</li>
     * <li>The variant is {@code baseState} with the {@link IProperty} set to the value</li>
     * <p>
     * The {@code getMeta} function is used to get the metadata of each value.
     *
     * @param baseState The base state to use for the variant
     * @param property  The property whose values should be used
     * @param getMeta   A function to get the metadata of each value
     * @param <T>       The value type
     */
    private <T extends Comparable<T>> void registerVariantBlockItemModels(final IBlockState baseState, final IProperty<T> property, final ToIntFunction<T> getMeta) {
        property.getAllowedValues().forEach(value -> registerBlockItemModelForMeta(baseState.withProperty(property, value), getMeta.applyAsInt(value)));
    }

    /**
     * Register a model for a metadata value an {@link Item}.
     * <p>
     * Uses the registry name as the domain/path and {@code variant} as the variant.
     *
     * @param item     The Item
     * @param metadata The metadata
     * @param variant  The variant
     */
    private void registerItemModelForMeta(final Item item, final int metadata, final String variant) {
        registerItemModelForMeta(item, metadata, new ModelResourceLocation(item.getRegistryName(), variant));
    }

    /**
     * Register a model for a metadata value of an {@link Item}.
     * <p>
     * Uses {@code modelResourceLocation} as the domain, path and variant.
     *
     * @param item                  The Item
     * @param metadata              The metadata
     * @param modelResourceLocation The full model location
     */
    private void registerItemModelForMeta(final Item item, final int metadata, final ModelResourceLocation modelResourceLocation) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, modelResourceLocation);
    }
}