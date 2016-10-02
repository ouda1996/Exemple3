import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by User on 02/10/2016.
 */
public class exempleTest {
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetNum() throws Exception {
            exemple exemple =  new exemple(25);
           assertEquals(25,exemple.getNum());
    }

    @Test
    public void testsetnum() throws Exception {

    }

    @Test
    public void testmethode() throws Exception {

    }
}