package co.edu.ims.AppCompraventa;

import co.edu.ims.compraventa.Categoria;
import co.edu.ims.compraventa.Cliente;
import co.edu.ims.compraventa.Detalle;
import co.edu.ims.compraventa.Producto;
import co.edu.ims.compraventa.Factura;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *t
 * @author Silvia
 */
public class AppMain {
    

    public static void main(String[] args) {
        EntityManagerFactory emf; //creo atributo entity manager factory
        EntityManager em;  //creo atributo entity manager
        
        emf = Persistence.createEntityManagerFactory("compraventaPU"); //Busca el archivo de configuracion de la conexion BD
        em = emf.createEntityManager();//creo un entity manager
        
        // Se crea objeto en memoria (sin persistir aun).
        Categoria asiar = new Categoria("Jabon");
        Categoria cocina = new Categoria("Cubiertos");
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(asiar); // Se persiste objeto en base de datos.
        em.persist(cocina);
        tx.commit();
        /*
        Categoria aseo = new Categoria(1,"Aseo");
        List<Categoria> categorias=new ArrayList<>();
        categorias.add(aseo);
        
        Cliente nombre = new Cliente(1, "Cristian", "Cra 12 # 17-93", 123456789, "Popayan", "3123123123");
        List<Cliente> cliente = new ArrayList<>();
        cliente.add(nombre);
        
        Producto escoba = new Producto(1, "Escoba", 20000, categorias);
        List<Producto> producto = new ArrayList<>();
        producto.add(escoba);
        
        Factura num1 = new Factura(1,"FAC1","09/03/2017",cliente);
        List<Factura> factura = new ArrayList<>();
        factura.add(num1);
        
        Detalle nuevo = new Detalle(1, "10", factura, producto);
        List<Detalle> detalle = new ArrayList<>();
        detalle.add(nuevo);
        
        Gson gson = new Gson();
        String jsCategotia = gson.toJson(aseo);
        System.out.println("Datos de la categoria:"+jsCategotia);
         String jsCliente = gson.toJson(cliente);
        System.out.println("Datos del Cliente:"+jsCliente);
        String jsonProducto = gson.toJson(escoba);
        System.out.println("Datos del producto"+jsonProducto);
        String jsonFactura = gson.toJson(num1);
        System.out.println("Datos de la Factura"+jsonFactura);
        String jsonDetalle = gson.toJson(nuevo);
        System.out.println("Datos del Detalle"+jsonDetalle);
        
    }
    */
 }
}
