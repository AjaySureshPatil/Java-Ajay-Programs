package Arrays;

public class selectionsort {

    public static void sorting(int[] input )
    {
        for(int i=0; i<input.length -1; i++)
        {
            int min =input[i];
            int minIndex =i;
            for(int j=i+1; j<input.length; j++)
            {
                if(input[j]< min)
                {
                    minIndex = j;
                }
            }
            if(minIndex !=i)
            {
                input[minIndex] = input[i];
                input[i] = min;
            }
        }
    }

    public static void main(String[] args)
    {
        int input [] ={1, 6, 9, 2, 5};
        sorting(input);
        for(int i=0; i< input.length; i++)
        {
            System.out.println(input[i] + " ");
        }
    }
}
