/*Aplicación que permita el ingreso de un número entero y 
muestre en pantalla la siguiente información:
1) Cantidad de cifras, 
2) Suma de cifras impares, 
3) Suma de cifras pares, 
4) Suma total de cifras, 
5) Cifra mayor, 
6) Cifra menor y 
7) Divisores de dicho número.*/
package cifrasdivisoresnumeros;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/*** @author Anijodz Academy*/
public class CifrasDivisoresNumeros {
       public static void main(String[] args) throws UnsupportedLookAndFeelException {
   UIManager.setLookAndFeel(new BernsteinLookAndFeel());
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
    
   
    public void Limpiar(JPanel pl) {
        for (Object o : pl.getComponents()) {
            if (o instanceof JTextField) {
                ((JTextField) o).setText("");
            }
        }

    }
}
