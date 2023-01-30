/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasDeDecisao;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class DecExercicio03 {
    public static void decEx03(String[] args) {
	Scanner ler = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int primeiroValor = ler.nextInt();
        System.out.print("Valor 2: ");
        int segundoValor = ler.nextInt();
        System.out.print("Valor 3: ");
        int terceiroValor = ler.nextInt();
        System.out.print("Valor 4: ");
        int quartoValor = ler.nextInt();
        System.out.print("Valor 5: ");
        int quintoValor = ler.nextInt();

        System.out.println("\nRESPOSTA: os valores que são divisíveis por 2 OU por 3 são:");

        if ((primeiroValor %2 == 0) || (primeiroValor %3 == 0)){
            System.out.println(primeiroValor);
        }
        if ((segundoValor %2 == 0) || (segundoValor %3 == 0)){
            System.out.println(segundoValor);
        }
        if ((terceiroValor %2 == 0) || (terceiroValor %3 == 0)){
            System.out.println(terceiroValor);
        }
        if ((quartoValor %2 == 0) || (quartoValor %3 == 0)){
            System.out.println(quartoValor);
        }
        if ((quintoValor %2 == 0) || (quintoValor %3 == 0)){
            System.out.println(quintoValor);
        }
    }
}
