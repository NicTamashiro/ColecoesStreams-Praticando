package AcessandoElementos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("Joao");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println("A segunda pessoa da lista eh: " + funcionarios.get(1));
        System.out.println("Total de funcionarios: " + funcionarios.size());
    }
}
