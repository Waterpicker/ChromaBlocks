package org.waterpicker.chromablocks.datagen;

public class BlockModelGenerators {
//   private final Consumer<VariantsBlockStateSupplier> blockStateOutput;
//   private final BiConsumer<Identifier, Supplier<JsonElement>> modelOutput;
//   private final Consumer<Item> skippedAutoModelsOutput;
//
//   public BlockModelGenerators(Consumer<VariantsBlockStateSupplier> consumer, BiConsumer<Identifier, Supplier<JsonElement>> biConsumer, Consumer<Item> consumer2) {
//      this.blockStateOutput = consumer;
//      this.modelOutput = biConsumer;
//      this.skippedAutoModelsOutput = consumer2;
//   }
//
//   private void skipAutoItemBlock(Block block) {
//      this.skippedAutoModelsOutput.accept(block.asItem());
//   }
//
//   private void delegateItemModel(Block block, Identifier resourceLocation) {
//      this.modelOutput.accept(ModelLocationUtils.getModelLocation(block.asItem()), new DelegatedModel(resourceLocation));
//   }
//
//   private void createSimpleFlatItemModel(Item item) {
//      ModelTemplates.FLAT_ITEM.upload(ModelLocationUtils.getModelLocation(item), TextureMapping.layer0(item), this.modelOutput);
//   }
//
//
//   private static PropertyDispatch createHorizontalFacingDispatchAlt() {
//      return PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING).select(Direction.SOUTH, Variant.variant()).select(Direction.WEST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.NORTH, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(Direction.EAST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270));
//   }
//
//
//   private static PropertyDispatch createBooleanModelDispatch(BooleanProperty booleanProperty, Identifier resourceLocation, Identifier resourceLocation2) {
//      return PropertyDispatch.property(booleanProperty).select(true, Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(false, Variant.variant().with(VariantProperties.MODEL, resourceLocation2));
//   }
//
//   private static BlockStateModelGenerator createButton(Block block, Identifier resourceLocation, Identifier resourceLocation2) {
//      return MultiVariantGenerator.multiVariant(block).with(PropertyDispatch.property(BlockStateProperties.POWERED).select(false, Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2))).with(PropertyDispatch.properties(BlockStateProperties.ATTACH_FACE, BlockStateProperties.HORIZONTAL_FACING).select(AttachFace.FLOOR, Direction.EAST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(AttachFace.FLOOR, Direction.WEST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).select(AttachFace.FLOOR, Direction.SOUTH, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(AttachFace.FLOOR, Direction.NORTH, Variant.variant()).select(AttachFace.WALL, Direction.EAST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(AttachFace.WALL, Direction.WEST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(AttachFace.WALL, Direction.SOUTH, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(AttachFace.WALL, Direction.NORTH, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(AttachFace.CEILING, Direction.EAST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180)).select(AttachFace.CEILING, Direction.WEST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180)).select(AttachFace.CEILING, Direction.SOUTH, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R180)).select(AttachFace.CEILING, Direction.NORTH, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180)));
//   }
//
//   private static BlockStateModelGenerator createFence(Block block, Identifier resourceLocation, Identifier resourceLocation2) {
//      return MultipartBlockStateSupplier.create(block).with(BlockStateVariant.create().put(VariantSettings.MODEL, resourceLocation)).with(Condition.condition().term(BlockStateProperties.NORTH, true), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.EAST, true), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.SOUTH, true), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.WEST, true), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true));
//   }
//
//   private static BlockStateModelGenerator createWall(Block block, Identifier resourceLocation, Identifier resourceLocation2, Identifier resourceLocation3) {
//      return MultiPartGenerator.multiPart(block).with(Condition.condition().term(BlockStateProperties.UP, true), Variant.variant().with(VariantProperties.MODEL, resourceLocation)).with(Condition.condition().term(BlockStateProperties.NORTH_WALL, WallSide.LOW), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.EAST_WALL, WallSide.LOW), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.SOUTH_WALL, WallSide.LOW), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.WEST_WALL, WallSide.LOW), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.NORTH_WALL, WallSide.TALL), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.EAST_WALL, WallSide.TALL), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.SOUTH_WALL, WallSide.TALL), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).with(Condition.condition().term(BlockStateProperties.WEST_WALL, WallSide.TALL), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true));
//   }
//
//   private static BlockStateModelGenerator createFenceGate(Block block, Identifier resourceLocation, Identifier resourceLocation2, Identifier resourceLocation3, Identifier resourceLocation4) {
//      return MultiVariantGenerator.multiVariant(block, Variant.variant().with(VariantProperties.UV_LOCK, true)).with(createHorizontalFacingDispatchAlt()).with(PropertyDispatch.properties(BlockStateProperties.IN_WALL, BlockStateProperties.OPEN).select(false, false, Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).select(true, false, Variant.variant().with(VariantProperties.MODEL, resourceLocation4)).select(false, true, Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(true, true, Variant.variant().with(VariantProperties.MODEL, resourceLocation3)));
//   }
//
//   private static BlockStateModelGenerator createStairs(Block block, Identifier resourceLocation, Identifier resourceLocation2, Identifier resourceLocation3) {
//      return MultiVariantGenerator.multiVariant(block).with(PropertyDispatch.properties(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.HALF, BlockStateProperties.STAIRS_SHAPE).select(Direction.EAST, Half.BOTTOM, StairsShape.STRAIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).select(Direction.WEST, Half.BOTTOM, StairsShape.STRAIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.BOTTOM, StairsShape.STRAIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.NORTH, Half.BOTTOM, StairsShape.STRAIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.BOTTOM, StairsShape.OUTER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3)).select(Direction.WEST, Half.BOTTOM, StairsShape.OUTER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.BOTTOM, StairsShape.OUTER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.NORTH, Half.BOTTOM, StairsShape.OUTER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.BOTTOM, StairsShape.OUTER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.WEST, Half.BOTTOM, StairsShape.OUTER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.BOTTOM, StairsShape.OUTER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3)).select(Direction.NORTH, Half.BOTTOM, StairsShape.OUTER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.BOTTOM, StairsShape.INNER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(Direction.WEST, Half.BOTTOM, StairsShape.INNER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.BOTTOM, StairsShape.INNER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.NORTH, Half.BOTTOM, StairsShape.INNER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.BOTTOM, StairsShape.INNER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.WEST, Half.BOTTOM, StairsShape.INNER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.BOTTOM, StairsShape.INNER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(Direction.NORTH, Half.BOTTOM, StairsShape.INNER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.TOP, StairsShape.STRAIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.WEST, Half.TOP, StairsShape.STRAIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.TOP, StairsShape.STRAIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.NORTH, Half.TOP, StairsShape.STRAIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.TOP, StairsShape.OUTER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.WEST, Half.TOP, StairsShape.OUTER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.TOP, StairsShape.OUTER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.NORTH, Half.TOP, StairsShape.OUTER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.TOP, StairsShape.OUTER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.WEST, Half.TOP, StairsShape.OUTER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.TOP, StairsShape.OUTER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.NORTH, Half.TOP, StairsShape.OUTER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.TOP, StairsShape.INNER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.WEST, Half.TOP, StairsShape.INNER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.TOP, StairsShape.INNER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.NORTH, Half.TOP, StairsShape.INNER_RIGHT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.EAST, Half.TOP, StairsShape.INNER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.WEST, Half.TOP, StairsShape.INNER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true)).select(Direction.SOUTH, Half.TOP, StairsShape.INNER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true)).select(Direction.NORTH, Half.TOP, StairsShape.INNER_LEFT, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true)));
//   }
//
//   private static MultiVariantGenerator createSimpleBlock(Block block, Identifier resourceLocation) {
//      return MultiVariantGenerator.multiVariant(block, Variant.variant().with(VariantProperties.MODEL, resourceLocation));
//   }
//
//   private static BlockStateModelGenerator createPressurePlate(Block block, Identifier resourceLocation, Identifier resourceLocation2) {
//      return MultiVariantGenerator.multiVariant(block).with(createBooleanModelDispatch(Properties.POWERED, resourceLocation2, resourceLocation));
//   }
//
//   private static VariantsBlockStateSupplier createSlab(Block block, Identifier resourceLocation, Identifier resourceLocation2, Identifier resourceLocation3) {
//      return VariantsBlockStateSupplier.create(block).coordinate(BlockStateVariantMap.create(Properties.SLAB_TYPE).register(SlabType.BOTTOM, BlockStateVariant.create().put(VariantSettings.MODEL, resourceLocation)).register(SlabType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, resourceLocation2)).register(SlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, resourceLocation3)));
//   }
//
//   private BlockModelGenerators.BlockFamilyProvider family(Block block, TexturedModel.Provider provider) {
//      TexturedModel texturedModel = provider.get(block);
//      return (new BlockModelGenerators.BlockFamilyProvider(texturedModel.getMapping()).fullBlock(block, texturedModel.getTemplate()));
//   }
//
//   private BlockModelGenerators.BlockFamilyProvider family(Block block) {
//      return this.family(block, TexturedModel.CUBE);
//   }
//
//   public void run() {
////
////      for (int i = 0; i < ChromaBlocks.blocks.size(); i++) {
////         this.family(ChromaBlocks.blocks.get(i))
////                 .button(ChromaBlocks.buttons.get(i))
////                 .wall(ChromaBlocks.walls.get(i))
////                 .slab(ChromaBlocks.slabs.get(i))
////                 .stairs(ChromaBlocks.stairsList.get(i))
////                 .door(ChromaBlocks.doors.get(i))
////                 .trapdoor(ChromaBlocks.trapdoors.get(i));
////      }
//   }
//
//   private static PropertyDispatch.C4<Direction, DoubleBlockHalf, DoorHingeSide, Boolean> configureDoorHalf(PropertyDispatch.C4<Direction, DoubleBlockHalf, DoorHingeSide, Boolean> c4, DoubleBlockHalf doubleBlockHalf, Identifier resourceLocation, Identifier resourceLocation2) {
//      return c4.select(Direction.EAST, doubleBlockHalf, DoorHingeSide.LEFT, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(Direction.SOUTH, doubleBlockHalf, DoorHingeSide.LEFT, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.WEST, doubleBlockHalf, DoorHingeSide.LEFT, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(Direction.NORTH, doubleBlockHalf, DoorHingeSide.LEFT, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).select(Direction.EAST, doubleBlockHalf, DoorHingeSide.RIGHT, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).select(Direction.SOUTH, doubleBlockHalf, DoorHingeSide.RIGHT, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.WEST, doubleBlockHalf, DoorHingeSide.RIGHT, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(Direction.NORTH, doubleBlockHalf, DoorHingeSide.RIGHT, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).select(Direction.EAST, doubleBlockHalf, DoorHingeSide.LEFT, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.SOUTH, doubleBlockHalf, DoorHingeSide.LEFT, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(Direction.WEST, doubleBlockHalf, DoorHingeSide.LEFT, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).select(Direction.NORTH, doubleBlockHalf, DoorHingeSide.LEFT, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).select(Direction.EAST, doubleBlockHalf, DoorHingeSide.RIGHT, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).select(Direction.SOUTH, doubleBlockHalf, DoorHingeSide.RIGHT, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(Direction.WEST, doubleBlockHalf, DoorHingeSide.RIGHT, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.NORTH, doubleBlockHalf, DoorHingeSide.RIGHT, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180));
//   }
//
//   private static BlockStateModelGenerator createDoor(Block block, Identifier resourceLocation, Identifier resourceLocation2, Identifier resourceLocation3, Identifier resourceLocation4) {
//      return MultiVariantGenerator.multiVariant(block).with(configureDoorHalf(configureDoorHalf(PropertyDispatch.properties(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.DOUBLE_BLOCK_HALF, BlockStateProperties.DOOR_HINGE, BlockStateProperties.OPEN), DoubleBlockHalf.LOWER, resourceLocation, resourceLocation2), DoubleBlockHalf.UPPER, resourceLocation3, resourceLocation4));
//   }
//
//   private static BlockStateModelGenerator createTrapdoor(Block block, Identifier resourceLocation, Identifier resourceLocation2, Identifier resourceLocation3) {
//      return MultiVariantGenerator.multiVariant(block).with(PropertyDispatch.properties(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.HALF, BlockStateProperties.OPEN).select(Direction.NORTH, Half.BOTTOM, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).select(Direction.SOUTH, Half.BOTTOM, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).select(Direction.EAST, Half.BOTTOM, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).select(Direction.WEST, Half.BOTTOM, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).select(Direction.NORTH, Half.TOP, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(Direction.SOUTH, Half.TOP, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(Direction.EAST, Half.TOP, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(Direction.WEST, Half.TOP, false, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation)).select(Direction.NORTH, Half.BOTTOM, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation3)).select(Direction.SOUTH, Half.BOTTOM, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(Direction.EAST, Half.BOTTOM, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.WEST, Half.BOTTOM, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).select(Direction.NORTH, Half.TOP, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation3)).select(Direction.SOUTH, Half.TOP, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(Direction.EAST, Half.TOP, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.WEST, Half.TOP, true, (Variant)Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)));
//   }
//
//   class BlockFamilyProvider {
//      private final TextureMapping mapping;
//      @Nullable
//      private Identifier fullBlock;
//
//      public BlockFamilyProvider(TextureMapping textureMapping) {
//         this.mapping = textureMapping;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider fullBlock(Block block, ModelTemplate modelTemplate) {
//         this.fullBlock = modelTemplate.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, this.fullBlock));
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider fullBlock(Function<TextureMapping, Identifier> function) {
//         this.fullBlock = function.apply(this.mapping);
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider button(Block block) {
//         Identifier resourceLocation = ModelTemplates.BUTTON.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation2 = ModelTemplates.BUTTON_PRESSED.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createButton(block, resourceLocation, resourceLocation2));
//         Identifier resourceLocation3 = ModelTemplates.BUTTON_INVENTORY.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.delegateItemModel(block, resourceLocation3);
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider wall(Block block) {
//         Identifier resourceLocation = ModelTemplates.WALL_POST.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation2 = ModelTemplates.WALL_LOW_SIDE.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation3 = ModelTemplates.WALL_TALL_SIDE.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createWall(block, resourceLocation, resourceLocation2, resourceLocation3));
//         Identifier resourceLocation4 = ModelTemplates.WALL_INVENTORY.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.delegateItemModel(block, resourceLocation4);
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider fence(Block block) {
//         Identifier resourceLocation = ModelTemplates.FENCE_POST.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation2 = ModelTemplates.FENCE_SIDE.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createFence(block, resourceLocation, resourceLocation2));
//         Identifier resourceLocation3 = ModelTemplates.FENCE_INVENTORY.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.delegateItemModel(block, resourceLocation3);
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider fenceGate(Block block) {
//         Identifier resourceLocation = ModelTemplates.FENCE_GATE_OPEN.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation2 = ModelTemplates.FENCE_GATE_CLOSED.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation3 = ModelTemplates.FENCE_GATE_WALL_OPEN.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation4 = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createFenceGate(block, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4));
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider pressurePlate(Block block) {
//         Identifier resourceLocation = ModelTemplates.PRESSURE_PLATE_UP.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation2 = ModelTemplates.PRESSURE_PLATE_DOWN.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createPressurePlate(block, resourceLocation, resourceLocation2));
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider sign(Block block, Block block2) {
//         Identifier resourceLocation = ModelTemplates.PARTICLE_ONLY.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resourceLocation));
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block2, resourceLocation));
//         BlockModelGenerators.this.createSimpleFlatItemModel(block.asItem());
//         BlockModelGenerators.this.skipAutoItemBlock(block2);
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider slab(Block block) {
//         if (this.fullBlock == null) {
//            throw new IllegalStateException("Full block not generated yet");
//         } else {
//            Identifier resourceLocation = ModelTemplates.SLAB_BOTTOM.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//            Identifier resourceLocation2 = ModelTemplates.SLAB_TOP.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//            BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createSlab(block, resourceLocation, resourceLocation2, this.fullBlock));
//            return this;
//         }
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider stairs(Block block) {
//         Identifier resourceLocation = ModelTemplates.STAIRS_INNER.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation2 = ModelTemplates.STAIRS_STRAIGHT.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation3 = ModelTemplates.STAIRS_OUTER.create(block, this.mapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(BlockModelGenerators.createStairs(block, resourceLocation, resourceLocation2, resourceLocation3));
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider trapdoor(Block block) {
//         TextureMapping textureMapping = this.mapping;
//         Identifier resourceLocation = ModelTemplates.TRAPDOOR_TOP.create(block, textureMapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation2 = ModelTemplates.TRAPDOOR_BOTTOM.create(block, textureMapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation3 = ModelTemplates.TRAPDOOR_OPEN.create(block, textureMapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.blockStateOutput.accept(createTrapdoor(block, resourceLocation, resourceLocation2, resourceLocation3));
//         BlockModelGenerators.this.delegateItemModel(block, resourceLocation2);
//         return this;
//      }
//
//      public BlockModelGenerators.BlockFamilyProvider door(Block block) {
//         TextureMapping textureMapping = this.mapping;
//         Identifier resourceLocation = ModelTemplates.DOOR_BOTTOM.create(block, textureMapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation2 = ModelTemplates.DOOR_BOTTOM_HINGE.create(block, textureMapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation3 = ModelTemplates.DOOR_TOP.create(block, textureMapping, BlockModelGenerators.this.modelOutput);
//         Identifier resourceLocation4 = ModelTemplates.DOOR_TOP_HINGE.create(block, textureMapping, BlockModelGenerators.this.modelOutput);
//         BlockModelGenerators.this.createSimpleFlatItemModel(block.asItem());
//         BlockModelGenerators.this.blockStateOutput.accept(createDoor(block, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4));
//         return this;
//      }
//   }
}
