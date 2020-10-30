/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi membandingkan dua nilai angka
 */
package pboif2.pkg10110959.latihan24.perbandinganduanilai;

import java.util.Scanner;
public class PBOIF210110959Latihan24PerbandinganDuaNilai {
    
    public static void membandingkan(int nilai1, int nilai2){
    if(nilai1==nilai2){
        System.out.println("Hasil : "+nilai1+" Sama dengan "+nilai2);
    }else if(nilai1>nilai2){
        System.out.println("Hasil : "+nilai1+" Lebih besar dari "+nilai2);
    } else{
        System.out.println("Hasil : "+nilai1+" Lebih kecil dari "+nilai2);
     }
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
            
    int nilai1;
        int nilai2;
        String ulang;
        boolean kondisi;
        
        System.out.println("===== Program Perbandingan Nilai =====");
        do{   
            System.out.print("Masukkan Nilai Pertama : ");
            nilai1 = input.nextInt();
            System.out.print("Masukkan Nilai Kedua    : ");
            nilai2 = input.nextInt();
            membandingkan(nilai1,nilai2);
            System.out.println("");
            System.out.println("Ulangi Aktivitas? (Ya/Tidak)");
            ulang = input.next();
            kondisi = "Ya".equals(ulang);
        } while(kondisi == true);       
    }
    
}
