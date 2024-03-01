
public class stack {
    public static void main(String[] args) {
        stack num = new stack();
        num.push(5);
        num.push(6);
        num.push(7);
        num.push(9);

        num.show();
    }
    int stack[] = new int[5];
    int topp = 0;
    public void push(int data) {
        stack[topp] = data;
        topp++;
    }
    public void show(){
        for(int i:stack){
            System.out.print(i+",");
        }

}}
