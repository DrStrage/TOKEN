/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.service;

import com.ca.control.dao.IpsDao;
import com.ca.control.domain.Ips;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IpsService{
  
    @Autowired
    IpsDao ipsD;
    
    public boolean existeIp(String ip){
        return ipsD.existByIp(ip);
    }
    
    public void agregarIps(Ips ip){
       ipsD.agregarIp(ip);
    }
  }