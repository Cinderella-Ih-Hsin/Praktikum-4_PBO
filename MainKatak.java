/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katak;

/**
 *
 * @author Cinderella
 */
public class Main {
    public static void main(String[] args) {
        Katak O1 = new Katak(4,"Joni");
        Kecebong O2 = new Kecebong(1,"Jojon",8);
        System.out.println("Obyek O1");
        System.out.println("Umur : "+O1.umur);
        System.out.println("Nama : "+O1.nama);
        System.out.println("Cara bergerak : "+O1.caraBergerak());
        System.out.println();
        System.out.println("Obyek O2");
        System.out.println("Umur : "+O2.umur);
        System.out.println("Nama : "+O2.nama);
        System.out.println("Panjang ekor : "+O2.panjangEkor);
        System.out.println("Cara bergerak : "+O2.caraBergerak());
    }   
}