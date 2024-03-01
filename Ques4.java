import java.util.*;
class Ques4{
    public static void main(String[] args){
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array");
        int n = sc.nextInt();
        System.out.print("Enter the array");
        int a[] = new int[n];// taking array input

        for(int i=0 ; i<n;i++){
            a[i]=sc.nextInt();

        }
        for(int i=0 ;i<n;i++){
            sum=sum+a[i];

        }
        System.out.println("The sum of no of given array "+sum);

    }
}