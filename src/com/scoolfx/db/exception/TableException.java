/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.exception;

/**
 *
 * @author Shekkar Raee
 */
public class TableException extends RuntimeException {

        private static final long serialVersionUID = 3745681L;

        public TableException(String message, Throwable ex) {
                super(message, ex);
        }

}
