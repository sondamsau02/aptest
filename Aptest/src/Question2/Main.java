package Question2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpecCar specCar = new SpecCar();
        System.out.println("Enter maker:");
        String maker = scanner.nextLine();
        System.out.println("Enter price: ");
        Integer price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type: ");
        Integer type = Integer.parseInt(scanner.nextLine());
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.println("Enter TC(1,2,3):");
        Integer tc = Integer.parseInt(scanner.nextLine());
        switch (tc){
            case 1:
//                System.out.println(maker+","+ price+","+ type);
                System.out.println(specCar.toString());
                break;
            case 2:
                price = price + 20;
                System.out.println("XZ"+maker+","+ price);
                break;
            case 3:
                if(type <= 7){
                    price = price + 10;
                }
                else {
                    price = price + 15;
                }
                System.out.println(price);
                break;

            default:
                System.out.println("Hello world");
        }


    }

}
