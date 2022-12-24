public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            if(i>5){      //if(i==7)
                break;    //continue;
            }
            System.out.println("The Number is : " + i);
        }
    }
    
}
