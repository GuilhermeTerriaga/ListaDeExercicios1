/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
/**
 *
 * @author guilherme
 */
public class Compra {

 
    private Date data;
    
    private Double valor;
    
    private Pagamento pagamento;


    public Compra(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public Double pagar(){
                      
        return pagamento.executar(this.valor);
    
    }
    
    
    
    
}
