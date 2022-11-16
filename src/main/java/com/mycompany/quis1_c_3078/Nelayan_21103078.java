/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.quis1_c_3078;

/**
 * @author Syamsa Shahira Julyinda
 * NIM   : 21103078
 * KELAS : S1SI-05-C
 */

//Kelas anak
public class Nelayan_21103078 extends Penduduk_21103078{
    
    //Atribut kelas anak
    int jmlBeratIkan, jmlSolar;
    
    //Method totalPendapatanNelayan
    public double totalPendapatanNelayan(){
        return (jmlBeratIkan * 8000) + (jmlSolar * 10000);
    }
    
    /**Method tampilDataNelayan dan 
    Method yang memanggil method induk 
    * dari kelas induknya dengan menggunakan keyword super*/
    public void tampilDataNelayan(){
        super.tampilDataPenduduk();
        System.out.println("Jumlah Berat Ikan        : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar       : " + jmlSolar);
        System.out.println("Total Pendapatan Nelayan : Rp " + totalPendapatanNelayan());
    }

}
