package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; // representa a multiplicidade 
    private int numFunc; // representa o indice da matriz 

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    // Tem como parametro de entrada o endereço de um objeto da classe de cada generalização de funcionario; 
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listaFuncionarios(){
        System.out.println("sigla " + sigla);
        System.out.println("nome " + nome);
        System.out.println("quantidade de Funcionarios " + numFunc);
        System.out.println("Registro \t Nome \t\t\t Cargo");
        
        for(int i = 0; i < numFunc; i++){
            System.out.print(funcionarios[i].getRegistro() + "\t \t");
            System.out.print(funcionarios[i].getNome() + "\t \t");
            System.out.println(funcionarios[i].getCargo());
        }
        
    }
}
