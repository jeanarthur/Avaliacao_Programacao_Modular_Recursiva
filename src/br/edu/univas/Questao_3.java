package br.edu.univas;

import java.util.Scanner;

public class Questao_3 {

    public static void main(String[] args) {
        int input = getInput("Digite um número: ");
        System.out.println(printSequence(input));
    }

    public static int getInput(String consoleMessage){
        Scanner scanner = new Scanner(System.in);
        System.out.println(consoleMessage);
        return scanner.nextInt();
    }

    public static int printSequence(int endNumber){
        if (endNumber <= 2){ return endNumber; }
        System.out.println(printSequence(endNumber - 2));
        return endNumber;
    }

}
