import java.util.OptionalInt;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 * Write a description of JavaFX class HelloJavaFX here.
 *
 * @author (Luis Gutierrez)
 * @author (Roland Hovarth)
 * @version (12/01/18)
 */
public class P5Pane extends GridPane
{
    final int FONT = 18;
    private Label quarters, dimes, nickels, pennies;
    private TextField change;

    public P5Pane()
    {
        Font font = new Font(FONT);
        quarters = new Label();
        quarters.setFont(font);
        dimes = new Label();
        dimes.setFont(font);
        nickels = new Label();
        nickels.setFont(font);
        pennies = new Label();
        pennies.setFont(font);                
        resetLabels();
        change = new TextField();
        

        setHgap(10);
        setVgap(10);
        Label directions = new Label("Enter quantity or change:");
        directions.setFont(font);
        // top row
        add(directions, 0, 0, 2, 1);
        add(change, 2, 0);
        // second row
        add(quarters, 0, 1, 2, 1);
        // add(quarters, 2, 1);
        // third row
        add(dimes, 0, 2, 2, 1);
        // add(dimes, 2, 2);
        // 4th row
        add(nickels, 0, 3, 2, 1);
        // add(nickels, 2, 3);
        // 5th row
        add(pennies, 0, 4, 2, 1);
        // add(pennies, 2, 4);
    }

    /**
     * Appends a String value to the respective label's text. Use to display coin
     * quantity to user
     * 
     * @param t
     *              String representation of coin quantity to display on screen
     */
    public void displayQuarters(String t)
    {
        String val = String.format("Quarters: %s", t);
        quarters.setText(val);
    }

    /**
     * Appends a String value to the respective label's text. Use to display coin
     * quantity to user
     * 
     * @param t
     *              String representation of coin quantity to display on screen
     */
    public void displayDimes(String t)
    {
        String val = String.format("Dimes: %s", t);
        dimes.setText(val);
    }

    /**
     * Appends a String value to the respective label's text. Use to display coin
     * quantity to user
     * 
     * @param t
     *              String representation of coin quantity to display on screen
     */
    public void displayNickles(String t)
    {
        String val = String.format("Nickles: %s", t);
        nickels.setText(val);
    }

    /**
     * Appends a String value to the respective label's text. Use to display coin
     * quantity to user
     * 
     * @param t
     *              String representation of coin quantity to display on screen
     */
    public void displayPennies(String t)
    {
        String val = String.format("Pennies: %s", t);
        pennies.setText(val);
    }

    /**
     * Returns an OptionalInt. If the user enters a value that can not be parsed to
     * an integer then the OptionalInt will be empty
     * 
     * @return OptionalInt
     */
    public OptionalInt getChange()
    {
        try
        {
            int val = Integer.parseInt(change.getText());
            return OptionalInt.of(val);
        }
        catch (NumberFormatException e)
        {
            return OptionalInt.empty();
        }
    }

    /**
     * Executes the event handler when the user enters a value
     * 
     * @param fn
     *               Method to be executed in response to the event
     */
    public void onSubmit(EventHandler<ActionEvent> fn)
    {
        change.setOnAction(fn);
    }

    /**
     * Resets change labels so that they all display 0
     */
    public void resetLabels()
    {
        displayQuarters("0");
        displayDimes("0");
        displayNickles("0");
        displayPennies("0");
    }
}
