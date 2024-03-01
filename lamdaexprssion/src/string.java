import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int len=s.length();
        System.out.println("the lenth of string is="+len);
        for(int i=len-1;i>0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
