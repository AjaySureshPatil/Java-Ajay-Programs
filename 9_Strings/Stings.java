public class Stings {
    public static void main(String [] args){
        StringBuilder sc=new StringBuilder("Radha");
        for(int i=0;i<sc.length()/2;i++){
            int front=i;
            int back=sc.length()-1-i;

            char getfront=sc.charAt(front);
            char getback=sc.charAt(back);

            sc.setCharAt(front,getback);
            sc.setCharAt(back,getfront);

        }
        System.out.println("The Reverse String : "+sc);
    }
    
}
