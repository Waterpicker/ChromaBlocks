package org.waterpicker.chromablocks.datagen;

import java.util.Optional;

import net.minecraft.data.client.model.Model;
import net.minecraft.data.client.model.TextureKey;
import net.minecraft.util.Identifier;

public class ModelTemplates {
   public static final Model CUBE;
   public static final Model CUBE_DIRECTIONAL;
   public static final Model CUBE_ALL;
   public static final Model CUBE_COLUMN;
   public static final Model CUBE_COLUMN_HORIZONTAL;
   public static final Model CUBE_TOP;
   public static final Model CUBE_BOTTOM_TOP;
   public static final Model CUBE_ORIENTABLE;
   public static final Model CUBE_ORIENTABLE_TOP_BOTTOM;
   public static final Model CUBE_ORIENTABLE_VERTICAL;
   public static final Model BUTTON;
   public static final Model BUTTON_PRESSED;
   public static final Model BUTTON_INVENTORY;
   public static final Model DOOR_BOTTOM;
   public static final Model DOOR_BOTTOM_HINGE;
   public static final Model DOOR_TOP;
   public static final Model DOOR_TOP_HINGE;
   public static final Model FENCE_POST;
   public static final Model FENCE_SIDE;
   public static final Model FENCE_INVENTORY;
   public static final Model WALL_POST;
   public static final Model WALL_LOW_SIDE;
   public static final Model WALL_TALL_SIDE;
   public static final Model WALL_INVENTORY;
   public static final Model FENCE_GATE_CLOSED;
   public static final Model FENCE_GATE_OPEN;
   public static final Model FENCE_GATE_WALL_CLOSED;
   public static final Model FENCE_GATE_WALL_OPEN;
   public static final Model PRESSURE_PLATE_UP;
   public static final Model PRESSURE_PLATE_DOWN;
   public static final Model PARTICLE_ONLY;
   public static final Model SLAB_BOTTOM;
   public static final Model SLAB_TOP;
   public static final Model STAIRS_STRAIGHT;
   public static final Model STAIRS_INNER;
   public static final Model STAIRS_OUTER;
   public static final Model TRAPDOOR_TOP;
   public static final Model TRAPDOOR_BOTTOM;
   public static final Model TRAPDOOR_OPEN;
   public static final Model ORIENTABLE_TRAPDOOR_TOP;
   public static final Model ORIENTABLE_TRAPDOOR_BOTTOM;
   public static final Model ORIENTABLE_TRAPDOOR_OPEN;
   public static final Model SINGLE_FACE;
   public static final Model FLAT_ITEM;

   private static Model create(TextureKey... args) {
      return new Model(Optional.empty(), Optional.empty(), args);
   }

   private static Model create(String string, TextureKey... args) {
      return new Model(Optional.of(new Identifier("chromablocks", "block/template/" + string)), Optional.empty(), args);
   }

   private static Model create(String string, String string2, TextureKey... args) {
      return new Model(Optional.of(new Identifier("chromablocks", "block/template/" + string)), Optional.of(string2), args);
   }

   private static Model createItem(String string, TextureKey... TextureKeys) {
      return new Model(Optional.of(new Identifier("minecraft", "item/" + string)), Optional.empty(), TextureKeys);
   }

