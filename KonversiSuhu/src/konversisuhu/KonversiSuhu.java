/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author MADCOMS
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int Input;
        
        //Membuat Scanner
        Scanner suhu = new Scanner (System.in);
        System.out.println("<<Konversi Suhu>>");
        System.out.print("Masukkan Input :");
        Input = suhu.nextInt();
        
        //Proses Penghitungan dan menampilkan output
        System.out.println("Hasil Konversi :");
        System.out.println("Fahrenheit :"+(1.8 * Input));
        System.out.println("Kelvin :"+(Input + 273));
        System.out.println("Reamur :"+(0.8 * Input));
        
    }
    
}
