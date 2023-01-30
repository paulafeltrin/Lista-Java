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
public class IntExercicio19D {
    public static void intEx19C(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a tensão em Volts: ");
        float tensaoVolts = ler.nextFloat();

        System.out.print("Digite a corrente em Ampéres: ");
        float correnteAmpere = ler.nextFloat();

        float potenciaWatts = tensaoVolts * correnteAmpere;
        System.out.println("A potência é: " + potenciaWatts + " Watts");
    }
}
