package ex24;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void isAnagram()
    {
        assertEquals(true, App.isAnagram("note", "tone"));
        assertEquals(true, App.isAnagram("NoTe", "tOnE"));
    }

    @Test
    public void notAnagram()
    {
        assertEquals(false, App.isAnagram("No", "Match"));
    }
}
