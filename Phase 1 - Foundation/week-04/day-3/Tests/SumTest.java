import Sum.Sum;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class SumTest {

    private Sum konkretniSuma = new Sum();

    @Test
    public void getSum(){
        ArrayList<Integer> listTest = new ArrayList<>();

        listTest.add(1);
        listTest.add(2);
        listTest.add(3);

        int resultOfTest = konkretniSuma.sum(listTest);

        assertEquals(6, resultOfTest );
    }

    @Test
    public void getSumEmpty(){
        ArrayList<Integer> listTest = new ArrayList<>();

        int resultOfTest = konkretniSuma.sum(listTest);

        assertEquals(0, resultOfTest );
    }

    @Test
    public void getSumOne(){
        ArrayList<Integer> listTest = new ArrayList<>();

        listTest.add(1);

        int resultOfTest = konkretniSuma.sum(listTest);

        assertEquals(1, resultOfTest );
    }

    @Test
    public void getSumNull(){
        ArrayList<Integer> listTest = new ArrayList<>();

        listTest.add(1);
        listTest.add(2);
        listTest.add(3);

        int resultOfTest = konkretniSuma.sum(listTest);

        boolean resultNull;

        assertNotEquals(null, resultOfTest );
    }

}
