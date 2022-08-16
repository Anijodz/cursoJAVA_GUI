/* */
//Se le declara un paquete.
package boletapagotrabajadoresfabrica;

/*import permite agregar a nuestro proyecto una o varias clases (paquete) según lo necesitemos.*/
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author Anijodz Academy
 */
public class Principal {

    /* Public: permite que el metodo se pueda llamar desde cualquier lugar.
    static: Indica que no es necesario crear una instancia de la clase para acceder al método. 
    void indica que el método main no retorna ningún valor. 
    La forma (String[] args) es la definición de los argumentos que recibe el método main. 
    En este caso se recibe un argumento. 
    Los paréntesis [] indican que el argumentos es un arreglo y la palabra String es el tipo de los elementos 
    del arreglo. */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
         UIManager.setLookAndFeel(new AluminiumLookAndFeel());
               //instanciamos un objeto de la clase interfaz.java
        interfaz vista = new interfaz();
//hacemos visible el formulario que queremos llamar 
      

     }
//Una letra es cada grafema del alfabeto de un sistema de escritura fonémico. 
    //crear un metodo para que solo Acepte letras.
    public static void Letras(JTextField l) {
        l.addKeyListener(new KeyAdapter() {

            /*keyTyped(KeyEvent e):Se ejecuta cuando el usuario presiona una tecla, pero solo cuando la tecla corresponde 
a caractéres, teclas especiales como F1, F2 entre otras no son identificadas.*/
            @Override
            public void keyTyped(KeyEvent evt) {

//El tipo de datos CHAR almacena datos de carácter en un campo de longitud fija.
//El método getKeyChar siempre devuelve un carácter Unicode válido o CHAR_UNDEFINED.   
                char l = evt.getKeyChar();

// en un simple if decimos: que solo resiva si l es menor que a o l es mayor que z.
//Y de esta manera logramos que el txt acepte sólo letras y espacios.   
//minusculas y o mayusculas.
                if (((l < 'a' || l > 'z') && (l < 'A' || l > 'Z') && (l != KeyEvent.VK_SPACE))) {
                    evt.consume();
                }
            }
        });
    }

    
    
    //crear un metodo para que solo Acepte numeros.
    //Los números naturales son los que utilizamos en la vida cotidiana para contar u ordenar y pertenecen al conjunto de números enteros positivos.
    /*El conjunto de los números naturales se representa por ℕ y está formado por: ℕ  = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ...}
Nosotros consideramos que 0 es un número natural, aunque no todos los autores están de acuerdo.

Los números naturales no tienen decimal, unidad imaginaria, o bien no son fracciones.

Los números naturales son ilimitados, si a un número natural le sumamos 1, obtenemos otro número natural.*/
    
    public static void Numeros(JTextField n) {
        n.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
//El tipo de datos CHAR almacena datos de carácter en un campo de longitud fija.
//El método getKeyChar siempre devuelve un carácter Unicode válido o CHAR_UNDEFINED.
                char n = evt.getKeyChar();

// en un simple if decimos: que solo resiva si n es menor que 0 o n es mayor que 9. 
//Y de esta manera logramos que acepte sólo números.
                if (n < '0' || n > '9') {
                    evt.consume();
                }
            }
        });
    }

    /*crear un metodo para que solo Acepte Decimales.
    Un número decimal es un número no entero, compuesto por una parte entera y una parte decimal, 
     se usan cuando queremos representar números que son más pequeños que la unidad.
    
    Los números decimales se escriben usando una coma para separar la parte entera de la parte decimal,
    pero en otros países se puede escribir usando punto o apóstrofe, aqui utilizaremos el puntico pues.
   
    Para ello, tenemos que añadir un KeyListener a nuestro JTextField. 
    Cada vez que se pulse una tecla, se avisará al método keyTyped
    de nuestro KeyListener. 
    Del KeyEvent que nos pasan como parámetro podemos obtener qué tecla se ha pulsado 
    (qué caracter) y rechazarla o no según nos convenga.
    
    en la variable k, si k es mayor o igual 46 que representa al punto y k es menor o igual al 57 que
    representa al numero 9 si k es igual a 46 que representa al punto resiva los numeros ingresados y 
    verifique que solo se pueda ingresar un solo punto si k es igual a 47 que representa al slash o 
    se ha ingresado otro caracter, no permitir su ingreso por teclado */
    
    
    public static void Decimales(JTextField txt) {
        txt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                int k = (int) evt.getKeyChar();
                if (k >= 46 && k <= 57) { 
                    if (k == 46) {
                        String dato = txt.getText();
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

    //metodo para limpiar las cajas de texto
    public void Texto(JPanel panel) {
        for (Object o : panel.getComponents()) {
            if (o instanceof JTextField jTextField) {
                jTextField.setText("");
            }
        }
    }
}
