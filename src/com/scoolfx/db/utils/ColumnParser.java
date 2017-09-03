/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.utils;

import java.util.List;

/**
 *
 * @author Shekkar Raee
 */
public class ColumnParser {        
        public static List<String> parseList(String column) {
                return Lists.toList(column.split("\\,"));
        }
}
