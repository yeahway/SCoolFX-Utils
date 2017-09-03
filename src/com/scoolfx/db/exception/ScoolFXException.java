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
public class ScoolFXException extends RuntimeException {

        private static final long serialVersionUID = 1327492L;

        public ScoolFXException() {
                super();
        }

        public ScoolFXException(String message) {
                super(message);
        }
        
        public ScoolFXException(String message, Throwable ex) {
                super(message, ex);
        }
}
