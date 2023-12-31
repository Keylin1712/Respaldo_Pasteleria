
package com.pasteleria.domain;


import jakarta.persistence.*;  
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name="pedidos")
public class Pedidos implements Serializable{
private static  final long serialVersionUID = 1L;   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="numero_pedido")
    private Long numero_pedido;
private String nombre_cliente;
 private int telefono;
private String descripcion;
private String fecha_entrega;

    public Pedidos() {
    }

    public Pedidos(String nombre_cliente, int telefono, String descripcion, String fecha_entrega) {
        this.nombre_cliente = nombre_cliente;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.fecha_entrega = fecha_entrega;
    }


}

