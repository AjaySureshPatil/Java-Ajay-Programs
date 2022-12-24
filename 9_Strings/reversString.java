public class reversString {
    public static void main(String[] args){
        StringBuilder sc=new StringBuilder("Akshay");
        for(int i=0;i<sc.length()/2;i++){
            int front= i;
            int back=sc.length()-1-i;

            char setfront=sc.charAt(front);
            char setback=sc.charAt(back);

            sc.setCharAt(front,setback);
            sc.setCharAt(back,setfront);
            

        }System.out.println(sc);
    }
    
}
