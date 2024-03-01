public class LinkedList {
    node head;
    public class node {
        int data;
        node next;


        node(int d) {
            data = d;
            next = null;
        }
    }
    public void addfirst( int data){
        node newnode = new node(data);
        if(head == null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        }
        public void addlast(int data) {
            node newnode = new node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            node currnode = head;
            while (currnode.next != null) {

                currnode = currnode.next;
            }
            currnode.next=newnode;
        }
        public void printlist(){
        if(head==null){
            System.out.println("list is empty");
        }
        node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
            System.out.print("null");
    }
//    public void deletefirst(){
//        if(head==null){
//            System.out.println("the list is empty");
//            return;
//        }
//        head=head.next;
//    }
//    public void deletelast(){
//        node secondlast=head;
//        node lastnode=head.next;
//        while(lastnode.next==null){
//            lastnode=lastnode.next;
//            secondlast=secondlast.next;
//        }
//        secondlast.next=null;
//    }
    public void reverse(){
        if(head==null){
            return;
        }
        node prenode=head;
        node currnode=head.next;
        while(currnode==null){
            node nextnode=currnode.next;
            currnode.next=prenode;
            prenode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prenode;
    }

    public static void main(String[] args) {
        LinkedList<Integer>list2=new LinkedList<>();
        list2.
        LinkedList list =new LinkedList();

        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(67);
       // list.addlast(34);
//        list.deletefirst();
//        list.deletelast();
        list.printlist();
        list.reverse();
list.printlist();
    }
    }


