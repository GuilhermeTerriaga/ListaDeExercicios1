/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios01;

import modelo.Compra;
import modelo.PagamentoBoleto;
import modelo.PagamentoCartao;
import modelo.PagamentoPagSeguro;

/**
 *
 * @author guilherme
 */
public class ListaExercicios01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Compra compra = new Compra(new PagamentoPagSeguro());
        compra.setValor(42.0);
        compra.setPagamento(new PagamentoCartao());
        compra.pagar();
        
    }
    
}
