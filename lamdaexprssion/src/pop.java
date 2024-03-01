public class pop {
    int stack[] = new int[5];
    int topp = 0;

    public void push(int data) {
        stack[topp] = data;
        topp++;

    }
    public void show(){
        for(int i:stack){
            System.out.println(i);
        }
    }
}