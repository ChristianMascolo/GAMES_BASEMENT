package implementation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.RubricaIndirizziBean;
import dao.RubricaIndirizziDAO;

public class RubricaIndirizziImpl implements RubricaIndirizziDAO{
	private Connection c;
	private ArrayList<RubricaIndirizziBean> al;
	
	public RubricaIndirizziImpl() {
		// TODO Auto-generated constructor stub
		al=new ArrayList<RubricaIndirizziBean> ();
		c=Connessione.setConnection();
		this.fillList();
	}
	
	private void fillList() {
		try {
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from Cap");
			
			while(rs.next()) {
				al.add(new RubricaIndirizziBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void stopConnection() {
		try {
			Connessione.releaseConnection(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addRubricaIndirizzi(RubricaIndirizziBean rib) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRubricaIndirizzi(RubricaIndirizziBean rib) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRubricaIndirizzi(RubricaIndirizziBean oldrib, RubricaIndirizziBean newrib) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<RubricaIndirizziBean> getAllRubricaIndirizzi() {
		// TODO Auto-generated method stub
		return al;
	}
}
