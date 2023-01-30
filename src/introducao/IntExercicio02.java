/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao;

/**
 *
 * @author Paula
 */
public class IntExercicio02 {
    public static void intEx02(String[] args) {
        float horasTrabalhadas = 100f;
        float valorHoraTrabalhada = 50f;
        float percentualDesconto = 10f;

        float salarioBase = horasTrabalhadas * valorHoraTrabalhada;
        float totalDescontos = (percentualDesconto / 100f) * salarioBase;
        float salarioLiquido = salarioBase - totalDescontos;

        System.out.println("Salário base: " + salarioBase);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
