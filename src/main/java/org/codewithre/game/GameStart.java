package org.codewithre.game;
// main class untuk menjalankan program
public class GameStart {
    public static void main(String[] args) {
        // membuat objek Player dan Monster
        Player knight = new Player("Knight", 100, 100);
        Player mage = new Player("Mage", 100, 100);
        Monster dragon = new Monster("Dragon", 500);
        Monster ldragon = new Monster("Little Dragon", 100);
        // memanggil method untuk menyerang monster
        knight.attack(dragon, 80);
        mage.attack(ldragon, 20);
        // menampilkan status informasi tiap karakter dan monster
        knight.showInfo();
        mage.showInfo();
        System.out.println("Existing Monsters");
        dragon.showInfo();
        ldragon.showInfo();
    }
}
