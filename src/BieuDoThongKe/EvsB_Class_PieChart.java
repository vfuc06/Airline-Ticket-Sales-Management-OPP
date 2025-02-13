package BieuDoThongKe;
import dao.CountClassDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.*;
import java.awt.*;

public class EvsB_Class_PieChart extends JFrame {
    private JFreeChart pieChart;
    public EvsB_Class_PieChart() {

        this.setTitle("PIECHART_ECONOMY AND BUSINESS CLASS 2024");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Tạo PieChart từ dataset
        DefaultPieDataset dataset = createDataset();
        JFreeChart pieChart = ChartFactory.createPieChart(
                "PIECHART_ECONOMY AND BUSINESS CLASS 2024",
                dataset,               // Dữ liệu
                true,                  // Có hiển thị chú thích
                true,                  // Có hiển thị tooltip
                false                  // Không hiển thị URL
        );

        PiePlot plot = (PiePlot) pieChart.getPlot();

        // Tùy chỉnh màu sắc các phân đoạn
        plot.setSectionPaint("Economy Class", new Color(100, 206, 255));
        plot.setSectionPaint("Business Class", new Color(255, 100, 100, 255));

        plot.setSectionOutlinesVisible(false);

        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    // Phương thức tạo dataset cho pie chart
    private DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        int slGheE_T1 = CountClassDAO.getInstance().SlGheE_T1_2024() + CountClassDAO.getInstance().SlGheE_T2_2024() + CountClassDAO.getInstance().SlGheE_T3_2024() +
                CountClassDAO.getInstance().SlGheE_T4_2024() + CountClassDAO.getInstance().SlGheE_T5_2024() + CountClassDAO.getInstance().SlGheE_T6_2024() +
                CountClassDAO.getInstance().SlGheE_T7_2024() + CountClassDAO.getInstance().SlGheE_T8_2024() + CountClassDAO.getInstance().SlGheE_T9_2024() +
                CountClassDAO.getInstance().SlGheE_T10_2024() + CountClassDAO.getInstance().SlGheE_T11_2024() + CountClassDAO.getInstance().SlGheE_T12_2024();

        int slGheB_T1 = CountClassDAO.getInstance().SlGheB_T1_2024() + CountClassDAO.getInstance().SlGheB_T2_2024() + CountClassDAO.getInstance().SlGheB_T3_2024() +
                CountClassDAO.getInstance().SlGheB_T4_2024() + CountClassDAO.getInstance().SlGheB_T5_2024() + CountClassDAO.getInstance().SlGheB_T6_2024() +
                CountClassDAO.getInstance().SlGheB_T7_2024() + CountClassDAO.getInstance().SlGheB_T8_2024() + CountClassDAO.getInstance().SlGheB_T9_2024() +
                CountClassDAO.getInstance().SlGheB_T10_2024() + CountClassDAO.getInstance().SlGheB_T11_2024() + CountClassDAO.getInstance().SlGheB_T12_2024();

        // Thêm dữ liệu vào pie chart (tổng số ghế)
        dataset.setValue("Economy Class", slGheE_T1);
        dataset.setValue("Business Class", slGheB_T1);
        return dataset;
    }
    public ChartPanel getpieChart() {
        return new ChartPanel(pieChart);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new EvsB_Class_PieChart().setVisible(true);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
