package CriandoMapClients;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> clients = new HashMap<>();

        clients.put(1, "Nicolas");
        clients.put(2, "Marcos");
        clients.put(3, "Caue");

        System.out.println("O nome do cliente com ID 2 eh: " + clients.get(2));
    }
}
