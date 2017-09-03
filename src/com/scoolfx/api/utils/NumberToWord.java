/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.api.utils;

/**
 *
 * @author Shekkar Raee
 */
public class NumberToWord {

        /**
         *
         * @param number
         * @return word
         */
        public String getWord(int number) {
                String word = "";
                String helper = number + "";
                int lengthOfNumber = helper.length();

                switch (lengthOfNumber) {
                        case 1:
                        case 2:
                                word = getOneTwoLengthWord(number);
                                break;
                        case 3:
                                word = getThreeLengthWord(number);
                                break;
                        case 4:
                                word = getFourLengthWord(number);
                                break;
                        case 5:
                                word = getFiveLengthWord(number);
                                break;
                        case 6:
                                word = getSixLengthWord(number);
                                break;
                        case 7:
                                word = getSevenLengthWord(number);
                                break;
                        default:
                                break;
                }
                return word;
        }

        /**
         *
         * @param number
         * @return word
         */
        protected String getOneTwoLengthWord(int number) {
                String word = "";
                switch (number) {
                        case 1:
                                word = "One";
                                break;
                        case 2:
                                word = "Two";
                                break;
                        case 3:
                                word = "Three";
                                break;
                        case 4:
                                word = "Four";
                                break;
                        case 5:
                                word = "Five";
                                break;
                        case 6:
                                word = "Six";
                                break;
                        case 7:
                                word = "Seven";
                                break;
                        case 8:
                                word = "Eight";
                                break;
                        case 9:
                                word = "Nine";
                                break;
                        case 10:
                                word = "Ten";
                                break;
                        case 11:
                                word = "Elevan";
                                break;
                        case 12:
                                word = "Twelve";
                                break;
                        case 13:
                                word = "Thirteen";
                                break;
                        case 14:
                                word = "Fourteen";
                                break;
                        case 15:
                                word = "Fifteen";
                                break;
                        case 16:
                                word = "Sixteen";
                                break;
                        case 17:
                                word = "Seventeen";
                                break;
                        case 18:
                                word = "Eighteen";
                                break;
                        case 19:
                                word = "Nineteen";
                                break;
                        case 20:
                                word = "Twenty";
                                break;
                        case 21:
                                word = "Twenty-One";
                                break;
                        case 22:
                                word = "Twenty-Two";
                                break;
                        case 23:
                                word = "Twenty-Three";
                                break;
                        case 24:
                                word = "Twenty-Four";
                                break;
                        case 25:
                                word = "Twenty-Five";
                                break;
                        case 26:
                                word = "Twenty-Six";
                                break;
                        case 27:
                                word = "Twenty-Seven";
                                break;
                        case 28:
                                word = "Twenty-Eight";
                                break;
                        case 29:
                                word = "Twenty-Nine";
                                break;
                        case 30:
                                word = "Thirty";
                                break;
                        case 31:
                                word = "Thirty-One";
                                break;
                        case 32:
                                word = "Thirty-Two";
                                break;
                        case 33:
                                word = "Thirty-Three";
                                break;
                        case 34:
                                word = "Thirty-Four";
                                break;
                        case 35:
                                word = "Thirty-Five";
                                break;
                        case 36:
                                word = "Thirty-Six";
                                break;
                        case 37:
                                word = "Thirty-Seven";
                                break;
                        case 38:
                                word = "Thirty-Eight";
                                break;
                        case 39:
                                word = "Thirty-Nine";
                                break;
                        case 40:
                                word = "Fourty";
                                break;
                        case 41:
                                word = "Fourty-One";
                                break;
                        case 42:
                                word = "Fourty-Two";
                                break;
                        case 43:
                                word = "Fourty-Three";
                                break;
                        case 44:
                                word = "Fourty-Four";
                                break;
                        case 45:
                                word = "Fourty-Five";
                                break;
                        case 46:
                                word = "Fourty-Six";
                                break;
                        case 47:
                                word = "Fourty-Seven";
                                break;
                        case 48:
                                word = "Fourty-Eight";
                                break;
                        case 49:
                                word = "Fourty-Nine";
                                break;
                        case 50:
                                word = "Fifty";
                                break;
                        case 51:
                                word = "Fifty-One";
                                break;
                        case 52:
                                word = "Fifty-Two";
                                break;
                        case 53:
                                word = "Fifty-Three";
                                break;
                        case 54:
                                word = "Fifty-Four";
                                break;
                        case 55:
                                word = "Fifty-Five";
                                break;
                        case 56:
                                word = "Fifty-Six";
                                break;
                        case 57:
                                word = "Fifty-Seven";
                                break;
                        case 58:
                                word = "Fifty-Eight";
                                break;
                        case 59:
                                word = "Fifty-Nine";
                                break;
                        case 60:
                                word = "Sixty";
                                break;
                        case 61:
                                word = "Sixty-One";
                                break;
                        case 62:
                                word = "Sixty-Two";
                                break;
                        case 63:
                                word = "Sixty-Three";
                                break;
                        case 64:
                                word = "Sixty-Four";
                                break;
                        case 65:
                                word = "Sixty-Five";
                                break;
                        case 66:
                                word = "Sixty-Six";
                                break;
                        case 67:
                                word = "Sixty-Seven";
                                break;
                        case 68:
                                word = "Sixty-Eight";
                                break;
                        case 69:
                                word = "Sixty-Nine";
                                break;
                        case 70:
                                word = "Seventy";
                                break;
                        case 71:
                                word = "Seventy-One";
                                break;
                        case 72:
                                word = "Seventy-Two";
                                break;
                        case 73:
                                word = "Seventy-Three";
                                break;
                        case 74:
                                word = "Seventy-Four";
                                break;
                        case 75:
                                word = "Seventy-Five";
                                break;
                        case 76:
                                word = "Seventy-Six";
                                break;
                        case 77:
                                word = "Seventy-Seven";
                                break;
                        case 78:
                                word = "Seventy-Eight";
                                break;
                        case 79:
                                word = "Seventy-Nine";
                                break;
                        case 80:
                                word = "Eighty";
                                break;
                        case 81:
                                word = "Eighty-One";
                                break;
                        case 82:
                                word = "Eighty-Two";
                                break;
                        case 83:
                                word = "Eighty-Three";
                                break;
                        case 84:
                                word = "Eighty-Four";
                                break;
                        case 85:
                                word = "Eighty-Five";
                                break;
                        case 86:
                                word = "Eighty-Six";
                                break;
                        case 87:
                                word = "Eighty-Seven";
                                break;
                        case 88:
                                word = "Eighty-Eight";
                                break;
                        case 89:
                                word = "Eighty-Nine";
                                break;
                        case 90:
                                word = "Nintey";
                                break;
                        case 91:
                                word = "Nintey-One";
                                break;
                        case 92:
                                word = "Nintey-Two";
                                break;
                        case 93:
                                word = "Nintey-Three";
                                break;
                        case 94:
                                word = "Nintey-Four";
                                break;
                        case 95:
                                word = "Nintey-Five";
                                break;
                        case 96:
                                word = "Nintey-Six";
                                break;
                        case 97:
                                word = "Nintey-Seven";
                                break;
                        case 98:
                                word = "Nintey-Eight";
                                break;
                        case 99:
                                word = "Nintey-Nine";
                                break;
                }
                return word;
        }

