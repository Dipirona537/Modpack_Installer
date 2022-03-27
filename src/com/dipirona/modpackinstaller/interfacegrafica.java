package com.dipirona.modpackinstaller;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class interfacegrafica {
        public static void main(String[] args)
        {
            String backup = download_mods.backup();
            String mover = download_mods.mover();
            String mover2 = download_mods.mover2();
            String mover3 = download_mods.mover3();
            String mover4 = download_mods.mover4();
            String modpack1 = download_mods.modpack1();
            String descompactar = download_mods.descompactar();
            String temp = download_mods.temp();

            JFrame iconef = new JFrame();
            Image icone = Toolkit.getDefaultToolkit().getImage("icone.png");
            iconef.setTitle("Instalador de Modpacks");
            iconef.setIconImage(icone);
            iconef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iconef.setSize(400,400);
            iconef.setVisible(true);
            //botao 1
            {
                JButton b1 = new JButton("Modpack 1");
                {
                    b1.setBounds(140, 50, 100, 60);
                    b1.setSize(100, 60);
                    b1.setMaximumSize(new Dimension(100,60));
                    b1.setFont(new Font("Arial", Font.BOLD, 10));
                    iconef.add(b1);
                }
                String comando1 = download_mods.comando1();
                b1.addActionListener(e -> {
                    try {
                        Runtime.getRuntime().exec(backup).waitFor();
                        Runtime.getRuntime().exec(mover).waitFor();
                        Runtime.getRuntime().exec(mover2).waitFor();
                        Runtime.getRuntime().exec(mover3).waitFor();
                        Runtime.getRuntime().exec(mover4).waitFor();
                        Runtime.getRuntime().exec(temp).waitFor();
                        Runtime.getRuntime().exec(modpack1).waitFor();
                        Runtime.getRuntime().exec(descompactar).waitFor();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                });
            }

            //botao 2
            {
                JButton b2 = new JButton("Modpack 2");
                {
                    b2.setBounds(140, 140, 100, 60);
                    b2.setSize(100, 60);
                    b2.setMaximumSize(new Dimension(100,60));
                    b2.setFont(new Font("Arial", Font.BOLD, 10));
                    iconef.add(b2);
                }
                String comando2 = download_mods.comando2();
                b2.addActionListener(e -> {
                    try {
                        Runtime.getRuntime().exec(comando2);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
            }

            //botao3
            {
                JButton b3 = new JButton("Modpack 3");
                {
                    b3.setBounds(140, 230, 100, 60);
                    b3.setSize(100, 60);
                    b3.setMaximumSize(new Dimension(100,60));
                    b3.setFont(new Font("Arial", Font.BOLD, 10));
                    iconef.add(b3);
                }
                String comando3 = download_mods.comando3();
                b3.addActionListener(e -> {
                    try {
                        Runtime.getRuntime().exec(comando3);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
            }
        }


}
