package com.vani;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ContactDAOImpl implements ContactDAO {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public boolean createContact(String firstName, String lastName, String email) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("firstname", firstName);
		map.put("lastname", lastName);
		map.put("email", email);
		int i = namedParameterJdbcTemplate
				.update("insert into contact (firstname,lastname,email) values (:firstname,:lastname,:email)",
						map);
		return i > 0;
	}

	public List findAll() {
		return namedParameterJdbcTemplate.query("select * from contact",
				(Map<String, ?>) null, new RowMapper() {
					public Object mapRow(ResultSet resultSet, int i)
							throws SQLException {
						return i + ". " + resultSet.getString(1) + " "
								+ resultSet.getString(2) + " "
								+ resultSet.getString(3) + " ";
					}
				});
	}
}
