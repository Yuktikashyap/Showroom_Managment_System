import java.util.Scanner;

public class Car implements utility {

        int price,seats;
        String name,color,brand;

        public void setDetails(){
            Scanner s = new Scanner(System.in);
            System.out.println();
            System.out.println("Kindly enter the details");
            System.out.print("CAR NAME : ");
            name = s.nextLine();

            System.out.print("COLOR : ");
            color = s.next();

            System.out.print("BRAND : ");
            brand = s.next();

            System.out.print("PRICE : ");
             price= s.nextInt();

            System.out.print("SEATS : ");
            seats = s.nextInt();

            System.out.println();
        }
        public void getDetails(){
            System.out.println("CAR NAME      :     "+name);
            System.out.println("COLOR         :     "+color);
            System.out.println("BRAND NAME    :     "+brand);
            System.out.println("PRICE         :     "+price);
            System.out.println("NO. OF SEATS  :     "+seats);
            System.out.println();
        }

}
