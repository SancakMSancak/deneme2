package com.MustafaSancak;

public class _6_SayıDönüşümü {
    public static void main(String[] args) {
        // Veri girişi
        int decimal=25,
                adecimal=100;

        // Sekizlik tabana dönüştürme
        String octa= Integer.toOctalString(decimal);
        System.out.println(decimal + " sayısının sekiz tabanındaki karşılığı: " + octa);

        // ikilik tabana dönüştürme
        String duo= Integer.toBinaryString(decimal);
        System.out.println(decimal + " sayısının iki tabanındaki karşılığı: " + duo);

        // Onaltılık tabana dönüştürme
        String sixty= Integer.toHexString(adecimal);
        System.out.println(adecimal + " sayısının onaltılık tabandaki karşılığı: " + sixty);


    }
}
