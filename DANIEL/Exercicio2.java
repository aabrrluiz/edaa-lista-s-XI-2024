import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        HashMap<String, String> cadastroPessoa = new HashMap<>();

        for(int pessoas = 0; pessoas < 5 ; pessoas++){
        
            System.err.println("Digite seu telefone: ");
            String telefone = scanner.nextLine();

            System.err.println("Digite seu CPF: ");
            String CPF = scanner.nextLine();

            cadastroPessoa.put(telefone, CPF);
        }
   
        System.out.println("\nDados cadastrados:");
        for (Map.Entry<String, String> entry : cadastroPessoa.entrySet()) {
            System.out.println("CPF: " + entry.getKey() + " - Telefone: " + entry.getValue());
        }
        scanner.close();

    }
}