package com.ssafy.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ssafy.mini.util.DBUtil;
import com.ssafy.mini.vo.User;


public class UserDao {
	
	private final DBUtil util = DBUtil.getInstance();
	
	private static UserDao instance = new UserDao();
	
	private UserDao() {
		
	}
	
	public static UserDao getInstance() {
		return instance;
	}
	
	public void registUser(User u) {
		
		String sql = "INSERT INTO USER(USERID, USERPASSWORD) VALUES(?, ?);";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int count = 0;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getPassword());
			
			count = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close(pstmt, conn);
		}
		
		
	}
	
	public User loginUser(String id, String password) {
		
		String sql = "SELECT * FROM USER WHERE USERID = ? AND USERPASSWORD = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		User u = new User();
		
		int count = 0;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				u.setId(rset.getString("USERID"));
				u.setPassword(rset.getString("USERPASSWORD"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close(pstmt, conn);
		}
		
		return u;
		
	}

}
