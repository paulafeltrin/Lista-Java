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
public class DecExercicio04 {
    public static void decEx04(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int a = ler.nextInt();
        System.out.print("Valor 2: ");
        int b = ler.nextInt();

        System.out.print("Valor 3: ");
        int c = ler.nextInt();

        System.out.print("Valor 4: ");
        int d = ler.nextInt();

        System.out.print("Valor 5: ");
        int e = ler.nextInt();

        if ((a < b) && (a < c) && (a < d) && (a < e)){
            System.out.println(a + " é o menor valor");
        } else if ((a > b) && (a > c) && (a > d) && (a > e)){
            System.out.println(a + " é o maior valor");
        }

        if ((b < a) && (b < c) && (b < d) && (b < e)){
            System.out.println(b + " é o menor valor");
        } else if ((b > a) && (b > c) && (b > d) && (b > e)){
            System.out.println(b + " é o maior valor");
        }

        if ((c < a) && (c < b) && (c < d) && (c < e)){
            System.out.println(c + " é o menor valor");
        } else if ((c > a) && (c > b) && (c > d) && (c > e)){
            System.out.println(c + " é o maior valor");
        }

        if ((d < a) && (d < b) && (d < c) && (d < e)){
            System.out.println(d + " é o menor valor");
        } else if ((d > a) && (d > b) && (d > c) && (d > e)){
            System.out.println(d + " é o maior valor");
        }

        if ((e < a) && (e < b) && (e < c) && (e < d)){
            System.out.println(e + " é o menor valor");
        } else if ((e > a) && (e > b) && (e > c) && (e > d)){
            System.out.println(e + " é o maior valor");
        }
    }
}
