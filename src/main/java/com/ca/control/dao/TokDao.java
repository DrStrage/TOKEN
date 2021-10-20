/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.dao;

import com.ca.control.domain.Tok;

import java.util.List;



public interface TokDao {
    
    List<Tok> ObtenerToken(String argumetno);
    void sumarClic(String argumento);
}
