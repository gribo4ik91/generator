package sample;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField emailPattern;

    @FXML
    private TextField emailServir;

    @FXML
    private Button getCopy;

    @FXML
    private Button getEmail;

    @FXML
    private Text your_email;

    @FXML
    void initialize() {

            getEmail.setOnAction(event -> {
                    String getUserPattern = emailPattern.getText().trim();
                    String getUserServir = emailServir.getText().trim();
                    your_email.setText("Your email: " + getUserPattern + LocalDateTime.now().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_TIME)
                            .replaceAll(":", "").replace(".", "")+ "@" + getUserServir);
                    System.out.println("Все работает");
                });


    }

}
