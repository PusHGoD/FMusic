/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.music.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author HuanPMSE61860
 */
public interface GenericDAO<K extends Serializable, E> {

    /**
     * @return list of E
     */
    public List<E> find();

    /**
     * @param k
     * @return object E
     */
    public E findById(K k);

    /**
     * @param e
     * @return add result
     */
    public boolean add(E e);

    /**
     * @param e
     * @return update result
     */
    public boolean update(E e);

    /**
     * @param e
     * @return delete result
     */
    public boolean delete(E e);
}
