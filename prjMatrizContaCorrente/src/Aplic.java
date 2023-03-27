import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int numero, op;
        double saldo, deposito, saque;
        boolean contNoExi = true;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        ContaCorrente[] matContaCorrente = new ContaCorrente[15];
        
        for(int i = 0; i < 15; i++){
            System.out.print("\nDigite o número da conta: ");
            numero = entrada.nextInt();

            System.out.print("Digite o saldo da conta: ");
            saldo = entrada.nextDouble();
            
            matContaCorrente[i] = new ContaCorrente(numero, saldo);       
        }
      
        do{
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar");
            System.out.println("4 - Listar contas");
            System.out.println("5 - Sair");
            
            System.out.print("\tDigite a opção: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("\nInforme o número da conta: " );
                    numero = entrada.nextInt();
                    
                    for(int i = 0; i < 15; i++){
                        if(matContaCorrente[i].getNumero() == numero){
                            System.out.println("\nConta: " + matContaCorrente[i].getNumero());
                            System.out.print("Digite o valor que será depositado: ");
                            deposito = entrada.nextDouble();
                            
                            matContaCorrente[i].depositar(deposito);

                            System.out.println("\nValor depositado\n");
                            contNoExi = false;
                            break;
                        }    
                    };
                    if(contNoExi == true){
                        System.out.println("\nConta não cadastrada!\n");
                    }
                    break;
                    // Corrigir daqui para baixo
                 case 2:
                    System.out.print("\nInforme o número da conta: " );
                    numero = entrada.nextInt();

                    for(int i = 0; i < 15; i++){
                        if(matContaCorrente[i].getNumero() == numero){
                            System.out.println("\nConta: " + matContaCorrente[i].getNumero());
                            System.out.print("Digite o valor que será Sacado: ");
                            saque = entrada.nextDouble();

                            if(saque <= matContaCorrente[i].getSaldo()){
                                matContaCorrente[i].sacar(saque);
                                System.out.println("\nValor Sacado");
                                contNoExi = false;
                                break;
                            }else{
                            System.out.println("\nSaldo Insuficiente\n");
                            contNoExi = false;
                        }
                        }
                    }
                    if(contNoExi == true){
                        System.out.println("\nConta não existe...\n");
                    }
                    break;
                case 3:
                    System.out.print("\nInforme o número da conta: " );
                    numero = entrada.nextInt();
                    
                    for(int i = 0; i < 15; i++){
                        if(matContaCorrente[i].getNumero() == numero){
                            System.out.println("\nConta: " + matContaCorrente[i].getNumero());
                            System.out.print(df.format(matContaCorrente[i].getSaldo()) + "\n");
                            contNoExi = false;
                            break;
                        }
                    }
                    if(contNoExi == true){
                        System.out.println("\nSaldo Insuficiente\n");
                    }
                    break;
                case 4:
                    System.out.print("\nConta");
                    System.out.println("\tSaldo");
                    for(int i = 0; i < 15; i++){
                        System.out.print(matContaCorrente[i].getNumero());
                        System.out.println("\t" + df.format(matContaCorrente[i].getSaldo()));
                    }
                    break;
            }
        
        }while(op < 5);
    }
    
}
