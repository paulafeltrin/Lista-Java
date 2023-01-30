/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasDeDecisao;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class DecExercicio08 {
    public static void decEx08(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        float peso = menu.nextFloat();

        System.out.print("Digite a sua altura: ");
        float altura = menu.nextFloat();

        double imc = peso / (Math.pow(altura, 2));

        String estadoNutricional = "";
        System.out.println("IMC: " + imc);

        if (imc < 10) {
            estadoNutricional = "Desnutrição Grau V";
        } else if ((imc >= 10) && (imc < 13)){
            estadoNutricional = "Desnutrição Grau IV";
        } else if ((imc >= 13) && (imc < 16)){
            estadoNutricional = "Desnutrição Grau III";
        } else if ((imc >= 16) && (imc < 17)){
            estadoNutricional = "Desnutrição Grau II";
        } else if ((imc >= 17) && (imc < 18.5)){
            estadoNutricional = "Desnutrição Grau I";
        } else if ((imc >= 18.5) && (imc < 25)){
            estadoNutricional = "Normal";
        } else if ((imc >= 25) && (imc < 30)){
            estadoNutricional = "Pré-obesidade";
        } else if ((imc >= 30) && (imc < 35)){
            estadoNutricional = "Obesidade Grau I";
        } else if ((imc >= 35) && (imc < 40)){
            estadoNutricional = "Obesidade Grau II";
        }  else {
            estadoNutricional = "Obesidade Grau III";
        }
        System.out.println(estadoNutricional);
    }
}
