package com.MustafaSancak;
import javax.swing.JOptionPane;

public class _10_JOptionalPane_CevapIsletme {
    public static void main(String[] args) {
        int cevap = JOptionPane.showConfirmDialog(null, "Java'yı seviyor musun?");
        if (cevap == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Harika! Java'yı sevmenize sevindim.");
        } else if (cevap == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Üzgünüm");
        } else{
            JOptionPane.showMessageDialog(null, "Lütfen bir seçim yapın!");
        }

    }
}
