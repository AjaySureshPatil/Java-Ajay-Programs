public class N3CheckNoisPrimeOrNot {

    public static boolean isPrime(int n){

        for(int i=2; i<n;  i++){
            if(n%i == 0){               // if reminder is 0 then Non-Prime  No
              // System.out.println("n => "+n  +" i => " +i);
                return false;
            }
         //   System.out.println("n => "+n  +" i => " +i);
        }
        return true;                   // if reminder is not 0 then it is Prime No
    }
    public static void main(String []args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int n = 12;
        boolean ans =(isPrime(n));
        if(n != 1 && ans == true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non-Prime Number");
        }
    }
}
