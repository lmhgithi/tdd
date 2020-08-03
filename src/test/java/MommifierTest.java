import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MommifierTest {
    @Test
    void should_get_string_itself_when_percentage_of_vowels_less_than_or_equals_30(){
        String string = "kk";
        handleVowels hv = new handleVowels();

        String result = hv.convert(string);

        assertEquals(string, result);
    }

}
