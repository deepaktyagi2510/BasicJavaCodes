import java.util.Scanner;

public class linersearch {
    public static void main(String[] args) {
        int aaray[] = {2, 4, 5, 7, 9, 7, 23, 56, 78};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key no");
        int key = sc.nextInt();
        int k = aaray.length, i,flag=0,pos;
        for (i = 0; i < k && flag==0 ;i++) {
          if(aaray[i]==key){
              flag=1;
              // pos=i+1;
          }
            }
        if (flag!=0) {
            System.out.println("this no is in the aaray="+key);
        }else{
            System.out.println("this no is not found in the aaray="+key);
        }

        }
    }
