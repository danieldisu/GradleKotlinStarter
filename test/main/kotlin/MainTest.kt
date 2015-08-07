import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.BlockJUnit4ClassRunner
import sayHelloTo

public class MainTest {

    private val USERNAME = "testName"

    Test
    public fun SayHelloTest() {
        Assert.assertEquals(sayHelloTo(USERNAME), "Hello fellow testName")
    }
}