public class bubblesort {
    public static void main(String[] args) {
        //Bubble sort in aaray
        int a[]={34,5,67,12,89,32};
        int k=a.length;
        for(int i=0;i<k-1;i++){
            for(int j=0;j<k-i-1;j++){
                if(a[j]>a[j+1]){
                    int s=a[j];
                    a[j]=a[j+1];
                    a[j+1]=s;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(a[i]);
        }
    }
}
