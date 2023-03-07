
import fatec.poo.model.Aluno;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
    int ra, op;
    double ntPrv1, ntPrv2, ntTrab1, ntTrab2;
    
    Scanner entrada = new Scanner(System.in);
    Aluno objAlu = new Aluno();
    
    do{
        System.out.print("Digite o seu RA: ");
        ra = entrada.nextInt();
    
        System.out.print("Digite a nota da primeira Prova: ");
        ntPrv1 = entrada.nextDouble();

        System.out.print("Digite a nota da segunda: ");
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
        
        switch(){
    
    };
        
        
    }while(op != 4);
    
    }
}
