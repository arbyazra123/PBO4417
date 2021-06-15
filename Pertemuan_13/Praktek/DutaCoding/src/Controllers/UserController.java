/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DBConfigs.DBQueries;
import Models.UserModel;
import Views.*;
import java.util.List;
import javax.swing.JOptionPane;
import Interfaces.IUserModel;

/**
 *
 * @author arbyazra
 */
public final class UserController {

    //
    FormRegister form;
    IUserModel iuser;

    //constructor
    public UserController(FormRegister form) {
        this.form = form;
        iuser = new DBQueries();
        
    }

    public void resetForm() {
        form.getTxtNik().setText("");
        form.getTxtNama().setText("");
        form.getTxtAlasan().setText("");
        form.getTxtAlamat().setText("");
    }

    public void insert() {
        if (!form.getTxtNik().getText().trim().isEmpty() || !form.getTxtNama().getText().trim().isEmpty() || !form.getTxtAlasan().getText().trim().isEmpty() || !form.getTxtAlamat().getText().trim().isEmpty()) {
            UserModel user = new UserModel();
            user.setNik(form.getTxtNik().getText());
            user.setNama(form.getTxtNama().getText());
            user.setJk(form.getCmbJK().getSelectedItem().toString());
            user.setAlamat(form.getTxtAlamat().getText());
            user.setAlasan(form.getTxtAlasan().getText());
            iuser.insert(user);
            JOptionPane.showMessageDialog(null, "Register Success");
            resetForm();
        }else{
            JOptionPane.showMessageDialog(form, "Data Can not empty");
        }
    }
}
