package view;

import BieuDoThongKe.DoanhThu_BarChart;
import BieuDoThongKe.EvsB_Class_PieChart;
import dao.*;
import model.*;
import org.jfree.chart.ChartPanel;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class NguoiDung extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private CardLayout cardLayout;
    private JTextField tf_MaPhieu;
    private JTextField tf_MaHanhKhach;
    private JTextField tf_ThanhTien;
    private JTextField tf_SogheDat;
    private JTextField tf_NgayDat;
    private JTextField tf_NgayBay;
    private JTextField tf_SoLuongGheHang1;
    private JTextField tf_SoLuongGheHang2;
    private JTextField tf_Giobay;
    private JTextField tf_manhanvien;
    private JTextField tf_tenNhanvien;
    private JTextField tf_sdtNhanVien;
    private JTextField tf_MaKhachHang;
    private JTextField tf_CCCD_CMND;
    private JTextField tf_TenKhachHang;
    private JTextField tf_SĐTkhachhang;
    private ButtonGroup ButtonGroupTinhtrang;
    private JTextField tf_DiaChiNhanVien;
    private JTable tableLichbay;
    private JTable tableNhanvien;
    private JTable tableKhachHang;
    private JTable tablePhieuDat;
    private JTable tableFS;
    private JTextField tf_FlightDateFS;
    private JTextField tf_FlightTimeFS;
    private JTextField tf_MaChuyenBayDatve;
    private JTextField tf_MaChuyenBayLichbay;
    private JTextField tf_TracuumaKHCS;
    private JTextField tf_CCCD_CMNDtracuuttinKH;
    private JTable tableCS;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NguoiDung frame = new NguoiDung();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public NguoiDung() {
        setTitle("HOME ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1486, 754);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        this.setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        JPanel panelLabelTieude = new JPanel();
        panelLabelTieude.setBackground(new Color(0, 103, 153));
        panelLabelTieude.setBounds(0, 3, 295, 206);
        contentPane.add(panelLabelTieude);
        panelLabelTieude.setLayout(null);

        JLabel lbtieude = new JLabel("FLIGHT TICKET");
        lbtieude.setForeground(new Color(255, 255, 255));
        lbtieude.setFont(new Font("Stencil", Font.BOLD, 32));
        lbtieude.setBounds(26, 117, 269, 46);
        panelLabelTieude.add(lbtieude);

        JLabel lbtieudemanagement = new JLabel("MANAGEMENT");
        lbtieudemanagement.setForeground(Color.WHITE);
        lbtieudemanagement.setFont(new Font("Britannic Bold", Font.BOLD, 30));
        lbtieudemanagement.setBounds(46, 153, 269, 53);
        panelLabelTieude.add(lbtieudemanagement);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/logo.png")));
        lblNewLabel.setBounds(0, -5, 295, 113);
        panelLabelTieude.add(lblNewLabel);

        JPanel panelNguoiDung = new JPanel();
        panelNguoiDung.setBounds(295, 3, 1176, 721);
        contentPane.add(panelNguoiDung);
        panelNguoiDung.setLayout(cardLayout);

        JPanel panelTrangchu = new JPanel();
        panelTrangchu.setBackground(new Color(0, 89, 132));
        panelNguoiDung.add(panelTrangchu, "Trangchu");
        panelTrangchu.setLayout(null);

        JPanel paneltieudetrangchu = new JPanel();
        paneltieudetrangchu.setBounds(0, 0, 1176, 297);
        panelTrangchu.add(paneltieudetrangchu);
        paneltieudetrangchu.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/mbaytrangchu.jpg")));
        lblNewLabel_1.setBounds(0, 0, 1176, 297);
        paneltieudetrangchu.add(lblNewLabel_1);

        JLabel lblEconomyClass = new JLabel("");
        lblEconomyClass.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/ghethuong.jpg")));
        lblEconomyClass.setBounds(150, 371, 284, 273);
        panelTrangchu.add(lblEconomyClass);

        JLabel lblgheThuonggia = new JLabel("");
        lblgheThuonggia.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/thuongia.jpg")));
        lblgheThuonggia.setBounds(593, 371, 511, 273);
        panelTrangchu.add(lblgheThuonggia);

        JLabel lblghethuong = new JLabel("Economy Class");
        lblghethuong.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblghethuong.setForeground(new Color(255, 255, 255));
        lblghethuong.setBounds(160, 654, 275, 35);
        panelTrangchu.add(lblghethuong);

        JLabel lblghethuonggia = new JLabel("Business Class");
        lblghethuonggia.setForeground(Color.WHITE);
        lblghethuonggia.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblghethuonggia.setBounds(719, 654, 275, 35);
        panelTrangchu.add(lblghethuonggia);

        JLabel lblwelcome = new JLabel("YOUR DREAM AWAITS – BOOK YOUR DREAM NOW");
        lblwelcome.setBounds(52, 312, 1114, 49);
        panelTrangchu.add(lblwelcome);
        lblwelcome.setFont(new Font("Segoe UI Black", Font.BOLD, 39));
        lblwelcome.setBackground(new Color(255, 255, 255));
        lblwelcome.setForeground(new Color(255, 255, 255));
        lblwelcome.setFont(new Font("Stencil", Font.PLAIN, 48));

        JPanel panelDatVe = new JPanel();
        panelDatVe.setBackground(new Color(0, 123, 183));
        panelNguoiDung.add(panelDatVe, "DatVe");
        panelDatVe.setLayout(null);

        JLabel lblDatVe = new JLabel("CUSTOMER BOOKING FORM");
        lblDatVe.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/ticket.png")));
        lblDatVe.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 55));
        lblDatVe.setBounds(251, 46, 764, 64);
        panelDatVe.add(lblDatVe);

        String[] giave = new String[] { "", "1.500.000", "5.000.000", "" };
        String[] hangve = new String[] { "","Economy Class","Business Class" };

        JLabel lblMaPhieu = new JLabel("Ticket Code");
        lblMaPhieu.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblMaPhieu.setBounds(119, 132, 104, 25);
        panelDatVe.add(lblMaPhieu);

        tf_MaPhieu = new JTextField();
        tf_MaPhieu.setBounds(264, 137, 223, 19);
        panelDatVe.add(tf_MaPhieu);
        tf_MaPhieu.setColumns(10);

        JLabel lblMaHanhKhach = new JLabel("Customer Code");
        lblMaHanhKhach.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblMaHanhKhach.setBounds(592, 132, 133, 25);
        panelDatVe.add(lblMaHanhKhach);

        tf_MaHanhKhach = new JTextField();
        tf_MaHanhKhach.setColumns(10);
        tf_MaHanhKhach.setBounds(770, 132, 223, 19);
        panelDatVe.add(tf_MaHanhKhach);

        JLabel lblMaChuyenBay = new JLabel("Flight Code");
        lblMaChuyenBay.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblMaChuyenBay.setBounds(119, 184, 135, 25);
        panelDatVe.add(lblMaChuyenBay);

        JLabel lblGiave = new JLabel("Ticket Price");
        lblGiave.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblGiave.setBounds(117, 244, 168, 25);
        panelDatVe.add(lblGiave);

        JComboBox cb_Giave = new JComboBox(giave);
        cb_Giave.setBounds(264, 248, 223, 21);
        panelDatVe.add(cb_Giave);

        JLabel lblHangve = new JLabel("Ticket Class");
        lblHangve.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblHangve.setBounds(592, 188, 104, 25);
        panelDatVe.add(lblHangve);

        JComboBox cb_HangVe = new JComboBox(hangve);
        cb_HangVe.setBounds(770, 188, 223, 21);
        panelDatVe.add(cb_HangVe);

        JLabel lblThanhTien = new JLabel("Total Amount");
        lblThanhTien.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblThanhTien.setBounds(119, 297, 104, 25);
        panelDatVe.add(lblThanhTien);

        tf_ThanhTien = new JTextField();
        tf_ThanhTien.setColumns(10);
        tf_ThanhTien.setBounds(264, 302, 226, 19);
        panelDatVe.add(tf_ThanhTien);

        tf_MaChuyenBayDatve = new JTextField();
        tf_MaChuyenBayDatve.setColumns(10);
        tf_MaChuyenBayDatve.setBounds(264, 189, 223, 19);
        panelDatVe.add(tf_MaChuyenBayDatve);

        JLabel lblSogheDat = new JLabel("Number of Seats");
        lblSogheDat.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblSogheDat.setBounds(592, 244, 139, 25);
        panelDatVe.add(lblSogheDat);

        tf_SogheDat = new JTextField();
        tf_SogheDat.setColumns(10);
        tf_SogheDat.setBounds(770, 244, 223, 19);
        panelDatVe.add(tf_SogheDat);

        JLabel lblNgayDat = new JLabel("Booking Date ( dd/mm/yy )");
        lblNgayDat.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNgayDat.setBounds(546, 297, 214, 25);
        panelDatVe.add(lblNgayDat);

        tf_NgayDat = new JTextField();
        tf_NgayDat.setColumns(10);
        tf_NgayDat.setBounds(770, 302, 223, 19);
        panelDatVe.add(tf_NgayDat);

        JButton btnThanhToan = new JButton("Payment");
        btnThanhToan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "thanhtoan");
            }
        });
        btnThanhToan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        btnThanhToan.setBounds(814, 341, 156, 39);
        panelDatVe.add(btnThanhToan);

        JRadioButton rdbtnDathanhtoan = new JRadioButton("Paid");
        rdbtnDathanhtoan.setFont(new Font("Tahoma", Font.ITALIC, 10));
        rdbtnDathanhtoan.setBounds(770, 400, 104, 39);
        panelDatVe.add(rdbtnDathanhtoan);

        JRadioButton rdbtnChuathanhtoan = new JRadioButton("Unpaid");
        rdbtnChuathanhtoan.setFont(new Font("Tahoma", Font.ITALIC, 10));
        rdbtnChuathanhtoan.setBounds(911, 400, 104, 39);
        panelDatVe.add(rdbtnChuathanhtoan);

        ButtonGroupTinhtrang = new ButtonGroup();
        ButtonGroupTinhtrang.add(rdbtnDathanhtoan);
        ButtonGroupTinhtrang.add(rdbtnChuathanhtoan);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 464, 1176, 247);
        panelDatVe.add(scrollPane);


        JButton btnadd = new JButton("Book Ticket");
        btnadd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        btnadd.setBounds(60, 399, 104, 39);
        panelDatVe.add(btnadd);
        btnadd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy thông tin từ các trường nhập liệu
                String maPhieuText = tf_MaPhieu.getText().trim();
                String maKhachHangText = tf_MaHanhKhach.getText().trim();
                String maChuyenBayText = tf_MaChuyenBayDatve.getText().trim();
                String hangVeText = cb_HangVe.getSelectedItem().toString().trim();
                String giaVeText = cb_Giave.getSelectedItem().toString().trim();
                String soGheDatText = tf_SogheDat.getText().trim();
                String thanhTienText = tf_ThanhTien.getText().trim();
                String ngayDatText = tf_NgayDat.getText().trim();

                // Kiểm tra xem có trường nào trống không
                if (maPhieuText.isEmpty() || maKhachHangText.isEmpty() || maChuyenBayText.isEmpty() ||
                        hangVeText.isEmpty() || giaVeText.isEmpty() || soGheDatText.isEmpty() || thanhTienText.isEmpty() || ngayDatText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin vào tất cả các trường!");
                    return;
                }

                PhieuDatChoKhachHang phieu = new PhieuDatChoKhachHang();

                // Gán thông tin vào đối tượng PhieuDatChoKhachHang
                try {
                    // Kiểm tra và chuyển đổi các chuỗi thành số nguyên
                    phieu.setMaPhieu(Integer.parseInt(maPhieuText));  // Lấy mã phiếu
                    phieu.setSoGheDat(Integer.parseInt(soGheDatText));  // Lấy số ghế đặt
                    phieu.setThanhTien(Integer.parseInt(thanhTienText));  // Lấy thành tiền
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập giá trị hợp lệ cho mã phiếu, số ghế và thành tiền!");
                    return;
                }

                // Gán các trường còn lại vào đối tượng PhieuDatChoKhachHang
                phieu.setMaKhachHang(maKhachHangText);  // Lấy mã khách hàng
                phieu.setMaChuyenBay(maChuyenBayText);  // Lấy mã chuyến bay
                phieu.setHangVe(hangVeText);  // Lấy hạng vé (Business/Economy)
                phieu.setGiaVe(giaVeText);  // Lấy giá vé
                phieu.setNgayDat(ngayDatText);  // Lấy ngày đặt vé

                // Xác định tình trạng thanh toán từ radio button
                if (rdbtnDathanhtoan.isSelected()) {
                    phieu.setTinhTrang("Paid");  // Tình trạng đã thanh toán
                } else if (rdbtnChuathanhtoan.isSelected()) {
                    phieu.setTinhTrang("Unpaid");  // Tình trạng chưa thanh toán
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn tình trạng!");
                    return;
                }

                // Lấy thông tin chuyến bay từ mã chuyến bay đã chọn
                LichBay lichBay = EditLichBayDao.getChuyenBayByMaChuyenBay(phieu.getMaChuyenBay());

                // Kiểm tra số ghế còn lại và số ghế khách hàng muốn đặt
                int soGheConLai = 0;
                if (phieu.getHangVe().equals("Business Class")) {
                    soGheConLai = lichBay.getSoLuongHangGheThuongGiaCon();  // Lấy số ghế hạng Business còn lại
                } else if (phieu.getHangVe().equals("Economy Class")) {
                    soGheConLai = lichBay.getSoLuongHangGheThuongCon();  // Lấy số ghế hạng Economy còn lại
                }

                // Kiểm tra nếu số ghế đặt lớn hơn số ghế còn lại
                if (phieu.getSoGheDat() > soGheConLai) {
                    JOptionPane.showMessageDialog(null, "Số ghế đặt vượt quá số ghế còn lại trên chuyến bay!");
                    return;  // Không thực hiện thêm phiếu đặt
                }

                // Thêm phiếu đặt vào cơ sở dữ liệu
                PhieuDatChoKhachHangDao.insert(phieu);

                // Kiểm tra loại vé và cập nhật số ghế còn lại
                if (phieu.getHangVe().equals("Business Class")) {
                    // Giảm số ghế hạng Business
                    int newSeatCount = soGheConLai - phieu.getSoGheDat();
                    EditLichBayDao.updateSeatCount(phieu.getMaChuyenBay(), true, newSeatCount);
                } else if (phieu.getHangVe().equals("Economy Class")) {
                    // Giảm số ghế hạng Economy
                    int newSeatCount = soGheConLai - phieu.getSoGheDat();
                    EditLichBayDao.updateSeatCount(phieu.getMaChuyenBay(), false, newSeatCount);
                }

                // Thông báo thành công
                JOptionPane.showMessageDialog(null, "Thêm phiếu đặt thành công!");

                // Cập nhật lại danh sách chuyến bay trong JTable
                showPhieuDatKH(PhieuDatChoKhachHangDao.findAll());
            }
        });


