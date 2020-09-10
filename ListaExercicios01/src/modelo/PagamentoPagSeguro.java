/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author guilherme
 */
public class PagamentoPagSeguro implements Pagamento{

    @Override
    public Double executar(Double valor) {
      System.out.println("Pagamento no PagSeguro! \nvalor:"+ valor);
      return valor;
    }
    
}
