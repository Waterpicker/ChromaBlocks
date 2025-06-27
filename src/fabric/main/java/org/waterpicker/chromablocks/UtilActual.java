package org.waterpicker.chromablocks;

import com.mojang.serialization.Lifecycle;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.msrandom.multiplatform.annotations.Actual;

import java.util.Arrays;
import java.util.function.Supplier;

public class UtilActual {
    @Actual
    public static BlockBehaviour.Properties chromaProperties(MaterialColor color) {
        return FabricBlockSettings.of(Material.METAL, color).strength(5.0F, 6.0F).lightLevel(value -> 15).breakByTool(FabricToolTags.PICKAXES, 1);
    }

    @Actual
    public static Tag<Item> createTag() {
        return TagRegistry.item(new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_blocks"));
    }

    @Actual
    public static Supplier<Block> registerBlock(String id, Supplier<Block> block) {
        return () -> Registry.BLOCK.register(ResourceKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(ChromaBlocks.MOD_ID, id)), block.get(), Lifecycle.stable());
    }

    @Actual
    public static void registerItem(String id, Supplier<Item> item) {
        Registry.ITEM.register(ResourceKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(ChromaBlocks.MOD_ID, id)), item.get(), Lifecycle.stable());
    }

    @Actual
    public static void registerItemColors(ItemColor provider, Supplier<Item>... items) {
        ColorProviderRegistry.ITEM.register(provider, Arrays.stream(items).map(a -> a.get()).map(a -> a.asItem()).toArray(Item[]::new));
    }

    @Actual
    public static void registerBlockColors(BlockColor provider, Supplier<Block>... blocks) {
        ColorProviderRegistry.BLOCK.register(provider, Arrays.stream(blocks).map(a -> a.get()).toArray(Block[]::new));
    }
}
