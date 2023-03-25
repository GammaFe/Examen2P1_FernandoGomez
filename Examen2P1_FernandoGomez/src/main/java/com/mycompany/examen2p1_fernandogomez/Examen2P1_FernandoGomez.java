package com.mycompany.examen2p1_fernandogomez;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Examen2P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        JFrame ventana = new JFrame();
        ventana.setSize(600, 450);

        JButton boton1 = new JButton("Libros y mas libros");
        JButton boton2 = new JButton("Gusanito hambriento");
        JButton boton3 = new JButton("Salir ");
        JLabel titulo = new JLabel("Examen2 Fernando Gomez (°_°)");

        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Usted esta entrando al ejercicio Libros y mas libros");
                Libreria libro = new Libreria();
                libro.mostrarOpciones();

            }
        });

        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Usted esta entrando al ejercicio Gusanito hamriento");
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese N:");
                int n = entrada.nextInt();
                System.out.println("Ingrese M:");
                int m = entrada.nextInt();
                while (n < 4 || n > 10 || m < 4 || m > 10) {
                    System.out.println("Las dimensiones tienen que estar entre 4 y 10 ");
                    System.out.println("Ingrese N:");
                    n = entrada.nextInt();
                    System.out.println("Ingrese M:");
                    m = entrada.nextInt();
                }
                Gusanito gusano = new Gusanito(n, m);

            }
        });

        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        boton1.setBounds(200, 160, 160, 50);
        boton2.setBounds(200, 220, 160, 50);
        boton3.setBounds(200, 280, 160, 50);
        titulo.setBounds(200, 50, 300, 100);
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(titulo);
        ventana.setLayout(null);
        ventana.setVisible(true);

        // Salir del main
    }
}
