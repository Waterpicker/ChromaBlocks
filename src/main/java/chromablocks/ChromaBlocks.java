package chromablocks;

import chromablocks.block.ModBlocks;
import chromablocks.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static chromablocks.ChromaBlocks.MODID;

@Mod(modid = MODID, name = "ChromaBlocks", version = "1.0-SNAPSHOT")
public class ChromaBlocks {
    public static final String MODID = "chromablocks";
    @Mod.EventHandler
    public void onPreInitialization(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(ModBlocks.class);
        MinecraftForge.EVENT_BUS.register(ModItems.class);
    }
}
