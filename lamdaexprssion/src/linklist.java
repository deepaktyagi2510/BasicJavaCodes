
public class linklist {
    public static void main(String[] args) {
        node n1 = new node(2);
        node n2 = new node(5);
        node n3 = new node(5);
        node head = n1;
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(null);
        System.out.print(n1);
        System.out.print(n2);
        System.out.print(n3);
    }
}
    class node{
        int data;
        private node next;
        node(int data){
           this.data=data;
        }

        public node getNext() {
            return next;
        }

        public void setNext(node next)  {
            this.next = next;
        }
    }

