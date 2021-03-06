import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FahrenheitConverter extends Application
{
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new FahrenheitPane(), 300, 150);
        
        primaryStage.setTitle("Fahrenheit Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}