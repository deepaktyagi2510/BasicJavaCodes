import java.util.Arrays;
import java.util.Scanner;

public class aaray {
    public static void main(String[] args) {
        int []a = new int[5];
        int i;
        System.out.println("The length of Array is : "+a.length);

//
       Scanner sc = new Scanner(System.in);
        for (i = 0; i < a.length; i++) {
//            System.out.println("The Value of " + "a["+ a[i] +"]");
            a[i] = sc.nextInt();
            System.out.println("The Value of " + "a["+ i +"]"+a[i]);
        }
        Arrays.sort(a);
        for (i = 0; i < a.length; i++) {
//            System.out.println("The Value of " + "a["+ a[i] +"]");
            //a[i] = sc.nextInt();
            System.out.print("The Value of array is "+a[i]);
        }

//        for(int j=1;j<a.length;j++){
//                if (max < a[j]) {
//                  max=a[j];
//            }
//            }
//        System.out.println("the largest no is "+max);

    }
    }
