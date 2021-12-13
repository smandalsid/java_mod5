import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
// import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label l1 = new Label("JAVA FX LABEL 1");
        Label l2 = new Label("JAVA FX LABEL 2");
        TextField t1 = new TextField();
        TextField t2 = new TextField();

        CheckBox c1 = new CheckBox("C");
        CheckBox c2 = new CheckBox("C++");
        CheckBox c3 = new CheckBox("Python");

        RadioButton r1 = new RadioButton("C");
        RadioButton r2 = new RadioButton("C++");
        RadioButton r3 = new RadioButton("Python");
        RadioButton r4 = new RadioButton("Java");
        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        r4.setToggleGroup(tg);

        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        Button btn1 = new Button();
        btn.setText("Say 'Hello World'");

        // btn.setOnAction(new EventHandler<ActionEvent>() {

        // @Override
        // public void handle(ActionEvent event) {
        // System.out.println("Hello World!");
        // }
        // });

        EventHandler<ActionEvent> evnt = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        };

        btn.addEventFilter(ActionEvent.ACTION,evnt);
        btn1.addEventFilter(ActionEvent.ACTION,evnt);

        // GridPane root = new GridPane();

        // root.addRow(0, l1, t1);
        // root.addRow(1, l2, t2);
        // root.addRow(2, btn);

        HBox root = new HBox();
        // root.getChildren().addAll(l1,t1,l2,t2);
        // root.getChildren().add(btn);
        // root.getChildren().addAll(r1,r2,r3,r4);

        root.getChildren().addAll(btn, btn1);

        // VBox root = new VBox();
        // root.addChildren().

        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }
}