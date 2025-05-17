package com.mycompany.operatorpembanding;

/**
 * Demonstrasi Operator Pembanding/Relasional dalam Java
 * @author luqmanaru
 */
public class OperatorPembanding {
    public static void main(String[] args) {
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;
        
        // Apakah A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println("A > B? " + hasil);
        
        // Apakah A lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println("A < B? " + hasil);
    }
}
