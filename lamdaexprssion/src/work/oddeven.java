package work;
public interface oddeven {
     int math(int a);

}
class test{
     public static void main(String[] args) {
          oddeven d=(a)-> {
               if (2 % a == 0) System.out.println("this is even no");
               return a;
          };
          System.out.println(d.math(4));
     }
}
