package in.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import in.spring.beans.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.spring.resources.SpringConfigFile;
import in.spring.mappers.StudentRowMapper;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		// ---------------------Insert Operation----------------
//		int std_roll = 3721;
//		String std_name = "Abdul Gandhi";
//		float std_marks = 100.7f;
//
//		String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//		int count = jdbcTemplate.update(insert_sql_query, std_roll, std_name, std_marks);
//
//		if (count > 0) {
//			System.out.println("insertion success");
//
//		} else {
//			System.out.println("insertion faliled");
//		}

		// ------------------UPDATE OPERATION---------------------

//		float marks = 88.989f;
//		int roll=931974451;
//		
//		String update_sql_query = "UPDATE student SET std_marks =? WHERE std_roll=?";
//		
//		int count = jdbcTemplate.update(update_sql_query,marks,roll);
//		
//		if(count>0) {
//			System.out.println("updation success");
//		}
//		else {
//			System.out.println("updation failed");
//		}

		// -------------DELETE OPERATION ------------------

//		int rollNo=1544;
//		
//		String delete_sql_query = "DELETE FROM student WHERE std_roll=? ";
//		int count=jdbcTemplate.update(delete_sql_query, rollNo);
//		if(count>0) {
//			System.out.println("deletion success");
//		}
//		else {
//			System.out.println("deletion failed");
//		}

		// ---------------------------SELECT OPERATION---------------
		String select_sql_query = "SELECT * FROM student";
		List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());

		for (Student std : std_list) {
			
			System.out.println("RollNo: " + std.getName());
			System.out.println("Name: " + std.getName());
			System.out.println("Marks: " + std.getMarks());
			System.out.println("------------------");
		}

	}
}
