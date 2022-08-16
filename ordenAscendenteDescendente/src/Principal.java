/*Elabore una aplicación que permita leer N números de tipo entero, y a 
continuación los visualice ordenados en forma ascendente o descendente.*/
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/***** @author Anijodz Academy *****/
public class Principal {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new HiFiLookAndFeel());
        new interfaz().setVisible(true);
    }

    public static void soloNumeros(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                char n = evt.getKeyChar();
                if (n < '0' || n > '9') {
                    evt.consume();
                }
            }
        });
    }
}