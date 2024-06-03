public class Linkeslist {
    Node headnode;

    class Node {
        String data;
        Node nextnode;

        Node(String data) {
            this.data = data;
            this.nextnode = null;
        }
    }

    public void printlist() {
        Node currnode = headnode;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.nextnode;
        }
        System.out.print("null\n");
    }

    public void addFirst(String data) {
        Node node = new Node(data);

        node.nextnode = headnode;
        headnode = node;
    }

    public void addlast(String data) {
        Node node = new Node(data);

        Node lastnode = headnode;

        while (lastnode.nextnode != null) {
            lastnode = lastnode.nextnode;
        }
        lastnode.nextnode = node;
    }


    public void deleteLast() {
        if(headnode == null){
            System.out.println("the list is empty");
        }
        Node secondlast = headnode;
        Node last = secondlast.nextnode;

        while(last.nextnode != null){
            secondlast = last;
            last = last.nextnode;
        }
        secondlast.nextnode = null;
}
    public void deletefirst(){
        if(headnode == null){
            System.out.println("list is empty");
        }
        headnode = headnode.nextnode;
        // headnode = null;
    }

    // public void add(int position, String data){
    //     Node node = new Node(data);
    //     Node currnode = headnode;

    //     while(position > 0){
    //         currnode = currnode.nextnode;
    //         position--;
    //     }
    //     currnode.nextnode = node;
    // }
}
class TestDrive{
    public static void main(String[] args) {
        Linkeslist al = new Linkeslist();

        al.addFirst("my");
        al.printlist();
        al.addlast("name");
        al.addlast("is");
        al.addlast("sujal");
        al.printlist();
        al.deleteLast();
        al.printlist();
        al.deletefirst();
        al.printlist();
    }
}
