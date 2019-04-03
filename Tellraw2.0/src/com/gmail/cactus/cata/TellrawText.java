package com.gmail.cactus.cata;

import com.gmail.cactus.cata.enums.ClickEvent;
import com.gmail.cactus.cata.enums.Color;
import com.gmail.cactus.cata.enums.Entity;
import com.gmail.cactus.cata.enums.HoverEvent;

public class TellrawText {
	public static final String TEXT_BOLD = "bold";
	public static final String TEXT_UNDERLINED = "underlined";
	public static final String TEXT_ITALIC = "italic";
	public static final String TEXT_STRIKETHROUGH = "strikethrough";

	private String text;

	public TellrawText(String value, Color color) {
		text = "{\"text\":\"" + value + "\",";

		if (color != null)
			text += "\"color\":\"" + color.toString() + "\",";
	}

	public TellrawText addClickEvent(ClickEvent type, String argument) {
		text += type.getValue(argument) + ",";

		return this;
	}

	public TellrawText addHoverEvent(HoverEvent type, String argument) {
		text += type.getValue(null, argument, null) + ",";

		return this;
	}

	public TellrawText addHoverEvent(HoverEvent type, Entity entity, String argument, String uuid) {
		text += type.getValue(entity, argument, uuid) + ",";

		return this;
	}

	public TellrawText setParameter(String type, boolean value) {
		text += "\"" + type + "\":\"" + String.valueOf(value) + "\"" + ",";

		return this;
	}

	public String build() {
		char[] chars = text.toCharArray();
		chars[chars.length - 1] = ' ';

		text = new String(chars);
		return text += "}";
	}
}
