package ex27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{
    @Test
    public void isTrue()
    {
        assertEquals(true, App.validateFirstName("Cameron"));
        assertEquals(true, App.validateLastName("McDougal"));
        assertEquals(true, App.validateZip("32119"));
        assertEquals(true, App.validateEmployeeID("CM-1337"));
    }

    @Test
    public void isFalse()
    {
        assertEquals(false, App.validateFirstName("C"));
        assertEquals(false, App.validateLastName("M"));
        assertEquals(false, App.validateZip("321"));
        assertEquals(false, App.validateEmployeeID("CJM-13370"));
    }
}
