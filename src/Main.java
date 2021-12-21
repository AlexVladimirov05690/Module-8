public class Main {
    public static void main(String[] args) {
        Coder coder = new Coder();
        Decoder decoder = new Decoder();
        InOut inOut = new InOut();
        String original = inOut.In();
        String encrypt = coder.replaceAll(original);
        System.out.println(encrypt);
        System.out.println("Расшифрованная строка: " + decoder.decrypt(encrypt));
    }
}
