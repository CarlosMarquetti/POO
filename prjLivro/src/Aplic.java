import fatec.poo.model.Livro;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int op;
        
        Scanner entrada = new Scanner(System.in);
        Livro objLiv = new Livro();
        
        objLiv.setIdentificacao(0);
        objLiv.setValMultaDiaria(30);
        
        do{
            System.out.println("1 - Consultar livro");
            System.out.println("2 - emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.println("     Digite a opção:");
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                    if(objLiv.getSituacao() == true)
                        System.out.print("O livro está emprestado");
                    else
                        System.out.print("O livro está disponíve");
                    break
                ;
                case 2:
                    if(objLiv.getSituacao() == true)
                        System.out.print("O livro está emprestado");
                    else{
                        System.out.print("Livto emprestado com sucesso");
                        objLiv.emprestar();
                    }
                    break
                ;
                case 3:
                    System.out.println("Digite a quantidade de dias que voce atrasou na entrega.");
                    digDiasAtraso = entrada.nextInt();// Gambiarra, resolver depois
                    if(objLiv.getSituacao() == true && digDiasAtraso > 0)
                        System.out.println("O valor da sua multa eh: " + objLiv.devolver(digDiasAtraso));
                    else{
                        System.out.print("O livro já está disponíve");

                    }
                    break
                ;
            }
        
        }while(op != 4);
    }
    
}
