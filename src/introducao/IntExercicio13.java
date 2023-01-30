/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao;

/**
 *
 * @author Paula
 */
public class IntExercicio13 {
    public static void intEx13(String[] args) {
        float salarioBase = 1500f;
        float reajustePercentual = 15f;
        float novoSalario = salarioBase + (salarioBase * reajustePercentual) / 100f;	

        System.out.println("O novo salário será de: " + novoSalario);
    }
}
