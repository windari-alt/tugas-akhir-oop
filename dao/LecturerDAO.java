/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.DBConnection;
import model.Lecturer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturerDAO {

    private Connection conn;
    private static final Logger logger = Logger.getLogger(LecturerDAO.class.getName());

    public LecturerDAO() {
        try {
            conn = DBConnection.getConnection();
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Gagal koneksi database", e);
        }
    }

    public List<Lecturer> getAll() {
        List<Lecturer> list = new ArrayList<>();

        String sql = "SELECT * FROM dosen";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Lecturer(
                        rs.getString("id_card"),
                        rs.getString("nama"),
                        rs.getString("nidn"),
                        rs.getString("expertise")
                ));
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, null, e);
        }

        return list;
    }

    public List<Lecturer> getLecturersByPage(int limit, int offset) {

        List<Lecturer> list = new ArrayList<>();

        String sql = "SELECT * FROM dosen LIMIT ? OFFSET ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, limit);
            ps.setInt(2, offset);

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    list.add(new Lecturer(
                            rs.getString("id_card"),
                            rs.getString("nama"),
                            rs.getString("nidn"),
                            rs.getString("expertise")
                    ));
                }
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, null, e);
        }

        return list;
    }

    public boolean simpan(Lecturer l) {

        String sql = "INSERT INTO dosen(id_card,nama,nidn,expertise) VALUES(?,?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, l.getIdCard());
            ps.setString(2, l.getName());
            ps.setString(3, l.getNidn());
            ps.setString(4, l.getExpertise());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            logger.log(Level.SEVERE, null, e);
        }

        return false;
    }

    public boolean ubah(Lecturer l) {

        String sql = "UPDATE dosen SET nama=?, nidn=?, expertise=? WHERE id_card=?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, l.getName());
            ps.setString(2, l.getNidn());
            ps.setString(3, l.getExpertise());
            ps.setString(4, l.getIdCard());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            logger.log(Level.SEVERE, null, e);
        }

        return false;
    }

    public boolean hapus(String idCard) {

        String sql = "DELETE FROM dosen WHERE id_card=?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, idCard);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            logger.log(Level.SEVERE, null, e);
        }

        return false;
    }

    public List<Lecturer> cari(String keyword) {

        List<Lecturer> list = new ArrayList<>();

        String sql = "SELECT * FROM dosen WHERE nama LIKE ? OR id_card LIKE ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            String key = "%" + keyword + "%";

            ps.setString(1, key);
            ps.setString(2, key);

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    list.add(new Lecturer(
                            rs.getString("id_card"),
                            rs.getString("nama"),
                            rs.getString("nidn"),
                            rs.getString("expertise")
                    ));
                }
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, null, e);
        }

        return list;
    }

}