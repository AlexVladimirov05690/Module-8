public class Decoder {
    String decrypt (String encryptedString) {
        int length = encryptedString.length();
        StringBuilder result = new StringBuilder(encryptedString);
        result = result.reverse();
        encryptedString = result.toString();
        StringBuilder result1 = new StringBuilder();
        char [] charsString = new char[length];
        int [] numbers = new int[length];
        for(int i = 0; i < length; i++) {
            charsString[i] = encryptedString.charAt(i);
            numbers[i] = ((int) charsString[i] - Coder.key);
            result1.append((char) numbers[i]);
        }
        String originalString = result1.toString();
        return originalString;
    }
}
