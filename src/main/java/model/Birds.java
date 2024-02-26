package model;

import model.Animals;

public class Birds extends Animals{
    private boolean feathers;
    private boolean wings;


    public Birds(){
        System.out.println("Non Param Birds Constructor");
    }

    @Override
    void print() {
        System.out.println("Welcome to Birds class.");
    }

    public Birds(boolean feathers, boolean wings) {
        this.feathers = feathers;
        this.wings = wings;
        System.out.println("Birds Param Constructor");
    }

    public Birds(String name, int age, String weight, String height, boolean feathers, boolean wings) {
        super(name, age, weight, height);
        this.feathers = feathers;
        this.wings = wings;
        System.out.println("Birds Param Constructor with super");
    }

    @Override
    public String AnimalDetails(String name, int age, String weight, String height){
        return "Animal name: "+name+" ,age: "+age+" ,weight: "+weight+" ,height: "+height+"and it is from Birds.";
    }

    public void fly(String name) {

        System.out.println(name + " can fly !!");
    }

    public void lay_eggs(String name) {

        System.out.println("Birds lay eggs !!");
    }

    public boolean getFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean getWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }


}
