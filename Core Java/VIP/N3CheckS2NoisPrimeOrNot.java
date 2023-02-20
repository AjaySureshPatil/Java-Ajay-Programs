public class N3CheckS2NoisPrimeOrNot {
    
    public static boolean isPrime(int n){

        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            } 
        }
        return true;
    }
    public static void main(String [] args){
        int n =20;
        boolean ans = (isPrime(n));

        if(n != 1 && ans == true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non Prime Number");
        }
    }
}
