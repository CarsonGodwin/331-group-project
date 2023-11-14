// Main.java
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the initial login screen
        Parent root = FXMLLoader.load(getClass().getResource("login_screen.fxml"));
        primaryStage.setTitle("Time Management App");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        system.out.println("Hello World");
        launch(args);
    }
}

