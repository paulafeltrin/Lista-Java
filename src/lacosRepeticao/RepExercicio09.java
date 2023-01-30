/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosRepeticao;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class RepExercicio09 {
    public static void repEx09(String[] args) {
        Scanner menu = new Scanner(System.in);
        while (true) {
            System.out.print("##--CALCULADORA--##\n");
            System.out.print("| Opção 1 - Adição            |\n");
            System.out.print("| Opção 2 - Subtração         |\n");
            System.out.print("| Opção 3 - multiplicação     |\n");
            System.out.print("| Opção 4 - Divisão           |\n");
            System.out.print("| Opção 5 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.println("Digite uma opção: ");
            int opcao = menu.nextInt();
            if (opcao == 5) {
                System.out.print("Até logo!");
                break;
            }
			
            System.out.println("Digite o primeiro valor: ");
            int num01 = menu.nextInt();

            System.out.println("Digite o segundo valor: ");
            float num02 = menu.nextFloat();
            float resultado = 0;
			
            switch (opcao) {
                case 1:
                    System.out.print("Opção Adição Selecionado\n");
                    resultado = num01 + num02;
                    break;
                case 2:
                    System.out.print("Opção Subtração Selecionado\n");
                    resultado = num01 - num02;
                    break;
                case 3:
                    System.out.print("Opção Multiplicação Selecionado\n");
                    resultado = num01 * num02;
                    break;
                case 4:
                    System.out.print("Opção Divisão Selecionado\n");
                    resultado = num01 / num02;
                    break;
                default:
                    System.out.print("Opção Inválida!\n");
                    break;
            }
            System.out.print("O resultado é: " + resultado + "\n");
            System.out.print("|-----------------------------|\n");
        }
    }
}
