import java.util.Scanner;
import java.lang.Math;


public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight, height, bodyMassIndex;
        System.out.println("How much do you weight?");
        weight = scan.nextDouble();
        System.out.println("How tall are you?");
        height = scan.nextDouble();
        bodyMassIndex = weight/Math.pow(height, 2);
        System.out.println(bodyMassIndex);


    }
}
