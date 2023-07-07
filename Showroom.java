import java.util.Scanner;

public class Showroom implements utility {

    int totCars,totEmp;
    String name,address,manager;

    public void setDetails(){
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Kindly enter the details");
        System.out.print("SHOWROOM NAME : ");
        name = s.nextLine();
        System.out.print("ADDRESS: ");
        address = s.next();

        System.out.print("MANAGER NAME: ");
        manager = s.next();

        System.out.print("TOTAL EMPLOYEE: ");
        totEmp = s.nextInt();

        System.out.print("TOTAL CARS: ");
        totCars = s.nextInt();

        System.out.println();
    }
    public void getDetails(){
        System.out.println("SHOWROOM NAME     :      "+name);
        System.out.println("ADDRESS NAME      :      "+address);
        System.out.println("MANAGER NAME      :      "+manager);
        System.out.println("TOTAL EMPLOYEE    :      "+totEmp);
        System.out.println("TOTAL CARS        :      "+totCars);
        System.out.println();
    }
}
