package Question3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyCar implements ICar{
    @Override
    public int f1(List<Car> t) {
        Scanner scanner = new Scanner(System.in);
        Integer total = 0;
        Integer integer = 0;
        System.out.println("Please enter the number of elements of the sequence: ");
        Integer soPhanTu = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[soPhanTu];
        System.out.println("Please enter the molecules: ");
        for(int i = 0;i<soPhanTu;i++){
            System.out.println("the element " + +i);
            arr[i] = scanner.nextInt();
            total = total + arr[i];
        }
        integer = total/arr.length;
        System.out.println(integer);
        return 0;
    }

    @Override
    public void f2(List<Car> t) {
        Scanner scanner = new Scanner(System.in);
        Integer total = 0;
        Integer integer = 0;
        System.out.println("Please enter the number of elements: ");
        Integer soPhanTu = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[soPhanTu];
        System.out.println("Please enter the molecules: ");
        for (int i = 0; i < soPhanTu; i++) {
            System.out.println("the element " + +i);
            arr[i] = scanner.nextInt();

        }
        int max=arr[0];
         int min=arr[0];
         int tg;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>max)max=arr[j];
            if(arr[j]<min)min=arr[j];
        }
        System.out.println("the largest number is:"+max);
        System.out.println("the smartest number is:"+min);
        {
            tg=min;
            min=max;
            max=tg;
        }
        System.out.println("\sequence of numbers ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    @Override
    public void f3(List<Car> t) {

    }


}
