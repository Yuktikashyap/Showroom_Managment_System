import java.util.Scanner;

 interface utility{

    public void getDetails();
    public void setDetails();
 }
public class Main {

    public static void menu(){

        System.out.println(":>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Kindly choose a choice acc to your Service <<<<<<<<<<<<<<<<<<<<<<<<<<<<<:");
        System.out.println("""
                               
                               1) Add the showroom              2) Add the car             3) Add the Employee
                               4) Get Showroom Details          5) Get Car Details         6) Get Employee Details
                               9) Go to Menu                    0) Exit
                      """);
        System.out.println("Enter your choice Please :>>>>");

    }
    public static void main(String[] args) {

        Showroom showroom[] = new Showroom[10];
        Car car[] = new Car[10];
        Employee employee[] = new Employee[10];
        int showroom_ind = 0;
        int car_ind = 0;
        int empl_ind = 0;

        int choice = 50;
        System.out.println(":>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Welcome to Our Showroom  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<: ");
        while(choice!=0){
            Scanner s = new Scanner(System.in);
            menu();
            choice = s.nextInt();

            while (choice!=0 && choice!=9){
                System.out.println();
                if(choice==1){

                    System.out.println("Processing your request :- Adding the Showroom ");
                    showroom[showroom_ind] = new Showroom();
                    showroom[showroom_ind].setDetails();

                    showroom_ind++;
                    System.out.println("Do you wish to continue to Add Showroom :- 1) Yes       9) Go to Menu     0) Exit");
                    choice = s.nextInt();
                    System.out.println();
                    System.out.println("Processing......................");
                }
                else if(choice == 2){

                    System.out.println("Processing your request :- Adding the Car ");
                    car[car_ind] = new Car();
                    car[car_ind].setDetails();

                    car_ind++;
                    System.out.println("Do you wish to continue to Add Car :- 1) Yes      9)Go to Menu     0) Exit ");
                    choice = s.nextInt();
                    if(choice==1) choice = 2;
                    System.out.println();
                    System.out.println("Processing......................");
                }
                else if(choice == 3){

                    System.out.println("Processing your request :- Adding the Employee ");
                    employee[empl_ind] = new Employee();
                    employee[empl_ind].setDetails();

                    empl_ind++;
                    System.out.println("Do you wish to continue to Add Employee :- 1) Yes       9) Go to Menu     0) Exit ");
                    choice = s.nextInt();
                    if(choice==1) choice = 3;
                    System.out.println();
                    System.out.println("Processing......................");
                }
                else if(choice == 4){

                    System.out.println("Processing your request :- Getting Details of Showroom ");
                    for(int i = 0;i<showroom_ind;i++){
                        showroom[i].getDetails();
                    }

                    System.out.println("Do you wish to continue to Get Details :- 1) Yes      9) Go to Menu      0) Exit ");
                    choice = s.nextInt();
                    if(choice==1) choice = 4;
                    System.out.println();
                    System.out.println("Processing......................");
                }
                else if(choice == 5){

                    System.out.println("Processing your request :- Getting Details of Car ");
                    for(int i = 0;i<car_ind;i++){
                        car[i].getDetails();
                    }

                    System.out.println("Do you wish to continue to Get Details :- 1) Yes      9) Go to Menu     0) Exit ");
                    choice = s.nextInt();
                    if(choice==1) choice = 5;
                    System.out.println();
                    System.out.println("Processing......................");
                }
                else if(choice == 6){

                    System.out.println("Processing your request :- Getting Details of Employee ");
                    for(int i = 0;i<empl_ind;i++){
                        employee[i].getDetails();
                    }

                    System.out.println("Do you wish to continue to Get Details :- 1) Yes    9) Go to Menu     0) Exit ");
                    choice = s.nextInt();
                    if(choice==1) choice = 6;
                    System.out.println();
                    System.out.println("Processing......................");
                }
                else{
                    System.out.println("Kindly make a choice from the menu -> 0) Exit     9)  Go to Menu     0) Exit ");
                    choice = s.nextInt();
                    System.out.println();
                    System.out.println("Processing......................");
                }
            }


        }

    }
}
