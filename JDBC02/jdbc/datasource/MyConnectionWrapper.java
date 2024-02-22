package jdbc.datasource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MyConnectionWrapper extends ConnectionWrapper {
	
	
	private Connection conn;
	private List<Connection> connList;

	public MyConnectionWrapper(Connection conn,List<Connection> connList) {
		super(conn);
		this.conn = conn;
		this.connList = connList;
	}

	//增强某个方法：
	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub
		//super.close();
		//归还连接：
		connList.add(conn);
		
	}

	
}
