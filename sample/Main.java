package sample;

import java.awt.Button;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.application.Application;
//import javafx.css.Style;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        Controller controller = fxmlLoader.getController();
        primaryStage.setResizable(true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("�򿪱� ����STAFF");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
    
    public static boolean canParseInt(String str){
    	if(str == null){ //��֤�Ƿ�Ϊ��
    	return false;
    	 
    	}
    	 
    	return str.matches("\\d+"); //ʹ��������ʽ�жϸ��ַ����Ƿ�Ϊ���֣���һ��\��ת�����\d+��ʾƥ��1���� //����������֣�"+"��"*"���ƣ�"*"��ʾ0������
    	 
    	}
}
