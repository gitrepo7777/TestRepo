

/**
 * HelloWorldService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.vani;

    /*
     *  HelloWorldService java interface
     */

    public interface HelloWorldService {
          

        /**
          * Auto generated method signature
          * 
                    * @param sayHello0
                
         */

         
                     public com.vani.SayHelloResponse sayHello(

                        com.vani.SayHello sayHello0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sayHello0
            
          */
        public void startsayHello(

            com.vani.SayHello sayHello0,

            final com.vani.HelloWorldServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    