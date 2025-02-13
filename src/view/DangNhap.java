package view;

import JDBCUtil.JDBCUtil;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
public class DangNhap extends JFrame {

    private static final long serialVersionUID = 1L;
    private CardLayout cardLayout;
    private JTextField jtf_tenDangnhap;
    private JTextField jtf_matKhau;
    private JTextField jtf_CCCD;
    private JTextField jtf_SDT;
    private JTextField jtf_Hovaten;
    private ButtonGroup buttonGroupgioiTinh;
    private JTextField jtf_tdn;
    private JTextField jtf_mk;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DangNhap frame = new DangNhap();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public DangNhap() {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "phuc123tp";
        Statement st;
        ResultSet rs;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 709, 448);
        cardLayout = new CardLayout();
        getContentPane().setLayout(cardLayout);
        this.setLocationRelativeTo(null);

        JPanel panelDangNhapDangKy = new JPanel();
        getContentPane().add(panelDangNhapDangKy, "dangnhapdangky");
        panelDangNhapDangKy.setLayout(null);

        JPanel panelLabelQLVMB = new JPanel();
        panelLabelQLVMB.setBackground(new Color(113, 183, 221));
        panelLabelQLVMB.setForeground(new Color(255, 255, 255));
        panelLabelQLVMB.setBounds(115, 34, 470, 67);
        panelDangNhapDangKy.add(panelLabelQLVMB);
        panelLabelQLVMB.setLayout(null);

