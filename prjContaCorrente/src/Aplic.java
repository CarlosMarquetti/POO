import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int numero, op;
        double saldo, deposito, saque;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número da conta: ");
        numero = entrada.nextInt();
        
        System.out.print("Digite o saldo da conta: ");
        saldo = entrada.nextDouble();
        
        ContaCorrente objContCorre = new ContaCorrente(numero, saldo);
        
        
        do{
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar");
            System.out.println("4 - Sair");
            
            System.out.print("\tDigite a opção: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Conta: " + objContCorre.getNumero());
                    System.out.print("Digite o valor que será depositado: ");
                    deposito = entrada.nextDouble();
                    
                    objContCorre.depositar(deposito);
                    
                    System.out.println("Valor depositado");
                    break;
                case 2:
                    System.out.println("Conta: " + objContCorre.getNumero());
                    System.out.print("Digite o valor que será Sacado: ");
                    saque = entrada.nextDouble();
                    
                    if(saldo < objContCorre.getSaldo()){
                        objContCorre.sacar(saque);
                        System.out.println("Valor Sacado");
                    }else{
                         System.out.println("Saldo Insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Conta: " + objContCorre.getNumero());
                    System.out.println("Saldo da conta: " + objContCorre.getSaldo());
                    break;
            }
        
        }while(op < 4);
    }
    
}
