/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princi;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Dilan y Camilo
 */ 
public class Pinci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();

        int opcion = 0;
        do {
            String menu = "---- MENU ----\n"
                    + "1. Insertar Nodo\n"
                    + "2. Desplegar lista\n"
                    + "3. Buscar Nodo\n"
                    + "4. Modificar Nodo\n"
                    + "5. Eliminar Nodo\n"
                    + "6. Sumar\n"
                    + "7. Restar\n"
                    + "8. Multiplicar\n"
                    + "9. Dividir\n"
                    + "10. Encontrar Maximo\n"
                    + "11. Encontrar Minimo\n"
                    + "12. Salir\n"
                    + "Seleccione una opción:";
            String opcionStr = JOptionPane.showInputDialog(null, menu);
            opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    lista.InsertarNodo();
                    break;
                case 2:
                    lista.Desplegarlista();
                    break;
                case 3:
                    lista.BuscarNodo();
                    break;
                case 4:
                    lista.ModificarNodo();
                    break;
                case 5:
                    lista.EliminarNodo();
                    break;
                case 6:
                    lista.Sumar();
                    break;
                case 7:
                    lista.Restar();
                    break;
                case 8:
                    lista.Multiplicar();
                    break;
                case 9:
                    lista.Dividir();
                    break;
                case 10:
                    lista.Maximo();
                    break;
                case 11:
                    lista.Minimo();
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 12);
    }
}