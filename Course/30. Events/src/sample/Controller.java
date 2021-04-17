package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button byeButton;
    @FXML
    private Button helloButton;
    @FXML
    private Button clearButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
        clearButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloButton)){
            System.out.println("Hello, " + nameField.getText());
        }else if (e.getSource().equals(byeButton)){
            System.out.println("Bye, " + nameField.getText());
        }else if (e.getSource().equals(clearButton)){
            nameField.clear();
            initialize();
        }
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" :
                            "Background Thread";
                    System.out.println("I am going to Sleep on the " + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" :
                                    "Background Thread";
                            System.out.println("I am updating the label on the " + s);
                            ourLabel.setText("We did Something!");
                        }
                    });
                } catch (InterruptedException event) {}
            }
        };
        new Thread(task).start();
        if (ourCheckBox.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
        clearButton.setDisable(disableButtons);
    }

    public void handleChange() {
        System.out.println("The check box is " + (ourCheckBox.isSelected()
        ? "Checked" : "Not Checked"));
    }
}
