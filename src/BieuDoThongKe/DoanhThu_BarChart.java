package BieuDoThongKe;
import dao.CountClassDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class DoanhThu_BarChart extends JFrame {
    private JFreeChart barChart;
    public DoanhThu_BarChart(){
        this.setTitle("Bar Chart");
        this.setSize(1000,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        CategoryDataset dataset = createDataset();
        JFreeChart chart = ChartFactory.createBarChart(
                "REVENUE CHART 2024",
                "Months",
                "Revenue",
                dataset
        );
        NumberAxis numberAxis = (NumberAxis) chart.getCategoryPlot().getRangeAxis();
        DecimalFormat decimalFormat = new DecimalFormat("#,### VNĐ");
        decimalFormat.setDecimalSeparatorAlwaysShown(true);
        numberAxis.setNumberFormatOverride(decimalFormat);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }
    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        int slGheE_T1 = CountClassDAO.getInstance().SlGheE_T1_2024();
        int slGheE_T2 = CountClassDAO.getInstance().SlGheE_T2_2024();
        int slGheE_T3 = CountClassDAO.getInstance().SlGheE_T3_2024();
        int slGheE_T4 = CountClassDAO.getInstance().SlGheE_T4_2024();
        int slGheE_T5 = CountClassDAO.getInstance().SlGheE_T5_2024();
        int slGheE_T6 = CountClassDAO.getInstance().SlGheE_T6_2024();
        int slGheE_T7 = CountClassDAO.getInstance().SlGheE_T7_2024();
        int slGheE_T8 = CountClassDAO.getInstance().SlGheE_T8_2024();
        int slGheE_T9 = CountClassDAO.getInstance().SlGheE_T9_2024();
        int slGheE_T10 = CountClassDAO.getInstance().SlGheE_T10_2024();
        int slGheE_T11 = CountClassDAO.getInstance().SlGheE_T11_2024();
        int slGheE_T12 = CountClassDAO.getInstance().SlGheE_T12_2024();

        int slGheB_T1 = CountClassDAO.getInstance().SlGheB_T1_2024();
        int slGheB_T2 = CountClassDAO.getInstance().SlGheB_T2_2024();
        int slGheB_T3 = CountClassDAO.getInstance().SlGheB_T3_2024();
        int slGheB_T4 = CountClassDAO.getInstance().SlGheB_T4_2024();
        int slGheB_T5 = CountClassDAO.getInstance().SlGheB_T5_2024();
        int slGheB_T6 = CountClassDAO.getInstance().SlGheB_T6_2024();
        int slGheB_T7 = CountClassDAO.getInstance().SlGheB_T7_2024();
        int slGheB_T8 = CountClassDAO.getInstance().SlGheB_T8_2024();
        int slGheB_T9 = CountClassDAO.getInstance().SlGheB_T9_2024();
        int slGheB_T10 = CountClassDAO.getInstance().SlGheB_T10_2024();
        int slGheB_T11 = CountClassDAO.getInstance().SlGheB_T11_2024();
        int slGheB_T12 = CountClassDAO.getInstance().SlGheB_T12_2024();


        int tienT1 = slGheE_T1 * 1500000 + slGheB_T1 * 5000000;
        int tienT2 = slGheE_T2 * 1500000 + slGheB_T2 * 5000000;
        int tienT3 = slGheE_T3 * 1500000 + slGheB_T3 * 5000000;
        int tienT4 = slGheE_T4 * 1500000 + slGheB_T4 * 5000000;
        int tienT5 = slGheE_T5 * 1500000 + slGheB_T5 * 5000000;
        int tienT6 = slGheE_T6 * 1500000 + slGheB_T6 * 5000000;
        int tienT7 = slGheE_T7 * 1500000 + slGheB_T7 * 5000000;
        int tienT8 = slGheE_T8 * 1500000 + slGheB_T8 * 5000000;
        int tienT9 = slGheE_T9 * 1500000 + slGheB_T9 * 5000000;
        int tienT10 = slGheE_T10 * 1500000 + slGheB_T10 * 5000000;
        int tienT11 = slGheE_T11 * 1500000 + slGheB_T11 * 5000000;
        int tienT12 = slGheE_T12 * 1500000 + slGheB_T12 * 5000000;
        // Thêm dữ liệu vào dataset
        dataset.addValue(tienT1, "Month", "January");
        dataset.addValue(tienT2, "Month", "Feb");
        dataset.addValue(tienT3, "Month", "March");
        dataset.addValue(tienT4, "Month", "April");
        dataset.addValue(tienT5, "Month", "May");
        dataset.addValue(tienT6, "Month", "June");
        dataset.addValue(tienT7, "Month", "July");
        dataset.addValue(tienT8, "Month", "Aug");
        dataset.addValue(tienT9, "Month", "Sep");
        dataset.addValue(tienT10, "Month", "Oct");
        dataset.addValue(tienT11, "Month", "Nov");
        dataset.addValue(tienT12, "Month", "Dec");

        return dataset;
    }
    public ChartPanel getBarChart() {
        return new ChartPanel(barChart);
    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new DoanhThu_BarChart();
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
