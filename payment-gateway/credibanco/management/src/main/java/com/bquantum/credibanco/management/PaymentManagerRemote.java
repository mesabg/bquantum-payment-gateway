/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bquantum.credibanco.management;

import javax.ejb.Remote;

/**
 *
 * @author Tecnologia
 */
@Remote
public interface PaymentManagerRemote {

    String authorize();
    
}
