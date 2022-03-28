package com.dipirona.modpackinstaller;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class interfacegrafica {
        public static void main(String[] args)
        {
            String backup = download_mods.backup();
            String mover = download_mods.mover();
            String mover2 = download_mods.mover2();
            String mover3 = download_mods.mover3();
            String mover4 = download_mods.mover4();
            String mover5 = download_mods.mover5();
            String mover6 = download_mods.mover6();
            String mover7 = download_mods.mover7();
            String modpack1 = download_mods.modpack1();
            String descompactar = download_mods.descompactar();
            String deletar = download_mods.deletar();
            String forge_download = download_mods.forge_download();
            String forge_install = download_mods.forge_install();
            String forge_del = download_mods.forge_del();

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
                b1.addActionListener(e -> {
                    try {
                        Runtime.getRuntime().exec(backup);
                        Runtime.getRuntime().exec(mover);
                        Runtime.getRuntime().exec(mover2);
                        Runtime.getRuntime().exec(mover3);
                        Runtime.getRuntime().exec(mover4);
                        Runtime.getRuntime().exec(mover5);
                        Runtime.getRuntime().exec(mover6);
                        Runtime.getRuntime().exec(mover7);
                        Process p9 = Runtime.getRuntime().exec(modpack1);
                        BufferedReader stdOut =new BufferedReader(new InputStreamReader(p9.getInputStream()));
                        while ((stdOut.readLine())!=null){
                            p9.waitFor();
                        }
                        Process p10 = Runtime.getRuntime().exec(descompactar);
                        BufferedReader stdOut1 =new BufferedReader(new InputStreamReader(p10.getInputStream()));
                        while ((stdOut1.readLine())!=null){
                            p10.waitFor();
                        }
                        Process p11 = Runtime.getRuntime().exec(deletar);
                        BufferedReader stdOut2 =new BufferedReader(new InputStreamReader(p11.getInputStream()));
                        while ((stdOut2.readLine())!=null){
                            p11.waitFor();
                        }
                        Process p12 = Runtime.getRuntime().exec(forge_download);
                        BufferedReader stdOut3 =new BufferedReader(new InputStreamReader(p12.getInputStream()));
                        while ((stdOut3.readLine())!=null){
                            p12.waitFor();
                        }
                        Process p13 = Runtime.getRuntime().exec(forge_install);
                        BufferedReader stdOut4 =new BufferedReader(new InputStreamReader(p13.getInputStream()));
                        while ((stdOut4.readLine())!=null){
                            p13.waitFor();
                        }
                        Process p14 = Runtime.getRuntime().exec(forge_del);
                        BufferedReader stdOut5 =new BufferedReader(new InputStreamReader(p14.getInputStream()));
                        while ((stdOut5.readLine())!=null){
                            p14.waitFor();
                        }
                        JOptionPane.showMessageDialog(null, "Modpack instalado com sucesso!");
                    } catch (IOException | InterruptedException ex) {
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
