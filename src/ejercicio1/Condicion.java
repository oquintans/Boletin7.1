


package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Condicion {
    private double numero;
    
    public Condicion(){
        
    }
    public Condicion(double numero){
        this.numero=numero;
    }
    public double pedirNumero(){
        String respuesta = JOptionPane.showInputDialog("Introduce Número: ");
        double valor = Double.parseDouble(respuesta);
        return valor;
    }
    public void comparar(double num){
        numero=num;
        if(num >+ 0){
            JOptionPane.showMessageDialog(null, num+ " es positivo.");
        }else {
            JOptionPane.showMessageDialog(null, num+ " es negativo.");
        }
        
    }
    
}
