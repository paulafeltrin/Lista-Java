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
public class IntExercicio19C {
    public static void intEx19C(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a tensão em Volts: ");
        float tensaoVolts = ler.nextFloat();

        System.out.print("Digite a resistência em Ohms: ");
        float resistenciaOhms = ler.nextFloat();

        float correnteAmpere = tensaoVolts / resistenciaOhms;
        System.out.println("A corrente é: " + correnteAmpere + " Ampéres");
    }
}
