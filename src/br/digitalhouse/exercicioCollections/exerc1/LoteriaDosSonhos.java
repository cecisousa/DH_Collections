package br.digitalhouse.exercicioCollections.exerc1;

import java.util.HashMap;
import java.util.Map;

public class LoteriaDosSonhos {
    public static void main(String[] args) {
        Map<Integer, String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        for(Integer chave: loteriaDosSonhos.keySet()){
            String valor = loteriaDosSonhos.get(chave);
            System.out.println(valor);
        }
    }
}
