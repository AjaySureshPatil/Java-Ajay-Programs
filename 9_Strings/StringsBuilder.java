public class StringsBuilder {
    public static void main(String [] args){
        StringBuilder sc= new StringBuilder("Akshay");
        System.out.println("Akshay");
        //characterr indexx 
        System.out.println(sc.charAt(3));
        //change character at any indexx
        sc.setCharAt(0,'M');
        System.out.println(sc);
        //Insert character at any indexx
        sc.insert(6,'A');
        System.out.println(sc);
        //Delete any indexx 
        sc.delete(0,1);
        System.out.println(sc);
        //apend the String (insert at last)
        sc.append("K");
        sc.append("S");
        sc.append("H");
        System.out.println(sc);
        //Length of func
        System.out.println(sc.length());

    }
}
