package CalculandoTotalComImposto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalGasto = precosProdutos.stream()
                .reduce(0.0, Double::sum);

        double totalComImposto = totalGasto * 1.08;

        System.out.println("Total antes: "+ String.format("%.2f", totalGasto));
        System.out.println("Total depois: "+ String.format("%.2f", totalComImposto));
    }
}
