package com.MustafaSancak;

import java.util.Scanner;

public class _8_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı isteyelim
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt(); // Kullanıcıdan sayı girişi alınır.

        System.out.println("Girdiğiniz sayı:" + sayi);

        // Program bitince scanner nesnesi kapatılır.
        scanner.close();
    }
}
