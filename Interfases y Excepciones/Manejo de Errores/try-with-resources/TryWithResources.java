/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trywithresources;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author nahue
 */
public class TryWithResources {
    public static void main(String[] args){        
    
    LecturaDeArchivo a=new LecturaDeArchivo();
        try {
            a.mostrarTxt("C:\\Users\\nahue\\Documents\\NetBeansProjects\\Lectura de archivo\\src\\lectura\\de\\archivo\\archivo.txt");
        }
        catch(FileNotFoundException fnfe){System.out.println("El archivo no fue encontrado");
            System.out.println(fnfe.getMessage());
            
        }
        catch  (IOException ex){
            System.out.println("Error de E/s");
            System.out.println(ex.getMessage());
        }
}
}