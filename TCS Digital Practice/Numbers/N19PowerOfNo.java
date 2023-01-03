public class N19PowerOfNo {
    
    public static void main(String [] args){

        int n= 5;  
        int k= 3;
        int ans= 1;
        for(int i=0; i<k; i++){
            ans =  ans * n;
        }
        System.out.println(n +" Raised to the power " +k+ " answer is as given " +ans);
    }
}
