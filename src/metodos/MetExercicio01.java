/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class MetExercicio01 {
    public static void metEx01(String[] args) {
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
            float num01 = menu.nextInt();

            System.out.println("Digite o segundo valor: ");
            float num02 = menu.nextFloat();
            float resultado = 0;

            switch (opcao) {
                case 1:
                    mensagem("Opção Adição Selecionado\\n");
                    resultado = soma(num01, num02);
                    break;
                case 2:
                    mensagem("Opção Subtração Selecionado\\n");
                    resultado = subtracao(num01, num02);
                    break;
                case 3:
                    mensagem("Opção Multiplicação Selecionado\\n");
                    resultado = multiplicacao(num01, num02);
                    break;
                case 4:
                    mensagem("Opção Divisão Selecionado\\n");
                    resultado = divisao(num01, num02);
                    break;
                default:
                    mensagem("Opção Inválida!\\n");
                    break;
            }
            System.out.print("O resultado é: " + resultado + "\\n");
            System.out.print("|-----------------------------|\\n");
        }
    }
    public static void mensagem(String msg){
        System.out.print(msg);
    }

    public static float soma(float n1, float n2){
        float res = n1 + n2;
        return res;
    }

    public static float subtracao(float n1, float n2){
        float res = n1 - n2;
        return res;
    }

    public static float divisao(float n1, float n2){
        float res = n1 / n2;
        return res;
    }

    public static float multiplicacao(float n1, float n2){
        float res = n1 * n2;
        return res;
    }
}
