/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class TugasJOptionPane {
    public static void main(String[] args) {
         
        
         String alamat = JOptionPane.showInputDialog("Dimana Alamat Anda ?");
        JOptionPane.showMessageDialog(null, "Alamat Anda Di " + alamat);
        
         String prodi = JOptionPane.showInputDialog("Apa Prodi Yang Anda Ambil ?");
        JOptionPane.showMessageDialog(null, "Prodi Yang Anda Ambil Adalah " + prodi);
        
         String pekerjaan = JOptionPane.showInputDialog("Apa Pekerjaan Anda ?");
        JOptionPane.showMessageDialog(null, "Pekerjaan Anda Adalah " + pekerjaan);
        
         String kampus = JOptionPane.showInputDialog("Dimana Kampus Anda ?");
        JOptionPane.showMessageDialog(null, "Kampus Anda Di " + kampus);
        
         String kota = JOptionPane.showInputDialog("Dimana Anda Dilahirkan ?");
        JOptionPane.showMessageDialog(null, "Anda Lahir Di " + kota);
    }
}
   
 

