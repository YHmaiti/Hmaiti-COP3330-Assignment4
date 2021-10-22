/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ucf.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import javafx.*;
import javafx.scene.control.CheckBox;
import org.junit.jupiter.api.Test;


// test all the functionalities of the GUI along with tasks from #6-#20 as mentioned by the assignment
class ToDoListCodeTest {

    // use a JavaFX panel to help in CheckBox Testing
    // declare a ToDoListCode Object for testing purpose that will be set to private


    @Test
    @DisplayName("Test if the functionality to get all items at once of a todo list works!")
    public void getItemsAsAWhole() {

        // create a ToDoListCode object called currentList
        // create an arraylist of type Item called testingList
        // create three sample Items type variables with sample data

        // add the three sample items to the currentList by calling the .addItem() method and pass the item to it
        // add the three sample items to the testingList using the .add() arraylist command and pass at each time the item to it

        // create a third Item type arraylist that will be made through the call of the .getItemsAsAWhole() method
        // ArrayList<Item> allList = currentList.getItemsAsAWhole();

        // test that the generated allList is correct by using assertArrayEquals() command as follows
        // to check that both the testing array and the allList are identical
        // assertArrayEquals(testingList.toArray(), allList.toArray());

    }

    @Test
    @DisplayName("Test if the user can mark items as complete or Incomplete successfully!")
    public void markAsCompleteTest() {

        // create a ToDoListCode Object that will be called currentList
        // create an Item object called item1 that will have a random sample data for testing purpose
        // create a checkBox variable called checkBox1 and set it to true using checkBox1.setSelected(true) command
        // call the setStatus method from the item.java class using: item1.setStatus(checkBox1)

        // administer a test to check if the status reflects a completed item since the passed checkBox was set to clicked meaning true
        // use: assertTrue(item1.getStatus().isSelected());

    }

    @Test
    @DisplayName("Test if the user can mark items as complete or Incomplete successfully!")
    public void markAsCompleteTest2() {

        // create a ToDoListCode Object that will be called currentList
        // create an Item object called item1 that will have a random sample data for testing purpose
        // create a checkBox variable called checkBox1 and set it to false using checkBox1.setSelected(false) command
        // call the setStatus method from the item.java class using: item1.setStatus(checkBox1)

        // administer a test to check if the status reflects a non completed item since the passed checkBox was set to not clicked meaning false
        // use: assertFalse(item1.getStatus().isSelected());

    }

    @Test
    @DisplayName("Test that only the completed items are obtained when the user wants just those!")
    public void completedElements() {

        // create a new ToDoListCode Object called currentList
        // create a new arraylist of type Item called testList
        // create three sample Item objects with random sample data item1, item2, item3, item4

        // add all 4 items to the currentList using the .addItem() method

        // create a checkBox tmp and set it to true

        // set item2 and item3 to complete by calling the setStatus method
        // item2.setStatus(tmp);
        // item3.setStatus(tmp);

        // add the item2 and item3 to the testList only

        // create a new arrayList that will hold only the completed items of the currentList
        // by calling the completedElements() method
        // ArrayList<Item> completeOnly = currentList.completedElements();

        // compare the completeOnly list to the testList and check if they match!
        // using: assertArrayEquals(testList.toArray(), completeOnly.toArray());

    }

    @Test
    @DisplayName("Test that only the incomplete items are obtained when the user wants just those!")
    public void incompleteElements() {

        // create a new ToDoListCode Object called currentList
        // create a new arraylist of type Item called testList
        // create three sample Item objects with random sample data item1, item2, item3, item4

        // add all 4 items to the currentList using the .addItem() method

        // create a checkBox tmp and set it to true

        // set item2 and item3 to complete by calling the setStatus method
        // item2.setStatus(tmp);
        // item3.setStatus(tmp);

        // add the item1 and item4 to the testList only

        // create a new arrayList that will hold only the incomplete items of the currentList
        // by calling the incompleteElements() method
        // ArrayList<Item> incompleteOnly = currentList.incompleteElements();

        // compare the incompleteOnly list to the testList and check if they match!
        // using: assertArrayEquals(testList.toArray(), incompleteOnly.toArray());

    }

    @Test
    @DisplayName("Test if addItem method adds the items successfully!")
    public void addItem() {

        // create a ToDoListCode Object currentList and create an arraylist testList of type Item
        // create three Item objects item1, item2, item3 with random sample data
        // add each to both lists using .addItem for the currentList and .add for the testList by passing each item at each time

        // check if both lists match to confirm the success of the addItem method:
        // assertArrayEquals(testList.toArray(), currentList.getItemsAsAWhole().toArray());

    }

    @Test
    @DisplayName("Test if the the delete by Item method works perfectly using two deletions and comparison")
    public void deleteItem() {

        // create a ToDoListCode Object a currentList
        // create an arrayList of type Item to be used for testing called testList
        // create three sample Item objects for sample data
        // add the three items to both currentList using .addItem() and add them to testList too using .add()

        // currentList.remove(random item from the samples)
        // testList.remove(random item from the samples but different than the one removed from currentList)

        // create a Boolean variable boolCheck that stores true if all the items remaining in the currentList are the same as testList
        // or stores false if they are all different(which is what we expect)
        // Using: Boolean boolCheck = (currentList.getItemsAsAWhole()).equals(testList);

        // test if all the elements are effectively different using assertFalse(boolCheck);

    }

    @Test
    @DisplayName("Test if the the delete by Item method works perfectly using two deletions and comparison")
    public void deleteItem2() {

        // create a ToDoListCode Object a currentList
        // create an arrayList of type Item to be used for testing called testList
        // create three sample Item objects for sample data
        // add the three items to both currentList using .addItem() and add them to testList too using .add()

        // currentList.remove(item2)
        // testList.remove(item2)

        // check that both arraylists are equal
        // using: assertArrayEquals(testList.toArray(), currentList.getItemsAsAWhole().toArray());

    }

