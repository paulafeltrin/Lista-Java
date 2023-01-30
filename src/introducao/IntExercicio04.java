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
public class IntExercicio04 {
    public static void intEx04(String[] args) {
        System.out.print("Qual é a temperatura em Fahrenheit: ");
        Scanner ler = new Scanner(System.in);
        float temperaturaFahrenheit = ler.nextFloat();

        float temperaturaCelsius = (( temperaturaFahrenheit - 32) * 5) / 9;
        System.out.println("Fahrenheit para Celsius : " + temperaturaCelsius);
    }
}
