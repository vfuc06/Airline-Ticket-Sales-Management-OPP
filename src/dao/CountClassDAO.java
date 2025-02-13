package dao;

import JDBCUtil.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountClassDAO {

    private static CountClassDAO instance;
    private CountClassDAO() {

    }
    public static CountClassDAO getInstance() {
        if (instance == null) {
            instance = new CountClassDAO();
        }
        return instance;
    }

    public int SlGheE_T1_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();

            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 1 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }

            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T2_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }

            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T3_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();


            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 3 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }

            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }

    public int SlGheE_T4_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();

            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 4 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T5_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 5 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }

    public int SlGheE_T6_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 6 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T7_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 7 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }

            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T8_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 8 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T9_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();

            // Câu lệnh SQL để tính tổng số ghế 'Economy Class' được đặt trong tháng 9 năm 2024
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 9 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";

            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }

            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T10_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 10 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T11_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 11 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheE_T12_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Economy Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 12 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T1_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 1 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T2_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T3_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 3 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T4_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 4 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T5_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 5 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T6_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 6 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T7_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 7 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T8_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 8 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T9_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 9 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T10_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 10 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T11_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 11 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public int SlGheB_T12_2024() {
        int soluongghe = 0;
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT SUM(SoGheDat) AS slGhe FROM PhieuDatCho WHERE HangVe = 'Business Class' " +
                    "AND MONTH(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 12 AND YEAR(STR_TO_DATE(NgayDat, '%d/%m/%Y')) = 2024";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                soluongghe = resultSet.getInt("slGhe");
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soluongghe;
    }
    public static void main(String[] args) {
        CountClassDAO dao = new CountClassDAO();
        int slGheT1 = dao.SlGheE_T1_2024();
        int slGheT2 = dao.SlGheE_T2_2024();
        int slGheT3 = dao.SlGheE_T3_2024();
        int slGheT4 = dao.SlGheE_T4_2024();
        int slGheT5 = dao.SlGheE_T5_2024();
        int slGheT6 = dao.SlGheE_T6_2024();
        int slGheT7 = dao.SlGheE_T7_2024();
        int slGheT8 = dao.SlGheE_T8_2024();
        int slGheT9 = dao.SlGheE_T9_2024();
        int slGheT10 = dao.SlGheE_T10_2024();
        int slGheT11 = dao.SlGheE_T11_2024();
        int slGheT12 = dao.SlGheE_T12_2024();

        System.out.println("Số lượng ghế tháng 1: " + slGheT1);
        System.out.println("Số lượng ghế tháng 2: " + slGheT2);
        System.out.println("Số lượng ghế tháng 3: " + slGheT3);
        System.out.println("Số lượng ghế tháng 4: " + slGheT4);
        System.out.println("Số lượng ghế tháng 5: " + slGheT5);
        System.out.println("Số lượng ghế tháng 6: " + slGheT6);
        System.out.println("Số lượng ghế tháng 7: " + slGheT7);
        System.out.println("Số lượng ghế tháng 8: " + slGheT8);
        System.out.println("Số lượng ghế tháng 9: " + slGheT9);
        System.out.println("Số lượng ghế tháng 10: " + slGheT10);
        System.out.println("Số lượng ghế tháng 11: " + slGheT11);
        System.out.println("Số lượng ghế tháng 12: " + slGheT12);
    }
}
