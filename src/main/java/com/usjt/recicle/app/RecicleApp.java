package com.usjt.recicle.app;

import com.usjt.recicle.app.view.TelaLogin;
import javax.swing.SwingUtilities;

public class RecicleApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
}
