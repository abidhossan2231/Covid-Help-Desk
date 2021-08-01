
package covid.help.desk;

import javafx.application.Application;
import javafx.stage.Stage;


public class Covid_Help_DeskFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         new main().setVisible(true) ;
               
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
