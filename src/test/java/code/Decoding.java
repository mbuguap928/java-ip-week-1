package code;

public class Decoding {
    private String input;
    private String output;
    private int key = 20;
    private String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


    public Decoding() {

    }

    public Decoding(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        setOutput(input);
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String input) {
        this.output = encoding(input);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    private String encoding(String input) {
        String phrase = input.toUpperCase();
        String output = "";
        int index = 0;
        try {
            char[] inputSplit = phrase.toCharArray();
            for (char letter : inputSplit) {
                String theletter = String.valueOf(letter);
                if (!theletter.equals(" ")) {
                    for (int i = 0; i <= alphabets.length; i++) {
                        if (theletter.equalsIgnoreCase(alphabets[i])) {
                            index = i - getKey();
                            if (index <0 )
                                output = output + alphabets[index + 26];
                            else
                                output = output + alphabets[index];
                            break;
                        }
                    }
                } else
                    output = output + " ";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return output;
    }

}
