/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackcomplex;

/*Importamos para poder usar las funciones del Satck*/
import java.util.Stack;

/**
 *
 * @author const
 */
public class StackComplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Con la funcion push podemos agregar datos al Stack desde la posicion 
        0 de este*/
        Stack pila = new Stack();
        pila.push("Eliseo"); 
        pila.push("Bradly");
        pila.push("Andre");
        pila.push("Harry");
        pila.push("Duran");
        
        
        
        
        
        
        
        /*Con Peek podemos encontrar el ultimo elemento de la pila*/
        System.out.println("El ultimo elemento de la fila es: "+pila.peek());
        
     
        /*con search podemos encontrar la posicion del elemento buscado*/
        
        System.out.println("Posicion de persona a buscar en la lista: "+ pila.search("Bradly"));
        System.out.println("Alumnos atendidos en orden del ultimo al primero: ");
        /*Con empty podemos saber si la pila esta vacia o no
        Podemos usarlos en bucles como el de este ejemplo para
        recorrar toda la fila hasta que esta vacia
        */
        while(pila.empty()==false){
            /*Con Pop eliminamos el ultimo elemento agregado a la pila*/
            System.out.println("Atendiendo a: "+pila.pop());
        }
        
    }
    
}
