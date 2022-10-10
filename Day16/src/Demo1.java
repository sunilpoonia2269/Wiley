import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String query = "SELECT * FROM customer_data";
		
		DatabaseConnection dc = new DatabaseConnection();
		
		Connection con = dc.createConnection();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
