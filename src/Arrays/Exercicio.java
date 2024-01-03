package Arrays;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidade = new int[5];
        int[] preço = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("digite o nome do produto: ");
            produtos[i] = input.next();
            System.out.println("digite a quantidade: ");
            quantidade[i] = input.nextInt();
            System.out.println("Digite o preço: ");
            preço[i] = input.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("produto cadastrado: " + produtos[i] + " Quantidade: " + quantidade[i] + " Preço: " + preço[i]);
        }

    }

}
