package com.laptrinhjavaweb.dao.impl;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO{

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		String sql ="SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}
	
	//code old
	/*public Connection getConnetioṇ() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jspservletjdbc";
			String user = "root";
			String password = "root";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}*/
	
	/*@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		List<NewModel> results = new ArrayList<>();
		String sql ="SELECT * FROM news WHERE categoryid = ?";
		//open connection
		Connection connection = getConnetioṇ();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if (connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				//tham so
				statement.setLong(1, categoryId);
				
				resultSet = statement.executeQuery();
				while (resultSet.next()) {
					NewModel news = new NewModel();
					news.setId(resultSet.getLong("id"));
					news.setTitle(resultSet.getString("title"));
					results.add(news);
				}
				return results;
			} catch (SQLException e) {
				return null;
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultSet != null) {
						resultSet.close();
					}
				} catch (SQLException e) {
					return null;
				}
			}
			
		}
		return null;
	}
*/
}
