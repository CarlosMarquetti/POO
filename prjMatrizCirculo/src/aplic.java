import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class aplic {

    public static void main(String[] args) {
        double raio;
        
        // Instancição dos objetos
        Scanner entrada = new Scanner(System.in);
    
        Circulo[] matCir = new Circulo[10];
        DecimalFormat df = new DecimalFormat("0.00");
             
        for(int i = 0; i < 10; i++){
            System.out.println("\nCirculo: " + (i+1));
            
            matCir[i] = new Circulo(); 
            
            System.out.print("Digite o Raio: ");
            raio = entrada.nextDouble();
            
            matCir[i].setRaio(raio);
        }
        
        for(int i = 0; i < 10; i++){  
            System.out.print("\nCirculo: " + (i+1));
            
            System.out.println("\nArea do Raio: " + df.format(matCir[i].calcArea()));
            System.out.println("Perimetro do Raio: " + df.format(matCir[i].calcPerimetro()));
            System.out.println("Diaetro do Raio: " + df.format(matCir[i].calcDiametro()));
            System.out.println("Medidad do Raio: " + df.format(matCir[i].getRaio()));
        }
              
    }
    
}
