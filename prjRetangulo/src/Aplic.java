
import fatec.poo.model.Retangulo;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        double medAlt, medBase;
        
        // Instancição dos objetos
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        System.out.print("Digite a medida da Altura: ");
        medAlt = entrada.nextDouble();
        
        System.out.print("Digite a medida da Base: ");
        medBase = entrada.nextDouble();
        
        // Passagem de mensagens para o objeto da classe Retangulo
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("\nMedida da altura: " + objRet.getAltura());
        System.out.println("Medida da Base: " + objRet.getBase());
        System.out.println("Medida do Perimetro: " + objRet.calcPerimetro());
        System.out.println("Medida da Área: " + objRet.calcArea());
    }
    
}
