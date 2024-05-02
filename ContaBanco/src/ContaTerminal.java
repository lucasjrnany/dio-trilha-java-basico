import java.util.Scanner;

import model.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      Conta conta = new Conta();
      boolean valido = false;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Por favor, digite o número da Agência! ");
      conta.agencia = scanner.nextLine();

      while(valido == false) {
        try {
            System.out.print("Por favor, digite o número da Conta! ");
            conta.numero = scanner.nextInt();  
            valido = true;
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Número da conta informado está incorreto, tente novamente!");
            scanner.next();
        }
      };
    
      System.out.print("Por favor, informe o nome do cliente! ");
      conta.nomeCliente = scanner.nextLine();

      valido = false;
      while(valido == false) {
        try {
            System.out.print("Por favor, informe o saldo da conta! ");
            conta.saldo = scanner.nextDouble();  
            valido = true;
        } catch (Exception e) {
            System.out.println("Saldo da conta informado está incorreto, tente novamente!");
            scanner.next();
        }
      };   


      System.out.println(conta.toString());
      scanner.close();
    }
}
