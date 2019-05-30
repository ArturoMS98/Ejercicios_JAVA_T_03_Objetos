
package t_03_objetos;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_03_objetos
 *
 * Funcion: 
 * Almacena datos como son: código, nombre, apellidos, móvil. También dispone de un
 * atributo denominado “puntos” que almacenará datos numéricos enteros, y un atributo
 * donde almacenará el número de pedidos realizados por el cliente.
 *  Dispone de un atributo estático utilizado para generar los códigos de los clientes
 *  nuevos.
 * Métodos:
 *   -Constructor por defecto. Genera el valor del atributo código, e inicializa a 0 los
 *    atributos de puntos y número de pedidos.
 *   -Constructor con parámetros donde inicializa cada uno de los atributos de la clase
 *    excepto los atributos código, puntos y número de pedidos (no se reciben por
 *    parámetro). Para el caso del código su valor se genera utilizando el atributo
 *    estático de la clase, y para los atributos puntos y número de pedidos se
 *    inicializará al valor de 0. El nombre y apellidos del cliente deberán almacenarse
 *    con la primera letra en mayúscula y el resto en minúscula.
 *   -Métodos para consultar los valores de todos los atributos de la clase, excepto el
 *    atributo estático.
 *   -Métodos para modificar todos los atributos de la clase excepto el código y el
 *    atributo estático. El nombre y apellidos del cliente deberán almacenarse con la
 *    primera letra en mayúscula y el resto en minúscula.
 *   -Método denominado getTipo(). Devuelve una cadena de caracteres de acuerdo a
 *    la siguiente condición (obligatorio utilizar el operador condicional):
 *
 *      Si el número de puntos del cliente es superior a 50 o el número de pedidos
 *      es superior a 3, devuelve la cadena de texto “cliente vip”.
 *      En caso contrario, devolverá “cliente básico”.
 *   -Método toString(). Devuelve una cadena de texto donde se detalla el código,
 *    nombre y apellidos del cliente, el número de pedidos que ha realizado y el tipo de
 *    cliente que es (vip o básico).
 *   tiempo: 26 minutos? y mucho asco de clase en la que no tengo nada que pensar.
 */
public class Cliente {
    int codigo;
    String nombre;
    String apellido1;
    String apellido2;
    String movil;
    int puntos;
    private int pedidosRealizados;
    int nextCodigo = 1;
    
    Cliente()
    {
        codigo = nextCodigo++;
        puntos = 0;
        pedidosRealizados = 0;
    }
    Cliente(String nombre, String apellido1, String apellido2, String movil)
    {
        this.nombre = Utilidades.getFormatoNombre(nombre);
        this.apellido1 = Utilidades.getFormatoNombre(apellido1);
        this.apellido2 = Utilidades.getFormatoNombre(apellido2);
        this.movil = movil;
        codigo = nextCodigo++;
    }
    public String getTipo()
    {
        if((this.puntos > 50) || (pedidosRealizados > 3))
        {
            return("Cliente Vip");
        }
        else
            return("Cliente Básico");
    }
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getMovil() {
        return movil;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setNombre(String nombre) {
        this.nombre = Utilidades.getFormatoNombre(nombre);
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = Utilidades.getFormatoNombre(apellido1);
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = Utilidades.getFormatoNombre(apellido2);
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setPedidosRealizados(int pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", puntos=" + puntos + ", pedidosRealizados=" + pedidosRealizados + ", TipoCliente=" + getTipo() + '}';
    }

    boolean getTipo(String cliente_Vip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
