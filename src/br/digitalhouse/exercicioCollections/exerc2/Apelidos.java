package br.digitalhouse.exercicioCollections.exerc2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apelidos {
    public static void main(String[] args) {

        List<String> joao = new ArrayList<>();
        joao.add("Juan");
        joao.add("Fissura");
        joao.add("Maromba");

        List<String> miguel = new ArrayList<>();
        miguel.add("Night Watch");
        miguel.add("Bruce Wayne");
        miguel.add("Tampinha");

        List<String> maria = new ArrayList<>();
        maria.add("Wonder Woman");
        maria.add("Mary");
        maria.add("Marilene");

        List<String> lucas = new ArrayList<>();
        lucas.add("Lukinha");
        lucas.add("Jorge");
        lucas.add("George");

        Map<String, ArrayList> apelidos = new HashMap<>();
        apelidos.put("João", (ArrayList) joao);
        apelidos.put("Miguel", (ArrayList) miguel);
        apelidos.put("Maria", (ArrayList) maria);
        apelidos.put("Lucas", (ArrayList) lucas);

    }
}
