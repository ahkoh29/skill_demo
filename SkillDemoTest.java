import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{
    @Test
    public void countInstanceOfTest(){
        assertEquals(2, SkillDemo.countInstanceOf("Happy Lunar New Year", "e")); //fails, should return 2
    }
}
