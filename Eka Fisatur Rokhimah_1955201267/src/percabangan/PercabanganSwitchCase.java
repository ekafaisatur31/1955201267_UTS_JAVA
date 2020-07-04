/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class PercabanganSwitchCase {

    public static void main(String[] args) {

        // ALMARI BUKU YANG TERDAPAT ADA BEBERAPA LACI
        
        // membuat variabel dan Scanner
        String almaribuku;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("masukkan nama laci : ");
        almaribuku = scan.nextLine();

        switch(almaribuku){
            case "laci sejarah":
                System.out.println("laci sejarah, terdapat buku sejarah");
                break;
            case "laci novel":
                System.out.println("laci novel, terdapat buku novel");
                break;
            case "laci komik":
                System.out.println("laci komik, terdapat buku komik!");
                break;
            default:
                System.out.println("maaf, nama laci tidak ada!");
        }
    }
}

    
