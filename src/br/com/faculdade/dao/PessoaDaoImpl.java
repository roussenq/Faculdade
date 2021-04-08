/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faculdade.dao;

import br.com.faculdade.modelo.Pessoa;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class PessoaDaoImpl extends BaseDaoImpl<Pessoa, Long> implements PessoaDao, Serializable {

    @Override
    public void salvarOuAlterar(Pessoa entidade, Session sessao) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Pessoa entidade, Session sessao) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa pesquisarPorId(Long id, Session sessao) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
