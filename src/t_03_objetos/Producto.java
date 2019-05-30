
package t_03_objetos;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_03_objetos
 *
 * Funcion: 
 * Guarda datos como son: un código, título, precio, iva y stock del producto, así como un
 * objeto donde se asocie a la categoría que pertenece.
 * También posee un atributo estático necesario para generar los códigos de los productos
 * nuevos.
 * Métodos:
 *   -Constructor por defecto. Genera el código del producto, ayudándose del valor del
 *    atributo estático.
 *   -Constructor con parámetros donde inicializa cada uno de los atributos de la clase
 *    excepto el atributo código (no se recibe por parámetro), su valor se genera
 *    utilizando el atributo estático de la clase. El título del producto deberá
 *    almacenarse con la primera letra en mayúscula y el resto en minúscula.
 *   -Métodos para consultar los valores de todos los atributos de la clase, excepto el
 *    atributo estático.
 * 
 *   -Métodos para modificar todos los atributos de la clase excepto el código y el
 *    atributo estático. Recuerda que el título debe seguir el formato primera letra en
 *    mayúscula y el resto en minúscula.
 *   -Método toString(). Devuelve una cadena de texto donde se detalle los valores
 *    de los atributos de la clase (excepto el atributo estático) así como el nombre de la
 *    categoría de la cual pertenece.
 *  tiempo tardado? acaso importa en comparación con el sufrimiento que estoy llevando?
 */
public class Producto {
    private int codigo;
    private String titulo;
    private double precio;
    private int iva;
    private int stock;
    Categoria tipoProducto;
    static int nextCodigo = 1;
    
    Producto()
    {
        codigo = nextCodigo++;
    }
    Producto(String titulo, double precio, int iva, int stock, String nombreCategoria)
    {
        codigo = nextCodigo++;
        this.titulo = Utilidades.getFormatoNombre(titulo);
        this.precio = precio;
        this.iva = iva;
        this.stock = stock;
        tipoProducto = new Categoria(nombreCategoria);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIva() {
        return iva;
    }

    public int getStock() {
        return stock;
    }

    public Categoria getTipoProducto() {
        return tipoProducto;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = Utilidades.getFormatoNombre(titulo);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTipoProducto(Categoria tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", titulo=" + titulo + ", precio=" + precio + ", iva=" + iva + ", stock=" + stock + ", tipoProducto=" + tipoProducto + '}';
    }
}
