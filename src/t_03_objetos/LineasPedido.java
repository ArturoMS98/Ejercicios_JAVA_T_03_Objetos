
package t_03_objetos;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_03_objetos
 *
 * Funcion: Esta clase asocia los productos pedidos dentro de un pedido concreto. 
 * Atributos:
 * -Un número de línea.
 * -Un objeto donde se vincule a un pedido.
 * -Un objeto donde se asocie al producto comprado.
 * -El número de unidades del producto comprado.
 * -El importe total de la línea.
 * Métodos:
 * -Constructor por defecto. Únicamente inicializa los campos unidades e importe al
 *  valor 0.
 * -Constructor donde únicamente se recibe el pedido.
 *  -Inicializar el atributo pedido de la clase.
 *  -Asigna el valor de 0 a los campos unidades e importe.
 *  -Calcula el número de línea, para ello, debe consultar el atributo líneas del
 *   objeto pedido (no olvides después actualizar el valor de líneas del objeto
 *   pedido, es decir, lo deberás incrementar en una unidad).
 * -Constructor donde recibe el pedido, el producto y el número de unidades.
 *   -Inicializa los 3 atributos de la clase.
 *   -Obtiene el número de línea, para ello, debe consultar el atributo líneas del
 *    objeto pedido (no olvides después actualizar el valor de líneas del objeto
 *    pedido, es decir, lo deberás incrementar en una unidad).
 *   -Calcula el importe de la línea, es decir, será igual al precio del producto por
 *    las unidades y teniendo en cuenta el iva del producto (haz uso del método
 *    de la clase Utilidades).
 *   -Actualiza el importe del pedido (súmale el importe de la línea al total del
 *    pedido).
 *   -Si el importe de la línea es superior a 15 se le obsequiará al cliente con 20
 *    puntos, en caso contrario, se le darán 2 simbólicos puntos.
 *   -Deberás actualizar el stock del producto, es decir, decrementar el stock en
 *    tantas unidades como las pedidas.
 * -Métodos para consultar los valores de todos los atributos de la clase.
 * -Método toString(). Devuelve una cadena de caracteres con el siguiente
 *  información y formato:
 *   -Número y fecha del pedido – Línea “númeroLinea”
 *   -Título del producto – “unidades” unidades - “precio” precio – “iva” iva
 *   -Importe línea con el símbolo del euro al final.
 * Mi querido manolo tiene un Don para hacer que la gente odie programar =)
 * 44 minutos
 */
public class LineasPedido {
    int numeroLinea;
    Pedido pedido;
    Producto producto;
    int unidadesProducto;
    double importeLinea;
    
    LineasPedido()
    {
        unidadesProducto = 0;
        importeLinea = 0;
    }
    LineasPedido(Pedido pedido)
    {
        this.pedido = pedido;
        unidadesProducto = 0;
        importeLinea = 0;
        numeroLinea = pedido.getLineasPedidas();
        pedido.setLineasPedidas(numeroLinea+1);
    }
    LineasPedido(Pedido pedido, Producto producto, int unidadesProducto)
    {
        this.unidadesProducto = unidadesProducto;
        this.pedido = pedido;
        this.producto = producto;
        numeroLinea = pedido.getLineasPedidas();
        pedido.setLineasPedidas(numeroLinea+1);
        importeLinea = producto.getPrecio()*unidadesProducto;
        importeLinea = Utilidades.getTotal(importeLinea, unidadesProducto, producto.getIva());
        pedido.setTotalImporte(pedido.getTotalImporte() + importeLinea);
        if(importeLinea > 15)
            pedido.cliente.setPuntos(pedido.cliente.getPuntos()+20);
        else
            pedido.cliente.setPuntos(pedido.cliente.getPuntos()+2);
        this.producto.setStock(this.producto.getStock()-unidadesProducto);
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getUnidadesProducto() {
        return unidadesProducto;
    }

    public double getImporteLinea() {
        return importeLinea;
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = "LineasPedido{" + "Número de pedido: " + pedido.getNumeroPedido() + ", fecha del pedido: " + pedido.getFecha() + "numeroLinea=" + numeroLinea;
        cadena = cadena + "\nTitulo del producto: " + producto.getTitulo() + ", unidades " + unidadesProducto + ", precio " + producto.getPrecio() + ", IVA: " + producto.getIva();
        cadena = cadena + "\nImporte línea: " + importeLinea + "€}";
        return cadena;
    }
}