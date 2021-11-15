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
public class listBuku {
    Buku[] listBuku = {
        new Buku(1, "Biografi Soekarno", 2),
        new Buku(2, "Belajar Bahasa Inggris", 10),
        new Buku(3, "Tutorial NetBeans Java", 3),
        new Buku(4, "Manga Naruto Vol. 1", 8),
        new Buku(5, "Manga Naruto Vol. 2", 5),
    };
    
    //method untuk menampilkan data list buku
    public void viewBuku(){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Judul \t\t Stok");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku() + " \t " +
                    listBuku[i].getJudulBuku() + " \t\t " +
                    listBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }
            
            
}
