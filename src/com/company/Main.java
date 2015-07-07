package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String command;
        while (scanner.hasNextLine()) {
            command = scanner.nextLine();
            System.out.println(test(command));
        }
    }
    public static boolean test (String str){
        Pattern pattern = Pattern.compile("^addAmount\\([\\d]{1,5},[\\d]{1,5}\\)$");
        Matcher matcher = pattern.matcher(str);
        return  matcher.matches();
    }
    public void newmethod (){

    }



}
