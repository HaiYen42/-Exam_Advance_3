import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        Queue<String> queue = new LinkedList<>();
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" + "1. Nhập tên khách hàng chờ mua vé xem phim\n" + "2. Khách tiếp theo\n" + "3. Thoát");
            System.out.println("Vui lòng nhập option ");
            option = Integer.parseInt(input.nextLine()) ;
            switch (option) {
                case 1:
                    System.out.println("Vui lòng nhập tên khách hàng ");
                    String customerName = input.nextLine();
                    queue.add(customerName);
                    break;
                case 2:
                    System.out.println("Phần tử đầu tiên là: " + queue.peek());
                    queue.poll();
                    System.out.println("Sau khi xóa phần tử đầu tiên là " + queue);
                    break;
                case 3:
                    System.out.println("Bạn đã thoát khỏi chương trình");
                    System.exit(0);
            }
        } while (option != 3);
    }
}