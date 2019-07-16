package server;
import java.lang.Class;
import java.sql.*;
public class sqlTransfer {
	private String url;
	private Statement st;
	private Connection con;
	private ResultSet rs;
	public sqlTransfer(String inputurl) {
		this.url=inputurl;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	  String username = "root" ;   
	  String password = "root" ;   
	  try{   
		  con =
	    DriverManager.getConnection(url , username , password ) ;   
	  }catch(SQLException se){   
	  System.out.println("数据库连接失败！");   
	    se.printStackTrace() ;   
	  }   
	  try {
		  st=con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	public void update(String sqlString) {
		try {
			st.executeUpdate(sqlString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void query(String sqlString) {
		try {
			st.executeQuery(sqlString);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(){
		 if(rs != null){   // 关闭记录集   
			    try{   
			      rs.close() ;   
			    }catch(SQLException e){   
			      e.printStackTrace() ;   
			    }   
			  }   
			  if(st != null){   // 关闭声明   
			    try{   
			      st.close() ;   
			    }catch(SQLException e){   
			      e.printStackTrace() ;   
			    }   
			  }   
			  if(con != null){  // 关闭连接对象   
			    try{   
			      con.close() ;   
			    }catch(SQLException e){   
			      e.printStackTrace() ;   
			    }   
			  }
	}
}
