package Lists;

public class StringOrderedList extends OrderedList{

    @Override
    protected int compare(Object obj1, Object obj2) {
        // positive c if s1 is larger than s2, negative if s2 larger and 0 if they are equal
        String s1 = String.valueOf(obj1);
        String s2 = String.valueOf(obj2);
        Integer c = s1.compareTo(s2);
        if(c > 0){
            return 1;
        }
        else if(c<0){
            return - 1;
        }
        else{
            return 0;
        }
    }

}