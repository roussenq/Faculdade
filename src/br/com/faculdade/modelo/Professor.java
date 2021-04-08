/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faculdade.modelo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author David
 */

@Entity
@Table(name = "professor")
@PrimaryKeyJoinColumn(name = "id_pessoa")
public class Professor extends Pessoa{

    
    
}
