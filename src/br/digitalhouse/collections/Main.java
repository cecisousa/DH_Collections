package br.digitalhouse.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();
        conjunto.add("Erika");
        conjunto.add("Jessica");
        conjunto.add("Camila");
        conjunto.add("Rafa");
        conjunto.remove("Rafa");

        for(String valor: conjunto){
            System.out.println(valor);
        }

        System.out.println("************************************************");

        Map<String, Integer> listaNumerica = new HashMap<>();
        listaNumerica.put("Cecilia", 28);
        listaNumerica.put("Patricia", 26);
        listaNumerica.put("Cecilia", 50);
        listaNumerica.put("Enzo", 2);
        listaNumerica.put("Obama", 20);

        listaNumerica.remove("Obama");

        for(String chave: listaNumerica.keySet()){
            Integer valor = listaNumerica.get(chave);
            System.out.println(valor);
        }

        System.out.println("************************************************");

        List<String> frutas = new ArrayList<>();
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");
        frutas.add("uva");
        frutas.add("pera");
        frutas.remove(4);
        for (String valor: frutas){
            System.out.println(valor);
        }
        String valor = frutas.get(0);
        System.out.println(frutas.get(0));


    }
}
