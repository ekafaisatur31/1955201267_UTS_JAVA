/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class TugasScanner {
    public static void main(String[] args) {
        
     
        String nama = "";
        String alamat = "";
        int umur = 0;
        double beratbadan;
        String kampus = "";
        
        //object Scanner
        Scanner br = new Scanner(System.in);
                
        // mengisi variabel nama dengan bufferedReader
        System.out.println("Siapa Nama Anda ?");
        nama = br.nextLine();
        
        System.out.println("Dimana Alamatmu ?");
        alamat = br.nextLine();
        
        System.out.println("Umur kamu berapa ?");
        umur = Integer.parseInt(br.nextLine());
        
        System.out.println("Berapa berat badan mu ?");
        beratbadan = Double.parseDouble(br.nextLine());
        
        System.out.println("Dimana Kampusmu ?");
        kampus = br.nextLine();
        
        // menampilkan nama
        System.out.println("Nama Anda Adalah" + " " + nama);
        System.out.println("Alamat Anda Di" + " " + alamat);
        System.out.println("Umur anda " + " " + umur);
        System.out.println("Berat badan mu " + " " + beratbadan);
        System.out.println("Kampus Anda Di" + " " + kampus);
        
        

    }
    
}