//// Nút "Cập Nhật"
        JButton btnupdate = new JButton("Update Ticket");
        btnupdate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        btnupdate.setBounds(218, 400, 125, 39);
        panelDatVe.add(btnupdate);
        btnupdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy dữ liệu từ các trường nhập liệu
                String maPhieuText = tf_MaPhieu.getText().trim();
                String maKhachHangText = tf_MaHanhKhach.getText().trim();
                String maChuyenBayText = tf_MaChuyenBayDatve.getText().trim();
                String hangVeText = cb_HangVe.getSelectedItem().toString().trim();
                String soGheDatText = tf_SogheDat.getText().trim();
                String thanhTienText = tf_ThanhTien.getText().trim();
                String ngayDatText = tf_NgayDat.getText().trim();

                // Kiểm tra xem có trường nào trống không
                if (maPhieuText.isEmpty() || maKhachHangText.isEmpty() || maChuyenBayText.isEmpty() ||
                        hangVeText.isEmpty() || soGheDatText.isEmpty() || thanhTienText.isEmpty() || ngayDatText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin vào tất cả các trường!");
                    return;  // Dừng lại nếu có trường trống
                }

                // Tạo đối tượng PhieuDatChoKhachHang và gán giá trị từ các trường nhập liệu
                PhieuDatChoKhachHang phieu = new PhieuDatChoKhachHang();
                phieu.setMaPhieu(Integer.parseInt(maPhieuText));  // Lấy mã phiếu
                phieu.setMaKhachHang(maKhachHangText);  // Lấy mã khách hàng
                phieu.setMaChuyenBay(maChuyenBayText);  // Lấy mã chuyến bay
                phieu.setHangVe(hangVeText);  // Lấy hạng vé (Business/Economy)
                phieu.setSoGheDat(Integer.parseInt(soGheDatText));  // Lấy số ghế đặt
                phieu.setThanhTien(Integer.parseInt(thanhTienText));  // Lấy thành tiền
                phieu.setNgayDat(ngayDatText);  // Lấy ngày đặt vé

                // Xác định tình trạng thanh toán từ radio button
                if (rdbtnDathanhtoan.isSelected()) {
                    phieu.setTinhTrang("Thanh toán");  // Tình trạng đã thanh toán
                } else if (rdbtnChuathanhtoan.isSelected()) {
                    phieu.setTinhTrang("Chưa thanh toán");  // Tình trạng chưa thanh toán
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn tình trạng!");
                    return;
                }

                // Cập nhật phiếu đặt vào cơ sở dữ liệu
                PhieuDatChoKhachHangDao.update(phieu);

                // Thông báo thành công
                JOptionPane.showMessageDialog(null, "Cập nhật phiếu đặt thành công!");

                // Cập nhật lại danh sách phiếu đặt trong JTable
                showPhieuDatKH(PhieuDatChoKhachHangDao.findAll());
            }
        });

