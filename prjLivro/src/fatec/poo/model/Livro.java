package fatec.poo.model;
public class Livro {
    private int identificacao;
    private boolean situacao;
    private double valMultaDiaria;

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }

    public boolean getSituacao() {
        return situacao;
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver(int a){
        situacao = false;
        return(a * valMultaDiaria);
    }
}
