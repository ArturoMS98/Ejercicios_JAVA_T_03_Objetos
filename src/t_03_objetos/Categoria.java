
package t_03_objetos;

import static t_03_objetos.Utilidades.getFormatoNombre;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_03_objetos
 *
 * Funcion: 
 * Almacenará el código del producto y el nombre de la categoría.
 * Además, dispone de un atributo estático de tipo entero denominado “nextCodigo”,
 * inicialmente su valor será de 1. Este atributo almacena el código de la siguiente
 * categoría a insertar.
 *  -Métodos:
 *   Constructor por defecto, inicializa los atributos a los siguientes valores:
 *         Nombre: Cadena vacía (es decir, “”)
 *         Código: Corresponderá al valor que almacena el atributo nextCodigo, no
 *                 olvides actualizar el valor de nextCodigo (incrementa su valor en una
 *                 unidad).
 *         Constructor con parámetro (recibe únicamente el nombre de la categoría), el
 *            valor del atributo código se generará utilizando el atributo estático nextCodigo. El
 *            nombre de la categoría debe almacenarse con la primera letra en mayúscula y el
 *            resto de caracteres en minúscula, por tanto, deberás hacer uso del método
 *            getFormatNombre de la clase Utilidades.
 *         Métodos para consultar cada uno de los atributos de la clase, excepto el atributo
 *                 estático.
 *         Método para modificar el atributo nombre. Recuerda que el nombre de la cadena
 *                se almacena con la primera letra en mayúscula y el resto en minúscula.
 *         Método toString(). Devuelve una cadena de texto donde se detalle el nombre el
 *                            código de la categoría y su nombre.
 *  Tiempo: 26 minutos 26 segundos (contando el journal claro)
 */
public class Categoria {

    private int codigoProducto;
    private String nombreCategoria;
    static int nextCodigo = 1;
    
    Categoria()
    {
        nombreCategoria = "";
        codigoProducto = nextCodigo;
        nextCodigo++;
    }
    Categoria(String nombreCategoria)
    {
        this.nombreCategoria = getFormatoNombre(nombreCategoria);
        codigoProducto = nextCodigo++;
    }
    
    public int getCodigoProducto()
    {
        return codigoProducto;
    }
    public String getNombreCategoria()
    {
        return nombreCategoria;
    }
    public void cambiaNombre(String nuevoNombre)
    {
        nombreCategoria = getFormatoNombre(nuevoNombre);
        codigoProducto = nextCodigo++;
    }
    @Override
    public String toString()
    {
        return("El nombre de la categoría es: " + nombreCategoria + ", el código de la categoría es: " + codigoProducto);
    }
}
