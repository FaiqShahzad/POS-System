/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos.system;

import java.sql.*;

/**
 *
 * @author Faiq Shahzad
 */
public class POSSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        POS_DataMembers POS_Data = new POS_DataMembers();

        new Log_In(POS_Data).setVisible(true);
    }
}
