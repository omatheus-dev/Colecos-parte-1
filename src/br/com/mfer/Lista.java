package br.com.mfer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    public static void main(String args[]) {
        listaDeNomes();
    }

    private static void listaDeNomes() {
        List<Nome> lista = new ArrayList<Nome>();

        Nome a = new Nome("Matheus Ferreira");
        Nome b = new Nome("Rafaela da Silva");
        Nome c = new Nome("Bruno Oliveira");
        Nome d = new Nome("Amanda Santos");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);

        System.out.println("***** Ordenando de forma alfabética ******");
        Collections.sort(lista);
        System.out.println(lista);

    }
}
