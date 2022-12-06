package com.ing.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        animals.add(henk);

        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        while(true){
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Voer uw command in: ");

            String input = scanner.nextLine();
            String[] inputArray = input.split(" ", 2);

            // Check if command is valid
            boolean inputIsInList = Arrays.asList(commands).contains(inputArray[0]);
            if(!inputIsInList){
                System.out.println("Unknown command: " + inputArray[0]);
                continue;
            }

            // Check if animal exists
            Animal foundAnimal = animals.stream().filter(x -> x.toString() == inputArray[1]).findFirst().get();
            if(foundAnimal == null){
                System.out.println("Animal not found: " + inputArray[1]);
                continue;
            }    



            if(input.equals(commands[0] + " henk"))
            {
                henk.sayHello();
            }
            
            scanner.close();
        }
    }
}
