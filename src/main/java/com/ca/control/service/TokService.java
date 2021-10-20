/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.service;

import com.ca.control.dao.TokDao;
import com.ca.control.domain.Tok;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokService {
    @Autowired
    TokDao tokDao;
    
    public List<Tok> ObtenerToken(String argumetno) {
        return tokDao.ObtenerToken(argumetno);
    }

   


    
    public void sumarClic(String argumento) {
       tokDao.sumarClic(argumento);
    }
}
