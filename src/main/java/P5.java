import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class P5 extends Application
{
    final int WIDTH = 500;
    final int HEIGHT = 300;

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        P5Pane pane = new P5Pane();
        pane.onSubmit(e -> pane.getChange().ifPresent(change -> breakdownChange(change, pane)));
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Change with minimal number of coins");
        primaryStage.setMinHeight(HEIGHT);
        primaryStage.setMinWidth(WIDTH);
        primaryStage.show();
    }

    /**
     * Takes in an amount of change as an integer and passes it along to a P5Pane
     * 
     * @param change
     *                   Amount of change as an integer
     * @param pane
     *                   P5Pane to output change quantities to
     */
    private void breakdownChange(int change, P5Pane pane)
    {
        pane.resetLabels();
        String res;
        if (change >= 25)
        {
            res = Integer.toString((int) change / 25);
            pane.displayQuarters(res);
            change = change % 25;
        }
        if (change >= 10)
        {
            res = Integer.toString((int) change / 10);
            pane.displayDimes(res);
            change = change % 10;
        }
        if (change >= 5)
        {
            res = Integer.toString((int) change / 5);
            pane.displayNickles(res);
            change = change % 5;
        }
        res = Integer.toString((int) change);
        pane.displayPennies(res);

    }
}
