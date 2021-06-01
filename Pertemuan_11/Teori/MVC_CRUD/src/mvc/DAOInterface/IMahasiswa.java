/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.*;

/**
 *
 * @author acer
 */
public interface IMahasiswa {
    public void insert(Mahasiswa b);
    public void update(Mahasiswa b);
    public void delete(int id);
    public List<Mahasiswa> getAll();
    public List<Mahasiswa> getCariNama(String nama);
}
