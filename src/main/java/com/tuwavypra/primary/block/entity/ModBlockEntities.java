package com.tuwavypra.primary.block.entity;

import com.tuwavypra.primary.PrimaryMod;
import com.tuwavypra.primary.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<AlchemyTableBlockEntity> ALCHEMY_TABLE;

    public static void registerAllBlockEntities() {
        ALCHEMY_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(PrimaryMod.MOD_ID, "alchemy_table"),
                FabricBlockEntityTypeBuilder.create(AlchemyTableBlockEntity::new,
                        ModBlocks.ALCHEMY_TABLE).build(null));
    }
}
