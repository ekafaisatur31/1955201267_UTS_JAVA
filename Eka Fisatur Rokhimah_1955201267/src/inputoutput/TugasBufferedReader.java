/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS 10
 */
public class TugasBufferedReader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
     
        String nama = "";
        String alamat = "";
        int umur = 0;
        double beratbadan;
        String kampus = "";
        
        //object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        // object bufferedReader
        BufferedReader br = new BufferedReader(isr);
        
        // mengisi variabel nama dengan bufferedReader
        System.out.println("Siapa Nama Anda ?");
        nama = br.readLine();
        
        System.out.println("Dimana Alamatmu ?");
        alamat = br.readLine();
        
        System.out.println("Umur kamu berapa ?");
        umur = Integer.parseInt(br.readLine());
        
        System.out.println("Berapa berat badan mu ?");
        beratbadan = Double.parseDouble(br.readLine());
        
        System.out.println("Dimana Kampusmu ?");
        kampus = br.readLine();
        
        // menampilkan nama
        System.out.println("Nama Anda Adalah" + " " + nama);
        System.out.println("Alamat Anda Di" + " " + alamat);
        System.out.println("Umur Anda" + " " + umur);
        System.out.println("Berat Badan Anda " + " " + beratbadan);
        System.out.println("Kampus Anda Di" + " " + kampus);
        
        

                
    }
    
}
