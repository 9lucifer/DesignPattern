package com.lucifer.A00_principle.demeter;

import java.util.ArrayList;
import java.util.List;
//todo：又叫最小知道原则，核心是降低耦合

//等效客户端
public class Demeter1 {

	public static void main(String[] args) {
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());

	}

}
//雇员
class Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
//学校总部员工
class CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//管理类
class CollegeManager {
	//返回学院的所有员工
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();//增加了10个员工到list集合
			emp.setId("员工id= " + i);
			list.add(emp);
		}
		return list;
	}
}

//学校管理类
//直接朋友：Employee；CollegeManager
//todo:间接朋友：CollegeEmployee，违反了迪米特法则（陌生类作为了局部变量）
class SchoolManager {
	//返回总部员工
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("总部员工id= " + i);
			list.add(emp);
		}
		return list;
	}

	//输出学校总部和学校员工的id
	void printAllEmployee(CollegeManager sub) {
		
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("------------学校员工------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总部员工------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
