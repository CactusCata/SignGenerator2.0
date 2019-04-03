package com.gmail.cactus.cata;

import java.util.ArrayList;
import java.util.List;

import com.gmail.cactus.cata.enums.Color;

public class Tellraw {
	private String command;
	private List<TellrawText> texts;

	public Tellraw(String selector) {
		command = "/tellraw @" + selector + " [\"\",";
		texts = new ArrayList<>();
	}

	public TellrawText addText(String value, Color color) {
		TellrawText text = new TellrawText(value, color);

		texts.add(text);

		return text;
	}

	public String generate() {
		int index = 0;
		for (TellrawText text : texts) {
			index++;

			command += text.build() + (index == texts.size() ? "" : ",");
		}

		return command += "]";
	}

}