package Lists;

public class StudentRecordOrderedList extends OrderedList{

    @Override
    protected int compare(Object obj1, Object obj2) {
        //Cast obj as student Records
        StudentRecord st1 = (StudentRecord)obj1;
        StudentRecord st2 = (StudentRecord)obj2;

        //Concatenate surname and first name
        String s1 = st1.name.concat(st1.surname);
        String s2 = st2.name.concat(st2.surname);
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