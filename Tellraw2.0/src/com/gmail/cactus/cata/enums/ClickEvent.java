package com.gmail.cactus.cata.enums;

public enum ClickEvent {
	OPEN_URL("open_url"),
	SUGGEST_COMMAND("suggest_command"),
	RUN_COMMAND("run_command"),
	INSERTION("insertion");

	private String name;

	private ClickEvent(String name) {
		this.name = name;
	}

	public String getValue(String argument) {
		switch (this) {
		case INSERTION:
			return "\"insertion\":\"" + argument + "\"";
		default:
			return "\"clickEvent\":{\"action\":\"" + name + "\",\"value\":\"" + argument + "\"}";
		}
	}
}