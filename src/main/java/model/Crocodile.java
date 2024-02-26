package model;

public class Crocodile extends Reptiles implements AnimalMethods{
    public Crocodile() {
        System.out.println("Non Param Crocodile Constructor");

    }

    public Crocodile(boolean short_legs, boolean long_tails) {
        super(short_legs, long_tails);
        System.out.println("Crocodile Param Constructor with Reptiles super");

    }

    public Crocodile(String name, int age, String weight, String height, boolean short_legs, boolean long_tails) {
        super(name, age, weight, height, short_legs, long_tails);
        System.out.println("Crocodile Param Constructor with Animals & Reptiles super");

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
