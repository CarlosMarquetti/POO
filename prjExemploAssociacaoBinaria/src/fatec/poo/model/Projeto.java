package fatec.poo.model;

/**
 *
 * @author 0030482121014
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    Funcionario[] funcionarios;
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listaFuncionarios(){
        System.out.println("codigo " + codigo);
        System.out.println("descrição " + descricao);
        System.out.println("data inicio " + dtInicio);
        System.out.println("data termino " + dtTermino);
        System.out.println("quantidade de Funcionarios " + numFunc);
        System.out.println("Registro \t Nome \t\t\t Cargo \t\t Departamento");
        
        for(int i = 0; i < numFunc; i++){
            System.out.print(funcionarios[i].getRegistro() + "\t \t");
            System.out.print(funcionarios[i].getNome() + "\t \t");
            System.out.print(funcionarios[i].getCargo() + "\t \t");
            System.out.print(funcionarios[i].getDepartamento());
        }
        
    }
    
    
    
}
