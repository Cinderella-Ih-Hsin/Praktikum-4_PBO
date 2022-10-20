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
public class Katak {
    int umur;
    String nama;
    public Katak(int umur, String nama){
        this.umur=umur;
        this.nama=nama;
    }
    public String caraBergerak(){
        if(umur>2){
            return "melompat";
        }
        else{
            return "berenang";
        }
    }
}
