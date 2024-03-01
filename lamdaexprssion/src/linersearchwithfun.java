import java.util.Scanner;

public class linersearchwithfun {
    int a[]=new int [10] ,key,i;
    void getdata(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the element of the aaray");
        for(int i=0;i<10;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("entre the element you want to search in the aaray");
        key=sc.nextInt();

    }
    void search(){
        int flag=0;
        for(int i=0;i<10&&flag==0;i++){
            if(a[i]==key){
                flag=1;
            }
        }
        if (flag!=0) {
            System.out.println("this no is in the aaray="+key);
        }else{
            System.out.println("this no is not found in the aaray="+key);
        }
    }
}
class output{
    public static void main(String[] args) {
        linersearchwithfun sc=new linersearchwithfun();
        sc.getdata();
        sc.search();
    }
}
