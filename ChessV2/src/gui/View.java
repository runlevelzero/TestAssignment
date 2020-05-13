package gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 @author Jeffrey Ng
 @created 2020-05-13 07:48 */
public class View extends JPanel implements ActionListener {

    Engine chessEngine;
    ChangeListener chessEngineListener;

    public View(Engine chessEngine) {
        super();
        this.setPreferredSize(new Dimension(Frame.FRAME_WIDTH, Frame.FRAME_HEIGHT));
        this.setLayout(new BorderLayout());
        this.chessEngine = chessEngine;

        chessEngineListener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                update();
            }
        };

        init();
    }

    private void init() {

    }

    private void update() {
        // repaint all models (engines)
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
