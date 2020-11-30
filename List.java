package Lists;

public class List {
    
    protected ListNode firstNode; //the first node
    protected ListNode lastNode; //the last node
    protected String name; //a string name


    
    public void insertAtFront (Object newData){
        if (firstNode == null) //empty list
            firstNode = lastNode = new ListNode(newData,null);
        
        else {
            ListNode newFirstNode = new ListNode(newData,null);
            firstNode = newFirstNode;
        }
    }

    public void insertAtBack(Object newData){
        if (firstNode == null) //empty list
            firstNode = lastNode = new ListNode(newData, null);
        
        else{
            ListNode newLastNode = new ListNode(newData,null);
            lastNode.next = newLastNode; // next of last node now points to newLastNode
            lastNode = newLastNode; // newLastNode now becomes the lastNode
        }
    }

    public Object removeFromFront(){
        if (firstNode == null)
            return null;
        
        Object removedData = firstNode.data;

        if (firstNode == lastNode)//only one list node
            return null;

        else {
            firstNode = firstNode.next;
        }
        return removedData;
    }

    public Object removeFromBack(){
        if (firstNode == null)
            return null;

        Object removedData = lastNode.data;

        if (firstNode == lastNode)
            firstNode = lastNode = null;
        
        else {
            ListNode current = firstNode;

            while (current.next != lastNode)
                current = current.next;
            
            current =  lastNode;
            current.next = null;

            
        }

        return removedData;
    }

    // getFirst allows one to get a 'handle' to navigate through the list in a loop
    public ListNode getFirst(){
        return firstNode;
    }

    @Override
    public String toString(){
        String output = new String();
        ListNode current = firstNode;

        output = name + ":";
        while (current != null){
            output += "\n" + current.data;
            current = current.next;
        }

        return output;
    }

    public List (String listName){firstNode = lastNode = null; name = listName;}
    public List(){this("List");}

}