/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosRepeticao;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class RepExercicio10 {
    public static void repEx10(String[] args) {
        Scanner entrar = new Scanner(System.in);
        final String usuario = "Paula";
        final String senha = "123Paula@";

        while (true){
            System.out.print("USUÁRIO: ");
	    String usuarioDigitado = entrar.nextLine();
	    System.out.print("SENHA: ");
	    String senhaDigitado = entrar.nextLine();
	    
	    if ((usuarioDigitado.equals(usuario)) && (senhaDigitado.equals(senha))){
                System.out.println("ACESSO CONCEDIDO!");
                break;
	    }
	    System.out.println("ACESSO NEGADO!");
	}
	System.out.println("FIM DO PROGRAMA!");    
    }
}
