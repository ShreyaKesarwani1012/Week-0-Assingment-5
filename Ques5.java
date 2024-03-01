import java.util.*;
class Ques5{
    
    public static void main(String [] agrs){
         
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array");
        int n = sc.nextInt();
        
    //taking value of array 1st
    System.out.println("enter the value 1st array");
    int a[] = new int[n];// taking array input
    for (int i=0;i<n;i++){
        System.out.println("enter the "+i+" value");
        a[i]=sc.nextInt();
    }
    int max2=a[0];
    int max1=a[0];
    for (int i=0; i<n; i++)
    {
        //System.out.print(a[i]+" ");
           if (a[i]>max2)

           { 
            max1= max2;
            max2=a[i];
              //now max is grt no
        }
        else if(a[i]>max1){
            max1=a[i];
        } 
    }
  


    System.out.println("the  largest no is"+max2);
    System.out.println("the second largest no is"+max1);


}
}