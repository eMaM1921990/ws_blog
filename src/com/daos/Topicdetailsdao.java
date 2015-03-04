package com.daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfac.dao;
import com.model.TopicDetails;
import com.utils.DBConnection;

public class Topicdetailsdao implements dao<TopicDetails>{

	DBConnection db=new DBConnection();
	@Override
	public String Presist(TopicDetails o) {
		String msg=null;
		// TODO Auto-generated method stub
		db.connect();
		try {
			db.pstm=db.con.prepareStatement("INSERT INTO TOPICSDETAILS (COMMENT,TOPICID) VALUES (?,?)");
			db.pstm.setString(1, o.getCOMMENT());
			db.pstm.setInt(2, o.getTOPICID());
			db.pstm.executeUpdate();
			msg="100";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			db.closeConnection();
			msg=Integer.toString(e.getErrorCode());
		}
		
		return msg;
	}

	@Override
	public List<TopicDetails> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TopicDetails> FindByParentId(int parentID) {
		// TODO Auto-generated method stub
		List<TopicDetails> data=new ArrayList<TopicDetails>();
		db.connect();
		try {
			db.pstm=db.con.prepareStatement("SELECT * FROM TOPICSDETAILS WHERE TOPICID=?");
			db.pstm.setInt(1, parentID);
			db.rs=db.pstm.executeQuery();
			while(db.rs.next()){
				TopicDetails t=new TopicDetails();
				t.setCOMMENT(db.rs.getString(2));
				t.setTOPICID(db.rs.getInt(5));
				data.add(t);
				
			}
			
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			db.closeConnection();
		}
		
		return data;
	}

}
