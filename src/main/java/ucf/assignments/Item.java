/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ucf.assignments;

// import packages needed for date usage and controls usage
import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

// create a class that will handle the processing of items within the todolist
public class Item {

    // create a private variable to be used to store the description of the item
    // use this item as a SimpleStringProperty variable

    // create a LocalDate type variable in order to store the date set by the user
    // for the current item being built, this variable will also be private


    // create a private checkBox variable to store the status of the task for either it is complete or no

    // create a proper constructor for the current Item class
    // the constructor takes the description of the item and
    // its assigned due date
    public Item(String description, LocalDate userSetDueTime){

        // the constructor will assign the variables passed to it
        // to the proper class private instances as described before


        // the constructor will also help create a new checkbox whenever it is called
        // for each of the items as the checkbox will be used for the status

    }


    // Build the setters methods

    // create a public void method that will set the description of the current item
    // the method takes a String named desc and sets it to the right instance variable
    public void setDescription(String desc){

        // the method uses this.variable to assign and store the String description obtained from parameter
        // within the process it also converts the passed String to a simpleStringProperty type using:
        // new SimpleStringProperty(desc);

    }

    // create a public void method that will set the due date of the current item chosen by the user
    // the method takes a LocalDate type variable called userSetTime and sets it to the right instance variable
    public void setDate(LocalDate userSetTime){

        // store the passed date argument in the right variable using the 'this.variable' command

    }

    // create a public void method that will set the status of the item to either complete or incomplete
    // the method takes a checkbox type argument and sets it to the right instance variable
    public void setStatus(CheckBox status){

        // store the status passed to the method in the appropriate private class instance variable set to
        // to store the status of the current item using the 'this.variable' command

        // the function will use conditionals to set either to complete or incomplete

    }

    // create the multiple getter methods needed

    // create a public LocalDate method that will help whenever called to get the due date of the current item
    // the method returns the stored information within the LocalDate private instance described before that will be
    // storing the due dates set by the user for the item
    public LocalDate getDate(){

        // returns the due date

        // use return NULL just for now this won't remain as this is just for part1 of the assignment to just not have
        // issues loading the GUI
        return null;
    }

    // create a String type method that will help whenever called to get the description of a certain item
    // the method returns the description stored in the private declared instance proper to the class as
    // mentioned before
    public String getDescription(){

        //  the method returns the description of the item
        //  use: variable.get() to return a String
        //  which will lead to easily help convert SimpleStringProperty to a String

        // use return NULL just for now this won't remain as this is just for part1 of the assignment to just not have
        // issues loading the GUI
        return null;

    }

    // create a CheckBox type function that will be used to return the status of the current item
    // either complete or incomplete based on what was assigned by the user
    public CheckBox getStatus(){

        // return the status stored in the appropriate private instance variable

        // use return NULL just for now this won't remain as this is just for part1 of the assignment to just not have
        // issues loading the GUI
        return null;

    }


}