    @Test
    @DisplayName("Test if items selected can be edited successfully for either the description or due date")
    public void editPriorItem() {

        // *******test that the update of the date is working:

        // create a new ToDoList object called currentList

        // create a sample Item Object called item1 with random sample description and sample date
        // add the item1 to the currentList created

        // call the editPriorItem method and update the date only Using:
        // currentList.editPriorItem(item1, "sampleDescription", LocalDate.of(sampleDate here));

        // verify that the date was updated using assertEquals:
        // assertEquals(item1.getDate(), LocalDate.of(sampleDate here));

        // *****test that the update of the description is working:

        // change the item's description only using:
        // currentList.editPriorItem(item1, "sampleDescription2", LocalDate.of(keep the same date here));

        // verify that the description was updated successfully and the date didn't change using:
        // assertEquals(item1.getDescription(), "sampleDescription2");

    }

    @Test
    @DisplayName("Check if the formatDate method works perfecting in taking the current date and format it using the format specified by the assignment!")
    public void formatDate(){

        // create a sample String variable1 for testing purpose and fill it with a sample date that is in the format expected
        // create a sample String variable2 with the same sample date with the format the date picker has
        // use assertTrue to check if the call on the formatDate() method while passing the variable2 returns the same
        // LocalDate with a matching format to the variable1 expected after converting the returned variable to string

    }

    @Test
    @DisplayName("Test if clearing everything works perfectly when the user clicks the Clear All button")
    public void clearAll() {

        // create a ToDoListCode Object currentList and an arrayList of type Item called testingList
        // create three random sample data of type Item that we will assign to each using the .addItem method for currentList
        // and .add for testingList by passing the items to each

        // after the items were added to each we will clear the currentList using
        // currentList.clearAll();
        // clear also the testList using testList.clear();
        // compare both lists and check if they are equal which means that they are both emptied and that the clearAll method works
        // assertArrayEquals(testList.toArray(), currentList.getItemsAsAWhole.toArray());

    }

    @Test
    @DisplayName("Test the checkExist function if it returns the right boolean value, true if the item is in the list and false when else")
    public void checkExist() {

        // create an arraylist and add to it three random sample items that will be created as Item Objects
        // create a boolean type variable called check
        // loop through the arrayList and check if we can find the item2 within it then set check to true
        // otherwise await the end of the loop then set check to false
        // use assertTrue(check); to check that effectively the item was found as it is expected

    }

    @Test
    @DisplayName("Test that when the user clicks Save Work the work is saved correctly after calling the saveToDirectory method")
    public void saveToDirectory() {

        // create a ToDoListCode Object called currentList:
        // currentList = new ToDoList();

        // create a string that will be used later for testing
        // String str ="";
        // create sample Item Objects with random data
        // item1, item2, item3
        // Item item1 = new Item("sampleDescription1", LocalDate.of(2021, Month.OCTOBER, 2));
        // Item item2 = new Item("sampleDescription2", LocalDate.of(2021, Month.OCTOBER, 8));
        // Item item3 = new Item("sampleDescription3", LocalDate.of(2021, Month.OCTOBER, 25));

        // next add the items to currentList using the addItems() method by passing the items to it one by one
        // create a checkbox and make it for item1 status as complete meaning set it to true
        // CheckBox tmp = new CheckBox();
        // tmp.setSelected(true);
        // item1.setStatus(tmp);

        // generate a file and assign to it the desired directory and pass the FILE variable to the currentList.saveToDirectory()
        // set a variable to hold the directory: dir = System.getProperty("user.home") + "/Desktop/ToDo_Yohan/fileForTesting.csv"
        // File directory = new File(dir);
        // currentList.saveToDirectory(directory);

        // use a buffered reader to read from teh file and store all the elements being read until the end of the file
        // in the String previously declared called str using a loop that goes until the end of the file
        // catch any IO or file not found exceptions along the process to throw an error adequately

        // generate a test String that will contain the expected elements scanned from the file called test
        // compare it with the str string from that stored what was read from teh file using assertEquals:
        // assertEquals(test, str);

    }

    @Test
    @DisplayName("Test that when the user clicks load work the ToDoList is loaded successfully and that its corresponding csv file was found!")
    public void loadToDoList() {

        // create a ToDoListCode Object called currentList
        // create three Item objects item1, item2, item3 with random sample descriptions and dates
        // create a tmp checkbox and set it to true
        // set item2 to be completed as a sample and the others will stay incomplete
        // CheckBox tmp = new CheckBox();
        // tmp.setSelected(true);
        // item2.setStatus(tmp);
        // next add all the items to the currentList using the addItem() method by passing the items one by one

        // create a new FILE type variable and assigned to it the directory desired and then call the saveToDirectory method to save it
        // create a variable to store the desired directory dir = System.getProperty("user.home") + "/Desktop/ToDo_Yohan/fileToTest.csv"
        // File directory = new File(dir);
        // currentList.save(directory);
        // Note: the directory will be adjusted for part2 to make the code runnable in multiple devises and not only the author's one

        // create a new arraylist that will store the loaded ToDoList and store it, we will call it test2 and build it through calling the loadToDoList():
        // ArrayList<Item> test2= currentList.loadToDoList(directory);

        // convert the content of the test2 arrayList to a String by creating a helper tool or pre-built method to do so, when testing for part2
        // and store it in a String called test3

        // create a String Called Valid that will store the expected content to be loaded from the directory

        // use assertEquals to compare the string built through the loadToDoList and the valid one
        // assertEquals(Valid, test3);

    }

}