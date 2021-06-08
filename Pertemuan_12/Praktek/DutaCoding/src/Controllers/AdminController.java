/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DBConfigs.DBQueries;
import Models.TableModelUser;
import Models.UserModel;
import Views.AdminPanel;
import java.util.List;
import javax.swing.JOptionPane;
import Interfaces.IUserModel;

/**
 *
 * @author arbyazra
 */
public final class AdminController {

    //
    AdminPanel form;
    IUserModel iuser;
    List<UserModel> listUser;

    //constructor
    public AdminController(AdminPanel form) {
        this.form = form;
        iuser = new DBQueries();
        listUser = iuser.getAll();
    }

    public void resetForm() {
        form.getTxtNik().setText("");
        form.getTxtNama().setText("");
        form.getTxtAlasan().setText("");
        form.getTxtAlamat().setText("");
        form.getTxtID().setText("");
    }

    public void showData() {
        listUser = iuser.getAll();
        TableModelUser tmUser = new TableModelUser(listUser);
        form.getTblUser().setModel(tmUser);
    }

    public void editData(int row) {
        form.getTxtID().setText(listUser.get(row).getId().toString());
        form.getTxtNik().setText(listUser.get(row).getNik());
        form.getTxtNama().setText(listUser.get(row).getNama());
        form.getCmbJK().setSelectedItem(listUser.get(row).getJk());
        form.getTxtAlamat().setText(listUser.get(row).getAlamat());
        form.getTxtAlasan().setText(listUser.get(row).getAlasan());

    }

    public void update() {
        if (!form.getTxtID().getText().trim().isEmpty()) {
            UserModel user = new UserModel();
            user.setNik(form.getTxtNik().getText());
            user.setNama(form.getTxtNama().getText());
            user.setJk(form.getCmbJK().getSelectedItem().toString());
            user.setAlamat(form.getTxtAlamat().getText());
            user.setAlasan(form.getTxtAlasan().getText());

            user.setId(Integer.parseInt(form.getTxtID().getText()));
            iuser.update(user);
            JOptionPane.showMessageDialog(null, "Update Success");
            resetForm();
        } else {
            JOptionPane.showMessageDialog(form, "Please select data first");
        }
    }

    public void delete() {
        if (!form.getTxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(form.getTxtID().getText());
            iuser.delete(id);
            JOptionPane.showMessageDialog(null, "Delete Data  Success");
            resetForm();
        }
    }

    public void showSearchData() {
        listUser = iuser.searchByName(form.getTxtCari().getText());
        TableModelUser tmUser = new TableModelUser(listUser);
        form.getTblUser().setModel(tmUser);
    }

    public void searchNik() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            iuser.searchByName(form.getTxtCari().getText());
            showSearchData();
        } else {
            JOptionPane.showMessageDialog(form, "Can not empty");
            showData();
        }
    }
}
