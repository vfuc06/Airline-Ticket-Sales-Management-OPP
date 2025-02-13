package dao;

import JDBCUtil.JDBCUtil;
import model.PhieuDatChoKhachHang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhieuDatChoKhachHangDao {

    public static int insert(PhieuDatChoKhachHang phieu) {
        int ketqua = 0;
        try (Connection con = JDBCUtil.getConnection()) {
            String sql = "INSERT INTO phieudatcho (MaPhieu, MaKhachHang, MaChuyenBay, HangVe, GiaVe, SoGheDat, ThanhTien, NgayDat, TinhTrang)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, phieu.getMaPhieu());
            pst.setString(2, phieu.getMaKhachHang());
            pst.setString(3, phieu.getMaChuyenBay());
            pst.setString(4, phieu.getHangVe());
            pst.setString(5, phieu.getGiaVe());
            pst.setInt(6, phieu.getSoGheDat());
            pst.setInt(7, phieu.getThanhTien());
            pst.setString(8, phieu.getNgayDat());
            pst.setString(9, phieu.getTinhTrang());

            ketqua = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    public static int update(PhieuDatChoKhachHang phieu) {
        int ketqua = 0;
        try (Connection con = JDBCUtil.getConnection()) {
            String sql = "UPDATE phieudatcho SET MaKhachHang = ?, MaChuyenBay = ?, HangVe = ?, GiaVe = ?, SoGheDat = ?, ThanhTien = ?, NgayDat = ?, TinhTrang = ? WHERE MaPhieu = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, phieu.getMaKhachHang());
            pst.setString(2, phieu.getMaChuyenBay());
            pst.setString(3, phieu.getHangVe());
            pst.setString(4, phieu.getGiaVe());
            pst.setInt(5, phieu.getSoGheDat());
            pst.setInt(6, phieu.getThanhTien());
            pst.setString(7, phieu.getNgayDat());
            pst.setString(8, phieu.getTinhTrang());
            pst.setInt(9, phieu.getMaPhieu());
            ketqua = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    public static int delete(PhieuDatChoKhachHang phieu) {
        int ketqua = 0;
        try (Connection con = JDBCUtil.getConnection()) {
            String sql = "DELETE FROM phieudatcho WHERE MaPhieu = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, phieu.getMaPhieu());

            ketqua = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    public static List<PhieuDatChoKhachHang> findAll() {
        List<PhieuDatChoKhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM phieudatcho";
        try (Connection con = JDBCUtil.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                PhieuDatChoKhachHang phieu = new PhieuDatChoKhachHang();
                phieu.setMaPhieu(rs.getInt("MaPhieu"));
                phieu.setMaKhachHang(rs.getString("MaKhachHang"));  // Đảm bảo rằng tên cột chính xác
                phieu.setMaChuyenBay(rs.getString("MaChuyenBay"));
                phieu.setHangVe(rs.getString("HangVe"));
                phieu.setGiaVe(rs.getString("GiaVe"));  // Kiểu dữ liệu int cho giá vé
                phieu.setSoGheDat(rs.getInt("SoGheDat"));
                phieu.setThanhTien(rs.getInt("ThanhTien"));
                phieu.setNgayDat(rs.getString("NgayDat"));
                phieu.setTinhTrang(rs.getString("TinhTrang"));
                list.add(phieu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static PhieuDatChoKhachHang findById(int maPhieu) {
        PhieuDatChoKhachHang phieu = null;
        String sql = "SELECT * FROM phieudatcho WHERE MaPhieu = ?";

        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            // Set mã phiếu vào câu truy vấn
            pst.setInt(1, maPhieu);

            // Thực thi truy vấn và lấy kết quả
            try (ResultSet rs = pst.executeQuery()) {
                // Nếu có kết quả trả về
                if (rs.next()) {
                    // Tạo đối tượng PhieuDatChoKhachHang và gán giá trị từ ResultSet
                    phieu = new PhieuDatChoKhachHang();
                    phieu.setMaPhieu(rs.getInt("MaPhieu"));
                    phieu.setMaKhachHang(rs.getString("MaKhachHang"));
                    phieu.setMaChuyenBay(rs.getString("MaChuyenBay"));
                    phieu.setHangVe(rs.getString("HangVe"));
                    phieu.setGiaVe(rs.getString("GiaVe"));
                    phieu.setSoGheDat(rs.getInt("SoGheDat"));
                    phieu.setThanhTien(rs.getInt("ThanhTien"));
                    phieu.setNgayDat(rs.getString("NgayDat"));
                    phieu.setTinhTrang(rs.getString("TinhTrang"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return phieu;
    }

}
