import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFiles {

    public int soma(int x, int y){
        return x + y;
    }

    @Test
    public void testSoma(){

        int result = soma(10,20);

        assertEquals(30, result);
    }

}
