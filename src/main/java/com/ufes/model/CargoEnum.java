/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.model;

/**
 *
 * @author Note162
 */
public enum CargoEnum {
    
    GERENTE_IMEDIATO( "Bloqueio" ),
    GERENTE_GERAL( "Gerente Geral" ),
    DIRETOR_FINANCEIRO( "Diretor Financeiro" ),
    DIRETOR_GERAL( "Diretor Geral" );
    
    private CargoEnum( String descricao ) {
	this.descricao = descricao;
    }
    
    private String descricao;
}
