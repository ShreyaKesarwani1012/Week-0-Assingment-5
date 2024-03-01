import java.util.*;
class Ques6{
    public static void main(String[] args){
    int i=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array");
        int n = sc.nextInt();
        System.out.print("Enter the array");
        int a[] = new int[n];// taking array input

        for(i=0 ; i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //reversing the array
        System.out.println("The reverse of given array is");
        for (int j=n-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
        
        
    }
}