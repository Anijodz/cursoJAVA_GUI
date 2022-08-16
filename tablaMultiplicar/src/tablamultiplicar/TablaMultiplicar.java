/*Escribir una aplicación que lea un número entero y muestre
la tabla de multiplicar de dicho número */
package tablamultiplicar;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Anijodz Academy
 */
public class TablaMultiplicar {

     public static void main(String[] args) throws UnsupportedLookAndFeelException {
     UIManager.setLookAndFeel(new AcrylLookAndFeel());
           //instanciamos un objeto de la clase interfaz.java
        interfaz vista = new interfaz();
//hacemos visible el formulario que queremos llamar 
        vista.setVisible(true);
           vista.setLocationRelativeTo(null);
        
         vista.  setTitle("Tabla de Multiplicar");
        
         vista.setResizable(false);

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
