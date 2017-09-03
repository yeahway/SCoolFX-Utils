/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shekkar Raee
 */
public class Lists {
        public static List<String> toList(String[] items) {
                List<String> list = new ArrayList<>();
                for(String item: items) {
                        list.add(item);
                }
                return list;
        }
}
