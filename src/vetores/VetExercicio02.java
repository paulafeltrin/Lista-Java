/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author Paula
 */
public class VetExercicio02 {
    public static void vetEx02(String[] args) {
        int[] cpf = {7, 2, 8, 3, 1, 6, 2, 4, 0, 2, 9};
        int mult = 10;
        int soma = 0;
        int firstDig = 0;
        int secondDig = 0;
        for (int i = 0; i < (cpf.length - 2); i++){
            int resMult = cpf[i] * mult;
            soma = soma + resMult;
            firstDig = cpf.length - (soma % cpf.length);
            mult--;
        }
        for (int i = 0; i < (cpf.length - 1); i++){
            int resMult = cpf[i] * mult;
            soma = soma + resMult;
            secondDig = cpf.length - (soma % cpf.length);
            mult--;
        }
        System.out.println("Primeiro dígito verificador " + firstDig);
        System.out.println("Segundo dígito verificador " + secondDig);
    }
}
