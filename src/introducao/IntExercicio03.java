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
public class IntExercicio03 {
    public static void intEx03(String[] args) {
        System.out.print("Qual é a temperatura em Celsius: ");
        Scanner ler = new Scanner(System.in);
        float temperaturaCelsius = ler.nextFloat();

        float temperaturaFahrenheit = (9f * temperaturaCelsius) / 5f;
        System.out.println("Celsius para Fahrenheit: " + temperaturaFahrenheit);
    }
}
