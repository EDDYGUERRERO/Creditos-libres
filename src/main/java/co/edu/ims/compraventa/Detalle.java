package co.edu.ims.compraventa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author Silvia
 */
@Entity
public class Detalle implements Serializable {
    
    @Id
    private int id;
    private String cantidad;
    @OneToMany
    @JoinColumn(name ="fk_factura")
    private List <Factura> idFactura;
    @OneToMany
    @JoinColumn(name = "fk_producto")
    private List <Producto> idProducto;
    
    public Detalle(){
        
    }

    public Detalle(int id, String cantidad, List<Factura> idFactura, List<Producto> idProducto) {
        this.id = id;
        this.cantidad = cantidad;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public List<Factura> getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(List<Factura> idFactura) {
        this.idFactura = idFactura;
    }

    public List<Producto> getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(List<Producto> idProducto) {
        this.idProducto = idProducto;
    }
    
}
