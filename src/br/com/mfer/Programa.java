package br.com.mfer;

import java.util.*;

public class Programa {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        List<String> list = new ArrayList<>();
        List<String> listM = new ArrayList<>();
        List<String> listF = new ArrayList<>();

        System.out.print("Digite o nome das pessoas separados por vírgula seguido de um espaço: ");
        String nome = sc.nextLine();
        String[] nomes = nome.split(", ");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Qual o sexo de " + nomes[i] + " (f/m): ");
            char sexo = sc.nextLine().charAt(0);
            if (sexo == 'f') {
                listF.add(nomes[i]);
            } else {
                listM.add(nomes[i]);
            }
        }

        for (int i = 0; i < nomes.length; i++) {
            list.add(nomes[i]);
        }

        // Imprime os nomes sem ordenação e, em seguida, os nomes ordenados em ordem alfabética
        System.out.println();
        System.out.println("Sem ordenação: " + list);
        Collections.sort(list); //ordem alfabética
        System.out.println("Com ordenação: " + list);
        System.out.println();

        // Imprime os nomes separados por sexo
        System.out.println("Pessoas do sexo Feminino: " + listF);
        System.out.println("Pessoas do sexo Masculino: " + listM);

        sc.close();
    }
}
