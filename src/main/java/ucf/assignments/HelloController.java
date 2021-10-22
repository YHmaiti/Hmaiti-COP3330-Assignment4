/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ucf.assignments;

// import all the tools needed

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.*;
import java.net.URL;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.ResourceBundle;
import javafx.scene.*;
import javafx.stage.*;
import javafx.util.StringConverter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

// create a class related to the manipulation and control of the Hello ToDoList manager GUI App
// the class will implement Initializable
public class HelloController implements Initializable{

    // first we need to create a model as it will be of type Object of the class ToDoListCode

    // We need to create a list that will match the type expected to be used in order to display on the GUI
    // in a table, so we will create an ObservableList of type Item, the ObservableList will be taken from the
    // FXCollections and we will do that using: ObservableList<Item> varname = FXCollections.observableArrayList();


    // create a VBox to represent the Buttons used for the load work and save work buttons
    // the VBox will be private and supported with a tag: @FXML

    // create a label to be used for the file load
    // this will be achieved through the use of a private Label after the tag @FXML

    // create a file chooser that will be used along with the VBox for Save work and Load work
    // this will be declared using FileChooser varname  = new FileChooser(); after the tag @FXML


    // create a dropdown comboBox that will be used to display the available display options
    // the comboBox is going to be of type String and used after the @FXML tag

    // create a TextField and DatePicker based Variables

    // Build a table and set its view and columns to be assigned to variables that will be of type Item and for the column
    // that will be one TableColumn variables of type Item and String for the descriptions
    // one TableColumn variable of Type Item and LocalDate for the Due Dates column
    // one Table Column of type Item and CheckBox for the status column
    // each of these will be written after its assigned @FXML tag

    // create a method that will support the display dropdown comboBox and the options it has
    // either to display all or to display the complete items or to display by incomplete items
    // the method has a passed parameter as ActionEvent
    public void displayOpt(ActionEvent e){

        // store in a string the option selected from the comboBox

        // use conditionals to check which option was selected and call the appropriate
        // display method and print a message to the user console to verify that the display is successful
        // and what options of display is being used

    }

    // create a method that will help us achieve the sorting of the current observable lists
    // by date
    public void sortByDate(){

        // we will use the FXCollections.sort() and use a comparator
        // which compares the date objects and then sorts each
        // the method that will be created will be an int method based on the FXCollections documentation

    }

    // create a method that displays all the items of a todolist when the user wishes to the display All items option
    public void displayAll(){

        // get all the items of the list then convert them to observable list
        // sort the items by date through the sortByDate() method then display on the table
        // using the .setItems() command

    }

    // create a method to display the incomplete items only
    public void displayIncomplete(){

        // use a console message to print the incomplete items only through the call of incompleteElements() method
        // convert to observable list for an easier handling when it comes to table view
        // call the sortByDate() method to sort the incomplete list of items by date
        // display on the table on the GUI using the .setItems() command

    }

    // create a method to display the complete items only
    public void displayComplete(){

        // use a console message to print the complete items only through the call of completeElements() method
        // convert to observable list for an easier handling when it comes to table view
        // call the sortByDate() method to sort the complete elements list of items by date
        // display on the table on the GUI using the .setItems() command

    }

    // create a method to represent the functionality for the saving process through the save work button click
    public void saveWorkBtnFunction(ActionEvent e){

        // create a Window type variable to help load a window that will play the role of a save dialogue
        // we will use the .getWindow() command to do so
        // store the current time using a LocalDateTime variable as that will be needed to store the ToDoList
        // set a default title and default title name for the file that can be changed later by the user

        // implement a try catch approach to save the file and catch any exception that can happen, we also will
        // create a variable that will be used in order to store the updated filename if the user changes the
        // default one and the directory too

    }

    // create a method to represent the functionality for the Load Work process through the Load Work button click
    public void loadWorkBtnFunction(ActionEvent e){

        // create a Window type variable to help load a window that will play the role of a load file dialogue
        // we will use the .getWindow() command to do so
        // use a new File Chooser to implement an ExtensionFilter in order to get only csv type files

       // implement a try catch approach to catch any exception that can occur while loading a file
            // set an initial directory and then get the file name and display it on the gui

            // check if the file exists then:
                // load the list and then display it through sorting it by date by calling the sortWithDate method and set the tableview using the .setItems()
                // with the observable list passed to it after being converted from an arraylist

    }

    // use the override tag for the used initialize method
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // use the setCellValueFactory command for each of the table's columns for
        // the description, for the due date and for the status

        // Generate a file label through the use of .text("") approach

        // create the options for the dropdown comboBox that has the display options, either All items
        // or by status, to display either the complete or incomplete items

