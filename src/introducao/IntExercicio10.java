/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao;

/**
 *
 * @author Paula
 */
public class IntExercicio10 {
    public static void intEx10(String[] args) {
        double valor = 2;
        double cubo, quadrado, potenciaDez, soma;
        cubo = Math.pow(valor, 3);
        quadrado = Math.pow(valor, 2);
        potenciaDez = Math.pow(valor, 10);
        soma = cubo + quadrado + potenciaDez;	

        System.out.println("Número elevado ao cubo = " + cubo);
        System.out.println("Número elevado ao quadrado = " + quadrado);
        System.out.println("Número elevado a potência 10 = " + potenciaDez);
        System.out.println("Soma dos valores = " + soma);
    }
}
