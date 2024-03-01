import java.util.*;
class Ques2{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows");
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i; j<n;j++){

                System.out.print(n-j +" ");

            }
            System.out.println();
        }


    }

}