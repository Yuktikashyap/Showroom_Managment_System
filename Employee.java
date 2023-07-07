import java.util.Scanner;
import java.util.UUID;

public class Employee {
    int age;
    String name,dep,shrm_name,id;

    public void setDetails(){
        System.out.println();

        Scanner s = new Scanner(System.in);
        System.out.println("Kindly enter the details");

        UUID uuidd = UUID.randomUUID();
        id = uuidd.toString();

        System.out.print("EMPLOYEE NAME : ");
        name = s.nextLine();

        System.out.print("DEPARTMENT : ");
        dep = s.next();

        System.out.print("SHOWROOM NAME : ");
        shrm_name = s.next();

        System.out.print("AGE : ");
        age= s.nextInt();

        System.out.println();
    }
    public void getDetails(){
        System.out.println("EMPLOYEE ID        :     "+id);
        System.out.println("EMPLOYEE NAME      :     "+name);
        System.out.println("AGE                :     "+age);
        System.out.println("DEPARTMENT         :     "+dep);
        System.out.println("SHOWROOM NAME      :     "+shrm_name);
        System.out.println();
    }
}
