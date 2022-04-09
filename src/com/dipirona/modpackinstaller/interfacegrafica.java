package com.dipirona.modpackinstaller;

import javax.swing.*;
import java.awt.*;

public class interfacegrafica {
    public static void main(String[] args){

        JFrame iconef = new JFrame();
        Image icone = Toolkit.getDefaultToolkit().getImage("icone.png");
        iconef.setTitle("Instalador de Modpacks");
        iconef.setIconImage(icone);
        iconef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iconef.setSize(400,400);
        iconef.setVisible(true);
        //botao 1
        Botoes.botao1(iconef);

        //botao 2
        Botoes.botao2(iconef);

        //botao3
        Botoes.botao3(iconef);
    }
}
