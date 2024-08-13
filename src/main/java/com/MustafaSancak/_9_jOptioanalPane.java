package com.MustafaSancak;

import javax.swing.JOptionPane;

public class _9_jOptioanalPane {
    public static void main(String[] args) {
        // Kullanıcıya basit bir iletişim kutusu gösterme
        JOptionPane.showMessageDialog(null, "Hoşgeldiniz!");

        // Kullanıcıdan metin girişi almak
        String ad = JOptionPane.showInputDialog("Adınız nedir?");
        JOptionPane.showMessageDialog(null, "Merhaba " + ad + " Bey, Hoşgeldiniz!");

    }
}
