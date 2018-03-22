package org.com.shub.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class FetchData {

	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	public List<Student> getAll(){
		//System.out.println("printed");
		List<Student> list = jdbc.query("Select * from student",new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
				Student st = new Student();
				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setEmail(rs.getString("email"));
				st.setAdrs(rs.getString("adrs"));
				return st;
			}
		});
		//System.out.println("fetched run succeessfully");
		return list;
	}
}
