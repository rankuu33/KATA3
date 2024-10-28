package software.ulpgc;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JFreeBarChartDisplay barChartDisplay;

    public MainFrame() throws HeadlessException {
        this.setTitle("Chart Viewer");
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createBarChartDisplay());
    }

    private Component createBarChartDisplay() {
        JFreeBarChartDisplay barChartDisplay = new JFreeBarChartDisplay();
        this.barChartDisplay = barChartDisplay;
        return barChartDisplay;
    }

    public BarChartDisplay barChartDisplay() { return barChartDisplay; }
}
