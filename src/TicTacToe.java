import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class TicTacToe extends JFrame {
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 400;
    public static final int ROWS = 3;
    public static final int COLUMNS = 3;
    public static final int GRID_SIZE = ROWS * COLUMNS;

    JPanel p = new JPanel();
    XOButton[] buttons = new XOButton[9];

    public TicTacToe() {
        setTitle("TicTacToe");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p.setLayout(new GridLayout(ROWS, COLUMNS));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new XOButton();
            p.add(buttons[i]);
        }
        add(p);


    }

}
