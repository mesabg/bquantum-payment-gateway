/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bquantum.web;

import com.bquantum.integration.PaymentManagerRemote;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Equipo
 */
@WebService(serviceName = "PaymentWebManager")
public class PaymentWebManager {

    @EJB
    private PaymentManagerRemote paymentManager;
    /**
     * Payment operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "pay")
    public String pay(@WebParam(name = "name") String txt) {
        System.out.println("We are united");
        return paymentManager.pay();
    }
}
