/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.idgenerater;

import lk.ijse.asirisupermarket.idcontroller.IDController;
import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author Hafees
 */
public class IdGenerater {
    public static String getNewId(String tableName, String columnName, String prefix, int digitCount) throws ClassNotFoundException, SQLException {
        String lastId = IDController.getLastId(tableName, columnName);
        if (null != lastId) {
            String[] idArray = lastId.split(prefix);

            int id = Integer.parseInt(idArray[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMinimumIntegerDigits(digitCount);
            numberFormat.setGroupingUsed(false);
            String newId = numberFormat.format(id);
            newId = prefix + "0" + newId ;
            System.out.println(newId);
             System.out.println(digitCount);
            return newId;
        } else {
            String newId = prefix;
            for (int i = 0; i < digitCount - 1; i++) {
                newId += "00";
                System.out.println(newId);
            }
            newId += "1";
            System.out.println("second"+newId);
            return newId;
        }
    }
}
