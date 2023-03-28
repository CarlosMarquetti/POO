package fatec.poo.model;
/**
 *
 * @author 0030482121014
 */
public class Instrutor extends Pessoa{
    private String areaAtuacao;
    private int identificacao;

    public Instrutor(int identificacao, String nome, String telefone) {
        super(nome, telefone);
        this.identificacao = identificacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public int getIdentificacao() {
        return identificacao;
    }
    
}
