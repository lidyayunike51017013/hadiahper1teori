/**
 * @(#)prteori1.java
 *
 *
 * @author 
 * @version 1.00 2019/9/18
 */

import java.util.Scanner;
public class prteori1 {

    public static void main (String [] args) {
    	Scanner input = new Scanner (System.in);
    	
    	String nama,alamat;
    	int tahun;
    	System.out.println ("Silahkan Masukkan Nama Anda : ");
    	nama = input.nextLine();
    	System.out.println ("Silahkan Masukkan Alamat : ");
    	alamat = input.nextLine ();
    	System.out.println ("Masukkan Umur : ");
    	tahun = input.nextInt ();
    	System.out.println();
    	
    	System.out.println ("Saudara : "+nama);
    	System.out.println ("Tinggal di : "+alamat);
    	System.out.println ("Berumur : "+tahun+"tahun");
    }
    
    
}