import Fibonacci.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void correctFibo () {

        int resultFibo = 377;

        Assert.assertEquals(resultFibo, Fibonacci.fibo(15));
    }

    @Test
    public void negativeFibo () {

        int resultFibo = 0;

        Assert.assertEquals(resultFibo, Fibonacci.fibo(0));
    }

    @Test
    public void Fibo1 () {

        int resultFibo = 1;

        Assert.assertEquals(resultFibo, Fibonacci.fibo(1));
    }

}
