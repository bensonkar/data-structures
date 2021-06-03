package main;

/**
 * @author bkariuki
 */
public class UserInput {
    public static class TextInput {

        public char c;
        public String res;

        public void add(char c) {
            this.c = c;
            res += String.valueOf(c);
        }

        public String getValue() {
            return String.valueOf(res);
        }
    }

    public static class NumericInput extends TextInput {
        public int input;
        public String res;

        @Override
        public void add(char c) {
            Boolean flag = Character.isDigit(c);
            if (flag) {
                this.input += c;
                res += String.valueOf(c);
            }
        }

        @Override
        public String getValue() {
            return String.valueOf(this.input);
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

}
