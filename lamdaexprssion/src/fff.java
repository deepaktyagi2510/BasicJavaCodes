public class fff {
    public static void main(String[] args) {
        int n=6 ,i;
        for( i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++ ){
                System.out.print("@");
            }
            for(int j=1;j<=n+2;j++){
                if(i==n || j==n+2){
                    System.out.print("@");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
