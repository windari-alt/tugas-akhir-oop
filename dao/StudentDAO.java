/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import config.DBConnection;

/**
 *
 * @author Lenovo
 */
public class StudentDAO {

    private Connection connection;

    public StudentDAO() {
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // AMBIL DATA
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        try {

            String sql = "SELECT * FROM mahasiswa";

            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String cardID = rs.getString("id_card");
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String studyProgram = rs.getString("study_program");

                students.add(new Student(cardID, nama, nim, studyProgram));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    // INSERT DATA
    public int create(Student student) {

        try {

            String sql = "INSERT INTO mahasiswa(id_card, nim, nama, study_program) VALUES(?,?,?,?)";

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, student.getCardID());
            stmt.setString(2, student.getNim());
            stmt.setString(3, student.getName());
            stmt.setString(4, student.getStudyProgram());

            stmt.executeUpdate();
            return 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // UPDATE DATA
    public int update(Student student, String nim) {

        try {

            String sql = "UPDATE mahasiswa SET id_card=?, nama=?, study_program=? WHERE nim=?";

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, student.getCardID());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getStudyProgram());
            stmt.setString(4, nim);

            stmt.executeUpdate();
            return 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // DELETE DATA
    public int delete(String nim) {

        try {

            String sql = "DELETE FROM mahasiswa WHERE nim=?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nim);

            stmt.executeUpdate();
            return 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}