package com.MustafaSancak;

public class _2_psvmReserveOperators {

    public static void main(String[] args) {
        // Operators

        int number=10;
        System.out.println(number);

        // artırma (alt: number+=1)

        number++;
        System.out.println("Artırma: " + number);

        number--;
        System.out.println("Azaltma: " + number);

        // Dört işlem

        int num1=20,
                num2=5;
        System.out.println("Toplama: " + (num1 + num2));
        System.out.println("Çıkarma: " + (num1 - num2));
        System.out.println("Bölme: " + (num1 / num2));
        System.out.println("Çarpma: " + (num1 * num2));
        System.out.println("Kalan: " + (num1 % num2));

        // Karşılaştırma
        boolean sonuc= (num1==num2);
        System.out.println("Eşitlik: " + sonuc);

        // değişikliği görmezden gelme
        int numara=123;
        System.out.println("Numara değeri: " + numara);

        int $numara=12;
        System.out.println("Numara değeri: " + numara);
    }
}
