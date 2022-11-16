/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_c_3078;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Syamsa Shahira Julyinda
 * NIM   : 21103078
 * KELAS : S1SI-05-C
 */

public class Quis1_C_3078 {

    public static void main(String[] args) {
        
        //Membuat object menggunakan array
        Nelayan_21103078[] N = new Nelayan_21103078[2];
        Dokter_21103078[] D = new Dokter_21103078[2];

        //pendefinisian objek dan field
        N[0] = new Nelayan_21103078();
        N[1] = new Nelayan_21103078();
        D[0] = new Dokter_21103078();
        D[1] = new Dokter_21103078();
        
        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data nelayan
            for(int i = 0; i < 2; i++){
                System.out.print("NIK             : ");
                N[i].nik = br.readLine();
                System.out.print("Nama            : ");
                N[i].nama = br.readLine();
                System.out.print("Umur            : ");
                N[i].umur = Integer.parseInt(br.readLine());
                System.out.print("Alamat          : ");
                N[i].alamat = br.readLine();
                System.out.print("Jml Berat Ikan  : ");
                N[i].jmlBeratIkan = Integer.parseInt(br.readLine());
                System.out.print("Jml Pakai Solar : ");
                N[i].jmlSolar = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data nelayan
            System.out.println("=========== DATA NELAYAN ===========");
            for(Nelayan_21103078 n : N){
                n.tampilDataNelayan();
                System.out.println("");
            }

            //mengisi data ke array pada data dokter
            for(int i = 0; i < 2; i++){
                System.out.print("NIK        : ");
                D[i].nik = br.readLine();
                System.out.print("Nama       : ");
                D[i].nama = br.readLine();
                System.out.print("Umur       : ");
                D[i].umur = Integer.parseInt(br.readLine());
                System.out.print("Alamat     : ");
                D[i].alamat = br.readLine();
                System.out.print("Jml Pasien : ");
                D[i].jmlPasien = Integer.parseInt(br.readLine());
                System.out.print("Jml Obat   : ");
                D[i].jmlObat = Integer.parseInt(br.readLine());
                System.out.println("");
            }
            
            //Menampilkan semua isi array pada data dokter
            System.out.println("=========== DATA DOKTER ===========");
            for(Dokter_21103078 d : D){
                d.tampilDataDokter();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
        
    }

}