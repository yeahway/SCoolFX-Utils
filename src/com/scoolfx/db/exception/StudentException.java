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
public class StudentException extends RuntimeException {

        private static final long serialVersionUID = 134837L;

        public StudentException() {
                super();
        }

        public StudentException(String message) {
                super(message);
        }
        public StudentException(String message, Throwable ex) {
                super(message, ex);
        }
}
