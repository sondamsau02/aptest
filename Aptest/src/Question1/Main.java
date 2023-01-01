package Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter price: ");
        String price = String.valueOf(Integer.parseInt(scanner.nextLine()));
        System.out.println("1. Test getTitle()");
        System.out.println("2. Test setPrice()");
        System.out.println("Enter TC(1 or 2):");
        Integer tc = Integer.valueOf(scanner.nextLine());
            switch (tc) {
                case 1:
                    System.out.println(title.toUpperCase());
                    break;
                case 2:
                    System.out.println("Enter new price:");
                    String newPrice = scanner.nextLine();
                    System.out.println(newPrice);
                    break;

                default:
                    System.out.println("Hello world");
                    break;
            }

        }
    }


