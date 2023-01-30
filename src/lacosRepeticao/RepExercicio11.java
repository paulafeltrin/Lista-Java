/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosRepeticao;

/**
 *
 * @author Paula
 */
public class RepExercicio11 {
    public static void repEx11(String[] args) {
        int numero = 36;
        int impar = 1;
        int termo = 0;
        do {
            numero -= impar;
            termo++;
            impar += 2;
        } while (numero >= impar);
        System.out.println(termo);
    }
}
