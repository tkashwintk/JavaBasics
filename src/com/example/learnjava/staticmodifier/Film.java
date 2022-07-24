package com.example.learnjava.staticmodifier;

public class Film {

    private static long count;
    private String name;

    public Film(String name) {

        this.name = name;
        count++;
    }
    public static long getCount() {
        return count;
    }

    public static void main(String[] args) {
        Film c1 = new Film("Star Wars Episode 1");
        Film c2 = new Film("Star Wars Episode 2");
        Film c3 = new Film("Star Wars Episode 3");
        Film c4 = new Film("Star Wars Episode 4");
        Film c5 = new Film("Star Wars Episode 5");

        System.out.println(getCount());
        System.out.println(c5.getCount());
    }
}
