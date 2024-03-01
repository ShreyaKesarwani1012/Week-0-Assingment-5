import java.util.*;
class RevHill{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no of rows and cols");
    int n= sc.nextInt();

    //printing-

    for(int i=1;i<=n;i++){

        //for downward space and dec star
        for(int j=1;j<i;j++){
            System.out.print("  ");
        }

        for(int j=i;j<n ;j++){
            System.out.print("* ");
        }

        //for increasing star

        for(int j=i;j<=n;j++){

            System.out.print("* ");
    
        }

        System.out.println();
    }
          

    }

}