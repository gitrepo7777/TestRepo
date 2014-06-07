package com.vp.jdbc;

import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import com.sun.rowset.CachedRowSetImpl;

public class ConnectionManager {

	private static Connection conn;

	/**
	 * @param args
	 */
	public static void main1(String[] args) {

		CachedRowSet cacheRowSet = null;
		try {
			// conn = getConnection();
			cacheRowSet = new CachedRowSetImpl();
			cacheRowSet.setUsername("vani");
			cacheRowSet.setPassword("Test1234");

			cacheRowSet.setUrl("jdbc:oracle:thin:@//localhost:1521/orcl");

			if (cacheRowSet != null) {
				System.out.println("Got the Connection !");
				//cacheRowSet = new CachedRowSetImpl();
				cacheRowSet.setCommand("Select * from COFFEES");
				cacheRowSet.execute();

				// cacheRowSet.acceptChanges(conn);
				/*
				 * cacheRowSet.addRowSetListener(new RowSetListener(){
				 * 
				 * @Override public void rowSetChanged(RowSetEvent event) { //
				 * TODO Auto-generated method stub
				 * 
				 * }
				 * 
				 * @Override public void rowChanged(RowSetEvent event) { // TODO
				 * Auto-generated method stub
				 * 
				 * }
				 * 
				 * @Override public void cursorMoved(RowSetEvent event) { //
				 * TODO Auto-generated method stub
				 * 
				 * }});
				 */

				

				while (cacheRowSet.next()) {
					String str = cacheRowSet.getString("COF_NAME");
					System.out.println("str = " + str);

					int supId = cacheRowSet.getInt("SUP_ID");
					System.out.println("SUP_ID " + supId);

					double price = cacheRowSet.getDouble("PRICE");
					System.out.println("price" + price);

					int sales = cacheRowSet.getInt("SALES");
					System.out.println("sales " + sales);

					int total = cacheRowSet.getInt("TOTAL");
					System.out.println("total = " + total);
				}
				
				if(cacheRowSet.isClosed())
					System.out.println("++++++++++++++++++Connection is Closed!!!!");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {/*
			try {
				conn.close();
				conn = null;
				System.out.println("Connection Closed!");

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (conn != null) {

				System.out.println("Connection is still not null");

				try {
					if (!conn.isClosed()) {

						System.out
								.println("Closig the connection in Finally..");
						conn.close();
					} else {
						System.out.println("Connection is already Closed.");
					}

				} catch (SQLException e) {
					System.out.println("Error Closing Connection "
							+ e.getLocalizedMessage());
					e.printStackTrace();
				}
			}
		*/}

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
//		String filename = "rss-coffee-industry-news.xml";
		String filename = "rss-the-coffee-break-blog.xml";
		String inserSql = "INSERT INTO RSS_FEEDS VALUES ( ?, ?) ";
		
		
			getConnection();
	
/*		PreparedStatement ps =  conn.prepareStatement(inserSql);
		ps.setString(1, filename);
//		ps.setString(2, getXmlFileAsString(filename));
		StringReader sr = new StringReader( getXmlFileAsString(filename));
		ps.setClob(2, sr);
		
		ps.execute();
		ps.close();*/
		
		
		Statement stmt =  conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );
		ResultSet rs = stmt.executeQuery("select RSS_NAME, RSS_FEED_XML from RSS_FEEDS");
		rs.absolute(1);
		
		String str = rs.getString(1);
		Clob clob = rs.getClob(2);

		
		System.out.println("str = " + str + "\n" + "clob = " +  clob.getSubString(1, new Long(clob.length()).intValue() ) );
		rs.close();
		stmt.close();
		
		
		
		conn.close();
		
		
	}

	public static String getXmlFileAsString(String fileName ) throws Exception{
		
	    javax.xml.parsers.DocumentBuilderFactory factory =  javax.xml.parsers.DocumentBuilderFactory.newInstance();
	    factory.setNamespaceAware(true);
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    Document doc = builder.parse(fileName);
	    
		Transformer t = TransformerFactory.newInstance().newTransformer();
		// t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		StringWriter sw = new StringWriter();
		t.transform(new DOMSource(doc), new StreamResult(sw));
		return sw.toString();
		
	}
	

	public static void getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@//localhost:1521/orcl", "vani", "Test1234");

//		return conn;

	}

}
