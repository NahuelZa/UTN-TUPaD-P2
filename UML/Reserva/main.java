/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reserva;

/**
 *
 * @author nahue
 */
public class main {

    public static void main(String[] args) {
        Mesa A12 = new Mesa(445, "15 personas");
        Cliente Juan = new Cliente("Juan", 42441244);
        Reserva A145 = new Reserva("15/04/4877", "15:00", A12);
        A145.setCliente(Juan);
        System.out.println(A145);

    }
}
