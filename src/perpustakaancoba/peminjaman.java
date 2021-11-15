/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaancoba;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Syahren Maulana
 */
public class peminjaman {
    private ArrayList<Integer> idBuku = new ArrayList<Integer>(); 
    private ArrayList<Integer> banyak = new ArrayList<Integer>(); 
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();     
     
    public peminjaman() { 
        this.idSiswa.add(0); 
        this.idBuku.add(0); 
        this.banyak.add(0); 
 
    } 
    public int getBanyak(){ 
        return this.banyak.size(); 
    }       
 
    public void setIdBuku(int idBuku ){ 
        this.idBuku.add(idBuku); 
    } 
     
    public void setIdSiswa(int idSiswa ){ 
        this.idSiswa.add(idSiswa); 
 
 
    } 
     
     
    public int getIdBuku(int idSiswa){ 
        return this.idBuku.get(idSiswa); 
    } 
     
    public int getIdSiswa(int idSiswa){ 
        return this.idSiswa.get(idSiswa); 
    } 
     
    
 
}    