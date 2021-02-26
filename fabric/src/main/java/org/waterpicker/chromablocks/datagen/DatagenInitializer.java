package org.waterpicker.chromablocks.datagen;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class DatagenInitializer implements PreLaunchEntrypoint {

	// How to run the data generator:-
	// - Duplicate the Minecraft Client run config
	// - Change the module from DimensionalDoors.main to DimensionalDoors.datagen
	// - Profit
	@Override
	public void onPreLaunch() {

	}
//		try {
//			FabricLoader.getInstance().getEntrypointContainers("main", ModInitializer.class).forEach(a -> a.getEntrypoint().onInitialize());
//
//			DataGeneratorHandler handler = DataGeneratorHandler.create(Paths.get("../generated/resource"));
////			ModelStateData stateData = handler.getModelStates();
//			LootTableData lootTableData = handler.getLootTables();
//			//(new BlockModelGenerators((argx) -> stateData.addBlockModel(argx.getBlock(), argx), stateData::addState, stateData::addHandheldItemModel)).run();
//
//			for (Group group : ChromaBlocks.groups) {
////				stateData.addSimpleBlockItemModel(group.getBlock());
////				stateData.addSimpleBlockItemModel(group.getStairs());
////				stateData.addSimpleBlockItemModel(group.getSlab());
////				stateData.addSimpleBlockItemModel(group.getWall());
////				stateData.addSimpleBlockItemModel(group.getButton());
////				stateData.addSimpleBlockItemModel(group.getStairs());
////				stateData.addSimpleBlockItemModel(group.getDoor());
////				stateData.addSimpleBlockItemModel(group.getTrapDoor());
//
//				handler.getTags().item(ChromaBlocks.CHROMA_BLOCKS).append(group.getBlock());
//				handler.getTags().block(BlockTags.DOORS).append(group.getDoor());
//				handler.getTags().block(BlockTags.STAIRS).append(group.getStairs());
//				handler.getTags().block(BlockTags.SLABS).append(group.getSlab());
//				handler.getTags().block(BlockTags.WALLS).append(group.getWall());
//				handler.getTags().block(BlockTags.BUTTONS).append(group.getButton());
//				handler.getTags().block(BlockTags.TRAPDOORS).append(group.getTrapDoor());
//
//				lootTableData.registerBlockDropSelf(group.getBlock());
//				lootTableData.registerBlockDropSelf(group.getSlab());
//				lootTableData.registerBlockDropSelf(group.getWall());
//				lootTableData.registerBlockDropSelf(group.getButton());
//				lootTableData.registerBlockDropSelf(group.getStairs());
//				lootTableData.registerBlockDropSelf(group.getDoor());
//				lootTableData.registerBlockDropSelf(group.getTrapDoor());
//
//				ShapelessRecipeBuilder
//						.shapeless(group.getBlock(), 8)
//						.requires(Blocks.IRON_BLOCK)
//						.requires(Items.REDSTONE)
//						.requires(Items.GLOWSTONE_DUST)
//						.requires(group.getItem())
//						.group("chroma_block_iron_block")
//						.unlockedBy("has_iron_block", has(Blocks.IRON_BLOCK))
//						.save(handler.getRecipes(), new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_" + group.getItem().getDyeColor().getName() + "_iron_block"));
//				ShapedRecipeBuilder
//						.shaped(group.getBlock(), 8)
//						.define('X', ChromaBlocks.CHROMA_BLOCKS)
//						.define('O', group.getItem())
//						.pattern("XXX")
//						.pattern("XOX")
//						.pattern("XXX")
//						.group("chroma_block_dye")
//						.unlockedBy("has_chroma_block", has(ChromaBlocks.CHROMA_BLOCKS))
//						.save(handler.getRecipes(), new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_" + group.getItem().getDyeColor().getName() + "_dye"));
//				ShapedRecipeBuilder
//						.shaped(group.getSlab(), 6).define('X', group.getBlock())
//						.pattern("XXX").group("chroma_slab")
//						.unlockedBy("has_chroma_block", has(ChromaBlocks.CHROMA_BLOCKS))
//						.save(handler.getRecipes()::accept, new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_" + group.getItem().getDyeColor().getName() + "slab"));
//				ShapedRecipeBuilder
//						.shaped(group.getWall(), 4)
//						.define('X', group.getBlock())
//						.pattern("XXX")
//						.pattern("XXX")
//						.group("chroma_wall")
//						.unlockedBy("has_chroma_block", has(ChromaBlocks.CHROMA_BLOCKS))
//						.save(handler.getRecipes()::accept, new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_" + group.getItem().getDyeColor().getName() + "_wall"));
//				ShapedRecipeBuilder
//						.shaped(group.getButton(), 4)
//						.define('X', group.getBlock())
//						.pattern("XX")
//						.group("chroma_slab")
//						.unlockedBy("has_chroma_block", has(ChromaBlocks.CHROMA_BLOCKS))
//						.save(handler.getRecipes()::accept, new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_" + group.getItem().getDyeColor().getName() + "_slab"));
//				ShapedRecipeBuilder
//						.shaped(group.getStairs(), 4)
//						.define('X', group.getBlock())
//						.pattern("X  ")
//						.pattern("XX ")
//						.pattern("XXX")
//						.group("chroma_stairs")
//						.unlockedBy("has_chroma_block", has(ChromaBlocks.CHROMA_BLOCKS))
//						.save(handler.getRecipes()::accept, new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_" + group.getItem().getDyeColor().getName() + "_stairs"));
//				ShapedRecipeBuilder
//						.shaped(group.getDoor(), 1)
//						.define('X', group.getBlock())
//						.pattern("XX")
//						.pattern("XX")
//						.pattern("XX")
//						.group("chroma_door")
//						.unlockedBy("has_chroma_block", has(ChromaBlocks.CHROMA_BLOCKS))
//						.save(handler.getRecipes()::accept, new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_" + group.getItem().getDyeColor().getName() + "_door"));
//				ShapedRecipeBuilder
//						.shaped(group.getTrapDoor(), 4)
//						.define('X', group.getBlock())
//						.pattern("XX")
//						.pattern("XX")
//						.group("chroma_trap_door")
//						.unlockedBy("has_chroma_block", has(ChromaBlocks.CHROMA_BLOCKS))
//						.save(handler.getRecipes()::accept, new ResourceLocation(ChromaBlocks.MOD_ID, "chroma_" + group.getItem().getDyeColor().getName() + "_trap_door"));
//			}
//
//			handler.run();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.exit(0);
//	}
//
//	private static EnterBlockTrigger.TriggerInstance insideOf(Block block) {
//		return new EnterBlockTrigger.TriggerInstance(EntityPredicate.Composite.ANY, block, StatePropertiesPredicate.ANY);
//	}
//
//	private static InventoryChangeTrigger.TriggerInstance has(ItemLike itemLike) {
//		return inventoryTrigger(ItemPredicate.Builder.item().of(itemLike).build());
//	}
//
//	private static InventoryChangeTrigger.TriggerInstance has(Tag<Item> tag) {
//		return inventoryTrigger(ItemPredicate.Builder.item().of(tag).build());
//	}
//
//	private static InventoryChangeTrigger.TriggerInstance inventoryTrigger(ItemPredicate... itemPredicates) {
//		return new InventoryChangeTrigger.TriggerInstance(EntityPredicate.Composite.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, itemPredicates);
//	}
}
