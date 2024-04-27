package MorseDecoder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MorseCodeDecoderTest {

    @Test
    public void testTranslateToMorseCode() {
        String input = "hello world";
        String expectedOutput = ".... . .-.. .-.. --- .-- --- .-. .-.. -.."; 
        assertEquals(expectedOutput, Main.translateToMorseCodeLogic(input));
    }
	
	
	  @Test
	    public void testTranslateToEnglish() {
	        String input = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";
	        String expectedOutput = "helloworld"; 
	        assertEquals(expectedOutput, Main.translateToEnglishLogic(input));
	    }

}

