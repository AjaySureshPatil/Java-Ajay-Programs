public class N4PrimeNoInGivenRange {
    
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i=2; i<Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void PrintPrimeinRange(int a, int b){
        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String [] args){
        int a = 10, b = 17;
        PrintPrimeinRange(a,b);
    }
}
