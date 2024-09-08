package com.MustafaSancak;

public class _14_SayiDonusturme {
    public static void main(String[] args) {
        // Otomatik Dönüşüm (Implicit Casting)
        int sayi1 = 5;
        double sayi2 = sayi1; // int tipindeki sayi1 double tipine
                              // otomatik olarak dönüştürülür.
        System.out.println("sayi2: " + sayi2);

        // Açık dönüşüm (Explicit Casting)
        double sayi3 = 10.5;
        int sayi4 = (int) sayi3; // double tipindeki sayi3
                                 // int tipine açık olarak
                                 // dönüştürülür.
        System.out.println("sayi4: " + sayi4);
    }
}
