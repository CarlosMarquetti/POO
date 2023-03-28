
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
 *
 * @author 0030482121014
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Instrutor objIns = new Instrutor(123, "Josivaldo Pereira", "1591166");
        
        objIns.setAreaAtuacao("Garoto de Programa");
        System.out.println("Nome do Instrutor: " + objIns.getNome());
        System.out.println("Telefone: " + objIns.getTelefone());
        System.out.println("Área de atuação: " + objIns.getAreaAtuacao());
        System.out.println("identificaçõa: " + objIns.getIdentificacao());
        
        Cliente objCli = new Cliente("472...", "Carlão", "991810886");
        
        objCli.setAltura(1.97);
        objCli.setPeso(110);
        System.out.println("\nNome do Cliente: " + objCli.getNome());
        System.out.println("Telefone: " + objCli.getTelefone());
        System.out.println("CPF: " + objCli.getCpf());
        System.out.println("Altura: " + objCli.getAltura());
        System.out.println("Peso: " + objCli.getPeso());
        System.out.println("IMC: " + objCli.imc());
    }
    
}
