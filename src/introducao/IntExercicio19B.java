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
public class IntExercicio19B {
    public static void intEx19B(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a resistência em Ohms: ");
        float resistenciaOhms = ler.nextFloat();

        System.out.print("Digite a corrente em Ampéres: ");
        float correnteAmpere = ler.nextFloat();

        float tensaoVolts = resistenciaOhms * correnteAmpere;
        System.out.println("A tensão é: " + tensaoVolts + " Volts");
    }
}
