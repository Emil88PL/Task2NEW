package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

public class main {

	// static Animal myCat = new Cat("Bob", 17);		//1.
    // static Animal myCat2 = new Cat("Pspsps", 15);
    // static Animal myDog = new Dog("Rex", 11);
    // static Animal myRabbit = new Rabbit("Mr.Rabbit", 3);
    // static Animal myRabbit2 = new Rabbit("Walter White", 2); 
        
    public static void main(String[] args) {
        // System.out.println(myCat);
        // System.out.println(myCat2);
        //  System.out.println(myDog);
        // System.out.println(myRabbit);
        // System.out.println(myRabbit2);
		System.out.println("\n");
		System.out.println("ArrayList:"); 		//2.
        List<Animal> animals = new ArrayList<>();	//2a / 2.b ??
		animals.add(new Dog("Snoop", 11));
		animals.add(new Cat("PsPSps", 15));
		animals.add(new Dog("Rex", 12));
		animals.add(new Rabbit("Mr.Rabbit", 3));
		animals.add(new Rabbit("Walter White", 1));

		System.out.println(animals.size());
		System.out.println(animals);
		

		System.out.println("\n");
		System.out.println("HashMap:");
		
		HashMap <String, Animal> animalsHash = new HashMap<String, Animal>();  //3a
		Animal myCat = new Cat("Bob", 17);
    	Animal myCat2 = new Cat("Pspsps", 15);
    	Animal myDog = new Dog("Rex", 11);
    	Animal myRabbit = new Rabbit("Mr.Rabbit", 3);
    	Animal myRabbit2 = new Rabbit("Walter White", 2);

		animalsHash.put("Bob", myCat);
		animalsHash.put("Pspsps", myCat2);
		animalsHash.put("Rex", myDog);
		animalsHash.put("Mr.Rabbit", myRabbit);
		animalsHash.put("Walter White", myRabbit2);

		System.out.println(animalsHash);
		System.out.println(animalsHash.size());
		 

		
		System.out.println(animalsHash.containsKey("Bob")); //6

		System.out.println("\n");
		System.out.println("HashMap: 3b");
		HashMap <Animal, String> animalsHash2 = new HashMap<Animal, String>();  //3b

		Animal myCatB = new Cat("Bob", 17);
    	Animal myCat2B = new Cat("Pspsps", 15);
    	Animal myDogB = new Dog("Rex", 11);
    	Animal myRabbitB = new Rabbit("Mr.Rabbit", 3);
    	Animal myRabbit2B = new Rabbit("Walter White", 2);

		
		animalsHash2.put(myCatB, " My Cat");
		animalsHash2.put(myCat2B, " My second Cat");
		animalsHash2.put(myDogB, " My dog");
		animalsHash2.put(myRabbitB, " My Rabbit");
		animalsHash2.put(myRabbit2B, " Also a Rabbit");

		System.out.println(animalsHash2);
		System.out.println("\n");
		System.out.println("For:");
		for (Map.Entry pairEntry : animalsHash2.entrySet()) { 		//5
			System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
		}
		System.out.println("\n");
		System.out.println("ForEach:");
		animals.stream().forEach(x -> System.out.println(x + " " + x.sayHello() + x.move()));
    }
}
