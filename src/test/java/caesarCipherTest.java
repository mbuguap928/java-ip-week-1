import code.Decoding;
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
    public void testEncoding_encodingValidation_boolean(){
        Encoding encrypt = new Encoding();
        String input = "My name is Peter";
        encrypt.setKey(20);
        encrypt.setInput(input);
        String encryptedString = "GS HUGY CM JYNYL";
        assertEquals(encryptedString, encrypt.getOutput());
    }
    @Test
    public void testDecoding_decodingValidation_boolean() {
        Encoding encode = new Encoding();
        String input = "My name is Peter";
        encode.setKey(20);
        encode.setInput(input);
        String encryptedString = "GS HUGY CM JYNYL";
        assertEquals(encryptedString, encode.getOutput());
    }

    @Test
    public void testBoth_encodingAndDecoding_string() {
        Encoding encode = new Encoding();
        String rawString = "My name is Peter".toUpperCase();
        encode.setKey(10);
        encode.setInput(rawString);
        Decoding decoding = new Decoding();
        decoding.setKey(10);
        decoding.setInput(encode.getOutput());
        assertEquals(rawString, decoding.getOutput());

    }
}
