package com.mycompany.examen2p1_fernandogomez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gusanito {

    public ArrayList<String> instrucciones;
    public char[][] tablero;
    public int xGusano, yGusano, xManzana, yManzana;

    // contructor
    public Gusanito(int n, int m) {
        int x = 0;
        this.instrucciones = new ArrayList<>();
        this.tablero = new char[n][m];
        if (n > m) {
            x = m;
        } else {
            x = n;
        }
        int dice1 = new Random().nextInt((x - 0) + 1) + 0;
        int dice2 = new Random().nextInt((x - 0) + 1) + 0;
        int dice3 = new Random().nextInt((x - 0) + 1) + 0;
        int dice4 = new Random().nextInt((x - 0) + 1) + 0;

        System.out.print("Valores aleatorios: ");
        this.xGusano = dice1;
        this.yGusano = dice2;
        this.xManzana = dice3;
        this.yManzana = dice4;
        System.out.println("gusX = " + this.xGusano + ", gusY = " + this.yGusano + ", manX = " + xManzana + ", manY = " + yManzana);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == xGusano && j == yGusano) {
                    tablero[i][j] = 'G';
                } else if (i == xManzana && j == yManzana) {
                    tablero[i][j] = 'M';
                } else {
                    tablero[i][j] = '.';
                }
            }
        }
    }

    public void agregarInstruccion(String instruccion) {
        this.instrucciones.add(instruccion);
    }

    public void mover() {
        for (String instruccion : instrucciones) {
            int magnitud = Integer.parseInt(instruccion.substring(0, instruccion.length() - 2));
            char direccion = instruccion.charAt(instruccion.length() - 2);
            int xDestino = xGusano;
            int yDestino = yGusano;
            switch (direccion) {
                case 'U':
                    xDestino -= magnitud;
                    break;
                case 'D':
                    xDestino += magnitud;
                    break;
                case 'R':
                    yDestino += magnitud;
                    break;
                case 'L':
                    yDestino -= magnitud;
                    break;
                default:
                    System.out.println("Instrucción inválida: " + instruccion);
                    continue;
            }
            if (xDestino < 0 || xDestino >= tablero.length || yDestino < 0 || yDestino >= tablero[0].length) {
                System.out.println("El gusano se salió del tablero: " + instruccion);
                continue;
            }
            if (tablero[xDestino][yDestino] == 'M') {
                System.out.println("El gusano encontró la manzana!");
            }
            tablero[xGusano][yGusano] = '.';
            tablero[xDestino][yDestino] = 'G';
            xGusano = xDestino;
            yGusano = yDestino;
            imprimirTablero();
        }
    }

    private void imprimirTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

            }

        }
    }
}
