import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Testing {
    @Test
    public void testAlternateCapsWithCat() {
        String output = Main.alternateCaps("cat");
        assertEquals("cAt", output);
    }

    @Test
    public void testAlternateCapsWithApple() {
        String output = Main.alternateCaps("apple");
        assertEquals("aPpLe", output);
    }

    @Test
    public void testAlternateCapsWithBlank() {
        String output = Main.alternateCaps("");
        assertEquals("", output);
    }

    @Test
    public void testAlternateCapsWithAllCapsApple() {
        String output = Main.alternateCaps("APPLE");
        assertEquals("APPLE", output);
    }
}
