package com.lav.design.pattern.behavioural.Observer;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Context context = new Context();

		
		Mercedes merc = new Mercedes(context);
		merc.setName("merc E series");
		merc.setTopSpeed("200");

		Audi audi = new Audi(context);
		audi.setName("audi R3");
		audi.setTopSpeed("250");

		merc.inspect();
		audi.inspect();

		if (context.isFaulty()) {
			List<String> errors = context.getInspectMessages();
			errors.stream().forEach(e -> System.out.println(e));
		} else {
			System.out.println("All is well");
		}
	}

}
