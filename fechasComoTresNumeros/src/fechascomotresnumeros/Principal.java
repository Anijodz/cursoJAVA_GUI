/*Escribir un aplicación que acepte fechas como tres números
(dd, mm, aaaa) y las visualice del modo usual.*/
package fechascomotresnumeros;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;

/**
 @author ANIJODZ ACADEMY
 */
public class Principal{

    public static void main(String[] args) {
          //instanciamos un objeto de la clase interfaz.java
        interfaz obj = new interfaz();

        //establecemos un nombre al formulario.
        obj.setTitle("Fecha en letras");

        //hacemos visible el formulario que queremos llamar 
        obj.setVisible(true);

        //deshabilitar el botón maximizar.
        obj.setResizable(false);

        //centrar el formulario.
        obj.setLocationRelativeTo(null);
    }
    
    
      //crear una funcion para que solo Acepte numeros.
    
    public static void SNumeros(JTextPane a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
//El tipo de datos CHAR almacena datos de carácter en un campo de longitud fija.
//El método getKeyChar siempre devuelve un carácter Unicode válido o CHAR_UNDEFINED.
                char n = evt.getKeyChar();

// en un simple if decimos: que solo resiva si n es menor que 0 o n es mayor que 9. 
//Y de esta manera logramos que el txt acepte sólo números.
                if (n < '0' || n > '9') {
                    evt.consume();
                }
            }
        });
    }
}
