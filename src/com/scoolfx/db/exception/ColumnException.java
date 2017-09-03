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
public class ColumnException extends RuntimeException {

        private static final long serialVersionUID = 1987923L;

        public ColumnException() {
                super();
        }

        public ColumnException(String message) {
                super(message);
        }
        public ColumnException(String message, Throwable ex) {
                super(message, ex);
        }
}
