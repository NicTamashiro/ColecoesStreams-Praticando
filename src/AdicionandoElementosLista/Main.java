package AdicionandoElementosLista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Joao");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");
        System.out.println("Lista de funcionarios: " + funcionarios);
    }
}
