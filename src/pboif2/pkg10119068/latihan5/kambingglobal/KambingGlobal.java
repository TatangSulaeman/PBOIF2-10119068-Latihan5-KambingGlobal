/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan5.kambingglobal;

/**
 *
 * @author amtat
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Kambing Global
 */
public class KambingGlobal{
    //Variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5 ;
        System.out.println("Jumlah Kambing setelah ditamabah: " + jumlahKambing);
    }
    
    public static void main(String[] args){
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //menambahj satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}
