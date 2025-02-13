package dao;

import JDBCUtil.JDBCUtil;
import model.KhachHang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static JDBCUtil.JDBCUtil.getConnection;
public class KhachHangDao {
    public static int insert(KhachHang kh) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO khachhang (MaKhachHang, SoCMND, TenKhachHang, DienThoai)" +
                    " VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, kh.getMaKhachHang());
            pst.setString(2, kh.getCCCD());
            pst.setString(3, kh.getTenKhachHang());
            pst.setString(4, kh.getSodienthoai());

            ketqua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    public static int update(KhachHang kh) {
        int ketqua = 0;
        try {
            if (kh.getMaKhachHang() == null || kh.getMaKhachHang().isEmpty()) {
                System.out.println("Error: MaKhachHang is empty or null!");
                return ketqua;
            }
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE khachhang " +
                    "SET SoCMND = ?, TenKhachHang = ?, DienThoai = ?" +
                    "WHERE MaKhachHang = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, kh.getCCCD());
            pst.setString(2, kh.getTenKhachHang());
            pst.setString(3, kh.getSodienthoai());
            pst.setString(4, kh.getMaKhachHang());
            ketqua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    public static int delete(KhachHang kh) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM khachhang WHERE MaKhachHang = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, kh.getMaKhachHang());

            ketqua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    public static List<KhachHang> findAll() {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM khachhang";
        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getString("MaKhachHang"));
                kh.setCCCD(rs.getString("SoCMND"));
                kh.setTenKhachHang(rs.getString("TenKhachHang"));
                kh.setSodienthoai(rs.getString("DienThoai"));
                list.add(kh);
            }
            rs.close();
            st.close();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
