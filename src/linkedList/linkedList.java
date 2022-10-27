package linkedList;

public class linkedList {

    Node head;

    public void insertNode(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertHead(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(String data, int index){
        if(index == 0){
            insertHead(data);
        }else{
            Node newNode = new Node(data);
            Node currentNode = head;
            for(int i=0;i <index; i++){
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void deleteIndex(int index){
        if(index ==0){
            head = head.next;
        }else{
            Node currentNode = head;
            for(int i=0; i<index;i++){
                currentNode = currentNode.next;
            }
            currentNode = currentNode.next.next;
        }
    }

    public void grabNodes(int index){
        Node currentNode = head;
        if(currentNode.data == null){
            System.out.println("The Linked List is Empty");
        }else{
            while(currentNode != null){
                System.out.println(currentNode.data+" ");
                currentNode = currentNode.next;
            }
        }
    }
}
