package com.gmail.cactus.cata.enums;

public enum Entity {

	CREEPER("Creeper"),
	BAT("Bat"),
	CHICKEN("Chicken"),
	COW("Cow"),
	MOOSHROOM("Mooshroom"),
	PIG("Pig"),
	RABBIT("Rabbit"),
	SHEEP("Sheep"),
	HORSE("EntityHorse"),
	SQUID("Squid"),
	VILLAGER("Villager"),
	CAVE_SPIDER("CaveSpider"),
	ENDERMAN("Enderman"),
	POLAR_BEAR("PolarBear"),
	SPIDER("Spider"),
	ZOMBIE_PIGMAN("Zombie Pigman"),
	BLAZE("Blaze"),
	GUARDIAN("Guardian"),
	ENDERMITE("Endermite"),
	EVOKER("Evoker"),
	GHAST("Ghast"),
	HUSK("Husk"),
	MAGMA_CUBE("Magma Cube"),
	SHULKER("Shulker"),
	SILVERFISH("Sliverfish"),
	SKELETON("Skeleton"),
	SLIME("Slime"),
	STRAY("Stray"),
	VEX("Vex"),
	VINDICATOR("Vindicator"),
	WITCH("Witch"),
	ZOMBIE("Zombie"),
	LLAMA("Llama"),
	OCELOT("Ocelot"),
	WOLF("Wolf"),
	IRON_GOLEM("Iron Golem"),
	SNOW_GOLEM("Snow Golem"),
	ENDER_DRAGON("Ender Dragon"),
	GIANT("Giant");

	private final String text;

	private Entity(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

}
