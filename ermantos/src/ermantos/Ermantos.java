/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

/**
 *
 * @author BerkayEfe
 */
public class Ermantos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
      //  bilgisayarVsOyuncu savas1 = new bilgisayarVsOyuncu();
      //  savas1.kartDagit();
       // savas1.savas();
        bilgisayarVsBilgisayar savas2 = new bilgisayarVsBilgisayar();
        savas2.kartDagit();
        savas2.savas();
    }

}
