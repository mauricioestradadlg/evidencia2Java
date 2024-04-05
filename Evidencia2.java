import java.util.Scanner;

public class Evidencia2{
    public static void main(String[] args) {


        //arbolBinario();
       

    }

    public static void arbolBinario(){
         // Crear un árbol
         Arbol arbol = new Arbol();

         // Insertar valores en el árbol
         arbol.insertar(10);
         arbol.insertar(5);
         arbol.insertar(15);
         arbol.insertar(3);
         arbol.insertar(7);
         arbol.insertar(12);
         arbol.insertar(17);
 
         // Mostrar el árbol en diferentes órdenes
         System.out.println("Recorrido inorden:");
         arbol.inorden(); // Debería mostrar 3, 5, 7, 10, 12, 15, 17
 
         System.out.println("\nRecorrido preorden:");
         arbol.preorden(); // Debería mostrar 10, 5, 3, 7, 15, 12, 17
 
         System.out.println("\nRecorrido postorden:");
         arbol.postorden(); // Debería mostrar 3, 7, 5, 12, 17, 15, 10
 
 
         // Buscar un valor en el árbol
         int valorBuscar = 12;
         Nodo nodoEncontrado = arbol.buscar(valorBuscar);
         if (nodoEncontrado != null) {
             System.out.println("\nEl valor " + valorBuscar + " se encuentra en el árbol.");
         } else {
             System.out.println("\nEl valor " + valorBuscar + " no se encuentra en el árbol.");
         }
 
         // Eliminar un valor del árbol
         int valorEliminar = 5;
         arbol.eliminar(valorEliminar);
 
         // Mostrar el árbol después de eliminar el nodo
         System.out.println("\nRecorrido inorden después de eliminar el nodo con valor " + valorEliminar + ":");
         arbol.inorden(); // Debería mostrar 3, 7, 10, 12, 15, 17
     }
    }



  
