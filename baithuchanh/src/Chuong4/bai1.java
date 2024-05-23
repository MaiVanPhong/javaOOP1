import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1{
    public static void main(String[] args){
        ArrayList<Integer> arrlistint = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = scanner.nextInt();
        System.out.println("Nhập vào các phần tử:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            arrlistint.add(number);
        }
        int max = Collections.max(arrlistint);
        System.out.println("Số nguyên lớn nhất trong dãy là: " + max);
        System.out.print("Nhập vào số nguyên để xoá: ");
        int deleteNumber = scanner.nextInt();
        arrlistint.removeIf(num -> num == deleteNumber);
        Collections.sort(arrlistint);
        System.out.println("Dãy số sau khi xoá và sắp xếp:");
        for (int number : arrlistint) {
            System.out.print(number + " ");
        }
    }
}