public class A2ConcatenationString {
    public static void main(String [] args){
        String firstname="Akshay";
        String lastname= "Pawade";
        String fullname=firstname+" "+lastname;
        //concatenation and length
        System.out.println(fullname+"\nThe length of String is:"+fullname.length());

        //charAt method  
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        System.out.println("_________________");

        //compareTo method
        String name1="Akshay";
        String name2="Pawade";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are Equle");
        }else{
            System.out.println("Strings are not Equle");
        }

        //Strings are inmutable we cannot change them once created;
        System.out.println("____________________________________");
        
        //subString 
        String sentence="tere naina tere naiana";
        String m= sentence.substring(5,sentence.length()  );
        System.out.println(m);
        
    }
}
