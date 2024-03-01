import java.util.*;
class LowerTri{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no of rows");
int n = sc.nextInt();
// printing

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

for(int i=1;i<=n;i++){
    for(int j=i;j<=n;j++){

        System.out.print("* ");

    }
        System.out.println();

}

}

}