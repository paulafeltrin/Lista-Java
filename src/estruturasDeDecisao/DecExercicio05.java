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
public class DecExercicio05 {
    public static void decEx05(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = ler.nextInt();
        String resultado =  "";

        if ((numero >= 1) && (numero <= 9)){
            resultado = "Dentro do valor permitido";
        } else {
            resultado = "Fora do valor permitido";
        }
        System.out.println(resultado);
    }
}
