import java.util.Scanner;

public class InOut {

    Scanner scanner = new Scanner(System.in);
    GetTime getTime = new GetTime();
    public String In() {
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();
        return string + " Время отправки сообщения: " + getTime.getNowTime();
    }

    public void Out(String string) {
        System.out.println(string);
    }
}
