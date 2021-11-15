/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaancoba;

import java.util.ArrayList;

/**
 *
 * @author Syahren Maulana
 */
public class Buku {
    private ArrayList<String> judulBuku = new ArrayList<String>(); 
    private int stok; 
    private ArrayList<Integer> idBuku = new ArrayList<Integer>(); 
     
    public Buku(int idBuku, String judulBuku, int stok) { 
        this.judulBuku.add(judulBuku);
        this.stok = stok; 
        this.idBuku.add(idBuku); 
 
 
    } 

    
    public int getIdBuku() {
        return this.idBuku.get(0);
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "stok"
    public int getStok() {
        return stok;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "judulBuku" 
    public ArrayList<String> getJudulBuku() {
        return judulBuku;
    }
    
    // method untuk mengurangi stok sejumlah 1
    public void kurangiStok(int stok){
        this.stok--;
       
    }
    
    public void tambahStok(int stok){
        this.stok++;
    }

    
}
