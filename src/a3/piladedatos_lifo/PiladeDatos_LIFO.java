/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3.piladedatos_lifo;

/**
 *
 * @author jmanueltorress
 */
class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class Pila {
    Nodo tope;

    public Pila() { //Metodo constructor
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void push(int valor) { //apilar
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
        System.out.println("Se ha realizado push del valor: " + valor);
    }

    public int pop() { //desapilar
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1; // O lanzar una excepción, dependiendo de tus requisitos
        }

        int valorDesapilado = tope.valor;
        tope = tope.siguiente;
        return valorDesapilado;
    }

    public int obtenerTope() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1; // O lanzar una excepción, dependiendo de tus requisitos
        }

        return tope.valor;
    }
}

public class A3PiladeDatos_LIFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Pila pila = new Pila();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        pila.push(60);
       

        System.out.println("Tope de la pila: " + pila.obtenerTope());

        int valorDesapilado = pila.pop();
        System.out.println("Valor desapilado: " + valorDesapilado);

        System.out.println("Tope de la pila después de pop: " + pila.obtenerTope());
    }
    
}
