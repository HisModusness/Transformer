package Transformers;

/**
 * Transforms the text into InTeRnEt CaPiTaLiZaTiOn
 * Created by liam on 3/6/14.
 */
public class ExampleTransformer implements Transformer {

    // Return a name to be associated with your text on output
    @Override
    public String getName() {
        return "Mr. Example";
    }

    // Do whatever you want to the input string, just return a string out.
    @Override
    public String transform(String input) {
        boolean capital = true;
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (!isLetter(c)) {
                sb.append(c);
            }
            else if (isCapital(c) && !capital) {
                sb.append(Character.toLowerCase(c));
            }
            else if (isLower(c) && capital) {
                sb.append(Character.toUpperCase(c));
            }
            else {
                sb.append(c);
            }
            capital = !capital;
        }
        return sb.toString();
    }

    public boolean isLetter(char c) {
        if (isCapital(c) || isLower(c)) {
            return true;
        }
        return false;
    }

    public boolean isCapital(char c) {
        if (c >= 65 && c <= 90) {
            return true;
        }
        return false;
    }

    public boolean isLower(char c) {
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }
}
