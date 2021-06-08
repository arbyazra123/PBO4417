/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConfigs;

/**
 *
 * @author arbyazra
 */
public class DBConstraints {

    public static String insert = "INSERT INTO users (id,nik,nama,jk,alamat,alasan,roles) VALUES (null,?,?,?,?,?,'user');";
    public static String update = "UPDATE users SET nik=?,nama=?,jk=?,alamat=?,alasan=? WHERE id=?;";
    public static String delete = "DELETE FROM users WHERE id=?;";
    public static String select = "SELECT * FROM users WHERE roles='user';";
    public static String searchNik = "SELECT * FROM users WHERE nik like ?;";
    public static String loginAdmin = "SELECT * FROM users WHERE nik=? and password=?;";
}
