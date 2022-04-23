/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Austin Brown
 */
public class WriteToDB {
   private String playerName;
   private int score;
   
   public WriteToDB(String playerName, int score) {
       this.playerName = playerName;
       this.score = score;
   }
   
   public void write2Leaderboard(WriteToDB to, Connection c) {
    try {
        Statement s = c.createStatement();
        String ins = "INSERT INTO scoreTable (playerName,score)" + "VALUES ('"+to.playerName+"', "+to.score+");";
        s.executeUpdate(ins);
    } catch(SQLException e){
        e.printStackTrace();
    }
}
   
   public static WriteToDB downLoadReport(WriteToDB to, Connection c) throws IOException {
       to = null;
       ArrayList<WriteToDB> playerReport = new ArrayList<WriteToDB>();
       try {
           Statement g = c.createStatement();
           String dwn = "SELECT * FROM scoreTable ORDER BY score DESC;";
           ResultSet rs = g.executeQuery(dwn);
           while(rs.next()) {
               String playerName = rs.getString("playerName");
               Integer score = rs.getInt("score");
               to = new WriteToDB(playerName, score);
               playerReport.add(to);
           
           }
           
           File newReport = new File("C:\\Users\\Austin Brown\\report.txt");
      if (newReport.createNewFile()) {
        System.out.println("File created: " + newReport.getName());
      } else {
        System.out.println("File already exists.");
      }
BufferedWriter out = null;

try {
    out = new BufferedWriter(new FileWriter("C:\\Users\\Austin Brown\\Downloads\\report.txt"));
    out.write("====Leader Board====\n" + "= Name........... Score =\n");
    for(int i = 0; i < playerReport.size(); i++) {
        out.write(playerReport.get(i) + "\n");
    }
    out.write("");
    out.newLine();
    
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if(out != null){
            out.close();
        } else {
            System.out.println("Buffer has not been initialized!");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
       } catch(SQLException e) {
           e.printStackTrace();
       }
    return to;
  
  
            
   }
   
  @Override
  public String toString() {
     // return "WriteToDB [playerName=" + playerName + ", score=" + score + "]";
      return "= " + playerName + "........... " + score + " =";
  }  
//public void fileCreation(ArrayList<WriteToDB> playerReport) throws IOException{
//    try {
//      File newReport = new File("report.txt");
//      if (newReport.createNewFile()) {
//        System.out.println("File created: " + newReport.getName());
//      } else {
//        System.out.println("File already exists.");
//      }
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//  }
}
    

   
