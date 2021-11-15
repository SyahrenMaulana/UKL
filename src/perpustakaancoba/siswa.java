/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaancoba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author Syahren Maulana
 */
public class siswa implements User{
    Scanner input = new Scanner(System.in);
    
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private boolean Status;
    
    
    
    
    
    public siswa(int idSiswa, String nama, String alamat, String telepon, boolean status){
        this.idSiswa.add(idSiswa);
        this.namaSiswa.add(nama);
        this.alamat.add(alamat);
        this.telepon.add(telepon);
        this.Status = status;
        
        
        
    }
    
    public void setIdSiswa(int idSiswa){ 
        this.idSiswa.add(idSiswa);
    } 
    public Integer getIdSiswa(int idSiswa){ 
        return this.idSiswa.get(idSiswa); 
    }        
    //public void editStatus(int idSiswa, boolean status){ 
      //  this.Status.set(idSiswa, status);; 
    //}       
    //public int getJmlSiswa(){ 
      //  return this.Status.size(); 
    //}
    
    @Override 
    public void setNama(String namaSiswa ){ 
        this.namaSiswa.add(namaSiswa); 
    } 
     
    @Override 
    public void setAlamat(String alamat ){ 
        this.alamat.add(alamat); 
    } 
    @Override 
    public void setTelepon(String telepon ){ 
 
 
        this.telepon.add(telepon); 
    } 
    
     
    @Override 
    public String getNama(int idSiswa){ 
        return this.namaSiswa.get(idSiswa); 
    } 
     
    @Override 
    public String getAlamat(int idSiswa){ 
        return this.alamat.get(idSiswa); 
    } 
     
    @Override 
    public String getTelepon(int idSiswa){ 
        return this.telepon.get(idSiswa); 
    } 
     public void changeStatus(){
        this.Status = !this.Status;
    }
    public String getStatus(){
        if (Status) {
            return "Diijinkan meminjam";
        }
        else{
            return "Tidak Diijinkan meminjam";
        }
    }
    
    public boolean isStatus(){
        return this.Status;
    }
}


