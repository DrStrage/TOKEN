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
@Table(name="tok")
public class Tok implements Serializable{
    
    private static final long serialVersionUID = 1L;
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long id;
    
    @Basic(optional = false)
    @Column(name = "clic")
    private double clic;
          
    @Basic (optional = false)
    @Column(name ="token")
    private String token;
    
    
    @Basic(optional = false)
    @Column (name = "argumento")
    private String argumento;

   
}
