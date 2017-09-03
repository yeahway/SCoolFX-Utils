/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.api.search;

import java.util.ArrayList;

/**
 *
 * @author Shekkar Raee
 */
public class Library {

        private String buttons[][];
        private String menuItems[][];
        private String textItems[][];
        private final ArrayList<ObjectItem> items;

        public Library(String key) {
                assignValues();
                items = new ArrayList<>();
                searchButtons(key.toLowerCase());
                searchMenuItem(key.toLowerCase());
                searchTextItem(key.toLowerCase());
        }

        /**
         * Initial assigning values to the items.
         */
        private void assignValues() {
                String buttonItems[][] = {{"Actions", "All the user activities."},
                {"Add Staff", "New staff"},
                {"Add Student", "New student"},
                {"Add Transaction", "New financial transaction"},
                {"Annual Analysis", "Annual analysis of transactions"},
                {"Attendance Staff", "View and Attend"},
                {"Attendance Student", "View and Attend"},
                {"Attendance Student Attend", "Attendance Book"},
                {"Attendance Student View", "View Attendances"},
                {"Banking Transactions", "All banking transactions"},
                {"Calculator", "Standard Calculator"},
                {"Calculators", "Standard and Converter"},
                {"Converter", "Converter Calculator"},
                {"Daily Book", "Daily transactions book"},
                {"Daily Analysis", "Daily analysis of transactions"},
                {"Excel", "Exporting information"},
                {"Exit", "System termination"},
                {"Extra", "Extra page"},
                {"Fee Structure", "Students fee structure"},
                {"Finance", "Finance page"},
                {"Finance Highlights", "Highlits of Finance"},
                {"Home", "Home page"},
                {"Logout", "Logout of account"},
                {"Mark-Sheet", "Progress card of student"},
                {"Modify Staff", "Modification of Student"},
                {"Modify Student", "Modification of Student"},
                {"Modify Transaction", "Modification of transactions"},
                {"Monthly Analysis", "Monthly analysis of transactions"},
                {"Minimise", "System iconification"},
                {"Next", "Next page"},
                {"Notice-Board", "Notice-board system"},
                {"Payroll", "Payroll system"},
                {"Photo Gallery", "Albums of the photos"},
                {"Previous", "Previous page"},
                {"Print Extra", "Print document of extra"},
                {"Print Finance", "Print document of finance"},
                {"Print Security", "Print document of security"},
                {"Print Setting", "Print document of setting"},
                {"Print Staff", "Print document of staff"},
                {"Print Student", "Print document of student"},
                {"Promte Students", "Promoting student to higher class"},
                {"Refresh", "System refreshing"},
                {"Remove staff", "Remove staff"},
                {"Remove student", "Remove student"},
                {"Remove transaction", "Remove transaction"},
                {"Security", "Security page"},
                {"Security Highlights", "Highlights of security"},
                {"Setting", "Setting page"},
                {"Staff", "Staff page"},
                {"Staff Bill", "Payment bill"},
                {"Staff Details", "Infos of staffs"},
                {"Staff Highlights", "Highlights of staffs"},
                {"Staff Profile", "Profile of staff"},
                {"Staff Records", "Staffts' history table"},
                {"Student", "Student page"},
                {"Student Bar Charts", "Bar-charts of students"},
                {"Student Bill", "Receipt bill"},
                {"Student Bill History", "Receipt history"},
                {"Student Details", "Infos of students"},
                {"Student Due Bill", "Next month's bill"},
                {"Student Highlights", "Highlights of student"},
                {"Student Pie Charts", "Pie-charts of students"},
                {"Student Profile", "Profile of student"},
                {"Student Records", "Students' history table"},
                {"Student Table", "Table of students"},
                {"Transactions", "Financial transactions"},
                {"Transactions Table", "All transactions details"},
                {"Users", "User informations"},
                {"Zoom In", "+25%"},
                {"Zoom Out", "-25%"},};

                buttons = new String[buttonItems.length][2];
                for (int i = 0; i < buttonItems.length; i++) {
                        buttons[i][0] = buttonItems[i][0];
                        buttons[i][1] = buttonItems[i][1];
                }
                String menusItem[][] = {{"About", "Information of SCoolFX"},
                {"Bubble", "Background Image"},
                {"Butterfly", "Background Image"},
                {"Exit", "System Termination"},
                {"Flower", "Background Image"},
                {"Help", "Help content of SCoolFX"},
                {"Little World", "Background Image"},
                {"Reflection", "Background Image"},
                {"Screenshot", "Screenshot of the APP"}};

                menuItems = new String[menusItem.length][2];
                for (int i = 0; i < menuItems.length; i++) {
                        menuItems[i][0] = menusItem[i][0];
                        menuItems[i][1] = menusItem[i][1];
                }
                String textsItem[][] = {{"Search", "Contents of APP."}};

                textItems = new String[textsItem.length][2];
                for (int i = 0; i < textItems.length; i++) {
                        textItems[i][0] = textsItem[i][0];
                        textItems[i][1] = textsItem[i][1];
                }
        }

        /**
         * Searches for the similar items in the button library.
         *
         * @param key
         */
        private void searchButtons(String key) {
                for (String[] button : buttons) {
                        if (key.length() <= button[0].length()) {
                                if (key.equals(button[0].toLowerCase().substring(0, key.length()))) {
                                        ObjectItem objectItem = new ObjectItem("Button", button[0], button[1]);
                                        items.add(objectItem);
                                }
                        }
                }
        }

        /**
         * Searches for the similar items in the menu library.
         *
         * @param key
         */
        private void searchMenuItem(String key) {
                for (String[] menuItem : menuItems) {
                        if (key.length() <= menuItem[0].length()) {
                                if (key.equals(menuItem[0].toLowerCase().substring(0, key.length()))) {
                                        ObjectItem objectItem = new ObjectItem("Menu Item", menuItem[0], menuItem[1]);
                                        items.add(objectItem);
                                }
                        }
                }
        }

        /**
         * Searches for the similar items in the text library.
         *
         * @param key
         */
        private void searchTextItem(String key) {
                for (String[] textItem : textItems) {
                        if (key.length() <= textItem[0].length()) {
                                if (key.equals(textItem[0].toLowerCase().substring(0, key.length()))) {
                                        ObjectItem objectItem = new ObjectItem("Text Field", textItem[0], textItem[1]);
                                        items.add(objectItem);
                                }
                        }
                }
        }

        /**
         * Checks whether the size of items is greater than ZERO or not.
         *
         * @return item exist or not.
         */
        public boolean isFound() {
                return this.items.size() > 0;
        }

        /**
         * The ArrayList object for the searched items.
         *
         * @return items (Searched items -ArrayLists)
         */
        public ArrayList<ObjectItem> getSearchItems() {
                return items;
        }
}
