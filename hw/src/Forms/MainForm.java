

package Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    public MainForm() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on JForm exit
        this.setTitle("Main Form");
        this.setSize(600, 200);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setVisible(true);

        JButton b1 = new JButton("Show Calender 1"); // Button 1 (Create Calender 1)
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                showNewCalendar();
            }
        });

        JButton b2 = new JButton("Show Calender 2"); // Button 2 (Create Calender 2)
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                showNewCalendar();
            }
        });


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.add(b1);
        panel.add(b2);

        this.add(panel);
    }

    /**
     * Create and show new calender object
     * Todo: This method logs the object HashCode in a text file, after refactoring the code; show warning message if the HashCode of Calender1 doesn't equal Calender2 HashCode
     */
    public void showNewCalendar() {
        SwingCalendar sc1 = SwingCalendar.getInstance();

        Util.Logger.log("Object HC: " + sc1.hashCode()); // Log Calender hash code

    }


}
