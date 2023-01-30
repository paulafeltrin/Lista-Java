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
public class DecExercicio02 {
    public static void decEx02(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int primeiroValor = ler.nextInt();

        System.out.print("Valor 2: ");
        int segundoValor = ler.nextInt();

        System.out.print("Valor 3: ");
        int terceiroValor = ler.nextInt();

        if (primeiroValor < segundoValor){
            if (segundoValor < terceiroValor) {
                System.out.println(primeiroValor + ", "+segundoValor+", " + terceiroValor);
            } else if (primeiroValor < terceiroValor) {
                System.out.println(primeiroValor + ", "+terceiroValor+", " + segundoValor);
            } else {
                System.out.println(terceiroValor + ", "+primeiroValor+", " + segundoValor);
            }
        } else if (segundoValor >= terceiroValor) {
            System.out.println(terceiroValor + ", " + segundoValor + ", " + primeiroValor);
        } else {
            if (primeiroValor < terceiroValor){
                System.out.println(segundoValor + ", "+primeiroValor+", " + terceiroValor);
            } else {
                System.out.println(segundoValor + ", "+terceiroValor+", " + primeiroValor);
            }
        }
    }
}
