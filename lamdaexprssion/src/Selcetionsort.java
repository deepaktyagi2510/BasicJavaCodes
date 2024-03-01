public class Selcetionsort {
    public static void main(String[] args) {
        int a[]={34,5,67,12,89,32};
        int k=a.length;
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(a[i]>a[j]){
                    int s=a[i];
                    a[i]=a[j];
                    a[j]=s;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(a[i]);
        }
    }
}
