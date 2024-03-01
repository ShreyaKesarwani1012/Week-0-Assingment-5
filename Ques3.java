import java.util.*;
class Ques3{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows");
        int n= sc.nextInt();
        for(int i=0; i<=n;i++){

            //R-downward
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            // upper right triangel
            for(int j=1;j<i;j++){
                System.out.print(i+" ");
            }

            // for increasing triangle
            for(int j=1;j<=i;j++){

                System.out.print(i+" ");
        
            }

            System.out.println();
        }

    }

}