

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CatTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CatTest
{
    /**
     * Default constructor for test class CatTest
     */
    public CatTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testEqualsOverride()
    {
        Cat cat = new Cat("Lucy");
        Cat cat2 = new Cat("Lucy");
        
        assertTrue(cat.equals(cat2));
    }
}

