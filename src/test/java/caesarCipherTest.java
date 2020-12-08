import org.junit.Test;

import static org.junit.Assert.*;

public class caesarCipherTest {
    @Test
    public void inputAsString_inputValidation_boolean(){
        CaesarCipher caesarCipher = new CaesarCipher();
        String value = "4";
        caesarCipher.setValue(value);
        assertEquals(value, caesarCipher.getValue());
    }

}