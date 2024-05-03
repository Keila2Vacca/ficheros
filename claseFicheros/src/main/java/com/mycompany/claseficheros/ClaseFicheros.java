/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.claseficheros;

import java.io.File;


public class ClaseFicheros {

    public static void main(String[] args) {
        File file = new File ("c:/hola.txt");
        
        if(file.exists()){
            System.out.println("Nombres: " + file.getName());
            System.out.println("Ruta: " + file.getPath());
            System.out.println("Ruta absoluta: " + file.getAbsolutePath());
            System.out.println("¿Permite escribir? " + file.canWrite());
            System.out.println("¿Permite leer? " + file.canRead());
            System.out.println("Tamaño: " + file.length());
        } else{
            System.out.println("El fichero no existe");
        }
    }
}
