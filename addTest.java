import java.beans.Transient;
import org.junit.*;
public class addTest {
    @Test
    public void testAdd() {
        add obj = new add();
        Assert.assertEquals(5, obj.add(2, 3));
        Assert.assertEquals(5, obj.add(1, 0));
    }
}
