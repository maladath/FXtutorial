
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class FirstFX extends Application{
	
	Label lb_text;
	Button btn_click;
	
	
	public static void main(String[] args) {
		
		SecClass sc = new SecClass();
		
		sc.print("Hallo");
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		lb_text = new Label("First label");
		btn_click = new Button("Klick it");
		
		btn_click.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				lb_text.setText("Button geklickt");
				
			}
		});
		
		VBox root = new VBox();
		root.getChildren().addAll(lb_text,btn_click);
		
		Scene scene = new Scene(root, 500, 500);
		stage.setScene(scene);
		
		stage.show();
		
		
	}
}
