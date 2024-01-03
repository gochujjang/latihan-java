package org.codewithre.game;

// parent class karakter game
public class Character {
    protected String name;
    protected int health;
    // konstruktor inisialisasi karakter
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }
    // method menampilkan informasi karakter
    public void showInfo() {
        System.out.println("Status " + name);
        System.out.println("Health: " + health + " hp");
//        System.out.println("");
    }
}
