package clases;

import java.util.Scanner;

public class Main_Class {

    public static void main(String[] args) {

        int limit;
        Scanner In = new Scanner(System.in);
        Serie messenger = new Serie();

        System.out.println(" Dame un número límite para buscar primos y te dire cuáles son: ");
        limit = In.nextInt();
        System.out.println("");

        messenger.esPrimo(limit);

    }
}
