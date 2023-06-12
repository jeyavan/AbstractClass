package com.Nive.SampleProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pig extends Animals {
	
	//@Autowired
	public void animalSound() {
		//System.out.println("pig extends: ");
	 System.out.println("oinking");
	 
	  }
	public void disp() {
		System.out.println("pig extends: ");
		
	}
	
	

	}
