public class Coder {
    public static int key = 65;

    String replaceAll(String originalString) {
        int length = originalString.length();
        int numbers [] = new int[length];
        char [] charsString = new char[length];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < length; i++) {
            charsString[i] = originalString.charAt(i);
            numbers[i] = ((int) charsString[i] + key);
            result.append((char) numbers[i]);
        }
        result = result.reverse();
        String encryptedString = result.toString();
        return encryptedString;
    }


}
