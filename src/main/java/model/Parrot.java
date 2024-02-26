package model;

public class Parrot extends Birds implements AnimalMethods{
    public Parrot() {
        System.out.println("Non Param Parrot Constructor");
    }

    public Parrot(boolean feathers, boolean wings) {
        super(feathers, wings);
        System.out.println("Parrot Param Constructor with Birds super");

    }

    public Parrot(String name, int age, String weight, String height, boolean feathers, boolean wings) {
        super(name, age, weight, height, feathers, wings);
        System.out.println("Parrot Param Constructor with Animals & Birds super");

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
