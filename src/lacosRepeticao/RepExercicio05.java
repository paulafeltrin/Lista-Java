/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosRepeticao;

/**
 *
 * @author Paula
 */
public class RepExercicio05 {
    public static void repEx05(String[] args) {
        int ant = 1, pos = 1, aux, cont = 1;
        do {
            System.out.println(ant);
            aux = ant + pos;
            ant = pos;
            pos = aux;
            cont++;
        } while ((cont >= 1) && (cont <= 15));
    }
}
