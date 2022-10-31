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

    public void deleteIndex(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            if (currentNode.next != null) {
                currentNode = currentNode.next.next;
            }else{
                currentNode = null;
            }
        }
    }

    public void grabNodes(){
        Node currentNode = head;
        System.out.println("==============================");
        if(currentNode.data == null){
            System.out.println("The Linked List is Empty");
        }else{
            while(currentNode != null){
                System.out.println("Data = "+currentNode.data+"     Link="+currentNode.next);
                currentNode = currentNode.next;
            }
        }
    }
    public String grabData(int index){
        if (index == 0) {
            return head.data;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
    }

    public void dataSwap(int index1, int index2){
        String data1 = grabData(index1);
        String data2 = grabData(index2);
        Node currentNode = head;
        for (int i = 0; i < index1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.data = data2;
        currentNode = head;
        for (int i = 0; i < index2; i++) {
            currentNode = currentNode.next;
        }
        currentNode.data = data1;
    }
}
