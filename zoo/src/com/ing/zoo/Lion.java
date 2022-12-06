package com.ing.zoo;

public class Lion implements Animal{
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    @Override
    public void eatLeaves() {
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
