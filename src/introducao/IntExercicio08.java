/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao;

/**
 *
 * @author Paula
 */
public class IntExercicio08 {
    public static void intEx08(String[] args) {
        float principal = 200f;
        float taxa = 5f;
        float tempo = 2f;

        float prestacao = principal + (principal * (taxa / 100f) * tempo);

        System.out.println("A prestação em atraso a ser paga é: " + prestacao);
    }
}
