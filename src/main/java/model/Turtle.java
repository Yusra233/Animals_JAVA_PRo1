package model;

public class Turtle extends Reptiles implements AnimalMethods{
    public Turtle() {
        System.out.println("Non Param Turtle Constructor");

    }

    public Turtle(boolean short_legs, boolean long_tails) {
        super(short_legs, long_tails);
        System.out.println("Turtle Param Constructor with Reptiles super");

    }

    public Turtle(String name, int age, String weight, String height, boolean short_legs, boolean long_tails) {
        super(name, age, weight, height, short_legs, long_tails);
        System.out.println("Turtle Param Constructor with Animals & Reptiles super");

    }

    @Override
    public String AnimalName(String name) {
        return "Animal Name is: "+name;
    }

    @Override
    public String AnimalWeight(String weight) {
        return "Animal Weight is: "+weight;
    }

    @Override
    public String AnimalName_weight(String name, String weight) {
        return "Animal Name and Weight is: "+name+", "+weight;
    }
}
