package me.bodiw.nompscreen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class NoMpScreen implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("nompscreen");

	@Override
	public void onInitialize() {
		LOGGER.info("Multiplayer is gone!:crab::crab::crab:");
	}
}
