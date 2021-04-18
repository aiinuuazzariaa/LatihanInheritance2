/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance2;

/**
 *
 * @author MOKLET-2
 */
public class Inheritance extends LatihanInheritance2{
    String nama;
    
    public void iden(String nama){
        this.nama = nama;
        System.out.println(nama+" adalah siswi SMK TELKOM MALANG");
        System.out.println(nama+" memilih jurusan RPL");
    }
}
