import javax.swing.*;
import java.awt.*;

public class FixedDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("EDT Demo - GOOD Practice");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new FlowLayout());

            JLabel status = new JLabel("Ready");
            JButton button = new JButton("Do Long Operation");

            button.addActionListener(e -> {
                status.setText("Working...");
                button.setEnabled(false);

                // Run the long operation on a background thread
                new Thread(() -> {
                    try {
                        Thread.sleep(5000); // Simulates a long operation off the EDT
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }

                    // Update UI safely back on the EDT
                    SwingUtilities.invokeLater(() -> {
                        status.setText("Done!");
                        button.setEnabled(true);
                    });
                }).start();
            });

            frame.add(button);
            frame.add(status);
            frame.setVisible(true);
        });
    }
}