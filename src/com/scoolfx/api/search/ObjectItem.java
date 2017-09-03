/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.api.search;

/**
 *
 * @author Shekkar Raee
 */
public class ObjectItem {

        private String type, item, action;

        public ObjectItem(String type, String item, String action) {
                this.item = item;
                this.type = type;
                this.action = action;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getItem() {
                return item;
        }

        public void setItem(String item) {
                this.item = item;
        }

        public String getAction() {
                return action;
        }

        public void setAction(String action) {
                this.action = action;
        }
}
