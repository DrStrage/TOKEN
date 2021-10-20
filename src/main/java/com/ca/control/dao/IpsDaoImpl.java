/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.dao;


import com.ca.control.domain.Ips;
import com.ca.control.domain.IpsCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IpsDaoImpl implements IpsDao{
    
    @Autowired
    IpsCrud ipsC;

    @Override
    public boolean existByIp(String ip) {
       return ipsC.existsByIp(ip);
    }

    @Override
    public void agregarIp(Ips ip) {
       ipsC.save(ip);
    }
    
    
    
}
