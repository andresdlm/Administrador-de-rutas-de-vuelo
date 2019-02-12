package tatteo;

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;
import java.lang.RuntimeException;

public class MatrizDeAdyacencia {
    private final int maxV; //Maximo de vertices
    private final int maxA; //Maximo de aristas
    private int aristas;
    private int matriz[][];


    public MatrizDeAdyacencia(int nroVertices, int nroAristas) {
        maxV = nroVertices;
        maxA = nroAristas;

        this.aristas = 0;

        matriz = new int[maxV][maxA];

        for (int i = 0; i < getMaxV(); i++) {
            for (int j = 0; j < getMaxV(); j++) {
                matriz[i][j] = 0;
            }
        }
    }

    //Creando un grafo usando el numero de vertices como parametro
    public MatrizDeAdyacencia(int nroVertices) {
        this(nroVertices, nroVertices);
    }

    public int getMaxV() {
        return maxV;
    }

    public int getMaxA() {
        return maxA;
    }
    
    /*
    Insertar una arista dada la relacion entre el vertice 1 y el vertice 2 y la distancia entre ellos 
    Vertices y las distancia entre ellos son los parametros
    */


    public void insertaArista(int v1, int v2, int d)
            throws ArrayIndexOutOfBoundsException, UnsupportedOperationException {
        if (v1 >= maxV || v2 >= maxV) {
            throw new ArrayIndexOutOfBoundsException(
                    "Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMaxV() - 1));
        } else if (aristas == maxA) {
            throw new UnsupportedOperationException("No se puede añadir más aristas");
        } else {
            matriz[v1][v2] = d;
        }
    }

    /*
    Metodo para saber si hay un camino entre 2 vertices dados
    Parametros: vertice 1 y 2
    */

    public boolean existeArista(int v1, int v2) {
        if (v1 >= maxV || v2 >= maxV) {
            throw new ArrayIndexOutOfBoundsException(
                    "Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMaxV() - 1));
        } else if (matriz[v1][v2] != 0) {
            return true;
        }
        return false;
    }

    /*
    Eliminar arista
    Parametros: vertices 1 y 2
    */

    public void eliminaArista(int v1, int v2) {
        if (v1 >= maxV || v2 >= maxV) {
            throw new ArrayIndexOutOfBoundsException(
                    "Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMaxV() - 1));
        } else if (matriz[v1][v2] == 0) {
            System.err.println("La arista NO existe");
        } else {
            matriz[v1][v2] = 0;
        }
    }


    public void imprimirMatriz() {
        System.out.print(" ");
        for (int i = 0; i < maxV; i++) {
            System.out.printf("  %3d", i);
        }
        System.out.println();
        for (int i = 0; i < maxV; i++) {
            System.out.printf(" %3d", i);
            for (int j = 0; j < maxV; j++) {
                System.out.printf(" %3d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}