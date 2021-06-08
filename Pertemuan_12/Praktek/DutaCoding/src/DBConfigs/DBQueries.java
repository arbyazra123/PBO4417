/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConfigs;

import Models.UserModel;
import Views.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Interfaces.IUserModel;

/**
 *
 * @author arbyazra
 */
public class DBQueries implements IUserModel {

    Connection connection;

    public DBQueries() {
        connection = DBConnection.connect();
    }

    @Override
    public void insert(UserModel user) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(DBConstraints.insert);
            stmt.setString(1, user.getNik());
            stmt.setString(2, user.getNama());
            stmt.setString(3, user.getJk());
            stmt.setString(4, user.getAlamat());
            stmt.setString(5, user.getAlasan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void update(UserModel user) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(DBConstraints.update);
            stmt.setString(1, user.getNik());
            stmt.setString(2, user.getNama());
            stmt.setString(3, user.getJk());
            stmt.setString(4, user.getAlamat());
            stmt.setString(5, user.getAlasan());
            stmt.setInt(6, user.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DBConstraints.delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<UserModel> getAll() {
        List<UserModel> listUser = null;
        try {
            listUser = new ArrayList<UserModel>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(DBConstraints.select);
            while (rs.next()) {
                UserModel user = new UserModel();
                user.setId(rs.getInt("id"));
                user.setNik(rs.getString("nik"));
                user.setNama(rs.getString("nama"));
                user.setJk(rs.getString("jk"));
                user.setAlamat(rs.getString("alamat"));
                user.setAlasan(rs.getString("alasan"));
                listUser.add(user);
            }
        } catch (SQLException e) {
            Logger.getLogger(DBQueries.class.getName()).log(Level.SEVERE, null, e);
        }
        return listUser;
    }

    @Override
    public List<UserModel> searchByName(String nama) {
        List<UserModel> listUser = null;
        try {
            listUser = new ArrayList<UserModel>();
            PreparedStatement st = connection.prepareStatement(DBConstraints.searchNik);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                UserModel user = new UserModel();
                user.setId(rs.getInt("id"));
                user.setNik(rs.getString("nik"));
                user.setNama(rs.getString("nama"));
                user.setJk(rs.getString("jk"));
                user.setAlamat(rs.getString("alamat"));
                user.setAlasan(rs.getString("alasan"));
                listUser.add(user);
            }
        } catch (SQLException e) {
            Logger.getLogger(DBQueries.class.getName()).log(Level.SEVERE, null, e);
        }
        return listUser;
    }

    @Override
    public void login(String nik, String password) {
        try {
            PreparedStatement st = connection.prepareStatement(DBConstraints.loginAdmin);
            st.setString(1, nik);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                if (rs.getString("roles").equals("admin")) {
                    FormPermission fp = new FormPermission();
                    AdminPanel adm = new AdminPanel();
                    adm.setVisible(true);
                    fp.setVisible(false);
                }
            } else {
               JOptionPane.showMessageDialog(null, "Nik dan Password tidak dikenali");
            }
        } catch (SQLException e) {
            Logger.getLogger(DBQueries.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Data isn't match");

        }
    }

}
