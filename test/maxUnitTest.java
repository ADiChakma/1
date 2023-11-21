import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import max.Max;
/**
 *
 * @author Adison
 */
public class maxUnitTest {
    
    public maxUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test  
    public void testFindMax(){  
        assertEquals(4,Max.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Max.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  