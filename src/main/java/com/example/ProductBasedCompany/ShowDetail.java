package com.example.ProductBasedCompany;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowDetail {
	@GetMapping("/office")
	public Company displayDetails(@RequestParam("dept") String dept) {
		if (dept.equals("Frontend")) {
			Employee e1 = new Employee(1212, "Saurabh Sakharkar", "Frontend Developer", 45000.34f);
			Employee e2 = new Employee(1341, "Amey Dahake", "Frontend Developer", 58000.41f);
			Employee e3 = new Employee(1922, "Sakshi Rajurkar", "Frontend Developer", 35000.91f);

			ArrayList<Employee> fEEmp = new ArrayList<Employee>();
			fEEmp.add(e1);
			fEEmp.add(e2);
			fEEmp.add(e3);

			Employee e4 = new Employee(9312, "Utkarsh Tambe", "UI designer", 45000.34f);
			Employee e5 = new Employee(2341, "Sejal Arora", "UI designer", 58000.41f);
			Employee e6 = new Employee(5322, "Mansi Kapoor", "UI designer", 35000.91f);

			ArrayList<Employee> UIEmp = new ArrayList<Employee>();
			UIEmp.add(e4);
			UIEmp.add(e5);
			UIEmp.add(e6);

			Department frontEnd = new Department("Frontend Developer", "Sanjay Mishra", "Rachna Sharma", fEEmp);
			Department UI = new Department("UI", "Rakesh Lanjhe", "Manjali Raut", UIEmp);

			ArrayList<Department> TCScomp = new ArrayList<Department>();
			TCScomp.add(frontEnd);
			TCScomp.add(UI);

			Company tcs = new Company("TCS", TCScomp, true);
			return tcs;
		} else {

			Employee e1 = new Employee(1212, "Yogesh Patil", "Backend Developer", 45000.34f);
			Employee e2 = new Employee(1341, "Ganesh Khot", "Backend Developer", 58000.41f);
			Employee e3 = new Employee(1922, "Chirag Dhande", "Backend Developer", 35000.91f);

			ArrayList<Employee> BEEmp = new ArrayList<Employee>();
			BEEmp.add(e1);
			BEEmp.add(e2);
			BEEmp.add(e3);

			Employee e4 = new Employee(9312, "Mayur Salve", "SQL developer", 45000.34f);
			Employee e5 = new Employee(2341, "Chetan Khande", "SQL developer", 58000.41f);
			Employee e6 = new Employee(5322, "Aman Mishra", "SQL developer", 35000.91f);

			ArrayList<Employee> DBEmp = new ArrayList<Employee>();
			DBEmp.add(e4);
			DBEmp.add(e5);
			DBEmp.add(e6);

			Department frontEnd = new Department("Frontend Developer", "Sanjay Mishra", "Rachna Sharma", BEEmp);
			Department UI = new Department("UI", "Rakesh Lanjhe", "Manjali Raut", DBEmp);

			ArrayList<Department> Infosyscomp = new ArrayList<Department>();
			Infosyscomp.add(frontEnd);
			Infosyscomp.add(UI);

			Company infosys = new Company("Infosys", Infosyscomp, false);
			return infosys;
		}

	}
}
