
import fatec.poo.model.Circulo;
import java.util.Scanner;

public class aplic {

    public static void main(String[] args) {
        double raio;
        String unidade;
        
        // Instancição dos objetos
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        Circulo objCir = new Circulo(unidade);
        
        System.out.print("Digite o raio: ");
        raio = entrada.nextDouble();
        
        objCir.setRaio(raio);
        
        System.out.println("\nArea do Raio: " + objCir.calcArea() + " " + objCir.getUnidadeDeMedida() + "²");
        System.out.println("Perimetro do Raio: " + objCir.calcPerimetro() + " " + objCir.getUnidadeDeMedida());
        System.out.println("Diaetro do Raio: " + objCir.calcDiametro() + " " + objCir.getUnidadeDeMedida());
        System.out.println("Medida do Raio: " + objCir.getRaio() + " " + objCir.getUnidadeDeMedida());
    }
    
}
