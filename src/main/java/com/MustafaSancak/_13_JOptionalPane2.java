package com.MustafaSancak;

import javax.swing.*;
import java.awt.*;

public class _13_JOptionalPane2 {

    public static void main(String[] args) {
        System.out.println("JOptionPane");

        Component parentComponent = null;

        // showMessageDialog kullanımı: parent, message, title, messageType
        JOptionPane.showMessageDialog(parentComponent, "Sisteme giriş yapılıyor...", "Soru", JOptionPane.INFORMATION_MESSAGE);

        // Kullanıcıdan veri almak
        String name = JOptionPane.showInputDialog("Lütfen isminizi giriniz: ");
        JOptionPane.showMessageDialog(parentComponent, "Hoşgeldiniz " + name + "!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);



    }
}