   static {
      CUBE = create("cube", TextureKey.PARTICLE, TextureKey.NORTH, TextureKey.SOUTH, TextureKey.EAST, TextureKey.WEST, TextureKey.UP, TextureKey.DOWN);
      CUBE_DIRECTIONAL = create("cube_directional", TextureKey.PARTICLE, TextureKey.NORTH, TextureKey.SOUTH, TextureKey.EAST, TextureKey.WEST, TextureKey.UP, TextureKey.DOWN);
      CUBE_ALL = create("cube_all", TextureKey.ALL);
      CUBE_COLUMN = create("cube_column", TextureKey.TEXTURE);
      CUBE_COLUMN_HORIZONTAL = create("cube_column_horizontal", "_horizontal", TextureKey.END, TextureKey.SIDE);
      CUBE_TOP = create("cube_top", TextureKey.TOP, TextureKey.SIDE);
      CUBE_BOTTOM_TOP = create("cube_bottom_top", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
      CUBE_ORIENTABLE = create("orientable", TextureKey.TOP, TextureKey.FRONT, TextureKey.SIDE);
      CUBE_ORIENTABLE_TOP_BOTTOM = create("orientable_with_bottom", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT);
      CUBE_ORIENTABLE_VERTICAL = create("orientable_vertical", "_vertical", TextureKey.FRONT, TextureKey.SIDE);
      BUTTON = create("button", TextureKey.TEXTURE);
      BUTTON_PRESSED = create("button_pressed", "_pressed", TextureKey.TEXTURE);
      BUTTON_INVENTORY = create("button_inventory", "_inventory", TextureKey.TEXTURE);
      DOOR_BOTTOM = create("door_bottom", "_bottom", TextureKey.TEXTURE);
      DOOR_BOTTOM_HINGE = create("door_bottom_rh", "_bottom_hinge", TextureKey.TEXTURE);
      DOOR_TOP = create("door_top", "_top", TextureKey.TEXTURE);
      DOOR_TOP_HINGE = create("door_top_rh", "_top_hinge", TextureKey.TEXTURE);
      FENCE_POST = create("fence_post", "_post", TextureKey.TEXTURE);
      FENCE_SIDE = create("fence_side", "_side", TextureKey.TEXTURE);
      FENCE_INVENTORY = create("fence_inventory", "_inventory", TextureKey.TEXTURE);
      WALL_POST = create("wall_post", "_post", TextureKey.WALL);
      WALL_LOW_SIDE = create("wall_side", "_side", TextureKey.WALL);
      WALL_TALL_SIDE = create("wall_side_tall", "_side_tall", TextureKey.WALL);
      WALL_INVENTORY = create("wall_inventory", "_inventory", TextureKey.WALL);
      FENCE_GATE_CLOSED = create("template_fence_gate", TextureKey.TEXTURE);
      FENCE_GATE_OPEN = create("template_fence_gate_open", "_open", TextureKey.TEXTURE);
      FENCE_GATE_WALL_CLOSED = create("template_fence_gate_wall", "_wall", TextureKey.TEXTURE);
      FENCE_GATE_WALL_OPEN = create("template_fence_gate_wall_open", "_wall_open", TextureKey.TEXTURE);
      PRESSURE_PLATE_UP = create("pressure_plate_up", TextureKey.TEXTURE);
      PRESSURE_PLATE_DOWN = create("pressure_plate_down", "_down", TextureKey.TEXTURE);
      PARTICLE_ONLY = create(TextureKey.PARTICLE);
      SLAB_BOTTOM = create("slab", TextureKey.BOTTOM, TextureKey.TEXTURE);
      SLAB_TOP = create("slab_top", "_top", TextureKey.TEXTURE);
      STAIRS_STRAIGHT = create("stairs", TextureKey.BOTTOM, TextureKey.TEXTURE);
      STAIRS_INNER = create("inner_stairs", "_inner", TextureKey.TEXTURE);
      STAIRS_OUTER = create("outer_stairs", "_outer", TextureKey.TEXTURE);
      TRAPDOOR_TOP = create("trapdoor_top", "_top", TextureKey.TEXTURE);
      TRAPDOOR_BOTTOM = create("trapdoor_bottom", "_bottom", TextureKey.TEXTURE);
      TRAPDOOR_OPEN = create("trapdoor_open", "_open", TextureKey.TEXTURE);
      ORIENTABLE_TRAPDOOR_TOP = create("orientable_trapdoor_top", "_top", TextureKey.TEXTURE);
      ORIENTABLE_TRAPDOOR_BOTTOM = create("template_orientable_trapdoor_bottom", "_bottom", TextureKey.TEXTURE);
      ORIENTABLE_TRAPDOOR_OPEN = create("template_orientable_trapdoor_open", "_open", TextureKey.TEXTURE);
      SINGLE_FACE = create("template_single_face", TextureKey.TEXTURE);
      FLAT_ITEM = createItem("generated", TextureKey.LAYER0);
   }
}
