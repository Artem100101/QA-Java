import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("Вячеслав")){
            System.out.println("Привет, " + string);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
