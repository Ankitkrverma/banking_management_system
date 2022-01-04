package banking_management_system;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        login log = new login();

        log.setBounds(10,10,700,600);
        log.setResizable(false);
        log.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        log.setVisible(true);
        frame.add(log)

    }


}
