import java.util.Scanner;

public class HomeWorkIf {
    public static void main(String[] args) {

       // int time = 19;
        //int day, month, year;


        System.out.println("Hello, my friend! I want to check on you! ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the time:");
        double time = scanner.nextDouble();


        if (time <= 12 && time >= 0){
            System.out.println("Good Morning, Sunshine!");
        }

        if ((time >= 13) && (time <= 19)) {
            System.out.println("Good Afternoon! Work Hard!");
        }
        if ((time >= 20) && (time <= 24)) {
            System.out.println("Good Evening. Get some rest!");
        }
        if ((time > 24) || (time < 0)) {
            System.out.println("Please check your clock and try again!");
        }
       //System.out.println(day+ "/" + month + "/" + year);

       System.out.println("Please insert today`s date:");
        int day = scanner.nextInt();

        if (day > 31 || day < 1) {
        System.out.println("Please insert valid date!");
        }

        System.out.println("Please insert today`s month:");
        int month = scanner.nextInt();

        if (month < 1 && month > 12){
            System.out.println("Please insert valid month!");
        }
        System.out.println("Please insert today`s year:");
        int year = scanner.nextInt();

        if ( year != 2021 ){
            System.out.println("Please insert valid year!");
        }
        System.out.println("Today is " + year + "/" + month + "/" + day );


    }

}
