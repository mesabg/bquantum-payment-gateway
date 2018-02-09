/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bquantum.integration;

import javax.ejb.Stateful;

/**
 *
 * @author Tecnologia
 */
@Stateful
public class PaymentManager implements PaymentManagerRemote {

    @Override
    public String authorize() {
        return null;
    }
    
}
