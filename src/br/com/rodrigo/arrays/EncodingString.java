package br.com.rodrigo.arrays;

public class EncodingString {

    public static void main (String[] args) {

        String code = getCodeForString("aaaddrrruuudddaaaeeedddfffsssaaadddffrrrllllggghhhhhaadddaaggrrqqq");

        System.out.println(code);

        int i = 5;
        int j = 2;

        System.out.println(i - j -1);

    }

    private static String getCodeForString(String string) {

        if (string == null || string.isEmpty() || string.isBlank())
            return "";

        int pointer;
        StringBuilder code = new StringBuilder();
        int charPosition = 0;

        while (charPosition < string.length()) {

            char currentChar = string.charAt(charPosition);

            int count = 0;
            pointer = charPosition;

            while(pointer < string.length() && string.charAt(pointer) == currentChar) {
                count++;
                pointer++;
            }

            code.append(count).append(currentChar);
            charPosition = pointer;

        }

        return code.toString();
    }
}
