package RemovendoElementos;

import java.util.ArrayList;
import java.util.List;

public class RemovendoElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Joao");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println("Lista inicial: " + funcionarios);

        funcionarios.remove("Vitor");
        System.out.println("Lista pos a exclusao: " + funcionarios);
    }
}
