package com.Nive.SampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Cow extends Animals {
    //@Autowired
	@Override
	public void animalSound() {
		System.out.println("Cow extends: ");
		System.out.println("Moo");
		
	}

}
