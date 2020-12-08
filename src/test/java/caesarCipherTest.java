import code.Encoding;
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
    @Test
    public void testEncryption_encryptionValidation_boolean(){
        Encoding encrypt = new Encoding();
        String input = "My name is Daniel";
        encrypt.setInput(input);
        String encryptedString = "GS HUGY CM XUHCYF";
        assertEquals(encryptedString, encrypt.getOutput());
    }


}