
package t_03_objetos;

/**
 *
 * @author baha
 * Tipo: BackEnd
 * Paquete: t_03_objetos
 *
 * Funcion: 
 * Contiene las siguientes constantes:
 *  dolar: 1.17521 (corresponde a los dólares que equivalen 1€)
 *  bitcoin: 0.000154250 (bitcoins que equivalen 1€)
 *       Métodos estáticos:
 *  getDolares. Devuelve el número de dólares que equivalen una cantidad de euros
 *              pasados por parámetro.
 *  getBitcoins. Igual que el método anterior, pero devuelve las bitcoins equivalentes.
 *  getFormatoNombre. Recibe por parámetro una cadena de caracteres y devuelve
 *                    la misma cadena, pero la primera letra estará en mayúscula y el resto en
 *                    minúscula.
 *  getTotal. Recibe 3 parámetros: precio, unidades e iva, devuelve el total de aplicar
 *            la unidades por el precio y el iva recibido.
 *  getDescuento. Recibe 2 parámetros: total y descuento, retorna el total aplicando
 *                el descuento recibido.    
 * tiempo necesitado: 17 minutos 33 segundos
 */
public class Utilidades {
    static final double DOLAR = 1.17521;
    static final double BITCOIN = 0.000154250;
    
    static double getDolares(double euros)
    {
        euros = euros*DOLAR;
        return euros;
    }
    static double getBitcoins(double euros)
    {
        euros = euros*BITCOIN;
        return euros;
    }
    static String getFormatoNombre(String nombre)
    {
        String primeraLetra = nombre.substring(0, 1);
        String minusculas = nombre.substring(1);
        primeraLetra = primeraLetra.toUpperCase();
        minusculas = minusculas.toLowerCase();
        nombre = primeraLetra + minusculas;
        return nombre;
    }
    static double getTotal(double precio, int unidades, double iva)
    {
        double total;
        total = precio*unidades;
        total = total + total*iva/100;
        return total;
    }
    static double getDescuento(double total, int descuento)
    {
        total = total - total*descuento/100;
        return total;
    }
}
