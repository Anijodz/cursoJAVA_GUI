/* Elaborar una aplicación que permita calcular el salario
neto de un trabajador en función del número de horas
trabajadas, pago por hora de trabajo y un descuento fijo al
sueldo bruto del 20%.  */
package calculosalarionetos;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*** ** @author Anijodz Academy */
public class Principal {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
UIManager.setLookAndFeel(new SmartLookAndFeel());          
new interfaz().setVisible(true);
     
    }

    public static void Letras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char l = evt.getKeyChar();
                if (((l < 'a' || l > 'z') && (l < 'A' || l > 'Z') && (l != KeyEvent.VK_SPACE))) {
                    evt.consume();
                }
            }
        });
    }


    public static void Numeros(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                char n = evt.getKeyChar();
                if (n < '0' || n > '9') {
                    evt.consume();
                }
            }
        });
    }


    public static void Decimales(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                int k = (int) evt.getKeyChar();
                if (k >= 46 && k <= 57) {
                    if (k == 46) {
                        String dato = a.getText();
                        int tamanio = dato.length();
                        for (int i = 0; i < tamanio; i++) {
                            if (dato.contains(".")) {
                                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                            }
                        }
                    }
                    if (k == 47) {
                        evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                    }
                } else {
                    evt.setKeyChar((char) KeyEvent.VK_CLEAR);
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
