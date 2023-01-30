/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class VetExercicio01 {

    /**
     *
     *
     * @param args
     */
    public static void vetEx01(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner teclado = new Scanner(System.in);
        String resultado = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor do 1º Vetor: ");
            array1[i] = teclado.nextInt();
	    System.out.print("Informe o " + (i + 1) + "º valor do 2º Vetor: ");
	    array2[i] = teclado.nextInt();
            array3[i] = array1[i] * array2[i];
            resultado = resultado + array3[i] + " ";
        }
        System.out.println("--=--=--=--=--=--=--=--");
        System.out.println(resultado);
    }
}
