public class minMax {
    public static void main(String [] args){
        int arr[]={28,45,65,78,64};
        
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<5;i++){
            
            if(max<arr[i]){
                max=arr[i];
            }
           
        }
        for(int i=0;i<5;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("the maximum element is ="+max);
        System.out.println("the minimum element is ="+min); //cout<<"the min ele is :"<<min;
        
    }
    
}

