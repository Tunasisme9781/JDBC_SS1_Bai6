package session01;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Nhập vận tốc: ");
        Scanner sc = new Scanner(System.in);
        int speed = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập thời gian đi (giờ): ");
        double hour = Double.parseDouble(sc.nextLine());

        System.out.println("Quãng đường đi học là: "+ speed*hour + "km");


    }
}
