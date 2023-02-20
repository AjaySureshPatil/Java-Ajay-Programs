package Arrays;

public class printarray {

	public static void main(String args[])  
	{    
		//declaration and instantiation of an array  
		int arr[]=new int[4];     
		//initializing elements   
		arr[0]=10;  
		arr[1]=20;    
		arr[2]=70;    
		arr[3]=40;    
		//traversing over array using for loop  
		for(int i=0;i<arr.length;i++)    //length is the property of the array  
			System.out.println(arr[i]);   
		
		
		// declaration and instantiation of an array   Type array name[] = new Type array[Size]
		String[] city = new String[4];  				
		//initializing elements   
		city[0] = "Delhi";  							// array name[0] = "dnksjfak"
		city[1] = "Jaipur";  
		city[2] = "Gujarat";  
		city[3] = "Mumbai";  
		//traversing over array using for-each loop   
		for (String str : city)   
		{  
		System.out.println(str);  
		}  
	}  


}
