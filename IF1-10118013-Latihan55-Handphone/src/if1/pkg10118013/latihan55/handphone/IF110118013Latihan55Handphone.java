/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan55.handphone;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
       
        System.out.println();
        
        Blackberry blackberry = new Blackberry("BlackB", "RIM", "Curve", 2000000);
        blackberry.setPinBB("BHS249");
        blackberry.displayProduct();
        System.out.println("PIN : " + blackberry.getPinBB());
      
        System.out.println();
        
        WindowsPhone wPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wPhone.setWpKeyStore("UUUQIJWORJ");
        wPhone.displayProduct();
        System.out.println("Wp Key Store : " + wPhone.getWpKeyStore());
       
    }
    
}
