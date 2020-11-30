package Lists;

public class StudentRecord{
    public String name;
    public String surname;
    public int studentNo;
    public float averageMark;

    @Override
    //to string to be used to print all students
    public String toString(){
        String output = "Full name: " + this.name + "\n" + this.surname + "\n" + "Student Number: " + this.studentNo + "\n" + "Average mark: " + this.averageMark + "\n";
        return output;
    }

    //constructors for cases with different inputs
    public StudentRecord(String myName, String mySurname, int myNo, float myMark){
        this.name = myName;
        this.surname = mySurname;
        this.studentNo = myNo;
        this.averageMark = myMark;
    }

    public StudentRecord(String myName, String mySurname){
        this.name = myName;
        this.surname = mySurname;
        this.studentNo = 0;
        this.averageMark = 0.0f;
    }

    public StudentRecord(){
        this.name = null;
        this.surname = null;
        this.studentNo = 0;
        this.averageMark = 0.0f;
    }
}