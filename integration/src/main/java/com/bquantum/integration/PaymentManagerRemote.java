/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bquantum.integration;

import javax.ejb.Remote;

/**
 *
 * @author Equipo
 */
@Remote
public interface PaymentManagerRemote {

    String pay();
    
}
