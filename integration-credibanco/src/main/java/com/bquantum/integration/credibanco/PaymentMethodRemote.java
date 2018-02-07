/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bquantum.integration.credibanco;

import javax.ejb.Remote;

/**
 *
 * @author Equipo
 */
@Remote
public interface PaymentMethodRemote {

    void pay();
    
}
