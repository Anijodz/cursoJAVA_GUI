/*Un número perfecto es un entero positivo, que es igual a
la suma de todos los enteros positivos (excluido el mismo) que
son divisores del número.*/
package numeroperfecto;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NumeroPerfecto {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new AeroLookAndFeel());
        new interfaz().setVisible(true);
    }
   public static void SNumeros(JTextField a) {
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
