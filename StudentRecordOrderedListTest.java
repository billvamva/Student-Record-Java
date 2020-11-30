package Lists;
import java.util.*;


public class StudentRecordOrderedListTest{

    //method to create a list
    public StudentRecordOrderedList initialize(){

        StudentRecordOrderedList studentList = new StudentRecordOrderedList();
        return studentList;
    }

    //method to add new student. Student Number to be assigned by system

    public void add(StudentRecordOrderedList studentList, int sNo){
        
        //input for name and surname
        Scanner name = new Scanner(System.in);

        //input for averageMark
        Scanner mark = new Scanner(System.in);

        //use try catch block to make sure inputs are correct

        try{
            //user input split to get name and surname from 1 line
            System.out.printf("enter first and last name of user: \n");
            String sName [] = name.nextLine().toUpperCase().split(" ");

            //get averageMark from user
            System.out.printf("enter the average mark of the student: \n");
            float sMark = mark.nextFloat();

            //Make a StudentRecord Node
            StudentRecord listNode = new StudentRecord(sName[0], sName[1], sNo, sMark);

            //Now we must add the student to the list. Use of final boolean to check if procedure was successfull
            final boolean checkInsert = studentList.insert(listNode);

            // use if statement to examine if student was added
            if(checkInsert == true){
                System.out.printf("Success!");
            }
            else{
                System.out.printf("Error! Student is already in the system!");
            }
        }catch(final InputMismatchException e){
            System.out.printf("Error! Make sure that the name is inputted as: first last and the mark as a float\n");
            }

                      
    }

    // method to remove student using fullname string
    public void remove(StudentRecordOrderedList studentList){
        //Scanner for user input for deletion
        Scanner sDelete = new Scanner(System.in);
        
        //make sure that fullName is all Upper Case       
        

        try{
            //user input split to get name and surname from 1 line
            System.out.printf("enter first and last name of user you want to delete: \n");
            String fullName[] = sDelete.nextLine().toUpperCase().strip().split(" ");


            //Make a new Node with the data of the student to be deleted
            StudentRecord delNode = new StudentRecord(fullName[0], fullName[1]);

            //Now we must remove the student from the list
            ListNode deletion = studentList.remove(delNode);

            // use if statement to examine if student was removed
            if(deletion != null){
                System.out.printf("Success!");
            }
            else{
                System.out.printf("Error! Student is not in the system!");
            }
        }catch(final InputMismatchException e){
            System.out.printf("Error! Make sure that the name is inputted as: first last and the mark as a float\n");
            }



    }

    //print one student
    public void printOne(StudentRecordOrderedList studentList){
        //Scanner for user input for detection
        Scanner sPrint1 = new Scanner(System.in);
        
        //make sure that fullName is all Upper Case       
        

        try{
            //user input split to get name and surname from 1 line
            System.out.printf("enter first and last name of user you want to print: \n");
            String fullName[] = sPrint1.nextLine().toUpperCase().strip().split(" ");


            //Make a new Node with the data of the student to be deleted
            StudentRecord findNode = new StudentRecord(fullName[0], fullName[1]);
            // Student Record with the data from the found student
            StudentRecord printNode = (StudentRecord)studentList.find(findNode).data;
            
            //Print Student Data
            if(printNode != null)
                System.out.print("\n----------------------------\n" + printNode.toString() + "\n----------------------------\n");
            else{
                System.out.print("Please insert valid input!");
            }

        }catch(final InputMismatchException e){
            System.out.printf("Please input the name in the format of -fist name-last name-\n");
            }
    }

    //print all students

    public String printAll(StudentRecordOrderedList studentList){
        // Use toString method of ordered List
        String output = studentList.toString();
        return output;
    }

    
    
    public static void main(final String[] args){
        //while boolean
        boolean repeat = true;

        //number of students initialized here
        int studentNo = 0;

        //create instance of test and create list 
        final StudentRecordOrderedListTest test = new StudentRecordOrderedListTest();
        StudentRecordOrderedList studentList = test.initialize();

        //loop until user opts to exit
        while(repeat == true){
            System.out.print("\nWhat would you like to do?\n");
            System.out.print("\n1. add a new student,\n" + 
                    "2. remove a student,\n"
                    + "3. print data of one student,\n"
                    + "4. print data of all students, \n"
                    + "5. exit the program.\n");
            final Scanner menu = new Scanner(System.in);
            //switch case for menu
            switch (menu.nextInt()){
                case 1:
                    //increment studentNo
                    studentNo++;  
                    //add student to studentList Initialized
                    test.add(studentList, studentNo);

                    break;
            
                case 2:
                    //delete student
                    test.remove(studentList);

                    break;
                
                case 3:
                    //print one student
                    test.printOne(studentList);

                    break;
                
                case 4:
                    //print all
                    String output = test.printAll(studentList);
                    System.out.println(output);

                    break;

                case 5:
                    //exit
                    repeat = false;
                    break;

                default:
                System.out.printf("please insert a valid integer");
                
            }
        }
    }


}