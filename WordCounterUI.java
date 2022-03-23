import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.*;

public class WordCounter extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Word Counter");
        BorderPane layout=new BorderPane();
        textArea= new TextArea();
        textArea.setPadding(new Insets(12));
        layout.setCenter(textArea);

        Label label=new Label("Result");
           VBox vBox=new VBox();
           vBox.setPadding(new Insets(12,30,10,30));
              TextArea resultText=new TextArea();
                resultText.setPrefWidth(250);
                   resultText.setPrefHeight(550);
                    resultText.setEditable(false);

        vBox.getChildren().addAll(label,resultText);
                  layout.setRight(vBox);
                      Button countButton=new Button("Count");
                           countButton.setOnAction(event -> {
                              TextAnalyzer textAnalyzer=new TextAnalyzer(textArea.getText());
                                resultText.setText(textAnalyzer.result());
        });
                           HBox hBox=new HBox();
        hBox.setPadding(new Insets(20));
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(countButton);
        layout.setBottom(hBox);
        Scene scene=new Scene(layout,700,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

