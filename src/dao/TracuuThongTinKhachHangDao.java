package dao;

import JDBCUtil.JDBCUtil;
import model.TracuuThongTinKhachHang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TracuuThongTinKhachHangDao {
    public List<TracuuThongTinKhachHang> searchCustomer(String maKhachHang, String soCMND) {
        List<TracuuThongTinKhachHang> list = new ArrayList<>();
        String sql = "SELECT " +
                "PhieuDatCho.MaPhieu AS MaVe, " +
                "KhachHang.MaKhachHang AS MaKhachHang, " +
                "KhachHang.SoCMND AS CCCD_CMND, " +
                "KhachHang.TenKhachHang AS TenKhachHang, " +
                "LichBay.MaChuyenBay AS MaChuyenBay, " +
                "LichBay.SanBayDi AS SanBayDi, " +
                "LichBay.SanBayDen AS SanBayDen, " +
                "PhieuDatCho.HangVe AS HangVe, " +
                "PhieuDatCho.GiaVe AS GiaVe, " +
                "PhieuDatCho.SoGheDat AS SoGhe, " +
                "PhieuDatCho.ThanhTien AS ThanhTien, " +
                "PhieuDatCho.NgayDat AS NgayDatCho, " +
                "PhieuDatCho.TinhTrang AS ThanhToan " +
                "FROM PhieuDatCho " +
                "JOIN KhachHang ON PhieuDatCho.MaKhachHang = KhachHang.MaKhachHang " +
                "JOIN LichBay ON PhieuDatCho.MaChuyenBay = LichBay.MaChuyenBay " +
                "WHERE 1=1";

        if (!maKhachHang.isEmpty()) {
            sql += " AND KhachHang.MaKhachHang = ?";
        }
        if (!soCMND.isEmpty()) {
            sql += " AND KhachHang.SoCMND = ?";
        }
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            int index = 1;
            if (!maKhachHang.isEmpty()) {
                ps.setString(index++, maKhachHang);
            }
            if (!soCMND.isEmpty()) {
                ps.setString(index++, soCMND);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    TracuuThongTinKhachHang ttkh = new TracuuThongTinKhachHang();
                    ttkh.setMaPhieu(rs.getInt("MaVe"));
                    ttkh.setMaKhachHang(rs.getString("MaKhachHang"));
                    ttkh.setSoCMND(rs.getString("CCCD_CMND"));
                    ttkh.setTenKhachHang(rs.getString("TenKhachHang"));
                    ttkh.setMaChuyenBay(rs.getString("MaChuyenBay"));
                    ttkh.setSanBayDi(rs.getString("SanBayDi"));
                    ttkh.setSanBayDen(rs.getString("SanBayDen"));
                    ttkh.setHangVe(rs.getString("HangVe"));
                    ttkh.setGiaVe(rs.getString("GiaVe"));
                    ttkh.setSoGheDat(rs.getInt("SoGhe"));
                    ttkh.setThanhTien(rs.getInt("ThanhTien"));
                    ttkh.setNgayDat(rs.getString("NgayDatCho"));
                    ttkh.setTinhTrang(rs.getString("ThanhToan"));
                    list.add(ttkh);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
