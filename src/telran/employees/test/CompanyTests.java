package telran.employees.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import telran.employees.dto.Employee;
import telran.employees.service.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CompanyTests {
	Company comp = new CompanyImpl();
	Employee empl1 = new Employee(123, "Vasya", "tehnic", 10_000, LocalDate.of(2009, 10, 20));
	Employee empl2 = new Employee(123, "Alex", "sales", 12_000, LocalDate.of(2014, 3, 11));
	Employee empl3 = new Employee(123, "Stas", "managers", 14_000, LocalDate.of(2016, 6, 05));
	final static String TEST_FILE_NAME = "test.data";
	
	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@Test
	void testAddEmployee() {
		
		employees = comp.addEmployee(empl1);  
		
	}

	@Test
	void testRemoveEmployee() {
		HashMap<Long, Employee> employees = new HashMap<>();
		employees.put(empl1.id(), empl1);
		employees.put(empl2.id(), empl2);
		employees.put(empl3.id(), empl3);
		employees = comp.removeEmployee(empl1.id())
	}

	@Test
	void testGetEmployee() {
		//TODO
	}

	@Test
	void testGetEmployees() {
		//TODO
	}
	@Test
	@Order(2)
	void testRestore() {
		//TODO
	}
	@Test
	@Order(1)
	void testSave() {
		//TODO
	}

}