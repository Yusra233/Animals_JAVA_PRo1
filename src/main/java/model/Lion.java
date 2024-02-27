package model;

public class Lion extends Mammals{
    public Lion(){System.out.println("Non Param Lion Constructor");}

    public Lion(String coverdBy) {
        super(coverdBy);
        System.out.println("Lion Param Constructor with Mammals super");
    }

    public Lion(String name, int age, String weight, String height, String coverdBy) {
        super(name, age, weight, height, coverdBy);
        System.out.println("Lion Param Constructor with Animals & Mammals super");

    }

}
