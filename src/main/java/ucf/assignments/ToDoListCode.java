/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ucf.assignments;

import java.util.ArrayList;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.scene.control.CheckBox;

// create a class that is going to be used to manage the to do lists and the multiple operations related to them
public class ToDoListCode {

    // create a private instance of the class that will be an array list of type Item
    // using : private ArrayList<Item> items

    // create a constructor for the class that will help create a new item array list at each time it is being called
    // and at each time the user wants a new To Do list
    public ToDoListCode(){

        // creates a new array list using :  items = new ArrayList<>();

    }

    // Build getter type methods that will help us get elements whenever the user clicks the appropriate buttons

    // create a public method of type array list of Items that will return the current to do list when called
    public ArrayList<Item> getItemsAsAWhole(){
        // returns all the items of the arraylist by returning the array list itself

        // we return null for now just as the part 1 of the assignment is the pseudocode and to help launch the gui at least
        // this will not remain later
        return null;
    }

    // create a method of type arraylist of Items that will return an arraylist of Items that were marked as completed
    public ArrayList<Item> completedElements(){

        // create a new Item type arraylist that will store the Items marked as completed

        // to build the new completed items array list we will loop through the whole current Items array list and get the completed ones
        // we will use the getStatus() in the class Item.java
        // we will also rely on the boolean approach using the method CheckBox isSelected()
        // if isSelected returns a true value we will add the current task to the completed tasks array list otherwise continue the loop

        // return the arrayList of completed Items

        // we return null for now just as the part 1 of the assignment is the pseudocode and to help launch the gui at least
        // this will not remain later
        return null;
    }

    // create a method of type arraylist of Items that will return an arraylist of Items that were marked as incomplete
    public ArrayList<Item> incompleteElements(){

        // create a new arraylist of type Item for incomplete items
        // Using: ArrayList<Item> incompleteItems = new ArrayList<>();

        // to build the new incomplete items array list we will loop through the whole current Items array list and get the incomplete ones
        // we will use the getStatus() method in Item.java class
        // we will also rely on the boolean approach using the method CheckBox isSelected()
        // if isSelected returns a false value we will add the current task to the incomplete tasks array list otherwise continue the loop

        // return the arrayList of incomplete Items

        // we return null for now just as the part 1 of the assignment is the pseudocode and to help launch the gui at least
        // this will not remain later
        return null;
    }

    // Build the multiple setter methods that will help store everything as assigned to them in relation to the current list/ Item

    // create a public void method that will be responsible for adding an item to the current Items arraylist of type Items
    public void addItem(Item currentItem){

        // add the passed item to the list of items using the .add command

    }

    // create a public void function that will be responsible for removing one item from the current Items arrayList
    public void deleteItem(Item currentItem){

        // use the .remove(currentItem) command to remove the item passed to the method from the list

    }

    // create a public void method that will be responsible for achieving edits to prior built items that were stored
    // it takes the new description and a new due date as assigned by the user and updates them through calling the
    // appropriate methods from the items.java class
    public void editPriorItem(Item item, String updatedDescription, LocalDate updatedDueDate){

        // the method will have the item to be edited and its new characteristics passed to it
        // the item will be updated with its new description adn due date through the use of the items.java
        // methods called item.setDescription(updatedDescription) and item.setDate(updatedDueDate)

    }

    // create a method that will be responsible to handle the option to delete everything from the Items arraylist
    public void clearAll(){

        // use the arraylist method .clear() to delete all items

    }

    // private LocalDate type method used to get the date and set it to the format desired by the assignment while also converting it
    // from a String to a LocalDate type variable, the date will then be in the format "yyyy-MM-dd" as the assignment desires
    // the method takes a String that we will call currDate
    public LocalDate formatDate(String currDate){

        // set a DateTimeFormatter to help format the date to the format desired using the .ofPattern("yyyy-MM-dd") approach
        // create a LocalDate variable that will store the date using the .parse() command to convert the date from String to LocalDate

        // print a message to the console as a check for correctness of the format of the date to see that it was successful

        // return the LocalDate generated variable to the caller using a return statement


        // we return null for now just as the part 1 of the assignment is the pseudocode and to help launch the gui at least
        // this will not remain later
        return null;
    }

