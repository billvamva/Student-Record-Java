package Lists;

public abstract class OrderedList extends List {
    
    protected abstract int compare (Object obj1, Object obj2);
    
    public ListNode find (Object newData){
        // walk-through list and use compare to find Node
        ListNode current = firstNode; // Node to traverse through the list ano
        ListNode findNode = new ListNode(newData, null); // Node to be found
        
        while(current != null){
            // iterate through the list 
            int c = compare(current.data, findNode.data);
            
            // assign compare value to be 1 when they are equal
            if (c == 0){
                return current;
            }

            else
                current = current.next;
        }

        return null;
    }
    
    public boolean insert (Object newData){
        ListNode insertNode = new ListNode(newData,null); // Node to be inserted
        insertNode.next = null;
        ListNode current = firstNode, prev = null; // Node to traverse through the list and node to store previous
        ListNode testNode = new ListNode(); // Node to store find ListNode
        
        // case where list is empty
        if(current == null) {
            firstNode = lastNode = insertNode;
            return true;
        }

        else {
            // use find method to check that it is not in the list
            testNode = find(insertNode.data);

            // check if find method returns anything
            if(testNode != null){
                return false;
            }
            
            // in case it is null then it does not exist in the list and we should add it
            else{             
                
                // loop that runs until end of list
                while (current != null) {

                    // we need to check if insert is smaller than current node at every loop
                    int c = compare(insertNode.data,current.data);

                    // case where inserted is larger than current node: increment current
                    if (c == 1) {
                        prev = current;
                        current = current.next;
                    }
                    
                    // case where inserted is smaller than next node: place in between
                    else {
                        if (prev == null){
                            insertNode.next = firstNode;
                            firstNode = insertNode;
                            return true;
                        }
                        else{
                            insertNode.next = prev.next;
                            prev.next = insertNode;
                            return true;
                        }
                        
                    }

                }

                // else traverse the list and add it to the end
                // current is at last node
                lastNode.next = insertNode;
                lastNode = insertNode;
                return true;
                               
            }
            
        }

    }

    public ListNode remove (Object remData){
        // store current as head and the previous node
        ListNode current = firstNode, prev = null;
        
       
        
        // Case 1: First Node has element
        if(current != null &&  compare(current.data,remData) == 0){
            // set next node as head
            firstNode = current.next;
            return current;

        }
        // use compare to see if they are equal (when it is 0)
        // Case 2: Node other than first has element
        while (current != null &&  compare(current.data,remData) != 0){
            //as long as node is not found or not reach end traverse through the list
            prev = current;
            current = current.next;

        }

        // case where it is found, unbind node using prev
        if (current != null){
            prev.next = current.next;
            return current;
        }

        // Case 3: It is not in the list so it means that while loop traversed through the list

        else{
            return null;
        }

    }

    @Override
    public void insertAtFront(Object newData){
        System.out.printf("Error!");
    }

    @Override
    public void insertAtBack(Object newData){
        System.out.printf("Error!");
    }
    
}