//
//
//// Nút "Xóa"
        JButton btnXoa = new JButton("Delete Ticket");
        btnXoa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        btnXoa.setBounds(393, 400, 139, 39);
        panelDatVe.add(btnXoa);
        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy mã phiếu từ trường nhập liệu
                String maPhieuText = tf_MaPhieu.getText().trim();
                if (maPhieuText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã phiếu!");
                    return;  // Dừng lại nếu mã phiếu trống
                }

                // Kiểm tra xem mã phiếu có hợp lệ không
                int maPhieu = 0;
                try {
                    maPhieu = Integer.parseInt(maPhieuText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Mã phiếu phải là một số hợp lệ!");
                    return;  // Dừng lại nếu mã phiếu không phải là số
                }

                // Tạo đối tượng PhieuDatChoKhachHang với mã phiếu cần xóa
                PhieuDatChoKhachHang phieu = new PhieuDatChoKhachHang();
                phieu.setMaPhieu(maPhieu);


                // Xóa phiếu đặt khỏi cơ sở dữ liệu
                PhieuDatChoKhachHangDao.delete(phieu);

                // Thông báo thành công
                JOptionPane.showMessageDialog(null, "Xóa phiếu đặt thành công!");

                // Cập nhật lại danh sách phiếu đặt trong JTable
                showPhieuDatKH(PhieuDatChoKhachHangDao.findAll());
            }
        });
        //Nút reset DatVe
        JButton btnRefresh = new JButton("Reset");
        btnRefresh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        btnRefresh.setBounds(592, 400, 139, 39);
        panelDatVe.add(btnRefresh);
        btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Đặt lại các trường nhập liệu (JTextField)
                tf_MaPhieu.setText(""); // Reset mã phiếu
                tf_MaHanhKhach.setText(""); // Reset mã hành khách
                tf_SogheDat.setText(""); // Reset số ghế đặt
                tf_ThanhTien.setText(""); // Reset thành tiền
                tf_NgayDat.setText(""); // Reset ngày đặt

                // Đặt lại các combobox (JComboBox)
                tf_MaChuyenBayDatve.setText(""); // Chọn lại giá trị mặc định của Chuyến Bay
                cb_HangVe.setSelectedIndex(0); // Chọn lại giá trị mặc định của Hạng vé
                cb_Giave.setSelectedIndex(0); // Chọn lại giá trị mặc định của Giá vé

                // Đặt lại các radio button (JRadioButton)
                rdbtnDathanhtoan.setSelected(false); // Bỏ chọn radio button "Đã thanh toán"
                rdbtnChuathanhtoan.setSelected(false); // Bỏ chọn radio button "Chưa thanh toán"

                // Hiển thị lại danh sách phiếu đặt
                // Cập nhật lại danh sách chuyến bay trong JTable
                showPhieuDatKH(PhieuDatChoKhachHangDao.findAll());
            }
        });

        tablePhieuDat = new JTable();
        tablePhieuDat.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                        "Coupon Code", "Passenger Code", "Flight Code", "Ticket Class", "Ticket Price", "Seats", "Total", "Booking Date", "Payment"
                }
        ));
        tablePhieuDat.getColumnModel().getColumn(1).setPreferredWidth(91);
        tablePhieuDat.getColumnModel().getColumn(2).setPreferredWidth(63);
        tablePhieuDat.getColumnModel().getColumn(3).setPreferredWidth(93);
        tablePhieuDat.getColumnModel().getColumn(5).setPreferredWidth(48);
        tablePhieuDat.getColumnModel().getColumn(6).setPreferredWidth(45);
        tablePhieuDat.getColumnModel().getColumn(7).setPreferredWidth(71);
        scrollPane.setViewportView(tablePhieuDat);

        JButton btnTinhTien = new JButton("Total");
        btnTinhTien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lấy số vé từ JTextField
                    int soVe = Integer.parseInt(tf_SogheDat.getText());

                    // Lấy loại vé từ JComboBox
                    String hangVe = cb_HangVe.getSelectedItem().toString().trim();

                    // Khai báo giá trị cho từng hạng vé
                    int giaVe = 0;
                    if (hangVe != null) {
                        if (hangVe.equals("Business Class")) {
                            giaVe = 5000000;  // Business class
                        } else if (hangVe.equals("Economy Class")) {
                            giaVe = 1500000;  // Economy class
                        }
                    }

                    // Tính tổng số tiền
                    int tongTien = soVe * giaVe;

                    // Cập nhật vào JTextField
                    tf_ThanhTien.setText(String.valueOf(tongTien));
                } catch (NumberFormatException ex) {
                    // Xử lý nếu người dùng không nhập số hợp lệ
                    tf_ThanhTien.setText("Invalid input");
                }
            }
        });
        btnTinhTien.setBounds(119, 332, 85, 21);
        panelDatVe.add(btnTinhTien);
        showPhieuDatKH(PhieuDatChoKhachHangDao.findAll());


        JPanel paneLichBay = new JPanel();
        paneLichBay.setBackground(new Color(0, 131, 193));
        panelNguoiDung.add(paneLichBay, "LichBay");
        paneLichBay.setLayout(null);

        JLabel lblQuanLiLichBay = new JLabel("FLIGHT SCHEDULE MANAGEMENT");
        lblQuanLiLichBay.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/calender.png")));
        lblQuanLiLichBay.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
        lblQuanLiLichBay.setBounds(244, 41, 885, 91);
        paneLichBay.add(lblQuanLiLichBay);

        String[] sb = new String[] { "", "SB Nội Bài - HAN", "SB Tân Sơn Nhất - SGN", "SB Đà Nẵng - DAD",
                "SB Nha Trang - CXR", "SB Cát Bi - HPH", "SB Phù Cát - UIH", "SB Buôn Ma Thuột - BMV",
                "SB Lien Khuong - DLI", "SB Phan Rang - Tháp Chàm - PHAN RANG", "SB Tuy Hòa - TBB" };

        JLabel lblmaChuyenBay = new JLabel("Flight Code");
        lblmaChuyenBay.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblmaChuyenBay.setBounds(89, 144, 117, 26);
        paneLichBay.add(lblmaChuyenBay);

        JLabel lblSanBayDi = new JLabel("Departure Airport");
        lblSanBayDi.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSanBayDi.setBounds(89, 190, 137, 26);
        paneLichBay.add(lblSanBayDi);

        JComboBox cB_sanbaydi = new JComboBox(sb);
        cB_sanbaydi.setBounds(296, 195, 228, 21);
        paneLichBay.add(cB_sanbaydi);

        JLabel lblSanBayDen = new JLabel("Arrival Airport");
        lblSanBayDen.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSanBayDen.setBounds(89, 241, 117, 26);
        paneLichBay.add(lblSanBayDen);

        JComboBox cB_sanbayden = new JComboBox(sb);
        cB_sanbayden.setBounds(296, 246, 228, 21);
        paneLichBay.add(cB_sanbayden);

        JLabel lblngayBay = new JLabel("Flight Date (dd/mm/yy)");
        lblngayBay.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblngayBay.setBounds(85, 293, 179, 26);
        paneLichBay.add(lblngayBay);


        tf_MaChuyenBayLichbay = new JTextField();
        tf_MaChuyenBayLichbay.setColumns(10);
        tf_MaChuyenBayLichbay.setBounds(296, 150, 228, 19);
        paneLichBay.add(tf_MaChuyenBayLichbay);

        tf_NgayBay = new JTextField();
        tf_NgayBay.setColumns(10);
        tf_NgayBay.setBounds(296, 299, 228, 19);
        paneLichBay.add(tf_NgayBay);

        JLabel lblSoLuongGheHang1 = new JLabel("Business Class");
        lblSoLuongGheHang1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSoLuongGheHang1.setBounds(625, 190, 142, 26);
        paneLichBay.add(lblSoLuongGheHang1);

        JLabel lblSoLuongGheHang2 = new JLabel("Economy Class");
        lblSoLuongGheHang2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSoLuongGheHang2.setBounds(625, 241, 142, 26);
        paneLichBay.add(lblSoLuongGheHang2);

        tf_SoLuongGheHang1 = new JTextField();
        tf_SoLuongGheHang1.setColumns(10);
        tf_SoLuongGheHang1.setBounds(795, 196, 228, 19);
        paneLichBay.add(tf_SoLuongGheHang1);

        tf_SoLuongGheHang2 = new JTextField();
        tf_SoLuongGheHang2.setColumns(10);
        tf_SoLuongGheHang2.setBounds(795, 247, 228, 19);
        paneLichBay.add(tf_SoLuongGheHang2);

        JLabel lblgioBay = new JLabel("Flight Time (hh:mm)");
        lblgioBay.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblgioBay.setBounds(625, 144, 160, 26);
        paneLichBay.add(lblgioBay);

        tf_Giobay = new JTextField();
        tf_Giobay.setColumns(10);
        tf_Giobay.setBounds(795, 150, 228, 19);
        paneLichBay.add(tf_Giobay);

        JButton btnthem = new JButton("Add");
        btnthem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        btnthem.setBounds(170, 347, 151, 40);
        paneLichBay.add(btnthem);
        btnthem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Kiểm tra các trường nhập liệu
                String maChuyenBayText = tf_MaChuyenBayLichbay.getText().trim();
                String ngayBayText = tf_NgayBay.getText().trim();
                String gioBayText = tf_Giobay.getText().trim();
                String soLuongHang1Text = tf_SoLuongGheHang1.getText().trim();
                String soLuongHang2Text = tf_SoLuongGheHang2.getText().trim();

                // Kiểm tra xem các trường có bị trống không
                if (maChuyenBayText.isEmpty() || ngayBayText.isEmpty() || gioBayText.isEmpty() ||
                        soLuongHang1Text.isEmpty() || soLuongHang2Text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;  // Dừng lại nếu có trường bị trống
                }

                // Kiểm tra số lượng ghế có phải là số hợp lệ không
                int soLuongHangGheThuongGia = 0;
                int soLuongHangGheThuong = 0;

                try {
                    soLuongHangGheThuongGia = Integer.parseInt(soLuongHang1Text);
                    soLuongHangGheThuong = Integer.parseInt(soLuongHang2Text);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Số lượng ghế phải là một số hợp lệ!");
                    return;  // Dừng lại nếu số lượng ghế không hợp lệ
                }

                // Tạo đối tượng LichBay mới và gán giá trị từ các trường nhập liệu
                LichBay lichBay = new LichBay();
                lichBay.setMaChuyenBay(maChuyenBayText); // Lấy mã chuyến bay
                lichBay.setSanBayDi(cB_sanbaydi.getSelectedItem().toString()); // Lấy sân bay đi
                lichBay.setSanBayDen(cB_sanbayden.getSelectedItem().toString()); // Lấy sân bay đến
                lichBay.setNgayBay(ngayBayText); // Lấy ngày bay
                lichBay.setGioBay(gioBayText); // Lấy giờ bay
                lichBay.setSoLuongHangGheThuongGia(soLuongHangGheThuongGia); // Lấy số lượng ghế hạng 1
                lichBay.setSoLuongHangGheThuong(soLuongHangGheThuong); // Lấy số lượng ghế hạng 2
                lichBay.setSoLuongHangGheThuongGiaCon(soLuongHangGheThuongGia); // Lấy số ghế còn lại hạng 1
                lichBay.setSoLuongHangGheThuongCon(soLuongHangGheThuong); // Lấy số ghế còn lại hạng 2

                // Thêm lịch bay vào cơ sở dữ liệu
                LichBayDao.insert(lichBay);

                // Thông báo thành công
                JOptionPane.showMessageDialog(null, "Thêm lịch bay thành công!");

                // Cập nhật giao diện với danh sách mới
                showLichBay(LichBayDao.findAll());
            }
        });


        JButton btnCapNhat = new JButton("Update");
        btnCapNhat.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        btnCapNhat.setBounds(354, 347, 151, 40);
        paneLichBay.add(btnCapNhat);
        btnCapNhat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Kiểm tra các trường nhập liệu
                String maChuyenBayText = tf_MaChuyenBayLichbay.getText().trim();
                String ngayBayText = tf_NgayBay.getText().trim();
                String gioBayText = tf_Giobay.getText().trim();
                String soLuongHang1Text = tf_SoLuongGheHang1.getText().trim();
                String soLuongHang2Text = tf_SoLuongGheHang2.getText().trim();

                // Kiểm tra xem các trường có bị trống không
                if (maChuyenBayText.isEmpty() || ngayBayText.isEmpty() || gioBayText.isEmpty() ||
                        soLuongHang1Text.isEmpty() || soLuongHang2Text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;  // Dừng lại nếu có trường bị trống
                }

                // Kiểm tra số lượng ghế có phải là số hợp lệ không
                int soLuongHangGheThuongGia = 0;
                int soLuongHangGheThuong = 0;

                try {
                    soLuongHangGheThuongGia = Integer.parseInt(soLuongHang1Text);
                    soLuongHangGheThuong = Integer.parseInt(soLuongHang2Text);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Số lượng ghế phải là một số hợp lệ!");
                    return;  // Dừng lại nếu số lượng ghế không hợp lệ
                }

                // Tạo đối tượng LichBay mới và gán giá trị từ các trường nhập liệu
                LichBay lichBay = new LichBay();
                lichBay.setMaChuyenBay(maChuyenBayText); // Lấy mã chuyến bay
                lichBay.setSanBayDi(cB_sanbaydi.getSelectedItem().toString()); // Lấy sân bay đi
                lichBay.setSanBayDen(cB_sanbayden.getSelectedItem().toString()); // Lấy sân bay đến
                lichBay.setNgayBay(ngayBayText); // Lấy ngày bay
                lichBay.setGioBay(gioBayText); // Lấy giờ bay
                lichBay.setSoLuongHangGheThuongGia(soLuongHangGheThuongGia); // Lấy số lượng ghế hạng 1
                lichBay.setSoLuongHangGheThuong(soLuongHangGheThuong); // Lấy số lượng ghế hạng 2

                // Cập nhật thông tin lịch bay trong cơ sở dữ liệu
                LichBayDao.update(lichBay);

                // Thông báo thành công
                JOptionPane.showMessageDialog(null, "Cập nhật lịch bay thành công!");

                // Cập nhật giao diện với danh sách mới
                showLichBay(LichBayDao.findAll());
            }
        });
        JButton btnxoa = new JButton("Delete");
        btnxoa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        btnxoa.setBounds(547, 347, 151, 40);
        paneLichBay.add(btnxoa);
        btnxoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy mã chuyến bay từ trường nhập liệu
                String maChuyenBay = tf_MaChuyenBayLichbay.getText().trim();

                // Kiểm tra xem mã chuyến bay có trống không
                if (maChuyenBay.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã chuyến bay cần xóa!");
                    return;  // Dừng lại nếu mã chuyến bay trống
                }

                try {
                    // Tạo đối tượng LichBay với mã chuyến bay cần xóa
                    LichBay lichBay = new LichBay();
                    lichBay.setMaChuyenBay(maChuyenBay);

                    // Xóa lịch bay trong cơ sở dữ liệu
                    LichBayDao.delete(lichBay);

                    // Thông báo thành công
                    JOptionPane.showMessageDialog(null, "Xóa lịch bay thành công!");

                    // Cập nhật giao diện với danh sách mới
                    showLichBay(LichBayDao.findAll());
                } catch (Exception ex) {
                    // Nếu có lỗi trong quá trình xóa
                    JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi xóa lịch bay: " + ex.getMessage());
                }
            }
        });

        JButton btnReset = new JButton("Reset");
        btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        btnReset.setBounds(748, 347, 151, 40);
        paneLichBay.add(btnReset);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Đặt lại các trường nhập liệu (JTextField)
                tf_NgayBay.setText(""); // Reset ngày bay
                tf_Giobay.setText(""); // Reset giờ bay
                tf_SoLuongGheHang1.setText(""); // Reset số lượng ghế hạng 1
                tf_SoLuongGheHang2.setText(""); // Reset số lượng ghế hạng 2

                // Đặt lại các combobox (JComboBox)
                tf_MaChuyenBayLichbay.setText(""); // Chọn lại giá trị mặc định của mã chuyến bay
                cB_sanbaydi.setSelectedIndex(0); // Chọn lại giá trị mặc định của sân bay đi
                cB_sanbayden.setSelectedIndex(0); // Chọn lại giá trị mặc định của sân bay đến

                // Hiển thị lại danh sách các chuyến bay (nếu cần)
                showLichBayFSTable(LichBayDao.findAll());
            }
        });

        JScrollPane scrollPane_lichbay = new JScrollPane();
        scrollPane_lichbay.setBounds(0, 419, 1176, 292);
        paneLichBay.add(scrollPane_lichbay);

        tableLichbay = new JTable();
        tableLichbay.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                },
                new String[] {
                        "Flight Code", "Departure Airport", "Arrival Airport", "Flight Date", "Flight Time", "Business Class", "Economy Class"
                }
        ));
        tableLichbay.getColumnModel().getColumn(1).setPreferredWidth(111);
        tableLichbay.getColumnModel().getColumn(2).setPreferredWidth(83);
        tableLichbay.getColumnModel().getColumn(3).setPreferredWidth(81);
        tableLichbay.getColumnModel().getColumn(4).setPreferredWidth(86);
        tableLichbay.getColumnModel().getColumn(5).setPreferredWidth(100);
        tableLichbay.getColumnModel().getColumn(6).setPreferredWidth(97);
        scrollPane_lichbay.setViewportView(tableLichbay);
        showLichBay(LichBayDao.findAll());




        JPanel panelNhanVien = new JPanel();
        panelNhanVien.setBackground(new Color(0, 128, 189));
        panelNguoiDung.add(panelNhanVien, "NhanVien");
        panelNhanVien.setLayout(null);

        JLabel lblQuanLiNhanVien = new JLabel("STAFF MANAGEMENT");
        lblQuanLiNhanVien.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/staff.png")));
        lblQuanLiNhanVien.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 60));
        lblQuanLiNhanVien.setBounds(324, 68, 670, 68);
        panelNhanVien.add(lblQuanLiNhanVien);

        JLabel lblMaNhanVien = new JLabel("Staff Code");
        lblMaNhanVien.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblMaNhanVien.setBounds(99, 185, 125, 27);
        panelNhanVien.add(lblMaNhanVien);

        JLabel lbltenNhanVien = new JLabel("Staff Name");
        lbltenNhanVien.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbltenNhanVien.setBounds(547, 185, 159, 27);
        panelNhanVien.add(lbltenNhanVien);

        JLabel lblSdtNhanVien = new JLabel("Phone Number");
        lblSdtNhanVien.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblSdtNhanVien.setBounds(99, 259, 125, 27);
        panelNhanVien.add(lblSdtNhanVien);

        JLabel lbldiachiNhanVien = new JLabel("Address");
        lbldiachiNhanVien.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbldiachiNhanVien.setBounds(547, 259, 125, 27);
        panelNhanVien.add(lbldiachiNhanVien);

        tf_manhanvien = new JTextField();
        tf_manhanvien.setBounds(235, 188, 237, 25);
        panelNhanVien.add(tf_manhanvien);
        tf_manhanvien.setColumns(10);

        tf_tenNhanvien = new JTextField();
        tf_tenNhanvien.setColumns(10);
        tf_tenNhanvien.setBounds(716, 188, 252, 25);
        panelNhanVien.add(tf_tenNhanvien);

        tf_sdtNhanVien = new JTextField();
        tf_sdtNhanVien.setColumns(10);
        tf_sdtNhanVien.setBounds(234, 262, 238, 25);
        panelNhanVien.add(tf_sdtNhanVien);

        tf_DiaChiNhanVien = new JTextField();
        tf_DiaChiNhanVien.setColumns(10);
        tf_DiaChiNhanVien.setBounds(716, 261, 380, 27);
        panelNhanVien.add(tf_DiaChiNhanVien);

        JButton btnaddNhanvien = new JButton("Add");
        btnaddNhanvien.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
        btnaddNhanvien.setBounds(99, 336, 137, 48);
        panelNhanVien.add(btnaddNhanvien);
        btnaddNhanvien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Kiểm tra các trường nhập liệu
                String maNhanVienText = tf_manhanvien.getText().trim();
                String tenNhanVienText = tf_tenNhanvien.getText().trim();
                String soDienThoaiText = tf_sdtNhanVien.getText().trim();
                String diaChiText = tf_DiaChiNhanVien.getText().trim();

                // Kiểm tra xem các trường có bị trống không
                if (maNhanVienText.isEmpty() || tenNhanVienText.isEmpty() || soDienThoaiText.isEmpty() || diaChiText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin nhân viên!");
                    return;  // Dừng lại nếu có trường bị trống
                }

                try {
                    // Tạo đối tượng NhanVien mới và gán giá trị từ các trường nhập liệu
                    NhanVien nv = new NhanVien();
                    nv.setMaNhanvien(Integer.parseInt(maNhanVienText));  // Lấy mã nhân viên
                    nv.setTennhanVien(tenNhanVienText);  // Lấy tên nhân viên
                    nv.setSodienthoai(soDienThoaiText);  // Lấy số điện thoại
                    nv.setDiachi(diaChiText);  // Lấy địa chỉ

                    // Thêm nhân viên vào cơ sở dữ liệu
                    NhanVienDao.insert(nv);  // Gọi phương thức thêm dữ liệu

                    // Thông báo thành công
                    JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công!");

                    // Cập nhật lại bảng hiển thị
                    showNhanVien(NhanVienDao.findAll());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Mã nhân viên phải là một số hợp lệ!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi thêm nhân viên: " + ex.getMessage());
                }
            }
        });

        JButton btnsuaNhanvien = new JButton("Update");
        btnsuaNhanvien.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
        btnsuaNhanvien.setBounds(335, 336, 137, 48);
        panelNhanVien.add(btnsuaNhanvien);
        btnsuaNhanvien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy dữ liệu từ các trường nhập liệu
                String maNhanVienText = tf_manhanvien.getText().trim();
                String tenNhanVienText = tf_tenNhanvien.getText().trim();
                String soDienThoaiText = tf_sdtNhanVien.getText().trim();
                String diaChiText = tf_DiaChiNhanVien.getText().trim();

                // Kiểm tra xem các trường có bị trống không
                if (maNhanVienText.isEmpty() || tenNhanVienText.isEmpty() || soDienThoaiText.isEmpty() || diaChiText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin nhân viên!");
                    return;  // Dừng lại nếu có trường bị trống
                }

                try {
                    // Lấy mã nhân viên từ trường nhập liệu
                    int maNhanVien = Integer.parseInt(maNhanVienText);  // Kiểm tra nếu mã nhân viên hợp lệ

                    // Tạo đối tượng NhanVien và gán dữ liệu từ các trường nhập liệu
                    NhanVien nv = new NhanVien();
                    nv.setMaNhanvien(maNhanVien);  // Gán mã nhân viên
                    nv.setTennhanVien(tenNhanVienText);  // Gán tên nhân viên
                    nv.setSodienthoai(soDienThoaiText);  // Gán số điện thoại
                    nv.setDiachi(diaChiText);  // Gán địa chỉ

                    // Cập nhật thông tin nhân viên trong cơ sở dữ liệu
                    int result = NhanVienDao.update(nv);

                    // Kiểm tra kết quả và thông báo cho người dùng
                    if (result > 0) {
                        JOptionPane.showMessageDialog(null, "Cập nhật nhân viên thành công!");
                        showNhanVien(NhanVienDao.findAll());  // Cập nhật lại bảng hiển thị
                    } else {
                        JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên để cập nhật.");
                    }
                } catch (NumberFormatException ex) {
                    // Xử lý khi người dùng nhập mã nhân viên không phải số
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nhân viên hợp lệ (chỉ số).");
                } catch (Exception ex) {
                    // Xử lý các lỗi khác
                    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra khi cập nhật nhân viên.");
                }
            }
        });

        JButton btnxoaNhanVien = new JButton("Delete");
        btnxoaNhanVien.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
        btnxoaNhanVien.setBounds(547, 336, 137, 48);
        panelNhanVien.add(btnxoaNhanVien);
        btnxoaNhanVien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy dữ liệu từ trường nhập liệu
                String maNhanVienText = tf_manhanvien.getText().trim();

                // Kiểm tra xem mã nhân viên có bị trống không
                if (maNhanVienText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nhân viên cần xóa!");
                    return;  // Dừng lại nếu mã nhân viên trống
                }

                try {
                    // Lấy mã nhân viên từ trường nhập liệu
                    int maNhanVien = Integer.parseInt(maNhanVienText);  // Kiểm tra nếu mã nhân viên hợp lệ

                    // Tạo đối tượng NhanVien với mã nhân viên cần xóa
                    NhanVien nv = new NhanVien();
                    nv.setMaNhanvien(maNhanVien);

                    // Gọi phương thức xóa nhân viên trong cơ sở dữ liệu
                    int result = NhanVienDao.delete(nv);

                    // Kiểm tra kết quả và thông báo cho người dùng
                    if (result > 0) {
                        JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công!");
                        showNhanVien(NhanVienDao.findAll());  // Cập nhật lại bảng hiển thị
                    } else {
                        JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên để xóa.");
                    }
                } catch (NumberFormatException ex) {
                    // Xử lý khi người dùng nhập mã nhân viên không phải số
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nhân viên hợp lệ (chỉ số).");
                } catch (Exception ex) {
                    // Xử lý các lỗi khác
                    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra khi xóa nhân viên.");
                }
            }
        });
        JButton btnResetNhanvien = new JButton("Reset");
        btnResetNhanvien.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
        btnResetNhanvien.setBounds(769, 335, 159, 51);
        panelNhanVien.add(btnResetNhanvien);
        btnResetNhanvien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Đặt lại các trường nhập liệu (JTextField)
                tf_manhanvien.setText(""); // Reset mã nhân viên
                tf_tenNhanvien.setText(""); // Reset tên nhân viên
                tf_sdtNhanVien.setText(""); // Reset số điện thoại nhân viên
                tf_DiaChiNhanVien.setText(""); // Reset địa chỉ nhân viên

                // Hiển thị lại danh sách nhân viên
                showNhanVien(NhanVienDao.findAll()); // Hiển thị lại danh sách nhân viên
            }
        });

        JScrollPane scrollPane_Nhanvien = new JScrollPane();
        scrollPane_Nhanvien.setBounds(0, 421, 1176, 290);
        panelNhanVien.add(scrollPane_Nhanvien);
        tableNhanvien = new JTable();
        tableNhanvien.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                },
                new String[] {
                        "Staff Code", "Staff Name", "Address", "Phone Number"
                }
        ));
        tableNhanvien.getColumnModel().getColumn(3).setPreferredWidth(121);
        scrollPane_Nhanvien.setViewportView(tableNhanvien);
        showNhanVien(NhanVienDao.findAll());



        JPanel panelKhachHang = new JPanel();
        panelKhachHang.setBackground(new Color(0, 136, 202));
        panelNguoiDung.add(panelKhachHang, "KhachHang");
        panelKhachHang.setLayout(null);

        JLabel lblQuanliKhachHang = new JLabel("CUSTOMER MANAGEMENT");
        lblQuanliKhachHang.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/customer.png")));
        lblQuanliKhachHang.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 60));
        lblQuanliKhachHang.setBounds(257, 26, 766, 90);
        panelKhachHang.add(lblQuanliKhachHang);

        JLabel lblMaKhachHang = new JLabel("Customer Code");
        lblMaKhachHang.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblMaKhachHang.setBounds(339, 126, 189, 24);
        panelKhachHang.add(lblMaKhachHang);

        tf_MaKhachHang = new JTextField();
        tf_MaKhachHang.setBounds(538, 126, 240, 24);
        panelKhachHang.add(tf_MaKhachHang);
        tf_MaKhachHang.setColumns(10);

        JLabel lblCCCDKhachHang = new JLabel("CCCD/CMND");
        lblCCCDKhachHang.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblCCCDKhachHang.setBounds(339, 178, 134, 24);
        panelKhachHang.add(lblCCCDKhachHang);

        tf_CCCD_CMND = new JTextField();
        tf_CCCD_CMND.setColumns(10);
        tf_CCCD_CMND.setBounds(538, 181, 240, 25);
        panelKhachHang.add(tf_CCCD_CMND);

        JLabel lbltenKhachHang = new JLabel("Customer Name");
        lbltenKhachHang.setFont(new Font("Tahoma", Font.BOLD, 18));
        lbltenKhachHang.setBounds(339, 233, 189, 24);
        panelKhachHang.add(lbltenKhachHang);

        tf_TenKhachHang = new JTextField();
        tf_TenKhachHang.setColumns(10);
        tf_TenKhachHang.setBounds(538, 237, 240, 24);
        panelKhachHang.add(tf_TenKhachHang);

        JLabel lblSodienthoai = new JLabel("Phone Number");
        lblSodienthoai.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblSodienthoai.setBounds(339, 285, 184, 24);
        panelKhachHang.add(lblSodienthoai);

        tf_SĐTkhachhang = new JTextField();
        tf_SĐTkhachhang.setColumns(10);
        tf_SĐTkhachhang.setBounds(538, 289, 240, 24);
        panelKhachHang.add(tf_SĐTkhachhang);

        JButton btnaddKH = new JButton("Add");
        btnaddKH.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        btnaddKH.setBounds(255, 344, 134, 43);
        panelKhachHang.add(btnaddKH);
        btnaddKH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy dữ liệu từ các trường nhập liệu
                String maKhachHang = tf_MaKhachHang.getText().trim();
                String cccd = tf_CCCD_CMND.getText().trim();
                String tenKhachHang = tf_TenKhachHang.getText().trim();
                String soDienThoai = tf_SĐTkhachhang.getText().trim();

                // Kiểm tra xem các trường có bị trống không
                if (maKhachHang.isEmpty() || cccd.isEmpty() || tenKhachHang.isEmpty() || soDienThoai.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin khách hàng!");
                    return;  // Dừng lại nếu có trường bị trống
                }

                try {
                    // Tạo đối tượng KhachHang và gán dữ liệu từ các trường nhập liệu
                    KhachHang kh = new KhachHang();
                    kh.setMaKhachHang(maKhachHang);  // Gán mã khách hàng
                    kh.setCCCD(cccd);  // Gán CCCD/CMND
                    kh.setTenKhachHang(tenKhachHang);  // Gán tên khách hàng
                    kh.setSodienthoai(soDienThoai);  // Gán số điện thoại

                    // Thêm khách hàng vào cơ sở dữ liệu
                    KhachHangDao.insert(kh);
                    JOptionPane.showMessageDialog(null, "Thêm thành công!!");
                    showDataKH(KhachHangDao.findAll());  // Cập nhật lại bảng hiển thị
                } catch (Exception ex) {
                    // Xử lý lỗi
                    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra khi thêm khách hàng.");
                }
            }
        });

        JButton btnxoaKH = new JButton("Delete");
        btnxoaKH.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        btnxoaKH.setBounds(463, 344, 134, 43);
        panelKhachHang.add(btnxoaKH);
        btnxoaKH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy dữ liệu từ các trường nhập liệu
                String maKhachHang = tf_MaKhachHang.getText().trim();

                // Kiểm tra xem mã khách hàng có bị trống không
                if (maKhachHang.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã khách hàng cần xóa!");
                    return;  // Dừng lại nếu mã khách hàng trống
                }

                try {
                    // Tạo đối tượng KhachHang và gán mã khách hàng
                    KhachHang kh = new KhachHang();
                    kh.setMaKhachHang(maKhachHang);

                    // Gọi phương thức xóa khách hàng trong cơ sở dữ liệu
                    KhachHangDao.delete(kh);
                    JOptionPane.showMessageDialog(null, "Xóa thành công!");
                    showDataKH(KhachHangDao.findAll());  // Cập nhật lại bảng hiển thị
                } catch (Exception ex) {
                    // Xử lý các lỗi khi xóa
                    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra khi xóa khách hàng.");
                }
            }
        });

        JButton btnupdateKH = new JButton("Update");
        btnupdateKH.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        btnupdateKH.setBounds(657, 344, 134, 43);
        panelKhachHang.add(btnupdateKH);
        btnupdateKH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy dữ liệu từ các trường nhập liệu
                String maKhachHang = tf_MaKhachHang.getText().trim();
                String cccd = tf_CCCD_CMND.getText().trim();
                String tenKhachHang = tf_TenKhachHang.getText().trim();
                String soDienThoai = tf_SĐTkhachhang.getText().trim();

                // Kiểm tra xem các trường có bị trống không
                if (maKhachHang.isEmpty() || cccd.isEmpty() || tenKhachHang.isEmpty() || soDienThoai.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin khách hàng!");
                    return;  // Dừng lại nếu có trường bị trống
                }

                try {
                    // Tạo đối tượng KhachHang và gán dữ liệu từ các trường nhập liệu
                    KhachHang kh = new KhachHang();
                    kh.setMaKhachHang(maKhachHang);  // Gán mã khách hàng
                    kh.setCCCD(cccd);  // Gán CCCD/CMND
                    kh.setTenKhachHang(tenKhachHang);  // Gán tên khách hàng
                    kh.setSodienthoai(soDienThoai);  // Gán số điện thoại

                    // Cập nhật thông tin khách hàng trong cơ sở dữ liệu
                    KhachHangDao.update(kh);
                    JOptionPane.showMessageDialog(null, "Chỉnh sửa thông tin khách hàng thành công!");
                    showDataKH(KhachHangDao.findAll());  // Cập nhật lại bảng hiển thị
                } catch (Exception ex) {
                    // Xử lý lỗi khi cập nhật
                    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra khi cập nhật khách hàng.");
                }
            }
        });

        JButton btnresetCus = new JButton("Reset");
        btnresetCus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        btnresetCus.setBounds(848, 344, 134, 43);
        panelKhachHang.add(btnresetCus);
        btnresetCus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Đặt lại các trường nhập liệu (JTextField)
                tf_MaKhachHang.setText(""); // Reset mã khách hàng
                tf_CCCD_CMND.setText(""); // Reset CCCD/CMND
                tf_TenKhachHang.setText(""); // Reset tên khách hàng
                tf_SĐTkhachhang.setText(""); // Reset số điện thoại khách hàng

                // Hiển thị lại danh sách khách hàng
                showDataKH(KhachHangDao.findAll()); // Hiển thị lại danh sách khách hàng
            }
        });

        JScrollPane scrollKhachHang = new JScrollPane();
        scrollKhachHang.setBounds(0, 431, 1176, 280);
        panelKhachHang.add(scrollKhachHang);

        tableKhachHang = new JTable();
        tableKhachHang.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                },
                new String[] {
                        "Customer Code", "CCCD/CMND", "Customer Name", "Phone Number"
                }
        ));
        tableKhachHang.getColumnModel().getColumn(0).setPreferredWidth(92);
        tableKhachHang.getColumnModel().getColumn(2).setPreferredWidth(94);
        tableKhachHang.getColumnModel().getColumn(3).setPreferredWidth(99);
        scrollKhachHang.setViewportView(tableKhachHang);
        showDataKH(KhachHangDao.findAll());


        JPanel panelTraCuuChuyenBay = new JPanel();
        panelTraCuuChuyenBay.setBackground(new Color(0, 128, 192));
        panelNguoiDung.add(panelTraCuuChuyenBay, "Tracuuchuyenbay");
        panelTraCuuChuyenBay.setLayout(null);

        JLabel lbltracuuchuyenBay = new JLabel("FLIGHT SEARCH");
        lbltracuuchuyenBay.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/find.png")));
        lbltracuuchuyenBay.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 51));
        lbltracuuchuyenBay.setBounds(411, 24, 460, 128);
        panelTraCuuChuyenBay.add(lbltracuuchuyenBay);

        JLabel lblsanbaydiFS = new JLabel("Departure Airport");
        lblsanbaydiFS.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblsanbaydiFS.setBounds(114, 150, 200, 25);
        panelTraCuuChuyenBay.add(lblsanbaydiFS);

        JComboBox cb_sanbaydiFS = new JComboBox(sb);
        cb_sanbaydiFS.setBounds(324, 156, 192, 21);
        panelTraCuuChuyenBay.add(cb_sanbaydiFS);

        JLabel lblsanbaydenFS = new JLabel("Arrival Airport");
        lblsanbaydenFS.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblsanbaydenFS.setBounds(601, 150, 200, 25);
        panelTraCuuChuyenBay.add(lblsanbaydenFS);

        JComboBox cBsanbaydenFS = new JComboBox(sb);
        cBsanbaydenFS.setBounds(837, 156, 210, 21);
        panelTraCuuChuyenBay.add(cBsanbaydenFS);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(0, 418, 1176, 293);
        panelTraCuuChuyenBay.add(scrollPane_2);


        JLabel lblFlightDate = new JLabel("Flight Date ( dd/mm/yy )");
        lblFlightDate.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblFlightDate.setBounds(52, 230, 262, 25);
        panelTraCuuChuyenBay.add(lblFlightDate);

        tf_FlightDateFS = new JTextField();
        tf_FlightDateFS.setBounds(324, 230, 192, 26);
        panelTraCuuChuyenBay.add(tf_FlightDateFS);
        tf_FlightDateFS.setColumns(10);

        JLabel lblGioBayFS = new JLabel("Flight Time (hh:mm) ");
        lblGioBayFS.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblGioBayFS.setBounds(601, 230, 228, 25);
        panelTraCuuChuyenBay.add(lblGioBayFS);

        tf_FlightTimeFS = new JTextField();
        tf_FlightTimeFS.setColumns(10);
        tf_FlightTimeFS.setBounds(838, 234, 209, 26);
        panelTraCuuChuyenBay.add(tf_FlightTimeFS);

        JButton btnResetFS = new JButton("Reset");
        btnResetFS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        btnResetFS.setBounds(324, 295, 192, 57);
        panelTraCuuChuyenBay.add(btnResetFS);
        btnResetFS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Đặt lại các trường nhập liệu (JTextField)
                tf_FlightDateFS.setText(""); // Reset ngày bay
                tf_FlightTimeFS.setText(""); // Reset giờ bay

                // Đặt lại các combobox (JComboBox)
                cb_sanbaydiFS.setSelectedIndex(0); // Chọn lại giá trị mặc định cho sân bay đi
                cBsanbaydenFS.setSelectedIndex(0); // Chọn lại giá trị mặc định cho sân bay đến

            }
        });

        JButton btnTraCuuFS = new JButton("Find");
        btnTraCuuFS.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/findsmall.png")));
        btnTraCuuFS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        btnTraCuuFS.setBounds(635, 295, 192, 57);
        panelTraCuuChuyenBay.add(btnTraCuuFS);
        btnTraCuuFS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy giá trị từ các trường nhập liệu
                String sanBayDi = cb_sanbaydiFS.getSelectedItem().toString(); // Lấy sân bay đi từ combobox
                String sanBayDen = cBsanbaydenFS.getSelectedItem().toString(); // Lấy sân bay đến từ combobox
                String ngayBay = tf_FlightDateFS.getText(); // Lấy ngày bay từ JTextField
                String gioBay = tf_FlightTimeFS.getText(); // Lấy giờ bay từ JTextField

                // Kiểm tra nếu các trường dữ liệu trống
                if (sanBayDi.isEmpty() || sanBayDen.isEmpty() || ngayBay.isEmpty() || gioBay.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin tìm kiếm!");
                    return; // Dừng thực hiện nếu có trường trống
                }

                try {
                    // Gọi phương thức tìm kiếm chuyến bay
                    List<LichBay> lichBays = LichBayDao.findFlights(sanBayDi, sanBayDen, ngayBay, gioBay);

                    // Kiểm tra nếu không có chuyến bay nào được tìm thấy
                    if (lichBays.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Không tìm thấy chuyến bay nào!");
                    } else {
                        // Hiển thị kết quả lên bảng tableFS
                        showLichBayFSTable(lichBays);
                    }
                } catch (Exception ex) {
                    // Xử lý lỗi khi tìm kiếm chuyến bay
                    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra khi tìm kiếm chuyến bay.");
                }
            }
        });

        tableFS = new JTable();
        tableFS.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                },
                new String[] {
                        "Flight Code", "Fight Date", "Flight Time", "Departure Airport", "Arrival Airport", "Empty Business Class Seats", "Empty Economy Class Seats"
                }
        ));
        tableFS.getColumnModel().getColumn(3).setPreferredWidth(99);
        tableFS.getColumnModel().getColumn(5).setPreferredWidth(136);
        tableFS.getColumnModel().getColumn(6).setPreferredWidth(146);
        scrollPane_2.setViewportView(tableFS);


        JPanel panelTraCuuTTKhachHang = new JPanel();
        panelTraCuuTTKhachHang.setBackground(new Color(0, 128, 192));
        panelNguoiDung.add(panelTraCuuTTKhachHang, "tracuuthongtinkhachhang");
        panelTraCuuTTKhachHang.setLayout(null);

        JLabel lbltracuuttkhachhang = new JLabel("CUSTOMER SEARCH");
        lbltracuuttkhachhang.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/find.png")));
        lbltracuuttkhachhang.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 72));
        lbltracuuttkhachhang.setBounds(316, 97, 676, 86);
        panelTraCuuTTKhachHang.add(lbltracuuttkhachhang);

        JLabel lblMaKhachhangtracuuttKH = new JLabel("Customer Code");
        lblMaKhachhangtracuuttKH.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblMaKhachhangtracuuttKH.setBounds(188, 228, 148, 30);
        panelTraCuuTTKhachHang.add(lblMaKhachhangtracuuttKH);

        tf_TracuumaKHCS = new JTextField();
        tf_TracuumaKHCS.setBounds(346, 233, 209, 28);
        panelTraCuuTTKhachHang.add(tf_TracuumaKHCS);
        tf_TracuumaKHCS.setColumns(10);

        JLabel lblCCCDtracuuttKH = new JLabel("CCCD/CMND");
        lblCCCDtracuuttKH.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblCCCDtracuuttKH.setBounds(637, 228, 148, 30);
        panelTraCuuTTKhachHang.add(lblCCCDtracuuttKH);

        tf_CCCD_CMNDtracuuttinKH = new JTextField();
        tf_CCCD_CMNDtracuuttinKH.setColumns(10);
        tf_CCCD_CMNDtracuuttinKH.setBounds(785, 228, 209, 28);
        panelTraCuuTTKhachHang.add(tf_CCCD_CMNDtracuuttinKH);

        JScrollPane scrollPane_3 = new JScrollPane();
        scrollPane_3.setBounds(0, 421, 1176, 300);
        panelTraCuuTTKhachHang.add(scrollPane_3);

        JButton btnTraCuuCus = new JButton("SEARCH");
        btnTraCuuCus.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/findsmall.png")));
        btnTraCuuCus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
        btnTraCuuCus.setBounds(725, 316, 185, 60);
        panelTraCuuTTKhachHang.add(btnTraCuuCus);
        btnTraCuuCus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String maKhachHang = tf_TracuumaKHCS.getText().trim(); // Lấy mã khách hàng từ JTextField
                String soCMND = tf_CCCD_CMNDtracuuttinKH.getText().trim(); // Lấy số CCCD từ JTextField

                // Kiểm tra nếu cả hai trường đều rỗng
                if (maKhachHang.isEmpty() && soCMND.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập Mã khách hàng hoặc Số CCCD/CMND để tìm kiếm.");
                    return; // Dừng hàm nếu không có thông tin nhập vào
                }

                // Khởi tạo đối tượng DAO để gọi phương thức searchCustomer
                TracuuThongTinKhachHangDao dao = new TracuuThongTinKhachHangDao();
                List<TracuuThongTinKhachHang> listTTKH = dao.searchCustomer(maKhachHang, soCMND);

                // Kiểm tra nếu không tìm thấy khách hàng
                if (listTTKH.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Không tìm thấy khách hàng khớp với thông tin.");
                } else {
                    // Hiển thị thông tin khách hàng lên JTable
                    showThongTinKhachHang(listTTKH);
                }
            }
        });

        JButton btnResetTraCuuCus = new JButton("RESET");
        btnResetTraCuuCus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
        btnResetTraCuuCus.setBounds(370, 316, 185, 60);
        panelTraCuuTTKhachHang.add(btnResetTraCuuCus);
        btnResetTraCuuCus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf_TracuumaKHCS.setText(""); // Reset mã khách hàng
                tf_CCCD_CMNDtracuuttinKH.setText(""); // Reset số CCCD/CMND
            }
        });



        tableCS = new JTable();
        tableCS.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                        "Ticket Code", "Customer Code", "CCCD/CMND", "Customer Name", "Flight Code", "Departure Airport", "Arrial Airport", "Ticket Class", "Ticket Price", "Number of Seats", "Total Amount", "Booking Date", "Payment"
                }
        ));
        tableCS.getColumnModel().getColumn(1).setPreferredWidth(95);
        tableCS.getColumnModel().getColumn(3).setPreferredWidth(103);
        tableCS.getColumnModel().getColumn(5).setPreferredWidth(98);
        tableCS.getColumnModel().getColumn(9).setPreferredWidth(96);
        scrollPane_3.setViewportView(tableCS);


        JPanel panelThongKe = new JPanel();
        panelNguoiDung.add(panelThongKe, "ThongKe");
        panelThongKe.setLayout(null);

        JPanel panelChart = new JPanel();
        panelChart.setLayout(new BorderLayout());  // Sử dụng BorderLayout hoặc layout phù hợp
        panelThongKe.add(panelChart, BorderLayout.CENTER);  // Đảm bảo thêm panelChart vào đúng vị trí trong panelThongKe

        JPanel panelbtnThongke = new JPanel();
        panelbtnThongke.setBackground(new Color(0, 142, 142));
        panelbtnThongke.setBounds(52, 481, 1099, 204);
        panelThongKe.add(panelbtnThongke);
        panelbtnThongke.setLayout(null);

        JButton btnPieChart_BvsE = new JButton("PieChart_Business and Economy Class");
        btnPieChart_BvsE.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/piechart.png")));
        btnPieChart_BvsE.setFont(new Font("Segoe UI Black", Font.PLAIN, 27));
        btnPieChart_BvsE.setBounds(45, 114, 619, 73);
        panelbtnThongke.add(btnPieChart_BvsE);


        JButton btnBarChartDoanhThu = new JButton("BarChart_Revenue");
        btnBarChartDoanhThu.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/barchart.png")));
        btnBarChartDoanhThu.setFont(new Font("Segoe UI Black", Font.PLAIN, 27));
        btnBarChartDoanhThu.setBounds(723, 116, 353, 68);
        panelbtnThongke.add(btnBarChartDoanhThu);

        JLabel lbltieudeThongKe = new JLabel("STATISTICAL REPORT");
        lbltieudeThongKe.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/thongke.png")));
        lbltieudeThongKe.setBounds(58, 20, 1014, 78);
        panelbtnThongke.add(lbltieudeThongKe);
        lbltieudeThongKe.setForeground(new Color(255, 255, 255));
        lbltieudeThongKe.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 70));

        JLabel lblhinhthongke = new JLabel("");
        lblhinhthongke.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/maybaythongke.jpg")));
        lblhinhthongke.setBounds(0, 0, 1176, 731);
        panelThongKe.add(lblhinhthongke);

        JPanel panelThanhtoan = new JPanel();
        panelThanhtoan.setBackground(new Color(0, 64, 128));
        panelNguoiDung.add(panelThanhtoan, "thanhtoan");
        panelThanhtoan.setLayout(null);

        JLabel lbltieudethanhtoan = new JLabel("PAYMENT ");
        lbltieudethanhtoan.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/payment.png")));
        lbltieudethanhtoan.setFont(new Font("Segoe UI Black", Font.BOLD, 80));
        lbltieudethanhtoan.setForeground(new Color(255, 255, 255));
        lbltieudethanhtoan.setBounds(332, 22, 615, 98);
        panelThanhtoan.add(lbltieudethanhtoan);

        JLabel lblhinhQR = new JLabel("");
        lblhinhQR.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/qrthanhtoan.jpg")));
        lblhinhQR.setBounds(168, 144, 369, 520);
        panelThanhtoan.add(lblhinhQR);

        JPanel panelttinthanhtoan = new JPanel();
        panelttinthanhtoan.setBackground(new Color(227, 227, 227));
        panelttinthanhtoan.setBounds(596, 299, 467, 210);
        panelThanhtoan.add(panelttinthanhtoan);
        panelttinthanhtoan.setLayout(null);

        JLabel lbltieude = new JLabel("PAYMENT INFORMATION");
        lbltieude.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 41));
        lbltieude.setBounds(33, 22, 434, 52);
        panelttinthanhtoan.add(lbltieude);

        JLabel lbltenQR = new JLabel("Fullname: NGUYEN VAN PHUC");
        lbltenQR.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
        lbltenQR.setBounds(33, 84, 378, 45);
        panelttinthanhtoan.add(lbltenQR);

        JLabel lblstk = new JLabel("ACOUNT NUMBER: 1031077694");
        lblstk.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
        lblstk.setBounds(33, 139, 417, 35);
        panelttinthanhtoan.add(lblstk);

        JButton btnbackQR = new JButton("BACK");
        btnbackQR.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
        btnbackQR.setBounds(924, 610, 139, 36);
        panelThanhtoan.add(btnbackQR);


        JLabel lblhinhnenQR = new JLabel("");
        lblhinhnenQR.setIcon(new ImageIcon(NguoiDung.class.getResource("/image/maybayQR.jpg")));
        lblhinhnenQR.setBounds(0, 0, 1176, 711);
        panelThanhtoan.add(lblhinhnenQR);
        btnBarChartDoanhThu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tạo một biểu đồ Bar và lấy ChartPanel từ BarChart
                DoanhThu_BarChart dt = new DoanhThu_BarChart();
                ChartPanel barChartPanel = dt.getBarChart();  // Lấy ChartPanel của BarChart

                // Xóa các component cũ trong panelChart
                panelChart.removeAll();
                panelChart.add(barChartPanel);  // Thêm biểu đồ Bar vào panelChart
                panelChart.revalidate();
                panelChart.repaint();  // Cập nhật giao diện
            }
        });
        btnPieChart_BvsE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tạo biểu đồ Pie và lấy ChartPanel từ PieChart
                EvsB_Class_PieChart eb = new EvsB_Class_PieChart();
                ChartPanel pieChartPanel = eb.getpieChart();  // Lấy ChartPanel của PieChart

                // Xóa các component cũ trong panelChart
                panelChart.removeAll();
                panelChart.add(pieChartPanel);  // Thêm ChartPanel của PieChart vào panelChart
                panelChart.revalidate();
                panelChart.repaint();  // Cập nhật giao diện
            }
        });
        // Button for Trang chủ
        JButton btnTrangchu = new JButton("HOME");
        btnTrangchu.setBackground(new Color(215, 215, 215));
        btnTrangchu.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 17));
        btnTrangchu.setBounds(0, 205, 295, 60);
        contentPane.add(btnTrangchu);
        btnTrangchu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "Trangchu");
            }
        });

        // Button for Dat Ve
        JButton btnDatVe = new JButton("TICKET");
        btnDatVe.setBackground(new Color(215, 215, 215));
        btnDatVe.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 17));
        btnDatVe.setBounds(0, 265, 295, 60);
        contentPane.add(btnDatVe);
        btnDatVe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "DatVe");
            }
        });

        // Button for Lich Bay
        JButton btnLichBay = new JButton("FLIGHT SCHEDULE");
        btnLichBay.setBackground(new Color(215, 215, 215));
        btnLichBay.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 17));
        btnLichBay.setBounds(0, 323, 295, 60);
        contentPane.add(btnLichBay);
        btnLichBay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "LichBay");
            }
        });

        // Button for Nhân Viên
        JButton btnNhanVien = new JButton("STAFF");
        btnNhanVien.setBackground(new Color(215, 215, 215));
        btnNhanVien.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 19));
        btnNhanVien.setBounds(0, 377, 295, 60);
        contentPane.add(btnNhanVien);
        btnNhanVien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "NhanVien");
            }
        });

        // Button for Khách Hàng
        JButton btnKhachHang = new JButton("CUSTOMER");
        btnKhachHang.setBackground(new Color(215, 215, 215));
        btnKhachHang.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 17));
        btnKhachHang.setBounds(0, 434, 295, 61);
        contentPane.add(btnKhachHang);
        btnKhachHang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "KhachHang");
            }
        });


        // Button for Báo Cáo Thống Kê
        JButton btnBaoCaoThongKe = new JButton("STATISTICAL REPORT");
        btnBaoCaoThongKe.setBackground(new Color(215, 215, 215));
        btnBaoCaoThongKe.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 16));
        btnBaoCaoThongKe.setBounds(0, 608, 295, 60);
        contentPane.add(btnBaoCaoThongKe);
        btnBaoCaoThongKe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "ThongKe");
            }
        });


        JButton btnTracuuchuyenbay = new JButton("FLIGHT SEARCH");
        btnTracuuchuyenbay.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 17));
        btnTracuuchuyenbay.setBackground(new Color(215, 215, 215));
        btnTracuuchuyenbay.setBounds(0, 492, 295, 61);
        contentPane.add(btnTracuuchuyenbay);
        btnTracuuchuyenbay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "Tracuuchuyenbay");
            }
        });

        JButton btnttkhachhang = new JButton("CUSTOMER SEARCH");
        btnttkhachhang.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 17));
        btnttkhachhang.setBackground(new Color(215, 215, 215));
        btnttkhachhang.setBounds(0, 548, 295, 61);
        contentPane.add(btnttkhachhang);
        btnttkhachhang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelNguoiDung, "tracuuthongtinkhachhang");
            }
        });
        // Button for Đăng Xuất
        JButton btnDangxuat = new JButton("LOG OUT");
        btnDangxuat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NguoiDung.this.dispose();
                DangNhap dn = new DangNhap();
                dn.setVisible(true);
            }
        });
        btnDangxuat.setBackground(new Color(255, 72, 72));
        btnDangxuat.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 19));
        btnDangxuat.setBounds(0, 668, 295, 56);
        contentPane.add(btnDangxuat);


    }
    public void showDataKH(List<KhachHang> kh) {
        DefaultTableModel tableModel = (DefaultTableModel) tableKhachHang.getModel();
        tableModel.setRowCount(0); // Xóa dữ liệu cũ trong bảng
        kh.forEach(khachHang -> {
            tableModel.addRow(new Object[]{
                    khachHang.getMaKhachHang(),
                    khachHang.getCCCD(),
                    khachHang.getTenKhachHang(),
                    khachHang.getSodienthoai()
            });
        });
    }
    public void showPhieuDatKH(List<PhieuDatChoKhachHang> phieuDatList) {
        // Tạo danh sách tạm để lưu dữ liệu
        List<PhieuDatChoKhachHang> listPhieu = new ArrayList<>();
        listPhieu = phieuDatList;

        // Lấy mô hình bảng
        DefaultTableModel tableModel;
        tablePhieuDat.getModel();
        tableModel = (DefaultTableModel) tablePhieuDat.getModel();

        // Xóa dữ liệu cũ trong bảng
        tableModel.setRowCount(0);

        // Duyệt danh sách và thêm từng dòng vào bảng
        listPhieu.forEach((phieu) -> {
            tableModel.addRow(new Object[]{
                    phieu.getMaPhieu(),
                    phieu.getMaKhachHang(),
                    phieu.getMaChuyenBay(),
                    phieu.getHangVe(),
                    phieu.getGiaVe(),
                    phieu.getSoGheDat(),
                    phieu.getThanhTien(),
                    phieu.getNgayDat(),
                    phieu.getTinhTrang()
            });
        });
    }
    public void showLichBay(List<LichBay> lichBayList) {
        DefaultTableModel tableModel = (DefaultTableModel) tableLichbay.getModel();
        tableModel.setRowCount(0); // Reset lại bảng trước khi thêm dòng mới

        // Duyệt qua danh sách các chuyến bay và thêm vào bảng
        for (LichBay lichBay : lichBayList) {
            tableModel.addRow(new Object[]{
                    lichBay.getMaChuyenBay(),
                    lichBay.getSanBayDi(),
                    lichBay.getSanBayDen(),
                    lichBay.getNgayBay(),
                    lichBay.getGioBay(),
                    lichBay.getSoLuongHangGheThuongGia(),
                    lichBay.getSoLuongHangGheThuong()
            });
        }
        System.out.println(lichBayList);
    }
    public void showNhanVien(List<NhanVien> nhanVienList) {
        List<NhanVien> listNhanVien = new ArrayList<>();
        listNhanVien = nhanVienList;
        DefaultTableModel tableModel = (DefaultTableModel) tableNhanvien.getModel();
        tableModel.setRowCount(0);
        listNhanVien.forEach((nhanVien) -> {
            tableModel.addRow(new Object[]{
                    nhanVien.getMaNhanvien(),
                    nhanVien.getTennhanVien(),
                    nhanVien.getSodienthoai(),
                    nhanVien.getDiachi()
            });
        });
    }
    private void showLichBayFSTable(List<LichBay> lichBays) {
        // Cập nhật lại dữ liệu trong bảng
        DefaultTableModel model = (DefaultTableModel) tableFS.getModel();

        // Xóa tất cả dữ liệu cũ trong bảng
        model.setRowCount(0);

        // Duyệt qua danh sách lichBays và thêm vào bảng
        for (LichBay lichBay : lichBays) {
            Object[] row = new Object[7];
            row[0] = lichBay.getMaChuyenBay();
            row[1] = lichBay.getNgayBay();
            row[2] = lichBay.getGioBay();
            row[3] = lichBay.getSanBayDi();
            row[4] = lichBay.getSanBayDen();
            row[5] = lichBay.getSoLuongHangGheThuongGiaCon();
            row[6] = lichBay.getSoLuongHangGheThuongCon();
            model.addRow(row); // Thêm dòng vào bảng
        }
    }
    public void showThongTinKhachHang(List<TracuuThongTinKhachHang> listTTKH) {
        List<TracuuThongTinKhachHang> list = listTTKH;
        DefaultTableModel tableModel = (DefaultTableModel) tableCS.getModel();
        tableModel.setRowCount(0);  // Xóa hết dữ liệu trong bảng trước khi thêm dữ liệu mới

        // Duyệt qua danh sách các đối tượng TracuuThongTinKhachHang và thêm vào bảng
        list.forEach((ttkh) -> {
            tableModel.addRow(new Object[]{
                    ttkh.getMaPhieu(),         // Mã vé
                    ttkh.getMaKhachHang(),     // Mã khách hàng
                    ttkh.getSoCMND(),          // CCCD/CMND
                    ttkh.getTenKhachHang(),    // Tên khách hàng
                    ttkh.getMaChuyenBay(),     // Mã chuyến bay
                    ttkh.getSanBayDi(),        // Sân bay khởi hành
                    ttkh.getSanBayDen(),       // Sân bay đến (Arrial)
                    ttkh.getHangVe(),          // Hạng vé
                    ttkh.getGiaVe(),           // Giá vé
                    ttkh.getSoGheDat(),        // Số ghế
                    ttkh.getThanhTien(),       // Tổng số tiền
                    ttkh.getNgayDat(),         // Ngày đặt chỗ
                    ttkh.getTinhTrang()        // Thanh toán
            });
        });
    }
}
