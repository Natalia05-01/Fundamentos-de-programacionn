
import javax.swing.JOptionPane;

public class ejercicio01JOptionPane {
    public static void main(String[] args) {
        int cant, sumacant = 0;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;
        String salida;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del Refresco coca cola light lata:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada del Refresco coca cola light lata:"));
        subtotal = precio * cant; iva = 0.16 * subtotal; total = iva + subtotal;
        JOptionPane.showMessageDialog(null, "subtotal " + subtotal + " iva " + iva + " Total " + total);
        sumacant += cant; sumaiva += iva; sumatotal += total;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio 1/4 de Arroz:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada del 1/4 de Arroz:"));
        subtotal = precio * cant; iva = 0.16 * subtotal; total = iva + subtotal;
        JOptionPane.showMessageDialog(null, "subtotal " + subtotal + " iva " + iva + " Total " + total);
        sumacant += cant; sumaiva += iva; sumatotal += total;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio pieza de pan frances:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada piezas de pan frances:"));
        subtotal = precio * cant; iva = 0.16 * subtotal; total = iva + subtotal;
        JOptionPane.showMessageDialog(null, "subtotal " + subtotal + " iva " + iva + " Total " + total);
        sumacant += cant; sumaiva += iva; sumatotal += total;

        String reporteFinal = "el total de productos vendidos fue " + sumacant + "\n" +
                              "el total del iva fue " + sumaiva + "\n" +
                              "el total " + sumatotal;
        JOptionPane.showMessageDialog(null, reporteFinal);
    }
}