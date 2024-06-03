package OutrosArquivos;

public class Jogador {
    private String nome;
    private String sobrenome;
    private String posicao;
    private int idade;
    private String clube;

    public String getNome() {
        return nome;
    }
    public void setNome(String paramNome) {
        nome = paramNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String paramSobrenome){
        sobrenome = paramSobrenome;
    }

    public String getPosicao(){
        return posicao;
    }

    public void setPosicao(String paramPosicao){
        posicao = paramPosicao;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int paramIdade){
        idade = paramIdade;
    }

    public String getClube(){
        return clube;
    }

    public void setClube(String paramClube){
        clube = paramClube;
    }
}
