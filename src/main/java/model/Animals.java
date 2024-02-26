package model;

public abstract class Animals {
    private String name;
    private int age;
    private String weight;
    private String height;

    public Animals() {
        System.out.println("Non Param Animal Constructor");
    }

    abstract void print();

    public String AnimalDetails(String name, int age, String weight, String height){
        return "Animal name: "+name+" ,age: "+age+" ,weight: "+weight+" ,height: "+height;
    }

    public Animals(String name, int age, String weight, String height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        System.out.println("Animal Param Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


}
