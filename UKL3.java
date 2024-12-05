/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3;
import java.util.Scanner;
/**
 *
 * @author bagas
 */
public class UKL3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

    
        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        boolean adaNegatif = false;
        System.out.print("Elemen negatif dalam array: ");
        for (int num : array) {
            if (num < 0) {
                adaNegatif = true;
                System.out.print(num + " ");
            }
        }

    
        if (!adaNegatif) {
            System.out.println("Tidak ada elemen negatif dalam array.");
        }

        scanner.close();

    }
 }
