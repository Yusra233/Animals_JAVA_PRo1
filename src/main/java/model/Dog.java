package model;

public class Dog extends Mammals implements AnimalMethods{

    public Dog(){
        System.out.println("Non Param Dog Constructor");
    }

    public Dog(String coverdBy) {
        super(coverdBy);
        System.out.println("Dog Param Constructor with Mammals super");
    }

    public Dog(String name, int age, String weight, String height, String coverdBy) {
        super(name, age, weight, height, coverdBy);
        System.out.println("Dog Param Constructor with Animals & Mammals super");
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
