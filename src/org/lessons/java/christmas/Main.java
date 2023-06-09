package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> giftList = new ArrayList<>();
        System.out.println("La lista è vuota? " + giftList.isEmpty());

        boolean stop = false;

        do {
            System.out.print("Inserisci il nome del regalo da aggiungere alla lista (oppure 'stop' per fermarti): ");
            String gift = scanner.nextLine();

            switch (gift) {
                case "stop":
                    stop = true;
                    break;
                default:
                    giftList.add(gift);
                    System.out.println("Lunghezza della lista: " + giftList.size());
                    break;
            }
        } while (!stop);

        Collections.sort(giftList);

        System.out.println("Gift list:");
        for (String item : giftList) {
            System.out.println(item);
        }
        scanner.close();
    }
}
