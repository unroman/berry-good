package com.teamabnormals.berry_good.core.data.server.tags;

import com.teamabnormals.berry_good.core.BerryGood;
import com.teamabnormals.berry_good.core.registry.BGBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BGBlockTagsProvider extends BlockTagsProvider {

	public BGBlockTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, BerryGood.MOD_ID, existingFileHelper);
	}

	@Override
	public void addTags() {
		this.tag(BlockTags.BEE_GROWABLES).add(BGBlocks.SWEET_BERRY_BUSH_PIPS.get(), BGBlocks.CAVE_VINE_PIPS.get());
	}
}