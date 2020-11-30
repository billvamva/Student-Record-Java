package Lists;

public class IntegerOrderedList extends OrderedList{

    @Override
    protected int compare(Object obj1, Object obj2) {
        // compare integer values obj1 and obj2
        Integer c = ((Integer)obj1).intValue() - ((Integer)obj2).intValue();

        // depending on returned value return one of -1,0,1
        if (c>0){
            return 1;
        }
        else if(c<0){
            return -1;

        }
        else{
            return 0;
        }

    }

}