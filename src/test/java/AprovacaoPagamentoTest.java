/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.ufes.model.CargoEnum;
import com.ufes.model.Pedido;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Note162
 */
public class AprovacaoPagamentoTest {
    
    public AprovacaoPagamentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

 
     @Test
     public void CT001() {
         Pedido pedido = new Pedido(3400);
         String retornoDaAprovacao = this.solicitarAprovacao(pedido);
         System.out.println(retornoDaAprovacao);
         assertEquals("Aprovador Pelo DIRETOR_FINANCEIRO", retornoDaAprovacao);
     }
     
     @Test
     public void CT002() {
         Pedido pedido = new Pedido(500);
         String retornoDaAprovacao = this.solicitarAprovacao(pedido);
         System.out.println(retornoDaAprovacao);
         assertEquals("Aprovador Pelo GERENTE_IMEDIATO", retornoDaAprovacao);
     }
     
     @Test
     public void CT003() {
         Pedido pedido = new Pedido(15001);
         String retornoDaAprovacao = this.solicitarAprovacao(pedido);
         System.out.println(retornoDaAprovacao);
         assertEquals("Não Aprovado", retornoDaAprovacao);
     }
     
     public String solicitarAprovacao(Pedido pedido){
        
        if(pedido.getValor() <= 500){
             return "Aprovador Pelo "+ CargoEnum.GERENTE_IMEDIATO.toString();
        }else if(pedido.getValor() <= 1500){
              return "Aprovador Pelo "+ CargoEnum.GERENTE_GERAL.toString();
        }else if(pedido.getValor() <= 5000){
             return "Aprovador Pelo "+ CargoEnum.DIRETOR_FINANCEIRO.toString();
        }else if(pedido.getValor() <= 15000){
             return "Aprovador Pelo "+ CargoEnum.DIRETOR_GERAL.toString();
        }
        return "Não Aprovado";
     }
}



