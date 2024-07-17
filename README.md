# Time_Format_Converter
# 12-Hour to 24-Hour Time Converter

This project contains a Java application that converts time from the 12-hour format to the 24-hour format.

## Introduction

This Java application provides a simple way to convert time from the 12-hour AM/PM format to the 24-hour format. 
## Features

- Convert any 12-hour formatted time string to a 24-hour format.
- Handles AM and PM times correctly.
- Easy to use and integrate into other Java applications.


## Sample code
public class time {
    public static void main(String[] args) {
        String[] tym= {
                "01:00:00AM","02:15:30AM","03:34:56AM","04:45:45AM", "11:55:55PM","12:00:00AM"};
        for (String s : tym) {
            String type = s.substring(8, 10);
            if (type.equals("AM")) {
                if (s.substring(0, 2).equals("12"))
                    System.out.println("00" + s.substring(2, 8));
                else
                    System.out.println(s.substring(0, 8));
            } else {
                if(s.substring(0,2).equals("12"))
                    System.out.println(s.substring(0,8));
                else
                {
                    int hr = Integer.parseInt(s.substring(0, 2));
                    hr += 12;
                    System.out.println(String.valueOf(hr) + s.substring(2, 8));
                }
            }

        }
    }
}
