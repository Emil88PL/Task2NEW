package com.qa;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

import javax.sound.midi.Soundbank;
import javax.swing.TransferHandler;

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

		System.out.println("\n");
		System.out.println("Just Cats: ");
		ArrayList<Cat> catList = new ArrayList<Cat>();
		catList.add((Cat) myCat);
		catList.add((Cat) myCat2);
		// catList.add((Cat) myDog); // ERROR class com.qa.model.Dog cannot be cast to class com.qa.model.Cat

		System.out.println(catList);
		System.out.println("\n");
		
		// 4 

		HashSet<Animal> set = new HashSet<>();
		set.addAll(animals); // add all the elements of another collection 
		set.add(myCat); 
		System.out.println("Task 4: ");
		System.out.println(set);
	




		System.out.println(animalsHash.containsKey("Bob")); //6  Another solution line 140

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


		// Other 5

		System.out.println("For loop on ArrayList");
		for (int x = 0; x < animals.size(); x++){
			System.out.println(animals.get(x));
		}

		System.out.println("\n");

		System.out.println("For each loop on the animal map values");
		for (String key : animalsHash.keySet()){
			System.out.println("Key: " + key + " Value: " + animalsHash.get(key));
		}

		System.out.println("\n");
		System.out.println("Iterator used with the set");
		Iterator<Animal> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		// 6 
		System.out.println("Finding Bob.");
		for (Animal a : animals){
			if (a.getName().equals("Bob"))
			System.out.println("Found spot in ArrayList " + a); // not sure how that works... lol
		}

		System.out.println("Found Spot in the HashMap: " + animalsHash.get("Bob"));

		// 7

		// Collections.sort(animals);  .sort not working 
		// System.out.println("Sorted Animal list");
		// for (int x = 0 ; x < animals.size(); x++){
		// 	System.out.println(animals.get(x));
		// }

			// TreeMap<String, Animal> tree = new TreeMap<>();	TreeMap - import issue 
			// tree.putAll(animals);
			// System.out.println("TreeMap");
			// for (String key : tree.keySet()){
			// 	System.out.println("Key: " + key + " Value " + tree.get(key));
			// }

    }
}
