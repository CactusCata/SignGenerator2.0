package com.gmail.cactus.cata;

import com.gmail.cactus.cata.enums.ClickEvent;
import com.gmail.cactus.cata.enums.Color;
import com.gmail.cactus.cata.enums.Entity;
import com.gmail.cactus.cata.enums.HoverEvent;

public class Main {

	public static void main(String[] args) {

		Tellraw tellraw = new Tellraw("p[r=5]");
		tellraw.addText("Hello World", Color.BLUE).setParameter(TellrawText.TEXT_BOLD, true)
				.addClickEvent(ClickEvent.OPEN_URL, "https://youporn.com")
				.addHoverEvent(HoverEvent.SHOW_ENTITY, Entity.CREEPER, "Creepy", "9b8d31d5-420c-4f0c-80f0-de834b737a99");
		tellraw.addText("Hello 2", Color.AQUA).setParameter(TellrawText.TEXT_ITALIC, true)
				.addClickEvent(ClickEvent.RUN_COMMAND, "Je suis un abruti");
		tellraw.addText("Hello 2", Color.AQUA).setParameter(TellrawText.TEXT_ITALIC, true)
				.addHoverEvent(HoverEvent.SHOW_TEXT, "Je suis un abruti");
		System.out.println(tellraw.generate());

	}

}
