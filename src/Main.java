import linkedList.linkedList;

public class Main {
    public static void main(String [] args){
        linkedList l = new linkedList();

        l.insertNode("1");
        l.grabNodes();

        l.insertHead("0");
        l.grabNodes();

        l.deleteIndex(1);
        l.grabNodes();

        System.out.println("=====\n"+l.grabData(0)+"\n=====");

        l.dataSwap(0,1);
        l.grabNodes();


    }
}
