/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.enums;

/**
 *
 * @author Shekkar Raee
 */
public enum ExceptionEnum {
        STUDENT_CREATE_ERROR(1001, "student.create.error"), STUDENT_UPDATE_ERROR(1002, "student.update.error"),
        STUDENT_REMOVE_ERROR(1003, "student.remove.error"), STUDENT_RETRIEVE_ERROR(1004, "student.retrieve.error"),
        CLASS_CREATE_ERROR(2001, "class.create.error"), CLASS_UPDATE_ERROR(2002, "class.update.error"),
        CLASS_REMOVE_ERROR(2003, "class.remove.error"), CLASS_RETRIEVE_ERROR(2004, "class.retrieve.error"),
         COLUMN_CREATE_ERROR(3001, "column.create.error"), COLUMN_UPDATE_ERROR(3002, "column.update.error"),
        COLUMN_REMOVE_ERROR(3003, "column.remove.error"), COLUMN_RETRIEVE_ERROR(3004, "column.retrieve.error");

        private final int error_code;
        private final String message;

        ExceptionEnum(int error_code, String message) {
                this.error_code = error_code;
                this.message = message;
        }

        @Override
        public String toString() {
                return "ERROR " + error_code + " : " + message;
        }
}
