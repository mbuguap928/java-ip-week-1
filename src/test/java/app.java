import code.Decoding;
import code.Encoding;

import java.util.Scanner;

public class app {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String rawString = input.next().toUpperCase();
        Encoding encode = new Encoding();
        encode.setKey(10);
        encode.setInput(rawString);
        Decoding decode = new Decoding();
        decode.setKey(10);
        decode.setOutput(encode.getOutput());
        System.out.println("Input String".concat(rawString)
                .concat("\n Encoding String").concat(encode.getOutput())
                .concat("\n Decoding String").concat(decode.getOutput()));


    }
}
