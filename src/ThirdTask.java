import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int array[] = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            if (array[i]%3 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}
