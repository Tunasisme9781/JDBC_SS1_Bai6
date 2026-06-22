package session01;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Nhập vận tốc: ");
        Scanner sc = new Scanner(System.in);
        int speed = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập thời gian đi (giờ): ");
        float hour = Float.parseFloat(sc.nextLine());

        float road = speed * hour;

        System.out.printf("Quãng đường đi học là: %.2f", road );


    }
}
