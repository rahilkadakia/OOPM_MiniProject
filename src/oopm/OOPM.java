/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rahil
 */
public class OOPM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;//con is object, Connection is class
        Statement statement = null;
        ResultSet result = null;
        ResultSetMetaData meta = null;//Processes query results
        String query = "Select * from rahil.final";
        //String url;
        //String user;
        //String pass;
      
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527//OOPM", "rahil", "rnk1999");
            statement = con.createStatement();
            result = statement.executeQuery(query);
            meta = result.getMetaData();
            int colNum = meta.getColumnCount();
            for(int i = 1; i<= colNum; i++){
                System.out.print(meta.getColumnName(i) + "\t");
            }
            System.out.print("\n");
            while(result.next()){
                for(int i = 1; i<= colNum; i++){
                    System.out.print(result.getObject(i) + "\t");
                }
                System.out.print("\n");
                
                /*
                WIHTOUT META DATA
                int id = result.getInt("ID");//Can replace "ID" with its column number in table
                String name = result.getString("Name");//Can replace "Name" with its column number in table
                double ltransac = result.getDouble("LastTransaction");//Can replace "LastTransaction" with its column number in table
                System.out.println("ID" + "\t   " + "Name" + "\t     " + "Last Transaction" + "\t   ");
                System.out.println(id + "\t   "+ name + "\t   "+ ltransac + "\t   ");
                */
            }
           }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
