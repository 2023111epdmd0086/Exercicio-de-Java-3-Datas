package com.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        // Definir uma data globlal para ser convertida em uma data local (timezone do sistema)
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma hora no formato: YYYY-MM-ddTHH:mm:ssZ");
        String data = sc.nextLine();
        System.out.println(convertGlobal(data));
        sc.close();
    }

    public static String convertGlobal(String date){
        Instant data = Instant.parse(date);
        LocalDateTime r1 = LocalDateTime.ofInstant(data, ZoneId.systemDefault());
        return r1.toString();
    }
}
