package com.MustafaSancak;

import java.util.Scanner;
public class _12_Scanner_ileIslemler {
    public static void main(String[] args) {
        System.out.println("Scanner");
        int number=10;
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int scannerNumber=scanner.nextInt();
        System.out.println("Sayınız: " + scannerNumber);

        scanner.close();

}   }
