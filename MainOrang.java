/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * @author Cinderella
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Memasukkan Identitas Dosen 1 : Budi");
        Dosen dosen1 = new Dosen("Budi");
 
        System.out.println("Memasukkan Identitas Dosen 2 : Sadi, NIP. 1093");
        Dosen dosen2 = new Dosen("Sadi", 1093);
 
        System.out.println("Memasukkan Identitas Dosen 3 : Joko, NIP. 1923, umur 30");
        Dosen dosen3 = new Dosen("Joko", 1923, 30);

        System.out.println();
        dosen1.info();
        System.out.println();
        dosen2.info();
        System.out.println();
        dosen3.info();
    }    
}