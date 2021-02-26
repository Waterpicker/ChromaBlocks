package org.waterpicker.chromablocks.datagen;

public class TexturedModel {
//   public static final TexturedModel.Provider CUBE;
//   public static final TexturedModel.Provider COLUMN;
//   public static final TexturedModel.Provider COLUMN_HORIZONTAL;
//   public static final TexturedModel.Provider CUBE_TOP_BOTTOM;
//   public static final TexturedModel.Provider CUBE_TOP;
//   public static final TexturedModel.Provider ORIENTABLE_ONLY_TOP;
//   public static final TexturedModel.Provider ORIENTABLE;
//   public static final TexturedModel.Provider PARTICLE_ONLY;
//   public static final TexturedModel.Provider COLUMN_ALT;
//   public static final TexturedModel.Provider COLUMN_HORIZONTAL_ALT;
//   public static final TexturedModel.Provider TOP_BOTTOM_WITH_WALL;
//   public static final TexturedModel.Provider COLUMN_WITH_WALL;
//   private final TextureMapping mapping;
//   private final ModelTemplate template;
//
//   private TexturedModel(TextureMapping textureMapping, ModelTemplate modelTemplate) {
//      this.mapping = textureMapping;
//      this.template = modelTemplate;
//   }
//
//   public ModelTemplate getTemplate() {
//      return this.template;
//   }
//
//   public TextureMapping getMapping() {
//      return this.mapping;
//   }
//
//   public TexturedModel updateTextures(Consumer<TextureMapping> consumer) {
//      consumer.accept(this.mapping);
//      return this;
//   }
//
//   public ResourceLocation create(Block block, BiConsumer<ResourceLocation, Supplier<JsonElement>> biConsumer) {
//      return this.template.create(block, this.mapping, biConsumer);
//   }
//
//   public ResourceLocation createWithSuffix(Block block, String string, BiConsumer<ResourceLocation, Supplier<JsonElement>> biConsumer) {
//      return this.template.createWithSuffix(block, string, this.mapping, biConsumer);
//   }
//
//   private static TexturedModel.Provider createDefault(Function<Block, TextureMapping> function, ModelTemplate modelTemplate) {
//      return (block) -> {
//         return new TexturedModel((TextureMapping)function.apply(block), modelTemplate);
//      };
//   }
//
//   public static TexturedModel createAllSame(ResourceLocation resourceLocation) {
//      return new TexturedModel(TextureMapping.cube(resourceLocation), ModelTemplates.CUBE_ALL);
//   }
//
//   static {
//      CUBE = createDefault(TextureMapping::cube, ModelTemplates.CUBE_ALL);
//      COLUMN = createDefault(TextureMapping::column, ModelTemplates.CUBE_COLUMN);
//      COLUMN_HORIZONTAL = createDefault(TextureMapping::column, ModelTemplates.CUBE_COLUMN_HORIZONTAL);
//      CUBE_TOP_BOTTOM = createDefault(TextureMapping::cubeBottomTop, ModelTemplates.CUBE_BOTTOM_TOP);
//      CUBE_TOP = createDefault(TextureMapping::cubeTop, ModelTemplates.CUBE_TOP);
//      ORIENTABLE_ONLY_TOP = createDefault(TextureMapping::orientableCubeOnlyTop, ModelTemplates.CUBE_ORIENTABLE);
//      ORIENTABLE = createDefault(TextureMapping::orientableCube, ModelTemplates.CUBE_ORIENTABLE_TOP_BOTTOM);
//      PARTICLE_ONLY = createDefault(TextureMapping::particle, ModelTemplates.PARTICLE_ONLY);
//      COLUMN_ALT = createDefault(TextureMapping::logColumn, ModelTemplates.CUBE_COLUMN);
//      COLUMN_HORIZONTAL_ALT = createDefault(TextureMapping::logColumn, ModelTemplates.CUBE_COLUMN_HORIZONTAL);
//      TOP_BOTTOM_WITH_WALL = createDefault(TextureMapping::cubeBottomTopWithWall, ModelTemplates.CUBE_BOTTOM_TOP);
//      COLUMN_WITH_WALL = createDefault(TextureMapping::columnWithWall, ModelTemplates.CUBE_COLUMN);
//   }
//
//   @FunctionalInterface
//   public interface Provider {
//      TexturedModel get(Block block);
//
//      default ResourceLocation create(Block block, BiConsumer<ResourceLocation, Supplier<JsonElement>> biConsumer) {
//         return this.get(block).create(block, biConsumer);
//      }
//
//      default ResourceLocation createWithSuffix(Block block, String string, BiConsumer<ResourceLocation, Supplier<JsonElement>> biConsumer) {
//         return this.get(block).createWithSuffix(block, string, biConsumer);
//      }
//
//      default TexturedModel.Provider updateTexture(Consumer<TextureMapping> consumer) {
//         return (block) -> {
//            return this.get(block).updateTextures(consumer);
//         };
//      }
//   }
}
