public class N20FactorsOfN {
    
    public static void Divisor(int n){
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String [] args){
        int n = 14;
        System.out.println("Factors of N(" +n+") as given below ");
        Divisor(n);
    }
}
