package model;

public class Cat extends Mammals implements AnimalMethods{
    public Cat(){System.out.println("Non Param Cat Constructor");}

    public Cat(String coverdBy) {
        super(coverdBy);
        System.out.println("Cat Param Constructor with Mammals super");

    }

    public Cat(String name, int age, String weight, String height, String coverdBy) {
        super(name, age, weight, height, coverdBy);
        System.out.println("Cat Param Constructor with Animals & Mammals super");

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
