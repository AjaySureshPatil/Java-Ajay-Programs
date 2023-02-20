import java.util.*;
public class Switch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number :");
        int n=sc.nextInt();

        // switch(n){
        //     case 1:
        //     System.out.println("hello");
        //     break;

        //     case 2:
        //     System.out.println("bounjour");
        //     break;

        //     case 3:
        //     System.out.println("Namaste");
        //     break;

        //     default :
        //     System.out.println("I am steel learningg !!");
        switch(n){
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("feb");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("may");
            break;
            case 6:
            System.out.println("Jun");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("Aug");
            break;
            case 9:
            System.out.println("Sept");
            break;
            case 10:
            System.out.println("october");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default:
            System.out.print("Invalid month");
        }


            
        

    }
    
}
