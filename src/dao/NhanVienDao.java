package dao;

import model.NhanVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static JDBCUtil.JDBCUtil.getConnection;

public class NhanVienDao {
    public static int insert(NhanVien nhanVien) {
        int ketqua = 0;
        String query = "INSERT INTO NhanVien (MaNhanVien, TenNhanVien, DiaChi, DienThoai) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, nhanVien.getMaNhanvien());
            stmt.setString(2, nhanVien.getTennhanVien());
            stmt.setString(3, nhanVien.getDiachi());
            stmt.setString(4, nhanVien.getSodienthoai());

            ketqua = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    public static int delete(NhanVien nv) {
        int ketqua = 0;
        String query = "DELETE FROM NhanVien WHERE MaNhanvien = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, nv.getMaNhanvien());
            ketqua = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    public static int update(NhanVien nhanVien) {
        int ketqua = 0;
        String query = "UPDATE NhanVien SET TenNhanVien = ?, DiaChi = ?, DienThoai = ? WHERE MaNhanVien = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nhanVien.getTennhanVien());
            stmt.setString(2, nhanVien.getDiachi());
            stmt.setString(3, nhanVien.getSodienthoai());
            stmt.setInt(4, nhanVien.getMaNhanvien());

            ketqua = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    public static List<NhanVien> findAll() {
        List<NhanVien> list = new ArrayList<>();
        String query = "SELECT * FROM NhanVien";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNhanvien(rs.getInt("MaNhanVien"));
                nhanVien.setTennhanVien(rs.getString("TenNhanVien"));
                nhanVien.setDiachi(rs.getString("DiaChi"));
                nhanVien.setSodienthoai(rs.getString("DienThoai"));
                list.add(nhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
