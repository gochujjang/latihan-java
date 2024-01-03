package org.codewithre.game;
// child class monster dari parent karakter
class Monster extends Character {
    private int damage;
    private int healthInit;
    // construktor inisialisasi monster health dan damage nya
    public Monster(String name, int health, int damage) {
        super(name, health);
        this.damage = damage;
        this.healthInit = health;
    }
    // construktor dengan damage default 10
    public Monster(String name, int health) {
        this(name, health, 10); // Default damage is 10
    }
    // method monster menerima damage
    public void receiveDamage(int damage) {
        health -= damage;
    }
    // method cek apakah monster diserang
    public boolean isAttacked(String playerName) {
        System.out.println(name + " attack " + damage + " damage to " + playerName);
        System.out.println("");
        return health < healthInit;
    }
    // method get damage monster
    public int getDamage() {
        return damage;
    }
    // method menampilkan status monster
    @Override
    public void showInfo() {
        super.showInfo();
    }
}
