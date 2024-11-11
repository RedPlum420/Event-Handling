import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Button Game");
        frame.setSize(500, 500);

        JButton button = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton resetbutton = new JButton("Reset");
        JLabel label = new JLabel("0");

        frame.setLayout(new GridLayout(4, 1));

        Font buttonFontBig = new Font("Serif", Font.BOLD, 65);
        label.setFont(buttonFontBig);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);
        frame.add(button);
        frame.add(buttonMinus);
        frame.add(resetbutton);


        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int counter = Integer.parseInt(label.getText());
                counter++;
                label.setText(String.valueOf(counter));
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int counter = Integer.parseInt(label.getText());
                counter--;
                label.setText(String.valueOf(counter));
            }
        });

        resetbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("0");
            }
        });
    }
}


