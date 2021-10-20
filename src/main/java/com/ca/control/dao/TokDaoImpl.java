/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.dao;


import com.ca.control.domain.Tok;
import com.ca.control.domain.TokCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TokDaoImpl implements TokDao{
    @Autowired
    TokCrud tokC;

    @Override
    public List<Tok> ObtenerToken(String argumetno) {
        return tokC.findByArgumento(argumetno);
      
    }

   
    @Override
    public void sumarClic(String argumento) {
        var token = ObtenerToken(argumento);
        token.forEach((tok)->{tok.setClic(tok.getClic()+1);
        tokC.save(tok);
        });
        
    }


    
    
}
