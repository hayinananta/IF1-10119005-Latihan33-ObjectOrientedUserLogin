/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan33.objectorienteduserlogin;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini membuat login berbasis objek
 */
public class Latihan33Login {
    private static String usName, passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        System.out.print("Masukkan Passowrd = ");
        passWord = scanner.next();
        System.out.println();
        User login = new User();
        login.pengecekanLogin(usName, passWord);
    }
    
}
