import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleClassTest {



    @Test
    public void getDataTest(){

        ExampleClass exampleClass = new ExampleClass();


        assertEquals("Expected" ,exampleClass.getData("Input"));
        assertEquals("Expected" ,exampleClass.getData("Input"));
        assertEquals("Expected" ,exampleClass.getData("Input"));



    }
}
