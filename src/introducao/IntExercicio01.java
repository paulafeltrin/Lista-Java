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
public class IntExercicio01 {

    /**
     *
     * @param args
     */
    public static void intEx01(String[] args) {
        System.out.print("Digite um valor para o Raio: ");
        Scanner ler = new Scanner(System.in);
        double raio = ler.nextFloat();

        double areaCirculo = 3.141592654 * Math.pow(raio, 2);
        System.out.println("A área do círculo é igal a " + areaCirculo);
    }
}
