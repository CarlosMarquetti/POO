
import fatec.poo.model.Aluno;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
    int ra, op;
    double ntPrv1, ntPrv2, ntTrab1, ntTrab2;
    
    Scanner entrada = new Scanner(System.in);
    Aluno objAlu = new Aluno();
    
        System.out.print("Digite o seu RA: ");
        ra = entrada.nextInt();
    
        System.out.print("Digite a nota da primeira Prova: ");
        ntPrv1 = entrada.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        ntPrv2 = entrada.nextDouble();

        System.out.print("Digite a nota do primeiro Trabalho: ");
        ntTrab1 = entrada.nextDouble();

        System.out.print("Digite a nota do segundo Trabalho: ");
        ntTrab2 = entrada.nextDouble();
                
        objAlu.setRA(ra);
        objAlu.setNtPrv1(ntPrv1);
        objAlu.setNtPrv2(ntPrv2);
        objAlu.setNtTrab1(ntTrab1);
        objAlu.setNtTrab2(ntTrab2);
    
    do{
        System.out.println("\n1 - Exibir notas das Provas/Trabalhos");
        System.out.println("2 - Exibir a média dos Trabalhos/Provas");
        System.out.println("3 - Exibir média final");
        System.out.println("4 - Sair");
        System.out.print("            Digite a opção: ");
        op = entrada.nextInt();

        switch(op){
            case 1:
                System.out.println("\n\nProva 1: " + ntPrv1);
                System.out.println("Prova 2: " + ntPrv2);
                System.out.println("Trabalho 1: " + ntTrab1);
                System.out.println("Trabalho 2: " + ntTrab2);
                break
                ;
            case 2:
                System.out.println("\n\nMédia dos Trabalhos: " + objAlu.calcMediaTrab());
                System.out.println("Média das Provaa: " + objAlu.calcMediaProva());
                break
                ;
            case 3:
                System.out.println("\n\nMédia Final: " + objAlu.calcMediaFinal());
                break
                ;
    }
        
    }while(op != 4);
    
    }
}
