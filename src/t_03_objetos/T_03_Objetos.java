package t_03_objetos;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 30, 2019 1:48:13 PM<p>                                                               *
 * <p>fecha de finalizacion: May 30, 2019 1:48:13 PM<p>                                                                 *
 * <p>nombre del proyecto: T_03_Objetos.java<p>                                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Objetos.git">GIT</a></p>                        *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>Contendrá el método principal de la aplicación (main). Realizar las siguientes acciones:                          *
 *    -Crea 3 categorías y 5 productos por cada categoría.                                                              *
 *    -Visualiza los datos de todos los productos por consola.                                                          *
 *    -A continuación, crea 2 clientes.                                                                                 *
 *    -Seguidamente crea 2 pedidos uno por cada cliente.                                                                *
 *    -Crea 3 líneas por cada pedido y visualiza sus datos por pantalla.                                                *
 *    -Por último, visualiza toda la información de cada uno de los pedidos por pantalla.</p>                           *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: EXCESIVO. y una verdadera pérdida. esto no es una inversión si no aprendo nada. *
 * </p>                                                                                                                 *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Objetos {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Acabar con mi sufrimiento</p>                                                                                  *
    * <p>Crea 3 categorías y 5 productos por cada categoría.                                                            *
    *    Visualiza los datos de todos los productos por consola.                                                        *
    *    A continuación, crea 2 clientes.                                                                               *
    *    Seguidamente crea 2 pedidos uno por cada cliente.                                                              *
    *    Crea 3 líneas por cada pedido y visualiza sus datos por pantalla.                                              *
    *    Por último, visualiza toda la información de cada uno de los pedidos por pantalla.</p>                         *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        Categoria animales = new Categoria("animales");
        Categoria frutas = new Categoria("frutas");
        Categoria verduras = new Categoria("verduras");
        
        Producto perro = new Producto("perro", 50.24, 20, 15, animales.getNombreCategoria());
        Producto gato = new Producto("gato", 50.24, 20, 15, animales.getNombreCategoria());
        Producto puercoespin = new Producto("puercoespin", 50.24, 20, 15, animales.getNombreCategoria());
        Producto zorro = new Producto("zorro", 50.24, 20, 15, animales.getNombreCategoria());
        Producto lince = new Producto("lince", 50.24, 20, 15, animales.getNombreCategoria());
        
        Producto pera = new Producto("pera", 50.24, 20, 15, frutas.getNombreCategoria());
        Producto manzana = new Producto("manzana", 50.24, 20, 15, frutas.getNombreCategoria());
        Producto mandarina = new Producto("mandarina", 50.24, 20, 15, frutas.getNombreCategoria());
        Producto naranja = new Producto("naranja", 50.24, 20, 15, frutas.getNombreCategoria());
        Producto melocoton = new Producto("melocoton", 50.24, 20, 15, frutas.getNombreCategoria());
        
        Producto zanahoria = new Producto("zanahoria", 50.24, 20, 15, verduras.getNombreCategoria());
        Producto tomate = new Producto("tomate", 50.24, 20, 15, verduras.getNombreCategoria());
        Producto pepino = new Producto("pepino", 50.24, 20, 15, verduras.getNombreCategoria());
        Producto patata = new Producto("patata", 50.24, 20, 15, verduras.getNombreCategoria());
        Producto pimiento = new Producto("pimiento", 50.24, 20, 15, verduras.getNombreCategoria());
        
        System.out.println(perro.toString());
        System.out.println(gato.toString());
        System.out.println(puercoespin.toString());
        System.out.println(zorro.toString());
        System.out.println(lince.toString());
        
        System.out.println(pera.toString());
        System.out.println(manzana.toString());
        System.out.println(mandarina.toString());
        System.out.println(naranja.toString());
        System.out.println(melocoton.toString());
        
        System.out.println(zanahoria.toString());
        System.out.println(tomate.toString());
        System.out.println(pepino.toString());
        System.out.println(patata.toString());
        System.out.println(pimiento.toString());
        
        Cliente manolo = new Cliente("manolo", "Ortiz", "bRIONES", "738294923");
        Cliente capullo = new Cliente();
        
        Pedido pedido1 = new Pedido("2019-05-30", manolo);
        Pedido pedido2 = new Pedido("3029-13-43", capullo);
        
        LineasPedido linea1 = new LineasPedido(pedido1, pimiento, 5);
        LineasPedido linea2 = new LineasPedido(pedido1, perro, 2);
        LineasPedido linea3 = new LineasPedido(pedido1, perro, 2);
        LineasPedido lineaCapullo = new LineasPedido(pedido2, puercoespin, 4);
        LineasPedido linea2Capullo = new LineasPedido(pedido2, gato, 1);
        LineasPedido linea2Capullo3 = new LineasPedido(pedido2, gato, 1);
        
        System.out.println(linea1.toString());
        System.out.println(linea2.toString());
        System.out.println(linea3.toString());
        System.out.println(lineaCapullo.toString());
        System.out.println(linea2Capullo.toString());
        System.out.println(linea2Capullo3.toString());
        
        System.out.println(pedido1.toString());
        System.out.println(pedido2.toString());
    }
}