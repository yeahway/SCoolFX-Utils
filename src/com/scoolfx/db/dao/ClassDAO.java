/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.dao;

import com.scoolfx.db.exception.ClassException;
import javafx.collections.ObservableList;

/**
 *
 * @author Shekkar Raee
 */
public interface ClassDAO {

        public ObservableList<com.scoolfx.db.model.Class> getAllClasses() throws ClassException;
}
