package Lists;

public class ListNode {
    //instance variables
    public Object data;
    public ListNode next;

    //constructors
    public ListNode (Object newData, ListNode newNext){
        data = newData;
        newNext = next;
    }

    public ListNode (){
        data = null;
        next = null;
    }
}