import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số : ");
        int number = scanner.nextInt();
        if (number < 2 ){
            System.out.println(number + "Không phải là số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % 1 == 0 ){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + "Là số nguyên tố");
            }else {
                System.out.println(number + "Không phải là số nguyên tố");
            }
        }
    }
}
