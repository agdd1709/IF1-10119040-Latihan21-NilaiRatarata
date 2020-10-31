/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan21.rata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * Program menghititung nilai rata-rata mahasiswa
 */
public class IF110119040Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,n;
        float jumlah, x, rata;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        jumlah = 0;
        i = 1;
        while (i <= n){
            System.out.print("Nilai Mahasiswa ke-" + i +": ");
            x = input.nextInt();
            jumlah += x;
            i++;
        }
        rata = jumlah / n;
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        
        System.out.println("Develoved by : Agus Deri Dermawan");
        
    }
    
}
