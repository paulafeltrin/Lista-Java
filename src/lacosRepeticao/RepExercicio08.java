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
public class RepExercicio08 {
    public static void repEx08(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int tabuada = teclado.nextInt();
        int contador = 0;
        do {
        double resultado = tabuada * contador;
        System.out.println(tabuada + " x " + contador + " = " + resultado);
        contador++;
        } while ((contador >= 0) && (contador <= 10));
    }
}
