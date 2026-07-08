package CalculandoQuadradoDosNum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadradoNumeros = numeros.stream()
                .map(numero -> numero * numero)
                .toList();

        System.out.println("Quadrado dos numeros: " + quadradoNumeros);
    }
}
