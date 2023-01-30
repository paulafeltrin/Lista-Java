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
public class DecExercicio01 {
    public static void decEx01(String[] args) {
	Scanner ler = new Scanner(System.in);
        System.out.print("Digite a nota do primeiro bimestre: ");
        float primeiroBim = ler.nextFloat();

        System.out.print("Digite a nota do segundo bimestre: ");
        float segundoBim = ler.nextFloat();

        System.out.print("Digite a nota do terceiro bimestre: ");
        float terceiroBim = ler.nextFloat();

        System.out.print("Digite a nota do quarto bimestre: ");
        float quartoBim = ler.nextFloat();

        float media = ( primeiroBim + segundoBim + terceiroBim + quartoBim ) / 4f;
        String situacaoAluno = "";

        if (media < 50){
            situacaoAluno = "REPROVADO";
        } else if (media == 50) {
            situacaoAluno = "RECUPERAÇÃO";
        } else {
            situacaoAluno = "APROVADO";
        }

        System.out.println("A média do aluno é: " + media + " Situação Aluno: " + situacaoAluno);
    }
}
