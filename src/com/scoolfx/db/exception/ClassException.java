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
public class ClassException extends RuntimeException {

        private static final long serialVersionUID = 1798793L;

        public ClassException() {
                super();
        }

        public ClassException(String message) {
                super(message);
        }

        public ClassException(String message, Throwable ex) {
                super(message, ex);
        }
}
