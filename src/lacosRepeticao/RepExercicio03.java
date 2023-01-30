/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosRepeticao;

/**
 *
 * @author Paula
 */
public class RepExercicio03 {
    public static void repEx03(String[] args) {
        int num = 1;
        int soma = 0;
        do {
            soma = num + soma;
            num++;
        } while ((num >= 1) && (num <= 500));
        System.out.println("Somatório dos números entre 1 e 500 é: " + soma);
    }
}
