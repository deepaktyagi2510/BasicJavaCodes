import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int a[]={1,34,5,6,78,90,3,4,5,39,51};
        int k=a.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key");
      int key=sc.nextInt();
int i=0;
      int j=10;
      int flag=0;
     while(i<=j&&flag==0){
          int mid=(i+j)/2;
          if(a[mid]==key){
              flag=1;
          }
          if(a[mid]>key){
              j=mid-1;
          }if(a[mid]<key)
              i=mid+1;

      }
        if(flag==0){
            System.out.println("number is not found");
        }
        else{
            System.out.println("number is  found");
        }
    }
}
