
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl1;
import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class UKL1 {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan yang ingin diperiksa: ");
        int bilangan = scanner.nextInt();

        if (apakahPrima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }

  
    public static boolean apakahPrima(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return false;
    }
}