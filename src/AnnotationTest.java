import org.junit.*;
public class AnnotationTest {
    @BeforeClass
    public static void runOnceBeforeClass(){
        System.out.println("Before Class Called");
    }
    @Before
    public void runBeforeEveryTest(){
        System.out.println("Before Called");
    }
    @After
    public void runAfterEveryTest()
    {
        System.out.println("After Called");
    }
    @AfterClass
    public static void runOnceAfterClass(){
        System.out.println("After Class Called");
    }
    @Test
    public void testOne(){
        System.out.println("Test one");
    }
    @Test
    public void testTwo(){
        System.out.println("Test two");
    }

}
