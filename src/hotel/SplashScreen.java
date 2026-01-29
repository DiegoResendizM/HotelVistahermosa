package hotel.vistahermosa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashScreen extends JFrame {

    public SplashScreen() {
        setTitle("Hotel Vista Hermosa");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(255, 255, 255));

        JLabel lblBienvenido = new JLabel("BIENVENIDO", SwingConstants.CENTER);
        lblBienvenido.setFont(new Font("Arial Black", Font.BOLD, 32));
        lblBienvenido.setForeground(new Color(0, 102, 153));
        lblBienvenido.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));

        JLabel lblLogo = new JLabel(new ImageIcon(getClass().getResource("/logo/logo.png")));
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblHotel = new JLabel("Hotel Vista Hermosa", SwingConstants.CENTER);
        lblHotel.setFont(new Font("Segoe UI", Font.ITALIC, 16));
        lblHotel.setForeground(new Color(100, 100, 100));
        lblHotel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        mainPanel.add(lblBienvenido, BorderLayout.NORTH);
        mainPanel.add(lblLogo, BorderLayout.CENTER);
        mainPanel.add(lblHotel, BorderLayout.SOUTH);
        
        add(mainPanel);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuPrincipal().setVisible(true);
                dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SplashScreen().setVisible(true);
        });
    }
}