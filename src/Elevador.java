import java.util.Queue;

public class Elevador {
    private Integer quantidadeMaximaPessoas;
    private Integer pesoMaximo;
    private Integer pesoAtual;
    private Integer totalAndares;
    private Queue<Pessoa> pessoas;

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(Integer totalAndares) {
        this.totalAndares = totalAndares;
    }

    public Integer getQuantidadeMaximaPessoas() {
        return quantidadeMaximaPessoas;
    }

    public void setQuantidadeMaximaPessoas(Integer quantidadeMaximaPessoas) {
        this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
    }

    public Integer getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Integer pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Queue<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Queue<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Integer getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(Integer pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
}
