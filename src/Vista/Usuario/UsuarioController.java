package Vista.Usuario;

/*    
 *  To change this license header, choose License Headers in Project Properties.
 *   To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class UsuarioController implements Initializable {
    
    private Label label;
    @FXML
    private Label nombre;
    @FXML
    private PasswordField contrasena;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logearse(ActionEvent event) {
    }

    @FXML
    private void registrarse(ActionEvent event) {
    }
    
}
