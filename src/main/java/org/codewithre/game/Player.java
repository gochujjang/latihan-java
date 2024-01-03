package org.codewithre.game;
// child class player dari parent karakter game
class Player extends Character {
    private int energy;
    // konstruktor inisialisasi player
    public Player(String name, int health, int energy) {
        super(name, health);
        this.energy = energy;
    }
    // method menyerang monster
    public void attack(Monster target, int damage) {
        target.receiveDamage(damage);
        energy -= damage;
        System.out.println(name + " attacking " + damage + " damage to " + target.name + "!");
        if (target.isAttacked(name)) {
            health -= target.getDamage();
        }
    }
    // menampilkan informasi status pemain
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Energy: " + energy + " mp");
        System.out.println("");
    }
}
