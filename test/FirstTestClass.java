import com.company.rustam.Main;
import org.junit.Assert;
import org.junit.Test;

public class FirstTestClass {
    @Test
    public void firstTest() {
        int res = Main.makeSomeCalc();
        Assert.assertTrue(res == 9);
    }
}