        // assign a folder in the desktop that will be named using ToDo_yohan in order to mark it
        // as proper to the GUI app and proper to the author
        // use the System.getProperty in the process and create a FILE type variable to hold the directory
        // then create it using the .mkdirs() command and create a fileChooser using the directory

        // convert the format of the Due date to yyyy-mm-dd as requested by the assignment
        // using a setConverter and a DateTimeFormatter along with two methods to change the date from a String and
        // to a String, the methods will use the .format() and the .parse() approaches

        // Generate an Observable List from an arraylist using the FXCollections.observableArrayList(pass all items of the array list);
        // Important: call the sort by date method created!!
        // set the items on the table where they will be displayed sorted by date using the tablevariabletobecreated.setItems(observableListVarName);

        // Create the option to have a selection mode available
        // which allows the user to choose what item they want to delete edit or manipulate
        // based on the options available using .getSelectionModel() and the related methods

    }

    // create a method to display one selected row by the user
    public void selectionOfRowByUser(){

        // get the item by using : .getSelectionModel().getSelectedItem();
        // call the display method and pass the item selected

    }

    // create a method to just clear the text fields to give the user the chance to re-enter new input or remove a mistake or so
    public void fieldClearing(){

        // to clear the description field: .setText("");
        // to clear the due date use: .setValue(null);

    }

    // create a method that deletes everything when the clear all button gets clicked by the user
    public void clearAllTriggered(ActionEvent e){

        // print to the console a message announcing the clear all process
        // call the .clearAll() method from the ToDoListCode class
        // refresh the table and clear it from all elements through the use of .getItems().clear()

    }

    // create a method that is responsible for displaying the items by description first then due date
    public void displayCurrentItem(Item currItem){

        // this method sets the description and due date fields to their appropriate elements and values
        // using .setText(currItem.getDescription())
        // using .setValue(currItem.getDueDate())

    }

    // create a method to handle the edit item button when the user wants to edit n item instead of deleting it and creating a new one
    public void editItemBtn(ActionEvent e){

        // create an Item type variable that will store the selected item from the table
        // using the getSelectionModel().getSelectedItem() command

        // call the update item method from the ToDoListCode class that will take as parameters variables that stored the new changes
        // made by the user and then sort the list by date again after the change and that through the call of sortByDate() method
        // then refresh the table display and clear the description text area and date Picker

    }

    // create a method to show the help menu set in the case the user wants more description of what the app can do
    // and what options are available to their use
    // the method handles input and output exceptions
    public void helpMenuNeed(ActionEvent e) throws IOException {

        // load the help menu window of the app GUI
        // using a Parent type variable and FXMLLoader.load(getClass().getResource("HelpMenu.fxml"));

        // implement the option to have a window with a scrolling tool as the help menu is large and will require that
        // using a ScrollPane through the use of the .setContent() command and passing to it the Parent variable created
        // as described by the documentation

        // create a Stage variable and mark the size of the Help Menu window then use the stage.show() to display

    }

    // create a method that deletes a precise selected item by the user
    public void deleteSelectedItem(ActionEvent e) {

        // create an Item type variable that will store the selected item from the table
        // using the getSelectionModel().getSelectedItem() command

        // send a message to the output screen displaying what will be deleted
        // display the item to user before the deletion by calling the displayCurrentItem method

        // remove the item from the list using the deleteItem() method
        // then remove item from the table using .getItems().remove(item that will be selected by the user)

        // call the sortByDate() method to resort everything in the list by date then start over by refreshing the table
        // to make the update noticeable to the user and remove anything from the date picker and text field to be ready
        // for new input through the use of clearAll() method

    }

    // create a method responsible for the add of newly made items by the user whenever the Add Item button is clicked
    public void addItemBtn(ActionEvent e) {

        // use the print to console approach to print the description and dude date that will be added

        // implement conditionals to check if either the due date was not picked or the description was left blank
        // then send an error message to the user to notify them about the missing component adequately
        // using an Alert type variable with a setHeaderText(error message here and note)
        // Alert var name = new Alert(Alert.AlertType.ERROR);

        // implement a conditional to check if an item already exists
        // then use the same approach using an Alert type variable
        // and print a header text error message adequately for this case and use a hold screen command .showAndWait()

        // implement a last else statement that is executed whenever the description and due date are not left empty and
        // when then item was not already stored previously
            // then create a new object of type Item and set the description and due date to what the user inputs
            // then add the newly created Item to the arraylist of items
            // add the item to the table elements using the .getItems().add(current Item added) command BUT
            // call the sort by date method before to have the elements displayed on the table sorted by date again
            // clear the fields again to get new input if the user wants and refresh the table using the .refresh() command
        // end of the else statement

    }

    // end of the HelloController class
}