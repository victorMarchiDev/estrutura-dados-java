import com.github.victorMarchiDev.IsUnique;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class IsUniqueTest {

    @Test
    public void isUniqueTest(){
        assertTrue(IsUnique.isUnique("abcde"));
        assertTrue(IsUnique.isUnique("aAbBcCdDeE"));
        assertTrue(IsUnique.isUnique("abcded"));
    }
}