        JLabel lblQlvmb = new JLabel("FLIGHT TICKET MANAGEMENT");
        lblQlvmb.setForeground(new Color(255, 255, 255));
        lblQlvmb.setBounds(20, 21, 450, 36);
        panelLabelQLVMB.add(lblQlvmb);
        lblQlvmb.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 23));

        JPanel paneltdnmk = new JPanel();
        paneltdnmk.setBounds(115, 101, 470, 228);
        panelDangNhapDangKy.add(paneltdnmk);
        paneltdnmk.setLayout(null);


        JLabel lbltdn = new JLabel("UserName");
        lbltdn.setBounds(54, 42, 124, 21);
        paneltdnmk.add(lbltdn);
        lbltdn.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblmk = new JLabel("Password");
        lblmk.setBounds(54, 109, 107, 21);
        paneltdnmk.add(lblmk);
        lblmk.setFont(new Font("Tahoma", Font.PLAIN, 20));

        jtf_tdn = new JTextField();
        jtf_tdn.setBounds(171, 41, 240, 31);
        paneltdnmk.add(jtf_tdn);
        jtf_tdn.setColumns(10);

        jtf_mk = new JTextField();
        jtf_mk.setBounds(171, 99, 240, 31);
        paneltdnmk.add(jtf_mk);
        jtf_mk.setColumns(10);

        JButton btnDangKy = new JButton("Register Now !");
        btnDangKy.setBackground(new Color(219, 219, 219));
        btnDangKy.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnDangKy.setBounds(66, 178, 124, 31);
        paneltdnmk.add(btnDangKy);
        JButton btnDangNhap = new JButton("Login");
        btnDangNhap.setBackground(new Color(219, 219, 219));
        btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnDangNhap.setBounds(306, 145, 107, 31);
        paneltdnmk.add(btnDangNhap);

        JLabel lbltbaodangky = new JLabel("You don't have an account yet, please sign up here!");
        lbltbaodangky.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        lbltbaodangky.setBounds(22, 155, 274, 13);
        paneltdnmk.add(lbltbaodangky);
        btnDangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tendangnhap = jtf_tdn.getText();
                String matkhau = jtf_mk.getText();
                if (tendangnhap.isEmpty() || matkhau.isEmpty()) {
                    JOptionPane.showMessageDialog(panelDangNhapDangKy, "Vui lòng nhập tên đăng nhập và mật khẩu.");
                    return;
                }
                try (Connection con = JDBCUtil.getConnection()) {
                    String sql = "SELECT * FROM Admin WHERE tendangnhap = ? AND matkhau = ?";
                    try (PreparedStatement pst = con.prepareStatement(sql)) {
                        pst.setString(1, tendangnhap);
                        pst.setString(2, matkhau);

                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {
                            JOptionPane.showMessageDialog(panelDangNhapDangKy, "Đăng nhập thành công!");
                            // Đóng cửa sổ đăng nhập hiện tại
                            NguoiDung nd = new NguoiDung();
                            nd.setVisible(true);
                            DangNhap.this.dispose();

                        } else {
                            JOptionPane.showMessageDialog(panelDangNhapDangKy, "Tên đăng nhập hoặc mật khẩu sai.");
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(panelDangNhapDangKy, "Lỗi kết nối cơ sở dữ liệu: " + ex.getMessage());
                }
            }
        });
        btnDangKy.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }
            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
            }
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(getContentPane(), "dangKy");
            }
        });

        JLabel lblNenMaybaydkidnhap = new JLabel("");
        lblNenMaybaydkidnhap.setIcon(new ImageIcon(DangNhap.class.getResource("/image/maybaydkidnhap.jpg")));
        lblNenMaybaydkidnhap.setBounds(0, 0, 700, 411);
        panelDangNhapDangKy.add(lblNenMaybaydkidnhap);

        JPanel paneldangKy = new JPanel();
        paneldangKy.setBackground(new Color(0, 130, 191));
        paneldangKy.setForeground(new Color(0, 0, 0));
        getContentPane().add(paneldangKy, "dangKy");
        paneldangKy.setLayout(null);

        JLabel lblDangKy = new JLabel("REGISTER ACCOUNT");
        lblDangKy.setFont(new Font("Stencil", Font.BOLD, 43));
        lblDangKy.setBounds(153, 34, 432, 48);
        paneldangKy.add(lblDangKy);

        JLabel lbltenDangNhap = new JLabel("Username");
        lbltenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 15));
        lbltenDangNhap.setBounds(40, 103, 121, 29);
        paneldangKy.add(lbltenDangNhap);

        JLabel lblCCCD = new JLabel("CCCD/CMND");
        lblCCCD.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblCCCD.setBounds(40, 152, 121, 29);
        paneldangKy.add(lblCCCD);

        JLabel lblHovaTen = new JLabel("Full Name ");
        lblHovaTen.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblHovaTen.setBounds(40, 209, 121, 29);
        paneldangKy.add(lblHovaTen);

        JLabel lblSdt = new JLabel("Phone Number ");
        lblSdt.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblSdt.setBounds(370, 152, 121, 29);
        paneldangKy.add(lblSdt);

        JLabel lblmatKhau = new JLabel("Password");
        lblmatKhau.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblmatKhau.setBounds(370, 103, 121, 29);
        paneldangKy.add(lblmatKhau);

        JLabel lblgioiTinh = new JLabel("Gender");
        lblgioiTinh.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblgioiTinh.setBounds(370, 209, 121, 29);
        paneldangKy.add(lblgioiTinh);

        jtf_tenDangnhap = new JTextField();
        jtf_tenDangnhap.setBounds(153, 109, 168, 22);
        paneldangKy.add(jtf_tenDangnhap);
        jtf_tenDangnhap.setColumns(10);

        jtf_matKhau = new JTextField();
        jtf_matKhau.setColumns(10);
        jtf_matKhau.setBounds(486, 109, 168, 22);
        paneldangKy.add(jtf_matKhau);

        jtf_CCCD = new JTextField();
        jtf_CCCD.setColumns(10);
        jtf_CCCD.setBounds(153, 158, 168, 22);
        paneldangKy.add(jtf_CCCD);

        jtf_SDT = new JTextField();
        jtf_SDT.setColumns(10);
        jtf_SDT.setBounds(486, 158, 168, 22);
        paneldangKy.add(jtf_SDT);

        jtf_Hovaten = new JTextField();
        jtf_Hovaten.setColumns(10);
        jtf_Hovaten.setBounds(153, 209, 168, 22);
        paneldangKy.add(jtf_Hovaten);

        JRadioButton rdbtnNam = new JRadioButton("Male ");
        rdbtnNam.setFont(new Font("Tahoma", Font.BOLD, 10));
        rdbtnNam.setBounds(486, 215, 61, 21);
        paneldangKy.add(rdbtnNam);

        JRadioButton rdbtnNu = new JRadioButton("Female ");
        rdbtnNu.setFont(new Font("Tahoma", Font.BOLD, 10));
        rdbtnNu.setBounds(586, 215, 68, 21);
        paneldangKy.add(rdbtnNu);

        buttonGroupgioiTinh = new ButtonGroup();
        buttonGroupgioiTinh.add(rdbtnNam);
        buttonGroupgioiTinh.add(rdbtnNu);

        JButton btndangKy = new JButton("Register");
        btndangKy.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
        btndangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dk = JOptionPane.showConfirmDialog(paneldangKy, "Bạn có muốn đăng ký không!", "Confirm", JOptionPane.YES_NO_OPTION);
                if (dk != JOptionPane.YES_OPTION) {
                    return;
                }
                String gioiTinh = rdbtnNu.isSelected() ? "Nu" : "Nam";
                String cccd = jtf_CCCD.getText();
                String tendangnhap = jtf_tenDangnhap.getText();
                String matkhau = jtf_matKhau.getText();
                String sodienthoai = jtf_SDT.getText();
                String hovaten = jtf_Hovaten.getText();

                try (Connection con = JDBCUtil.getConnection()) {
                    String sql = "INSERT INTO Admin (cccd, tendangnhap, matkhau, Sodienthoai, Hovaten, Gioitinh) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, cccd);
                    pst.setString(2, tendangnhap);
                    pst.setString(3, matkhau);
                    pst.setString(4, sodienthoai);
                    pst.setString(5, hovaten);
                    pst.setString(6, gioiTinh);

                    int result = pst.executeUpdate();
                    JDBCUtil.closeConnection(con);
                    if (result > 0) {
                        JOptionPane.showMessageDialog(paneldangKy, "Account Registered Successfully");
                    } else {
                        JOptionPane.showMessageDialog(paneldangKy, "Account Registration Failed");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(paneldangKy, "Error: " + ex.getMessage());
                }
            }
        });


        btndangKy.setBackground(new Color(192, 192, 192));
        btndangKy.setBounds(165, 269, 156, 36);
        paneldangKy.add(btndangKy);

        JButton btndangnhap = new JButton("Login ");
        btndangnhap.setBackground(new Color(192, 192, 192));
        btndangnhap.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
        btndangnhap.setBounds(370, 272, 153, 36);
        paneldangKy.add(btndangnhap);
        btndangnhap.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(getContentPane(), "dangnhapdangky");

            }
        });

    }
}
