package sample;

import javafx.beans.property.SimpleStringProperty;

public class Staff {
	SimpleStringProperty ID ;
	SimpleStringProperty NAME ;
	SimpleStringProperty DEPT ;
	SimpleStringProperty JOB ;
	SimpleStringProperty YEARS ;
	SimpleStringProperty SALARY;
	SimpleStringProperty COMM ; 
	
	void set_ID(String id) {
		ID.setValue(id);;
	}
	
	void set_NAME(String name) {
		NAME.setValue(name);
	}
	
	void set_DEPT(String dept) {
		DEPT.setValue(dept);
	}
	
	void set_JOB(String job) {
		JOB.setValue(job);
	}
	
	void set_YEARS(String years) {
		YEARS.setValue(years);
	}
	
	void set_SALARY(String salary) {
		SALARY.setValue(salary);
	}
	void set_COMM(String comm) {
		COMM.setValue(comm);
	}

	/*
	 *在使用table view时向table view中导入数据
	 *在数据的类中需要写   get加属性名（）函数
	 *不然在表中无法显示数据
	 */
    public String getID() {
        return ID.get();
    }
    public String getNAME() {
        return NAME.get();
    }
    public String getDEPT() {
        return DEPT.get();
    }
    public String getJOB() {
        return JOB.get();
    }
    public String getYEARS() {
        return YEARS.get();
    }
    public String getSALARY() {
        return SALARY.get();
    }
    public String getCOMM() {
        return COMM.get();
    }
    
	Staff(String id, String name, String dept, String job, String years, String salary, String comm){
		this.ID = new SimpleStringProperty(id);
		this.NAME =  new SimpleStringProperty(name);
		this.DEPT = new SimpleStringProperty(dept);
		this.JOB =  new SimpleStringProperty(job);
		this.YEARS =  new SimpleStringProperty(years);
		this.SALARY =  new SimpleStringProperty(salary);
		this.COMM =  new SimpleStringProperty(comm);
	}
	
}
