package model;

import model.Animals;

public class Reptiles extends Animals {
    private boolean short_legs;
    private boolean long_tails;

    public Reptiles() {
        System.out.println("Non Param Reptiles Constructor");
    }

    @Override
    void print() {
        System.out.println("Welcome to Reptiles class.");
    }

    public Reptiles(boolean short_legs, boolean long_tails) {
        this.short_legs = short_legs;
        this.long_tails = long_tails;
        System.out.println("Reptiles Param Constructor");
    }

    public Reptiles(String name, int age, String weight, String height, boolean short_legs, boolean long_tails) {
        super(name, age, weight, height);
        this.short_legs = short_legs;
        this.long_tails = long_tails;
        System.out.println("Reptiles Param Constructor with super");
    }
    @Override
    public String AnimalDetails(String name, int age, String weight, String height){
        return "Animal name: "+name+" ,age: "+age+" ,weight: "+weight+" ,height: "+height+"and it is from Reptiles.";
    }

    public boolean isShort_legs() {
        return short_legs;
    }

    public void setShort_legs(boolean short_legs) {
        this.short_legs = short_legs;
    }

    public boolean isLong_tails() {
        return long_tails;
    }

    public void setLong_tails(boolean long_tails) {
        this.long_tails = long_tails;
    }
}
