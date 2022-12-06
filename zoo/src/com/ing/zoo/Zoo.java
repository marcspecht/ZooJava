package com.ing.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
        
        List<Animal> animals = new ArrayList<>();

        Lion henk = new Lion();
        henk.name = "henk";
        
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        String[] inputArray = input.split(" ", 3);

        // Check if command is valid
        var command = inputArray[0];
    
        if(inputArray.length > 2)
            command = inputArray[0] + " " +inputArray[1];
    
        boolean inputIsInList = Arrays.asList(commands).contains(command);
        if(!inputIsInList){
            System.out.println("Unknown command: " + command);
            System.exit(0);
        }

        // Check if command has animal
        if(inputArray.length == 1){
            if(command.equals("hello")){
                everyoneHello(animals);
                System.exit(0);
            }
        }

        // Check if animal exists
        var name = inputArray[inputArray.length - 1];
        Optional<Animal> optionalAnimal = animals.stream().filter(x -> name.equals(x.toString())).findFirst();
        if(!optionalAnimal.isPresent()){
            System.out.println("Animal not found: " + inputArray[inputArray.length - 1]);
            System.exit(0);
        }    

        Animal animal = optionalAnimal.get();

        switch(command){
            case "hello":
                animal.sayHello();
                break;
            case "give leaves":
                try{
                    animal.eatLeaves();
                } catch(UnsupportedOperationException e){
                    System.out.println("Animal does not eat leaves");
                }
                break;
            case "give meat":
                try{
                    animal.eatMeat();
                } catch(UnsupportedOperationException e){
                    System.out.println("Animal does not eat meat");
                }
                break;
            case "perform trick":
                try{
                    animal.performTrick();
                } catch(UnsupportedOperationException e){
                    System.out.println("Animal does not now any tricks");
                }
                break;
            default:
                break;
        }

        scanner.close();
    }

    public static void everyoneHello(List<Animal> animals){
        for(Animal animal : animals){
            animal.sayHello();
        }
    }
}
