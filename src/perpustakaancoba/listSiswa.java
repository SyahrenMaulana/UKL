/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaancoba;

/**
 *
 * @author Syahren Maulana
 */
public class listSiswa {
    //pemeberian nilai pada array "listSiswa" dengan tipe class Siswa
    siswa[] listSiswa = {
        new siswa(1, "Fahmi", "Kediri", "08212", false),
        new siswa(2, "Iwann", "Kediri", "08123", true),
        new siswa(3, "Hidayat", "Kediri", "08122", true),
    };
    
    //method untuk menampilkan data list siswa
    public void viewSiswa(){
        System.out.println("--- List Siswa ---");
        System.out.println("ID \t Nama \t\t Alamat \t\t Status");
        for (int i = 0; i < listSiswa.length; i++) {
            System.out.println(listSiswa[i].getIdSiswa(0) +" \t "+
                    listSiswa[i].getNama(0)+" \t\t "+
                    listSiswa[i].getAlamat(0) +" \t\t "+
                    listSiswa[i].getStatus());
        }
    }
    
    public int cariSiswa(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 1; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa(0) == id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }
}
