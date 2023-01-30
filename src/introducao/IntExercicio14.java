/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class IntExercicio14 {
    public static void intEx14(String[] args) {
        System.out.print("Digite o primeiro valor: ");
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = ler.nextInt();

        int soma = a + b;
        int subtracao = a - b;
        int mult = a * b;
        int div = a / b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão inteira: " + div);
    }
}
