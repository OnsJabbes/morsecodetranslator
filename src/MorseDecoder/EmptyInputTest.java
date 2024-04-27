package MorseDecoder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmptyInputTest {

    @Test
    public void testTranslateToMorseCodeWithEmptyInput() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, Main.translateToMorseCodeLogic(input));
    }

    @Test
    public void testTranslateToEnglishWithEmptyInput() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, Main.translateToEnglishLogic(input));
    }

    
}
