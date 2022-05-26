package org.embeddedt.cullleaves.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LeavesBlock.class)
public class MixinLeaves extends Block {

    public MixinLeaves(Properties properties) {
        super(properties);
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.getMaterial() == Material.LEAVES;
    }
}