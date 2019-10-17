package sample;
/**
 * Sample Skeleton for 'sample.fxml' Controller Class
 */


import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import sample5.TableViewSample.Person;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Controller {

	   @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TableColumn<Staff, String> colDEPT;

	    @FXML
	    private TableColumn<Staff, String> colNAME;

	    @FXML
	    private TableColumn<Staff, String> colJOB;

	    @FXML
	    private TableColumn<Staff, String> colCOMM;
	    
	    @FXML
	    private TextField TextJOB;

	    @FXML
	    private TextField TextSALARY;

	    @FXML
	    private TextField TextYEARS;

	    @FXML
	    private TextField TextCOMM;
	    
	    @FXML
	    private TextField TextDEPT;

	    @FXML
	    private TextField TextID;
	    
	    @FXML
	    private TextField TextNAME;
	    
	    @FXML
	    private TableView<Staff> tableview_staff;

	    @FXML
	    private Button button_back;

	    @FXML
	    private TableColumn<Staff, String> colYEARS;

	    @FXML
	    private Button button_select;

	    @FXML
	    private Button button_add;

	    @FXML
	    private Label lable1;

	    @FXML
	    private TableColumn <Staff, String>colID;

	    @FXML
	    private Button button_del;

	    @FXML
	    private TableColumn<Staff, String> colSALARY;

	    @FXML
	    private Button button_use;
	    
	    @FXML
	    private Button button_upd;
    
    //private final TableView<Staff> staff = new TableView<>();
        public static ObservableList<Staff> staffObservableList = null;
        public static int num = 0;
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() throws SQLException {
    	assert colDEPT != null : "fx:id=\"colDEPT\" was not injected: check your FXML file 'sample.fxml'.";
        assert colNAME != null : "fx:id=\"colNAME\" was not injected: check your FXML file 'sample.fxml'.";
        assert colJOB != null : "fx:id=\"colJOB\" was not injected: check your FXML file 'sample.fxml'.";
        assert colCOMM != null : "fx:id=\"colCOMM\" was not injected: check your FXML file 'sample.fxml'.";    	
        assert colYEARS != null : "fx:id=\"colYEARS\" was not injected: check your FXML file 'sample.fxml'.";
        assert colID != null : "fx:id=\"colID\" was not injected: check your FXML file 'sample.fxml'.";
        assert colSALARY != null : "fx:id=\"colSALARY\" was not injected: check your FXML file 'sample.fxml'.";
    	assert button_select != null : "fx:id=\"button_select\" was not injected: check your FXML file 'sample.fxml'.";
        assert button_add != null : "fx:id=\"button_add\" was not injected: check your FXML file 'sample.fxml'.";
        assert lable1 != null : "fx:id=\"lable1\" was not injected: check your FXML file 'sample.fxml'.";
        assert button_del != null : "fx:id=\"button_del\" was not injected: check your FXML file 'sample.fxml'.";
        assert tableview_staff != null : "fx:id=\"tableview_staff\" was not injected: check your FXML file 'sample.fxml'.";
        assert button_back != null : "fx:id=\"button_back\" was not injected: check your FXML file 'sample.fxml'.";
        assert button_use != null : "fx:id=\"button_use\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextJOB != null : "fx:id=\"TextJOB\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextSALARY != null : "fx:id=\"TextSALARY\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextYEARS != null : "fx:id=\"TextYEARS\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextCOMM != null : "fx:id=\"TextCOMM\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextDEPT != null : "fx:id=\"TextDEPT\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextID != null : "fx:id=\"TextID\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextNAME != null : "fx:id=\"TextNAME\" was not injected: check your FXML file 'sample.fxml'.";
        assert button_upd != null : "fx:id=\"button_upd\" was not injected: check your FXML file 'sample.fxml'.";
        staffObservableList = FXCollections.observableArrayList();
        tableview_staff.setEditable(true);
        colID.setCellFactory(TextFieldTableCell.forTableColumn());
        colNAME.setCellFactory(TextFieldTableCell.forTableColumn());
        colDEPT.setCellFactory(TextFieldTableCell.forTableColumn());
        colSALARY.setCellFactory(TextFieldTableCell.forTableColumn());
        colCOMM.setCellFactory(TextFieldTableCell.forTableColumn());
        colYEARS.setCellFactory(TextFieldTableCell.forTableColumn());
        colJOB.setCellFactory(TextFieldTableCell.forTableColumn());
        colID.setCellValueFactory(new PropertyValueFactory<Staff, String>("ID"));
        colNAME.setCellValueFactory(new PropertyValueFactory<Staff, String>("NAME"));
        colDEPT.setCellValueFactory(new PropertyValueFactory<Staff, String>("DEPT"));
        colJOB.setCellValueFactory(new PropertyValueFactory<Staff, String>("JOB"));
        colYEARS.setCellValueFactory(new PropertyValueFactory<Staff, String>("YEARS"));
        colSALARY.setCellValueFactory(new PropertyValueFactory<Staff, String>("SALARY"));
        colCOMM.setCellValueFactory(new PropertyValueFactory<Staff, String>("COMM"));
        tableview_staff.setEditable(true);
		staffObservableList.clear();
        database.import_observableList(staffObservableList); 
		tableview_staff.setItems(staffObservableList);
		num = staffObservableList.size();
		
		//查询按钮
		
        button_select.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			try {
				database.import_observableList(staffObservableList); 
				tableview_staff.setItems(staffObservableList);
				num = staffObservableList.size();
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
			}
		});
        
        //添加按钮
        
        button_add.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
				if(TextID.getText() == null || TextID.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "警告:违反非空约束ID的输入为空 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextID.setText("");
					return;
				}
				if(!Main.canParseInt(TextID.getText())) {
					JOptionPane.showMessageDialog(null, "警告:ID的输入不是一个整数 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextID.setText("");
					return;
				}
				if(!database.same_mainkey(staffObservableList, Integer.parseInt(TextID.getText()))) {
					TextID.setText("");
					JOptionPane.showMessageDialog(null, "警告:主键重复违反唯一性约束 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					return;
				}
				if(TextNAME.getText().length() > 9) {
					JOptionPane.showMessageDialog(null, "警告:NAME的输入过长 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextNAME.setText("");
					return;
				}
				if(Main.canParseInt(TextNAME.getText())) {
					JOptionPane.showMessageDialog(null, "警告:NAME的输入不是一个字符串 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextNAME.setText("");
					return;
				}
				if(!Main.canParseInt(TextDEPT.getText())) {
					JOptionPane.showMessageDialog(null, "警告:DEPT的输入不是一个整数 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextDEPT.setText("");
					return;
				}
				if(TextJOB.getText().length() > 5) {
					JOptionPane.showMessageDialog(null, "警告:JOB的输入过长 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextJOB.setText("");
					return;
				}
				if(Main.canParseInt(TextJOB.getText())) {
					JOptionPane.showMessageDialog(null, "警告:JOB的输入不是一个字符串 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextJOB.setText("");
					return;
				}
				if(!Main.canParseInt(TextYEARS.getText())) {
					JOptionPane.showMessageDialog(null, "警告:YEARS的输入不是一个整数 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextYEARS.setText("");
					return;
				}
				if(!(TextSALARY.getText() instanceof String)) {
					JOptionPane.showMessageDialog(null, "警告:SALARY的输入不是一个数字 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextSALARY.setText("");
					return;
				}
				if(Double.valueOf(TextSALARY.getText())>99999.99 ) {
					JOptionPane.showMessageDialog(null, "警告:SALARY的输入溢出 请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextSALARY.setText("");
					return;
				}
				if(!(TextCOMM.getText() instanceof String)) {
					JOptionPane.showMessageDialog(null, "警告:COMM的输入不是一个数字请重新输入","提示",JOptionPane.WARNING_MESSAGE); 
					TextCOMM.setText("");
					return;
				}
				staffObservableList.add(new Staff(
						//把数据填入表中
						TextID.getText(),
						TextNAME.getText(), 
						TextDEPT.getText(),
						TextJOB.getText(), 
						TextYEARS.getText(), 
						TextSALARY.getText(), 
						TextCOMM.getText()
				));
				//清空文本
				TextID.setText("");
				TextNAME.setText("");
				TextDEPT.setText("");
				TextJOB.setText("");
				TextYEARS.setText("");
				TextSALARY.setText("");
				TextCOMM.setText("");
			}

        });
        
        //落实按钮
        
        button_use.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		try {
					database.save_data(staffObservableList, num);
					database.import_observableList(staffObservableList); 
					tableview_staff.setItems(staffObservableList);
					num = staffObservableList.size();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        });
        button_upd.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
//        		int i;
//     		    i = JOptionPane.showConfirmDialog(null, "Your number: ");
                Stage secondStage = new Stage();
                Label label = new Label("新窗口"); // 放一个标签
                //StackPane secondPane = new StackPane(label);
                Scene secondScene = new Scene(new Group());
                final VBox hb = new VBox();
                final TextField addID = new TextField();
                addID.setPromptText("ID");
                addID.setPrefWidth(200);
                final TextField addNAME = new TextField();
                addNAME.setPrefWidth(200);
                addNAME.setPromptText("Name");
                final TextField addDEPT = new TextField();
                addDEPT.setPrefWidth(200);
                addDEPT.setPromptText("DEPT");
                final TextField addJOB = new TextField();
                addJOB.setPromptText("JOB");
                addJOB.setPrefWidth(200);
                final TextField addYEARS = new TextField();
                addYEARS.setPrefWidth(200);
                addYEARS.setPromptText("YEARS");
                final TextField addSALART = new TextField();
                addSALART.setPrefWidth(200);
                addSALART.setPromptText("SALARY");
                final TextField addCOMM= new TextField();
                addCOMM.setPrefWidth(200);
                addCOMM.setPromptText("COMM");
                final Button addButton = new Button("Add");
                hb.getChildren().addAll(addID,addNAME,addDEPT,addJOB,addYEARS,addSALART,addCOMM,addButton);
                hb.setSpacing(10);
                hb.setPadding(new Insets(10, 10, 10, 10));
                addButton.setOnAction((ActionEvent e) -> {
                	Staff staff = new Staff(addID.getText(),addNAME.getText(),addDEPT.getText(),addJOB.getText(),addYEARS.getText(),addSALART.getText(),addCOMM.getText());
                	try {
						database.update(staff);
						secondStage.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
                });
                ((Group) secondScene.getRoot()).getChildren().addAll(hb);
                secondStage.setScene(secondScene);
                secondStage.setTitle("更新属性");
                secondStage.show();
        	}
		});
    }
}












