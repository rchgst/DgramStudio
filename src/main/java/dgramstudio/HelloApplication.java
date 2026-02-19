package dgramstudio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),700,400);
        scene.getStylesheets().addAll(
                getClass().getResource("/dgramstudio/css/blocks.css").toExternalForm(),
                getClass().getResource("/dgramstudio/css/theme.css").toExternalForm(),
                getClass().getResource("/dgramstudio/css/layout.css").toExternalForm(),
                getClass().getResource("/dgramstudio/css/controls.css").toExternalForm()
        );
        //stage.setMaximized(true);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}

