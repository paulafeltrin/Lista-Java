/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao;

/**
 *
 * @author Paula
 */
public class IntExercicio06 {
    public static void intEx06(String[] args) {
        double tempoGasto = 1;
        double velocidade = 80;
        double distancia = tempoGasto * velocidade;
        double litrosGastos = distancia / 12;
        System.out.printf("Este carro consumiu em %.0f km, ", distancia);
        System.out.printf("%.2f litros de combustível.", litrosGastos);
    }
}
