/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="ips")
public class Ips implements Serializable {
    private static final long serialVersionUID = 1L;
    
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long id;
 
  
    @Column(name = "ip")
    private String ip;
          
    
    @Column(name ="idtok")
    private double idtok;
    
    @Column(name ="fecha")
    private String fecha;
    
    @Column(name ="hora")
    private int hora;
    
     @Column(name ="minuto")
    private int minuto;
    
      @Column(name ="dia")
    private int dia;
    
       @Column(name ="mes")
    private int mes;
    
   
    
}
