/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2;
import java.util.Scanner;
/**
 *
 * @author bagas
 */
public class UKL2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola (r): ");
        double radius = scanner.nextDouble();

        double luasPermukaan = 4 * Math.PI * Math.pow(radius, 2);

        System.out.printf("Luas permukaan bola dengan jari-jari % .2f adalah %.2f\n", radius, luasPermukaan);

        
        scanner.close();
    }
  public static double hitungLuasPermukaanBola(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    
  }
  }