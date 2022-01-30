package main;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import main.Network;
import main.Server;


/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/

        Network objNetwork = new Network("network");            /* Activate the network */
        Server objServer = new Server();
        Client objClientSending = new Client("sending");
        Client objClientReceiving= new Client("receiving");

        objNetwork.start();
        objServer.start();
        objClientSending.start();
        objClientReceiving.start();

//        try {
//            objClientSending.join();
//            objClientReceiving.join();
//            objServer.join();
//            objNetwork.join();
//        }catch (InterruptedException e){
//            System.out.println("Interrupted Exception!");
//        }



    }


}
