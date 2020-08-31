/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pakody;

import java.util.InputMismatchException;
import java.util.Scanner;
import static uts_pakody.Add.tambah;
import static uts_pakody.Remove.remove;
import static uts_pakody.Search.Search;
/**
 *
 * @author HP
 */
public class Beranda {
    
    public static Scanner Input() {
        return new Scanner(System.in);
    }
    
    public static void Menu() {
        
        System.out.println("\n(KOPDES) Koperasi Desa Menabung :"
                + "\n 1. Add"
                + "\n 2. Remove All"
                + "\n 3. Search");
        Pilih();
    }
    public static void Pilih(){
         boolean stats = true;
        int Nilai = 0;
        while (stats) {            
            try {
                stats = false;
                System.out.print("pilih menu {1-3} : ");
                Nilai = Input().nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Masukkan Harus Berupa Angka");
                stats = true;
                Nilai = Input().nextInt();
            }
        } 
        switch (Nilai) {
            case 1: tambah();break;
            case 2: remove();break;
            case 3: Search();break;
        }
        Menu();
      }
}