    // create a method that will be of boolean type that will help us determine if
    // a selected item exists or it doesn't, the method returns true when the item is found
    // and false if it's not found
    public Boolean checkExist(String ItemDes){

        // we will evaluate and check if the item exists in a list using description passed
        // we will loop and check at each time if within the array list of Items there is an item that has
        // the corresponding description, if so we will return true otherwise when not found we return false at the end after the iterations end


        // we return null for now just as the part 1 of the assignment is the pseudocode and to help launch the gui at least
        // this will not remain later
        return null;
    }

    // create a method that will be responsible for saving the items of a todolist to a specific directory
    // the method allows the user to have the chance to choose the title they want as was asked through the assignment
    // the method takes a file directory as argument passed to it
    // The method will save the current arraylist of Items and its components into csv type files
    public void saveToDirectory(File fileDir){

        // the method will implement a try catch approach to handle input output exceptions that can occur
        // try {

            // the method will implement a buffered writer tool in order to have a tool to write into the files following a format to be specified
            // the file directory for the buffered writer will be the passed one to the function called fileDir

            // the method will at first use the buffered write in order to write the components at the beginning before writing the items
            // which will consist of Description, DueDate, Status

            // use a loop in order to iterate through the whole list of items

                // print a console message that will notify about the start of the writing process to the file
                // print the current description to the console

                // use the buffered write to write the description first to the file then use it to put a comma to separate it from what is next
                // get the date using the .getDate() method and then convert it to a string then output the date to the console and use the buffered writer
                // to write it to the file and use the buffered write to add a comma after the date is written

                // use the .getStatus().isSelected() approach to check if the checkbox of the status of the item was marked to either complete or incomplete
                // if it is complete, use the buffered write to write "complete", otherwise use in an else statement the buffered write to write
                // "incomplete" to the file

            // end of the for loop then close the buffered writer

            // catch method that uses the print stack trace approach
        // } catch (IOException e) {

            // e.printStackTrace();

        // }

    }

    // crate an arraylist of type Items that will help load a previously saved toDoList
    // the method will take as argument the directory of the file of the todolist to be loaded
    // the file directory passed needs to be of a .csv type file
    public ArrayList<Item> loadToDoList(File fileDir){

        // first, initialize an arraylist of type Items
        // that will store the newly loaded list

        // implement a try catch exception approach that catches input output exceptions
        // and file not found exceptions
        // try {

            // create an empty string variable that will be used to help read from the file

            // we will implement a buffered Reader tool that will be used with the passed file directory in order to read from
            // the csv file accordingly

            // read the first line before the loop as that line will be just the headers that have Description, DueDate and Status

            // start a while loop that goes up till the br.readLine() is null meaning the end of the file

                // initialize a String array that will be used at each iteration to store the elements of each line in the file
                // using the .split(",") approach in order to separate the elements of each line

                // Initialize a Checkbox variable to hold the status of the current item scanned from the file
                // using the CheckBox varname = new CheckBox();

                // print to the console the elements scanned at each iteration to see if the scanning process if going as expected

                // at each iteration we will get the date and convert it to a string and also create a new Item Object and
                // we will pass to the class constructor the description of the Item stored at index 0 and then the date after its conversion
                // using the dedicated method for that called formatDate that also puts the date in a format as asked in the assignment

                // when scanning from the file we will use conditionals to check if the status is either "complete" or "incomplete"
                // afterwards we will update the status accordingly, we will use .equals() string based approach to check for the status then
                // assign it using the checkBox variable created .setSelected() to either boolean true or false

                // update the status of the current item

                // add the created Object item into the arraylist of Items

             // end of the while loop

            // update items list with the current list


            // create the catch statements needed
        // } catch (FileNotFoundException e) {

           // e.printStackTrace();

       // } catch (IOException e) {

          //  e.printStackTrace();

       // }

        // after the array list was built from the loaded file successfuly we will return it to the caller

        // we return null for now just as the part 1 of the assignment is the pseudocode and to help launch the gui at least
        // this will not remain later
        return null;
    }

    // end of the class
}
