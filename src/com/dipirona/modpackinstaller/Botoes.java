package com.dipirona.modpackinstaller;

import javax.swing.*;
import java.awt.*;

public class Botoes {



    public static void botao1(JFrame iconef) {

        JButton b1 = new JButton("FTB Infinity");
        b1.setBounds(140, 50, 100, 60);
        b1.setSize(100, 60);
        b1.setMaximumSize(new Dimension(100,60));
        b1.setFont(new Font("Arial", Font.BOLD, 10));
        iconef.add(b1);
        b1.addActionListener(e -> {
            ModpackInstaller ftbInstaller = new FtbAniversarioInstaller();
            try {
                ftbInstaller.instalarModpack();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
    public static void botao2(JFrame iconef) {
        JButton b2 = new JButton("Modpack 2");
        {
            b2.setBounds(140, 140, 100, 60);
            b2.setSize(100, 60);
            b2.setMaximumSize(new Dimension(100,60));
            b2.setFont(new Font("Arial", Font.BOLD, 10));
            iconef.add(b2);
        }

        b2.addActionListener(e -> System.out.println("sem evento"));
    }
    public static void botao3(JFrame iconef) {
        JButton b3 = new JButton("Modpack 3");
        {
            b3.setBounds(140, 230, 100, 60);
            b3.setSize(100, 60);
            b3.setMaximumSize(new Dimension(100,60));
            b3.setFont(new Font("Arial", Font.BOLD, 10));
            iconef.add(b3);
        }
        b3.addActionListener(e -> System.out.println("sem evento"));
    }

}
