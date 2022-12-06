package com.ing.zoo.model;

import java.util.Random;

public class Zebra implements Animal{
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra()
    {
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void performTrick() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString(){
        return name;
    }
}
