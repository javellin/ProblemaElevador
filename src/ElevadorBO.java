import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ElevadorBO {

    private static List<Pessoa> construirListaPessoas(Integer A[], Integer B[]) {
        List<Pessoa> list = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setPeso(A[i]);
            pessoa.setAlvo(B[i]);
            list.add(pessoa);
        }

        return list;
    }

    public static Integer solucao(Integer maximoPessoas, Integer pesoMaximo, Integer totalAndares, Integer[] A, Integer[] B) {
        Queue<Pessoa> queue = new LinkedList<>();

        Elevador elevador = new Elevador();
        elevador.setPesoMaximo(pesoMaximo);
        elevador.setQuantidadeMaximaPessoas(maximoPessoas);
        elevador.setPesoAtual(0);
        elevador.setPessoas(queue);
        elevador.setTotalAndares(totalAndares);

        List<Pessoa> pessoas = construirListaPessoas(A, B);

        List<List<Pessoa>> niveisElevador = new ArrayList<>();

        criarNiveisElevador(pessoas, elevador, niveisElevador);

        return contarParadasElevador(niveisElevador, elevador);
    }

    private static Integer contarParadasElevador(List<List<Pessoa>> niveisElevador, Elevador elevador) {
        Integer count = 0;

        for (List<Pessoa> list : niveisElevador) {
            Pessoa pessoaAnterior = new Pessoa();
            for (Pessoa pessoa : list) {
                for (int andar = 0; andar <= elevador.getTotalAndares(); andar++) {
                    if (pessoa.getAlvo().equals(andar)) {
                        if (!pessoa.getAlvo().equals(pessoaAnterior.getAlvo())) {
                            count++;
                        }
                    }
                }
                pessoaAnterior = pessoa;
            }
            count++;
        }

        return count;

    }

    private static void criarNiveisElevador(List<Pessoa> pessoas, Elevador elevador, List<List<Pessoa>> niveisElevador) {
        List<Pessoa> list = new ArrayList<>();
        List<Pessoa> rest = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if ((pessoa.getPeso() + elevador.getPesoAtual() <= elevador.getPesoMaximo()) && (list.size() + 1 <= elevador.getQuantidadeMaximaPessoas())) {
                list.add(pessoa);
                elevador.setPesoAtual(elevador.getPesoAtual() + pessoa.getPeso());
            } else {
                rest.add(pessoa);
            }
        }

        niveisElevador.add(list);

        if (rest.size() > 0) {
            elevador.setPesoAtual(0);
            criarNiveisElevador(rest, elevador, niveisElevador);
        }
    }
}
