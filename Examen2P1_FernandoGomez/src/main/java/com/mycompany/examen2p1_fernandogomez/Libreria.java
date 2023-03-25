package com.mycompany.examen2p1_fernandogomez;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {

    public ArrayList<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(ArrayList<String> titulos) {
        this.titulos = titulos;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public ArrayList<String> titulos;
    public ArrayList<String> autores;

    public Libreria() {//contructos de libros
        this.titulos = new ArrayList<String>();
        this.autores = new ArrayList<String>();
    }

    public void mostrarOpciones() {
        this.titulos.add("Farenheit451");
        this.autores.add("No recuerdo");
        this.titulos.add("Harry Potter");
        this.autores.add("Jk Rowling");
        Scanner entrada = new Scanner(System.in);
        boolean salir = true;
        while (salir) {
            System.out.println("Libreria");
            System.out.println("1 Agregar libro");
            System.out.println("2 Eliminar libro");
            System.out.println("3 Listar");
            System.out.println("4 Buscar por Titulo");
            System.out.println("5 Regresar al menu");
            System.out.print("Opcion: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 1:
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del libro:");
                    String titulo = entrada.nextLine();
                    System.out.println("Ingrese el nombre del autor:");
                    String autor = entrada.nextLine();
                    agregarLibro(titulo, autor);
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                 /*   System.out.println("Quiere eliminar por nombre/1 o posision/cualquier otro numero");
                    int op = entrada.nextInt();
                   if (op == 1) {
                        System.out.println("Ingrese el título del libro que desea eliminar:");
                        titulo = entrada.nextLine();
                        eliminarLibro(titulo);
                    } else {*/
                        System.out.println("Ingrese el indice del libro que desea eliminar");
                        int ind = entrada.nextInt();
                        eliminaciondeLibro(ind);
                   // }

                    break;
                case 3:
                    entrada = new Scanner(System.in);
                    listarLibros();
                    break;
                case 4:
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese el título del libro que desea buscar:");
                    titulo = entrada.nextLine();
                    buscarLibro(titulo);
                    break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    public void agregarLibro(String titulo, String autor) {
        this.titulos.add(titulo);
        this.autores.add(autor);
        System.out.println("Libro agregado correctamente.");
    }

   /* public void eliminarLibro(String titulo) {
        if (this.titulos.contains(titulo)){
        int obj = this.titulos.indexOf(titulo)-1;
        this.titulos.remove(obj);
        this.autores.remove(obj);
        System.out.println("Libro eliminado correctamente.");}
        else{
            System.out.println("El libro no se puedo eliminar");
        }
    }*/

    public void eliminaciondeLibro(int ind) {
        if (ind > this.titulos.size()) {
            System.out.println("la lista es mas pequeña que el indice colocado");
        } else {
            this.titulos.remove(ind);
            this.autores.remove(ind);
            System.out.println("Libro eliminado correctamente.");
        }
    }

    public void buscarLibro(String titulo) {
        if (this.titulos.contains(titulo)) {
            System.out.println("El Libro se encuentra en la libreria ");
        } else {
            System.out.println("El libro no se encunetra en la libreria ");
        }
    }

    public void listarLibros() {
        System.out.println("Libros:");
        for (int i = 0; i < this.titulos.size(); i++) {
            System.out.println("Libro" + i);
            System.out.println("Título: " + this.titulos.get(i));
            System.out.println("Autor: " + this.autores.get(i));
        }
        System.out.println("-----------------------");
    }

}
