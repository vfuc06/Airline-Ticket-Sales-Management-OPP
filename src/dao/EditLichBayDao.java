package dao;

import model.LichBay;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static JDBCUtil.JDBCUtil.getConnection;
public class EditLichBayDao {
    public static int updateSeatCount(String maChuyenBay, boolean isBusinessClass, int newSeatCount) {
        int ketqua = 0;
        String query = "";
        if (isBusinessClass) {
            query = "UPDATE LichBay SET SoLuongHangGheThuongGiaCon = ? WHERE MaChuyenBay = ?";
        } else {
            query = "UPDATE LichBay SET SoLuongHangGheThuongCon = ? WHERE MaChuyenBay = ?";
        }
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, newSeatCount);
            stmt.setString(2, maChuyenBay);
            ketqua = stmt.executeUpdate();
            System.out.println("Số ghế đã được cập nhật: " + ketqua);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    public static List<LichBay> findAll() {
        List<LichBay> list = new ArrayList<>();
        String query = "SELECT * FROM LichBay";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                LichBay chuyenBay = new LichBay();
                chuyenBay.setMaChuyenBay(rs.getString("MaChuyenBay"));
                chuyenBay.setNgayBay(rs.getString("NgayBay"));
                chuyenBay.setGioBay(rs.getString("GioBay"));
                chuyenBay.setSanBayDi(rs.getString("SanBayDi"));
                chuyenBay.setSanBayDen(rs.getString("SanBayDen"));
                chuyenBay.setSoLuongHangGheThuongGiaCon(rs.getInt("SoLuongHangGheThuongGiaCon"));
                chuyenBay.setSoLuongHangGheThuongCon(rs.getInt("SoLuongHangGheThuongCon"));
                list.add(chuyenBay);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static LichBay getChuyenBayByMaChuyenBay(String maChuyenBay) {
        LichBay chuyenBay = null;
        String query = "SELECT MaChuyenBay, SanBayDi, SanBayDen, NgayBay, GioBay, SoLuongHangGheThuongGia, SoLuongHangGheThuong, SoLuongHangGheThuongGiaCon, SoLuongHangGheThuongCon FROM LichBay WHERE MaChuyenBay = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, maChuyenBay);  // Gán giá trị mã chuyến bay vào câu lệnh SQL

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    chuyenBay = new LichBay();
                    chuyenBay.setMaChuyenBay(rs.getString("MaChuyenBay"));
                    chuyenBay.setSanBayDi(rs.getString("SanBayDi"));
                    chuyenBay.setSanBayDen(rs.getString("SanBayDen"));
                    chuyenBay.setNgayBay(rs.getString("NgayBay"));
                    chuyenBay.setGioBay(rs.getString("GioBay"));
                    chuyenBay.setSoLuongHangGheThuongGia(rs.getInt("SoLuongHangGheThuongGia"));
                    chuyenBay.setSoLuongHangGheThuong(rs.getInt("SoLuongHangGheThuong"));
                    chuyenBay.setSoLuongHangGheThuongGiaCon(rs.getInt("SoLuongHangGheThuongGiaCon"));
                    chuyenBay.setSoLuongHangGheThuongCon(rs.getInt("SoLuongHangGheThuongCon"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chuyenBay;
    }

}