        /**
         *
         * @param number
         * @return word
         */
        protected String getThreeLengthWord(int number) {
                String word = "", tensAndOnes = "";
                switch (number) {
                        case 100:
                                word = "Hundred";
                                break;
                        default:
                                if (Integer.parseInt((number + "").substring(1, 3)) > 0) {
                                        tensAndOnes = getOneTwoLengthWord(Integer.parseInt((number + "").substring(1, 3)));
                                }
                                word = getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 1)))
                                    + "-Hundred" + " " + tensAndOnes;
                }
                return word;
        }

        /**
         *
         * @param number
         * @return word
         */
        @SuppressWarnings("fallthrough")
        protected String getFourLengthWord(int number) {
                String word = "", hundred = "", tensAndOnes = "";
                switch (number) {
                        case 1000:
                                word = "Ten-Thousand";
                                break;
                        default:
                                if (Integer.parseInt((number + "").substring(1, 2)) > 0) {
                                        hundred = ", " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(1, 2))) + "-Hundred";
                                }
                                if (Integer.parseInt((number + "").substring(2, 4)) > 0) {
                                        tensAndOnes = " " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(2, 4)));
                                }
                                word = getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 1)))
                                    + "-Thousand" + hundred + tensAndOnes;
                }
                return word;
        }

        /**
         *
         * @param number
         * @return word
         */
        @SuppressWarnings("fallthrough")
        protected String getFiveLengthWord(int number) {
                String word = "", hundred = "", tensAndOnes = "";
                switch (number) {
                        case 10000:
                                word = "Ten-Thousand";
                                break;
                        default:
                                if (Integer.parseInt((number + "").substring(2, 3)) > 0) {
                                        hundred = ", " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(2, 3))) + "-Hundred";
                                }
                                if (Integer.parseInt((number + "").substring(3, 5)) > 0) {
                                        tensAndOnes = " " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(3, 5)));
                                }
                                word = getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 2)))
                                    + "-Thousand" + hundred + tensAndOnes;
                }
                return word;
        }

        /**
         *
         * @param number
         * @return word
         */
        @SuppressWarnings("fallthrough")
        protected String getSixLengthWord(int number) {
                String word = "", thousand = "", hundred = "", tensAndOnes = "";
                switch (number) {
                        case 100000:
                                word = "One-Lakh";
                                break;
                        default:
                                if (Integer.parseInt((number + "").substring(1, 3)) > 0) {
                                        thousand = ", " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(1, 3))) + "-Thousand";
                                }
                                if (Integer.parseInt((number + "").substring(3, 4)) > 0) {
                                        hundred = ", " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(3, 4))) + "-Hundred";
                                }
                                if (Integer.parseInt((number + "").substring(4, 6)) > 0) {
                                        tensAndOnes = " " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(4, 6)));
                                }
                                word = getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 1))) + "-Lakh" + thousand + hundred + tensAndOnes;
                }
                return word;
        }

        /**
         *
         * @param number
         * @return word
         */
        @SuppressWarnings("fallthrough")
        protected String getSevenLengthWord(int number) {
                String word = "", thousand = "", hundred = "", tensAndOnes = "";
                switch (number) {
                        case 1000000:
                                word = "Ten-Lakh";
                                break;
                        default:
                                if (Integer.parseInt((number + "").substring(2, 4)) > 0) {
                                        thousand = ", " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(2, 4))) + "-Thousand";
                                }
                                if (Integer.parseInt((number + "").substring(4, 5)) > 0) {
                                        hundred = ", " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(4, 5))) + "-Hundred";
                                }
                                if (Integer.parseInt((number + "").substring(5, 7)) > 0) {
                                        tensAndOnes = " " + getOneTwoLengthWord(Integer.parseInt((number + "").substring(5, 7)));
                                }
                                word = getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 2))) + "-Lakh" + thousand + hundred + tensAndOnes;
                }
                return word;
        }

        /**
         *
         * @param i
         * @return theWord
         */
        public String coversion(String i) {
                String theWord = "";
                String helper = i;
                String breaking[] = helper.split("\\.");
                if (breaking.length > 1 && (Integer.parseInt(breaking[1])) > 0) {
                        String rupeesHolder = new NumberToWord().getWord(Integer.parseInt(breaking[0])).trim();
                        String paisaReform = "";
                        if (breaking[1].trim().length() == 1) {
                                paisaReform = breaking[1].trim() + "0";
                        } else {
                                paisaReform = breaking[1].trim().substring(0, 2);
                        }
                        String rupees = "";
                        String breakingSpace[] = rupeesHolder.split("\\ ");
                        for (int j = 0; j < breakingSpace.length; j++) {
                                if ((breakingSpace.length - 1) == j) {
                                        if (breakingSpace.length > 1) {
                                                rupees += ", " + breakingSpace[j];
                                        } else {
                                                rupees += breakingSpace[j];
                                        }
                                } else {
                                        rupees += breakingSpace[j] + " ";
                                }
                        }
                        String word = rupees + " Rupees and " + new NumberToWord().getWord(Integer.parseInt(paisaReform)) + " Paisa Only/-";
                        theWord = word;
                } else {
                        String word = new NumberToWord().getWord(Integer.parseInt(breaking[0])).trim();
                        String breakingSpace[] = word.split("\\ ");
                        String reWording = "";
                        for (int j = 0; j < breakingSpace.length; j++) {
                                if ((breakingSpace.length - 1) == j) {
                                        if (word.equals("")) {
                                        } else if (breakingSpace.length == 1) {
                                                reWording += breakingSpace[j] + " only/-";
                                        } else {
                                                reWording += "and " + breakingSpace[j] + " only /-";
                                        }
                                        break;
                                } else {
                                        reWording += breakingSpace[j] + " ";
                                }
                        }
                        theWord = reWording;
                }
                if (theWord.length() == 0) {
                        theWord = "zero";
                }
                return theWord;
        }
}
