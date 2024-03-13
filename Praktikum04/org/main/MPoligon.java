/*
 * Nama : Syariful Hanif Setiawan
 * NIM  : 24060122130095
 * Kelas : PBO-D1
 * Program : MPoligon.java
 * Deskripsi : Program ini berisi tentang main class dari program bangun datar
 */



package org.main;

import org.bangundatar.*;

public class MPoligon{
    
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segi3 = new Segitiga(10, 10);
        segi3.printInfo();
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());
        System.out.println("Luas Segitiga :"+segi3.hitungLuas());
    }
}
