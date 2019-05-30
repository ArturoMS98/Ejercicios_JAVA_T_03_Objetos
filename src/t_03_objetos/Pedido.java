
package t_03_objetos;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_03_objetos
 *
 * Funcion: 
 * Almacena datos como son: el número, la fecha y el total del pedido, así como un objeto
 * que se asocie al cliente que realizó el pedido.
 *   Existe un atributo estático utilizado para generar los números de pedido.
 *   También dispone de un atributo entero donde almacene el número de líneas pedidas
 *   Queremos almacenar en un atributo el descuento que le vamos a aplicar al pedido (será
 *    numérico).
 * Métodos:
 *  -Constructor por defecto. Genera el valor del número de pedido, e inicializa a 0 los
 *   atributos total y líneas.
 *  -Constructor con parámetros (recibe únicamente la fecha y el objeto cliente)
 *   donde inicializa cada uno de los atributos de la clase.
 *      Para el caso del número de pedido, su valor se genera utilizando el atributo
 *      estático de la clase, el valor de los atributos total y líneas será de 0.
 *      Se deberá incrementar en una unidad el número de pedidos realizado por
 *      el cliente.
 *      El valor del atributo descuento dependerá del tipo de cliente
 *      Si el cliente es VIP, el valor del atributo descuento será de 15.
 *      En caso contrario. El valor de descuento será de 5.
 *  -Métodos para consultar los valores de todos los atributos de la clase, excepto el
 *   atributo estático.
 *  -Métodos para modificar todos los atributos de la clase excepto el número, el
 *   atributo estático y el descuento. Para el método que modifique el cliente, deberá
 *   incrementar en una unidad el número de pedidos realizados por el cliente y
 *   calcular el descuento que le corresponde.
 *  -Método toString(). Devuelve una cadena de caracteres con el siguiente formato:
 *
 *      Número del pedido y fecha
 *      Nombre y apellidos del cliente y el tipo de cliente que es.
 *      Total del pedido sin descuento (con el símbolo del € al final)
 *      Total del pedido con el descuento aplicado (con el símbolo del € al final)
 *  -Método toStringDivisa(). Recibe por parámetro el tipo de divisa (dólar o
 *   bitcoin). Devuelve lo mismo que el método toString() pero el total del pedido y el
 *   total del pedido con descuento será el equivalente teniendo en cuenta la divisa
 *   recibida, es decir, si recibe la divisa dólar, devolverá el total y el total con
 *   descuento en dólares en vez de euros.
 *  tiempo? son las 18:13:58 de la tarde, y sigo haciendo un proyecto que no requiere pensar en lo más minimo.
 *  por el gilipollas de manolo. Supongo que en el trabajo me tocará hacer algo como esto eh.. hay que ser cansinos me
 *  cago en la puta.
 */
public class Pedido
{
    int numeroPedido;
    String fecha;
    double totalImporte;
    Cliente cliente;
    static int nextPedido = 1;
    int lineasPedidas;
    int descuento;
    
    Pedido()
    {
        totalImporte = 0;
        lineasPedidas = 0;
        numeroPedido = nextPedido++;
    }
    
    Pedido(String fecha, Cliente cliente)
    {
        numeroPedido = nextPedido++;
        this.fecha = fecha;
        this.cliente = cliente;
        totalImporte = 0;
        lineasPedidas = 0;
        cliente.setPedidosRealizados(cliente.getPedidosRealizados()+1);
        if(cliente.getTipo().equals("Cliente Vip"))
            descuento = 15;
        else
            descuento = 5;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotalImporte() {
        return totalImporte;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getLineasPedidas() {
        return lineasPedidas;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }

    public void setCliente(Cliente cliente) {
        this.cliente.setPedidosRealizados(1+ cliente.getPedidosRealizados());
        if(this.cliente.getTipo("Cliente Vip"))
            descuento = 15;
    }

    public void setLineasPedidas(int lineasPedidas) {
        this.lineasPedidas = lineasPedidas;
    }
    @Override
    public String toString() {
        return "Pedido{" + "numeroPedido=" + numeroPedido + ", fecha=" + fecha + "\n\t totalImporte sin descuento=" + totalImporte + "€\n totalImporte con descuento=" + (Utilidades.getDescuento(totalImporte, descuento)) + "€" + '}';
    }
    
    public String toStringDivisa(String tipoDivisa) {
        if(tipoDivisa.equalsIgnoreCase("dolar"))
        {
            return "Pedido{" + "numeroPedido=" + numeroPedido + ", fecha=" + fecha + "\n\t totalImporte sin descuento=" + Utilidades.getDolares(totalImporte) + "$\n totalImporte con descuento=" + Utilidades.getDolares(Utilidades.getDescuento(totalImporte, descuento)) + "$" + '}';
        }
        else if(tipoDivisa.equalsIgnoreCase("bitcoin"))
        {
            return "Pedido{" + "numeroPedido=" + numeroPedido + ", fecha=" + fecha + "\n\t totalImporte sin descuento=" + Utilidades.getBitcoins(totalImporte) + "B\n totalImporte con descuento=" + Utilidades.getBitcoins(Utilidades.getDescuento(totalImporte, descuento)) + "B" + '}';
        }
        else return("Introduzca una divisa válida, por favor.");
    }
}
