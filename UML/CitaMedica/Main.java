/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citamedica;

/**
 *
 * @author nahue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CitaMedica B45 = new CitaMedica("15/04/1845", "15:00");
        Profesional Pedro = new Profesional("Alfonso", "Urologo");
        Paciente Juan = new Paciente("Manuel", "Osde");

        B45.setProfesional(Pedro);
        B45.setPaciente(Juan);
        System.out.println(B45);
    }
    
}
