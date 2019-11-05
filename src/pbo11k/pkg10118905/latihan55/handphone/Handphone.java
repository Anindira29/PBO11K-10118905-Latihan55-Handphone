/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan55.handphone;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Handphone
 */
public class Handphone {
    protected String manufacture,operatingSystem,model;
   protected int harga;
   
   public Handphone(String man, String os, String model, int harga) {
       this.manufacture = man;
       this.operatingSystem = os;
       this.model = model;
       this.harga = harga;
   }
   public void displayProduct() {
       System.out.println("Manufaktur\t: "+ manufacture);
       System.out.println("OS\t\t: "+operatingSystem);
       System.out.println("Model\t\t: "+model);
       System.out.println("Harga\t\t: "+harga);
   }
    
}
