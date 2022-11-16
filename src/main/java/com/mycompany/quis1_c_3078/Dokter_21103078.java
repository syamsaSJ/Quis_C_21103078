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
public class Dokter_21103078 extends Penduduk_21103078{
    
    //atribut kelas anak
    int jmlPasien, jmlObat;

    //Method totalPendapatanDokter
    public double totalPendapatanDokter(){
        return (jmlPasien * 50000) + (jmlObat * 10000);
    }
    
    /**Method tampilDataDokter dan 
    Method yang memanggil method induk 
    * dari kelas induknya dengan menggunakan keyword super*/
    public void tampilDataDokter(){
        super.tampilDataPenduduk();
        System.out.println("Jumlah Pasien            : " + jmlPasien);
        System.out.println("Jumlah Obat              : " + jmlObat);
        System.out.println("Total Pendapatan Dokter  : Rp " + totalPendapatanDokter());
    }
    
}
