package com.daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.dao.interfac.dao;
import com.model.Topic;
import com.utils.DBConnection;

public class Topicdao implements dao<Topic> {
	DBConnection db = new DBConnection();

	@Override
	public String Presist(Topic o) {
		// TODO Auto-generated method stub
		String msg=null;
		db.connect();
		try {
			db.pstm = db.con
					.prepareStatement("INSERT INTO TOPICS (NAME,CREATEDBY,CREATEDIN,SUBJECT) VALUES (?,?,?,?)");
			db.pstm.setString(1, o.getNAME());
			db.pstm.setString(2, o.getCREATEDBY());
			db.pstm.setString(3, o.getCREATEDIN());
			db.pstm.setString(4, o.getSUBJECT());
			db.pstm.executeUpdate();
			msg="Topic Saved";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg="["+e.getErrorCode()+"]"+e.getMessage();
		}
		
		
		db.closeConnection();
		
		return msg;
	}

	@Override
	public List<Topic> FindAll() {
		// TODO Auto-generated method stub
		List<Topic> data = new ArrayList<>();
		db.connect();
		try {
			db.pstm = db.con.prepareStatement("SELECT * FROM TOPICS");
			db.rs = db.pstm.executeQuery();
			while (db.rs.next()) {
				Topic t = new Topic();
				t.setIdTOPICS(db.rs.getInt(1));
				t.setNAME(db.rs.getString(2));
				t.setCREATEDBY(db.rs.getString(3));
				t.setCREATEDIN(db.rs.getString(4));
				data.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.closeConnection();
		return data;
	}

	@Override
	public List<Topic> FindByParentId(int parentID) {
		// TODO Auto-generated method stub
		return null;
	}
}