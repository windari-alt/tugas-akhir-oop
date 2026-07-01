/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.KRSDAO;      
import model.KRS;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class KRSController {
    private final KRSDAO krsDao;

    public KRSController() {
        this.krsDao = new KRSDAO();
    }
    
    public KRSDAO getKrsDao() {
        return krsDao;
    }

    // CREATE
    public boolean tambahData(KRS krs) {
        return krsDao.simpan(krs);
    }

    // READ
    public List<KRS> tampilkanSemuaData() {
        return krsDao.ambilSemua();
    }

    // UPDATE
    public boolean ubahData(KRS krs) {
        return krsDao.update(krs);
    }

    
    
    public boolean hapusDataNilai(String nim, String kodeMk) {
        return krsDao.hapus(nim, kodeMk);
    }
}