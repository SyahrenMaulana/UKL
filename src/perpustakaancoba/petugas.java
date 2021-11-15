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
public class petugas implements User{

    private ArrayList<String> namaPetugas = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    
     
    public petugas() { 
        this.namaPetugas.add("Maman"); 
        this.alamat.add("Kediri"); 
        this.telepon.add("081222"); 
        
    } 
   
    public int getJmlPetugas(){ 
        return this.namaPetugas.size(); 
    }       
 
    @Override 
    public void setNama(String namaPetugas ){ 
        this.namaPetugas.add(namaPetugas); 
    } 
     
    @Override 
    public void setAlamat(String alamat ){ 
        this.namaPetugas.add(alamat); 
 
 
    } 
    @Override 
    public void setTelepon(String telepon ){ 
        this.namaPetugas.add(telepon); 
    } 
     
    @Override 
    public String getNama(int idKaryawan){ 
        return this.namaPetugas.get(idKaryawan); 
    } 
     
    @Override 
    public String getAlamat(int idPetugas){ 
        return this.alamat.get(idPetugas); 
    } 
     
    @Override 
    public String getTelepon(int idPetugas){ 
        return this.telepon.get(idPetugas); 
    } 
}
