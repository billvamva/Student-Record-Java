package Lists;
import java.util.*;

public class OrderedListTest{
    
    public static void main (final String[] args) {
        int selectMain = 0;
        // instances of lists
        final IntegerOrderedList list1 = new IntegerOrderedList();
        final StringOrderedList list2 = new StringOrderedList();

        // while loop that runs as long as user does not select to end
        while (selectMain != 3) {

            // secondary input to be used in each of the list modifications. Reset at every
            // cycle
            int selectSec = 0;

            // int and string variables
            int selectInt;
            

            System.out.printf("Input your choice:\n1. Modify integer list.\n2. Modify string list.\n3. Exit\n");

            // Scanner used for initial menu
            final Scanner mainInput = new Scanner(System.in);
            // Scanner used for secondary menu
            final Scanner secInput = new Scanner(System.in);
            // Scanner used for element selection
            final Scanner elementInput = new Scanner(System.in);
            
            // User inputs choice for main menu
            selectMain = mainInput.nextInt();

            switch(selectMain){
                
                // Integer Modification case
                case 1:
                    System.out.printf("\nInput your choice:\n1. Add an integer.\n2. Remove an integer. \n3. Print List.\n");

                    // User inputs choice for secondary menu
                    selectSec = secInput.nextInt();

                    // if statement for insert, remove and print
                    if(selectSec == 1){
                        System.out.printf("Input the element you want to insert: \n");
                        // try and catch statement to make sure that user inputs a valid integer
                        try{
                            selectInt = elementInput.nextInt();
                        } catch (final InputMismatchException e) {
                            System.out.println("Something went wrong. Input not accepted. Try inputting an integer. \n");
                            elementInput.nextLine();
                            break;
                        }
                        list1.insert(selectInt);
                        System.out.printf("Element inserted: " + selectInt + "\n");
                        break;
                    }
        
                    else if(selectSec == 2){
                        System.out.printf("Input the element you want to remove: \n");
                        // try and catch statement to make sure that user inputs a valid integer
                        try{
                            selectInt = elementInput.nextInt();
                        } catch (final InputMismatchException e) {
                            System.out.println("Something went wrong. Input not accepted. Try inputting an integer. \n");
                            elementInput.nextLine();
                            break;
                        }
                        list1.remove(selectInt);
                        System.out.printf("Element deleted: " + selectInt + "\n");
                        break;
                    }
                    else if(selectSec == 3){
                        System.out.println(list1);
                        break;
                    }
                    
                    else{
                        System.out.printf("Input a valid choice!");
                        break;
                    }

                
                
                

                case 2://String modification
                    System.out.printf("\nInput your choice:\n1. Add a string.\n2. Remove a string.\n3. Print List.\n");

                    // User inputs choice for secondary menu
                    selectSec = secInput.nextInt();

                    String selectString;

                    // if statement for insert or remove
                    if(selectSec == 1){
                        System.out.printf("Input the element you want to insert: \n");
                        // try and catch statement to make sure that user inputs a valid integer
                        try{
                            selectString = elementInput.next() + elementInput.nextLine();
                        } catch (final InputMismatchException e) {
                            System.out.println("Something went wrong. Input not accepted. Try inputting a string. \n");
                            elementInput.nextLine();
                            break;
                        }
                        // make sure that any spaces are elimanted
                        selectString = selectString.replaceAll("\\s","");
                        list2.insert(selectString);
                        System.out.printf("Element inserted: " + selectString + "\n");
                        break;
                    }

                    else if(selectSec == 2){
                        System.out.printf("Input the element you want to remove: \n");
                        // try and catch statement to make sure that user inputs a valid integer
                        try{
                            selectString = elementInput.next() + elementInput.nextLine();
                        } catch (final InputMismatchException e) {
                            System.out.println("Something went wrong. Input not accepted. Try inputting an integer. \n");
                            elementInput.nextLine();
                            break;
                        }
                        selectString = selectString.replaceAll("\\s","");
                        list2.remove(selectString);
                        System.out.printf("Element deleted: " + selectString + "\n");
                        break;
                    }

                    else if(selectSec == 3){
                        System.out.println(list2);
                        break;
                    }
                    
                    else{
                        System.out.printf("Input a valid choice!");
                        break;
                    }
                
                
                // Exit
                case 3: 
                    System.out.printf("Thank you!");
                    break;

                // default case
                default:
                    System.out.printf("Insert a valid input! (1, 2 or 3");
            }
       }
             
    }
}