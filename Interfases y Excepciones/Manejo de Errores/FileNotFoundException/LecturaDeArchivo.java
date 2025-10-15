/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectura.de.archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nahue
 */
public class LecturaDeArchivo {
    public void mostrarTxt(String ruta)throws FileNotFoundException, IOException{
        File archivo=new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(archivo)); 
        System.out.println(br.readLine());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
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
    

