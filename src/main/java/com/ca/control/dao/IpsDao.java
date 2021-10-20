/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.dao;

import com.ca.control.domain.Ips;



public interface IpsDao {
    
boolean existByIp(String ip);
void agregarIp(Ips ip);
}
