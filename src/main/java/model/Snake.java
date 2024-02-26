package model;

public class Snake extends Reptiles implements AnimalMethods{
    public Snake() {
        System.out.println("Non Param Snake Constructor");

    }

    public Snake(boolean short_legs, boolean long_tails) {
        super(short_legs, long_tails);
        System.out.println("Snake Param Constructor with Reptiles super");

    }

    public Snake(String name, int age, String weight, String height, boolean short_legs, boolean long_tails) {
        super(name, age, weight, height, short_legs, long_tails);
        System.out.println("Snake Param Constructor with Animals & Reptiles super");

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
