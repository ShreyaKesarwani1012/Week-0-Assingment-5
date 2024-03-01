import java.util.*;
class Hill{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no of rows and cols");
    int n= sc.nextInt();

    //printing-

    for(int i=0;i<=n;i++){

        //for downward space and inc star
        for(int j=i;j<n;j++){
            System.out.print("  ");
        }
        for(int j=1;j<i ;j++){
            System.out.print("* ");
        }

        //for increasing star

        for(int j=1;j<=i;j++){

            System.out.print("* ");
    
        }

        System.out.println();
    }
          

    }

}