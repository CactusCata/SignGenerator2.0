package com.gmail.cactus.cata.enums;

public enum HoverEvent {
	SHOW_TEXT("show_text"),
	SHOW_ITEM("show_item"),
	SHOW_ENTITY("show_entity"),
	SHOW_ACHIEVEMENT("show_achievement");

	private String name;

	private HoverEvent(String name) {
		this.name = name;
	}

	public String getValue(Entity entity, String argument, String uuid) {
		switch (this) {
		case SHOW_TEXT:
			return "\"hoverEvent\":{\"action\":\"" + name + "\",\"value\":\"" + argument + "\"}";
		case SHOW_ITEM:
			return "\"hoverEvent\":{\"action\":\"" + name + "\",\"value\":\"" + argument + "\"}";
		case SHOW_ENTITY:
			return "\"hoverEvent\":{\"action\":\"" + name + "\",\"value\":\"" + argument + "\"}";
		case SHOW_ACHIEVEMENT:
			return "\"hoverEvent\":{\"action\":\"" + name + "\",\"value\":\"" + argument + "\"}";
		default:
			return null;
		}
	}
	
}