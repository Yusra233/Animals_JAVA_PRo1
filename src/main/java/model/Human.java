package model;

public class Human extends Mammals{
    public Human(){System.out.println("Non Param Human Constructor");}

    public Human(String coverdBy) {
        super(coverdBy);
        System.out.println("Human Param Constructor with Mammals super");
    }

    public Human(String name, int age, String weight, String height, String coverdBy) {
        super(name, age, weight, height, coverdBy);
        System.out.println("Human Param Constructor with Animals & Mammals super");

    }

}
