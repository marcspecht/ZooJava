package com.ing.zoo.model;

public class Hippo implements Animal{
    public String name;
    public String helloText;
    public String eatText;

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    public void eatMeat() {
        throw new UnsupportedOperationException();
    }

    public void performTrick() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString(){
        return name;
    }
}
