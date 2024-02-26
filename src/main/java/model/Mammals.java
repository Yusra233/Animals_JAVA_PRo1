package model;

import model.Animals;

public class Mammals extends Animals {
    private String coverdBy;

    public enum Type{
        EGG_LAYING_MONOTREMES, MARSUPIALS , PLACENTALS
    }

    public Mammals(){System.out.println("Non Param Mammals Constructor");}

    @Override
    void print() {
        System.out.println("Welcome to Mammals class.");
    }

    public Mammals(String coverdBy) {
        this.coverdBy = coverdBy;
        System.out.println("Mammals Param Constructor");
    }

    public Mammals(String name, int age, String weight, String height, String coverdBy) {
        super(name, age, weight, height);
        this.coverdBy = coverdBy;
        System.out.println("Mammals Param Constructor with super");
    }

    public String getCoverdBy() {
        return coverdBy;
    }

    public void setCoverdBy(String coverdBy) {
        this.coverdBy = coverdBy;
    }
    @Override
    public String AnimalDetails(String name, int age, String weight, String height){
        return "Animal name: "+name+" ,age: "+age+" ,weight: "+weight+" ,height: "+height+"and it is from Mammals.";
    }

    public String animalDetails(String name, int age, String weight, String height, String coverdBy, Type type){
        return "This animal: "+ name+" with age: "+age+" and weight: "+weight+" and height: "+height+"and it's is: "+type+",is covered by: "+ coverdBy;

    }
    public String animalDetails(String name, String coverdBy){
        return "This animal: "+ name+" ,is covered by: "+ coverdBy;

    }
}
