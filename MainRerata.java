/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak4;

/**
 *
 * @author Cinderella
 */
public class Main {
    public static void main(String[] args) {
        RerataNilai rn = new RerataNilai();
        System.out.println("Rerata nilai 18 dan 12 adalah : "+rn.average(18, 12));
        System.out.println("Rerata nilai 20.4 dan 10.5 adalah : "+rn.average(20.4, 10.5));
        System.out.println("Rerata nilai 109, 342 dan 197 adalah : "+rn.average(109, 342, 197));
    } 
}