/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author galih
 */
public class Array2Muldi2 {
    int nis [] [] = {{210651}, {210651}, {210651}};
    String nama [] [] = { {"Ade"}, {"Galih"}, {"Baihaqi"}};
    
    public void namanis (int n){
        for (int i = 0; i< 1; i++){
            for (int j = 0; j< 1; j++){
                System.out.println(nama[1][j]+":"+nis[2][i]);
        }
    }
    }
public static void main (String [] args) {
    Array2Muldi2 siswa = new Array2Muldi2 ();
    
    siswa.namanis(0);
}        
}
