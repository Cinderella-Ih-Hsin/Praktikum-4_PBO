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
public class Dosen extends Orng {
    private int nip;
    public Dosen(String nama){
        this.nama=nama;
    }
    public Dosen(String nama, int nip){
        this.nama=nama;
        this.nip=nip;
    }
    public Dosen(String nama, int nip, int umur){
        this.nama=nama;
        this.umur=umur;
        this.nip=nip;
    }

    public void info(){
        System.out.println("Nama : " + nama);
        System.out.println ("NIP : " + nip);
        System.out.println("Umur : " + umur);
    }
}