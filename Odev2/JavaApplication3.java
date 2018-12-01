
//
//import Odev2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nameless
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbccccccccccccccccccccccccccccccdddddddddddddddddddd";
        HuffmanTree MyTree = new HuffmanTree();
        HuffmanTree MyTree2 = new HuffmanTree();
//        Odev2.huffmanKodla(myString,MyTree);
        System.out.println(Odev2.huffmanKodla(myString,MyTree));
        System.out.println();
    }
    
}
