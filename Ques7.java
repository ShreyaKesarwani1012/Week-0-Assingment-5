import java.util.*;
class Ques7{

static void common(int a[],int b[]){
for(int i=0;i<a.length;i++){
    for(int j=0; j<b.length;j++){
        if(a[i]==b[j]){
            System.out.println("the common part is"+a[i]);
        }
    }
}

 }
    public static void main(String[] args){
    
    
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array");
        int n = sc.nextInt();
        
    //taking value of array 1st
    System.out.println("enter the value 1st array");
    int a[] = new int[n];// taking array input
    for (int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }


    //taking value of array 2st
    System.out.println("enter the value 1st array");
    int b[] = new int[n];// taking array input
    for (int i=0;i<n;i++){
        b[i]=sc.nextInt();
    }

    common(a,b);
  
    }

}  