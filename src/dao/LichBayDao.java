package dao;

import model.LichBay;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static JDBCUtil.JDBCUtil.getConnection;

    public class LichBayDao {
        public static int insert(LichBay lichBay) {
            int ketqua = 0;
            String query = "INSERT INTO LichBay (MaChuyenBay, SanBayDi, SanBayDen, NgayBay, GioBay, SoLuongHangGheThuongGia, SoLuongHangGheThuong,SoLuongHangGheThuongGiaCon,SoLuongHangGheThuongCon) VALUES (?, ?, ?, ?, ?, ?, ?,?,?)";
            try (Connection conn = getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {

                stmt.setString(1, lichBay.getMaChuyenBay());
                stmt.setString(2, lichBay.getSanBayDi());
                stmt.setString(3, lichBay.getSanBayDen());
                stmt.setString(4, lichBay.getNgayBay());
                stmt.setString(5, lichBay.getGioBay());
                stmt.setInt(6, lichBay.getSoLuongHangGheThuongGia());
                stmt.setInt(7, lichBay.getSoLuongHangGheThuong());
                stmt.setInt(8, lichBay.getSoLuongHangGheThuongGia());
                stmt.setInt(9, lichBay.getSoLuongHangGheThuongCon());

                ketqua = stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return ketqua;
        }

        public static int delete(LichBay lichBay) {
            int ketqua = 0;
            String query = "DELETE FROM LichBay WHERE MaChuyenBay = ?";
            try (Connection conn = getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {

                stmt.setString(1, lichBay.getMaChuyenBay());
                ketqua = stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return ketqua;
        }

        public static int update(LichBay lichBay) {
            int ketqua = 0;
            String query = "UPDATE LichBay SET SanBayDi = ?, SanBayDen = ?, NgayBay = ?, GioBay = ?, SoLuongHangGheThuongGia = ?, SoLuongHangGheThuong = ? WHERE MaChuyenBay = ?";
            try (Connection conn = getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {

                stmt.setString(1, lichBay.getSanBayDi());
                stmt.setString(2, lichBay.getSanBayDen());
                stmt.setString(3, lichBay.getNgayBay());
                stmt.setString(4, lichBay.getGioBay());
                stmt.setInt(5, lichBay.getSoLuongHangGheThuongGia());
                stmt.setInt(6, lichBay.getSoLuongHangGheThuong());
                stmt.setString(7, lichBay.getMaChuyenBay());

                ketqua = stmt.executeUpdate();
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
                    LichBay lichBay = new LichBay();
                    lichBay.setMaChuyenBay(rs.getString("MaChuyenBay"));
                    lichBay.setSanBayDi(rs.getString("SanBayDi"));
                    lichBay.setSanBayDen(rs.getString("SanBayDen"));
                    lichBay.setNgayBay(rs.getString("NgayBay"));
                    lichBay.setGioBay(rs.getString("GioBay"));
                    lichBay.setSoLuongHangGheThuongGia(rs.getInt("SoLuongHangGheThuongGia"));
                    lichBay.setSoLuongHangGheThuong(rs.getInt("SoLuongHangGheThuong"));
                    list.add(lichBay);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return list;
        }
        public static List<LichBay> findFlights(String sanBayDi, String sanBayDen, String ngayBay, String gioBay) {
            List<LichBay> list = new ArrayList<>();
            String query = "SELECT * FROM LichBay WHERE SanBayDi = ? AND SanBayDen = ? AND NgayBay = ? AND GioBay = ?";

            try (Connection conn = getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(query)) {

                pstmt.setString(1, sanBayDi);
                pstmt.setString(2, sanBayDen);
                pstmt.setString(3, ngayBay);
                pstmt.setString(4, gioBay);
                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        LichBay lichBay = new LichBay();
                        lichBay.setMaChuyenBay(rs.getString("MaChuyenBay"));
                        lichBay.setSanBayDi(rs.getString("SanBayDi"));
                        lichBay.setSanBayDen(rs.getString("SanBayDen"));
                        lichBay.setNgayBay(rs.getString("NgayBay"));
                        lichBay.setGioBay(rs.getString("GioBay"));
                        lichBay.setSoLuongHangGheThuongGiaCon(rs.getInt("SoLuongHangGheThuongGiaCon"));
                        lichBay.setSoLuongHangGheThuongCon(rs.getInt("SoLuongHangGheThuongCon"));
                        list.add(lichBay);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return list;
        }


}
