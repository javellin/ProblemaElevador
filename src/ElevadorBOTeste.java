import org.junit.Assert;
import org.junit.Test;

public class ElevadorBOTeste {

    @Test
    public void teste1() {
        Integer A[] = criarIntegerArray(70, 90, 120, 30, 80, 50, 90);

        Integer B[] = criarIntegerArray(2, 3, 4, 5, 5, 3, 4);

        Assert.assertEquals(ElevadorBO.solucao(2, 200, 5, A, B), new Integer(11));
    }

    @Test
    public void teste2() {
        Integer A[] = criarIntegerArray(60, 80, 40);

        Integer B[] = criarIntegerArray(2, 3, 5);

        Assert.assertEquals(ElevadorBO.solucao(2, 200, 5, A, B), new Integer(5));
    }

    @Test
    public void teste3() {
        Integer A[] = criarIntegerArray(60, 80, 40);

        Integer B[] = criarIntegerArray(2, 2, 5);

        Assert.assertEquals(ElevadorBO.solucao(2, 200, 5, A, B), new Integer(4));
    }

    private Integer[] criarIntegerArray(Integer... num) {
        Integer array[] = new Integer[num.length];
        System.arraycopy(num, 0, array, 0, num.length);
        return array;
    }
}
