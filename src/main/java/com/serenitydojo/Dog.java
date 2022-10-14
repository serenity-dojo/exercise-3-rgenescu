package com.serenitydojo;

public class Dog {

    private String name;
    private String favoriteToy;
    private int age;

    private boolean isFed = false;

    private static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public boolean getFeedStatus() {
        return isFed;
    }

    public String getNoise() {
        return DOG_NOISE;
    }

    private boolean changeIsFedToTrue() {
        this.isFed = true;
        return isFed;
    }

    public void feed() {
        changeIsFedToTrue();
        System.out.println(" Feed status: " + isFed);
    }
}
