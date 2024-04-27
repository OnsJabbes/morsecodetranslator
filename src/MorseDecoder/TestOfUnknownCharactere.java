package MorseDecoder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestOfUnknownCharactere {

    @Test
    public void testTranslateToMorseCodeWithNumbersAndSymbols1() {
        String input = "1, 2 ? 3.";
        String expectedOutput = ".---- , ..--- ? ...-- .-.-.-";
        assertEquals(expectedOutput, Main.translateToMorseCodeLogic(input));
    }
    
    
    @Test
    public void testTranslateToMorseCodeWithNumbersAndSymbols() {
        String input = "*helloworld";
        String expectedOutput = "*.... . .-.. .-.. --- .-- --- .-. .-.. -..";
        assertEquals(expectedOutput, Main.translateToMorseCodeLogic(input));
    }

    @Test
    public void testTranslateToEnglishWithUnknownMorseCode() {
        String input = ".... * .-.-.- / ---";
        String expectedOutput = "h * , / o"; 
        assertEquals(expectedOutput, Main.translateToEnglishLogic(input));
    }
}
