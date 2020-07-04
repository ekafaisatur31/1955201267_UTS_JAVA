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


public class PercabanganIfElse {

    public static void main(String[] args) {
        
// MENENTUKAN BERAT BADAN IDEAL/TIDAK

        // membuat variabel dan Scanner
        int beratbadan;
        String nama;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Berat Badan: ");
        beratbadan = scan.nextInt();

        // cek apakah dia ideal atau tidak
        if( beratbadan <= 50 ) {
            System.out.println("Selamat " + nama + ", berat badan anda ideal!");
        } else {
            System.out.println("Maaf " + nama + ", berat badan anda overdose");
        }

    }

}

