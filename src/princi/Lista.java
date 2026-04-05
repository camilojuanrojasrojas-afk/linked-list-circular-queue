/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princi;
import javax.swing.JOptionPane;
/**
 *
 * @author Dilan y Camilo
 */
public class Lista {
    Nodo primero;
    Nodo ultimo;
    public Lista() {
        primero = null;
        ultimo = null;
    }
    public void InsertarNodo (){
        Nodo nuevo = new Nodo ();
        String dato = JOptionPane.showInputDialog("Ingrese el dato que contendra el nodo:");
        nuevo.dato = Integer.parseInt(dato);
        if (primero == null){
            primero = nuevo;
            ultimo = nuevo;
            primero.siguiente = primero;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Nodo ingresado con exito");
    }
    public void Desplegarlista (){
        Nodo actual = new Nodo();
        actual = primero;
        String lista = "";
        if (primero != null){
            do{
                lista += actual.dato + "\n";
                actual=actual.siguiente;
            }while (actual != primero);
            JOptionPane.showMessageDialog(null, lista);
        } else {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }
    }
    public void BuscarNodo(){
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        String nodoBuscado = JOptionPane.showInputDialog("Ingrese el dato del nodo a buscar:");
        if (primero != null){            
            do{
                if (actual.dato == Integer.parseInt(nodoBuscado)){
                    JOptionPane.showMessageDialog(null, "Nodo con el dato ("+ nodoBuscado +") encontrado");
                    encontrado = true;
                }
                actual=actual.siguiente;
            }while (actual != primero && encontrado != true);            
            if (!encontrado){
                JOptionPane.showMessageDialog(null, "Nodo no encontrado");
            }            
        } else {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }     
    }
    public void ModificarNodo(){
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        String nodoBuscado = JOptionPane.showInputDialog("Ingrese el dato del nodo a buscar para modificar:");
        if (primero != null){            
            do{
                if (actual.dato == Integer.parseInt(nodoBuscado)){
                    JOptionPane.showMessageDialog(null, "Nodo con el dato ("+ nodoBuscado +") encontrado");
                    String nuevoDato = JOptionPane.showInputDialog("Ingrese el nuevo dato para este Nodo:");
                    actual.dato = Integer.parseInt(nuevoDato);
                    JOptionPane.showMessageDialog(null, "Nodo modificado con exito");
                    encontrado = true;
                }
                actual=actual.siguiente;
            }while (actual != primero && encontrado != true);            
            if (!encontrado){
                JOptionPane.showMessageDialog(null, "Nodo no encontrado");
            }            
        } else {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }     
    }
   public void EliminarNodo(){
    Nodo actual = new Nodo();
    actual = primero;
    Nodo anterior = new Nodo();
    anterior = null;
    boolean encontrado = false;
    String nodoBuscadoStr = JOptionPane.showInputDialog(null, "Ingrese el dato del nodo a buscar para eliminar:");
    int nodoBuscado = Integer.parseInt(nodoBuscadoStr);
    if (primero != null){
        do{
            if (actual.dato == nodoBuscado){
                JOptionPane.showMessageDialog(null, "Nodo con el dato (" + nodoBuscado + ") encontrado");
                if (actual == primero){
                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                } else if (actual == ultimo){
                    anterior.siguiente = primero;
                    ultimo = anterior;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                JOptionPane.showMessageDialog(null, "Nodo eliminado con exito");
                encontrado = true;
            }
            anterior = actual;
            actual = actual.siguiente;    
        } while (actual != primero && !encontrado);
        if (!encontrado){
            JOptionPane.showMessageDialog(null, "Nodo no encontrado");
        }
    } else {
        JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
    }
  }
    public int SumarDatos(){
    Nodo actual = new Nodo();
    actual = primero;
    int suma = 0;
    if (primero != null){
        do{
            suma += actual.dato;
            actual=actual.siguiente;
        }while (actual != primero);
    }
    return suma;
}
    public void Sumar(){
    int suma = SumarDatos();
    JOptionPane.showMessageDialog(null, "La suma de los datos de la lista es: " + suma);
}
    public int RestarDatos() {
        Nodo actual = primero;
        int resta = actual.dato;
        actual = actual.siguiente;
        while (actual != primero) {
            resta -= actual.dato;
            actual = actual.siguiente;
        }
        return resta;
    }


    public void Restar() {
        int resta = RestarDatos();
        JOptionPane.showMessageDialog(null, "La resta de los datos de la lista es: " + resta);
    }
    public int MultiplicarDatos() {
    Nodo actual = primero;
    int multiplicacion = 1;
    if (primero != null) {
        do {
            multiplicacion *= actual.dato;
            actual = actual.siguiente;
        } while (actual != primero);
    }
    return multiplicacion;
}

    public void Multiplicar() {
        int multiplicacion = MultiplicarDatos();
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación de los datos de la lista es: " + multiplicacion);
    }
    public double DividirDatos() {
        Nodo actual = primero;
        double division = 0;
        if (primero != null) {
            division = actual.dato; // Inicializar con primer elemento
            actual = actual.siguiente;
            while (actual != primero) {
                division /= actual.dato;
                actual = actual.siguiente;
            }
        } else {
            System.out.println("No se puede realizar la división, la lista está vacía.");
        }
        return division;
    }


    public void Dividir() {
        double division = DividirDatos();
        JOptionPane.showMessageDialog(null, "El resultado de la división de los datos de la lista es: " + division);
    }
    public int EncontrarMaximo() {
    Nodo actual = primero;
    int maximo = Integer.MIN_VALUE;
    if (primero != null) {
        do {
            if (actual.dato > maximo) {
                maximo = actual.dato;
            }
            actual = actual.siguiente;
        } while (actual != primero);
    }
    return maximo;
}

    public void Maximo() {
        int maximo = EncontrarMaximo();
        JOptionPane.showMessageDialog(null, "El valor máximo de la lista es: " + maximo);
    }
    public int EncontrarMinimo() {
    Nodo actual = primero;
    int minimo = Integer.MAX_VALUE;
    if (primero != null) {
        do {
            if (actual.dato < minimo) {
                minimo = actual.dato;
            }
            actual = actual.siguiente;
        } while (actual != primero);
    }
    return minimo;
}

    public void Minimo() {
        int minimo = EncontrarMinimo();
        JOptionPane.showMessageDialog(null, "El valor mínimo de la lista es: " + minimo);
    }
}