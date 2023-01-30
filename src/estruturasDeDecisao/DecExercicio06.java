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
public class DecExercicio06 {
    public static void decEx06(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = ler.nextInt();
        int mult = numero * 2;
        if (mult >= 30){
            System.out.print(numero);
        } else {
                System.out.print("Nada a mostrar :>");
        }
    }
}
