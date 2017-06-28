package com.SimpleWinDirBackup;

/*
 * This program calls the batch file with arguments.
 * Check batch file(startBackup.bat) how the arguments are handled
 * */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WinDirBackUpBatch {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Properties prop = new Properties();
    	prop.load(new FileInputStream("config.properties"));
    	String BatFileToBackUp = prop.getProperty("BatFileToBackUp");
    	
    	String arg1="FirstArgument";
    	String arg2="SecondArgument";
    	String arg3="ThirdtArgument";
    	
    	
		try{
			
			String[] command = {"cmd.exe", "/C", "Start", BatFileToBackUp,arg1,arg2,arg3};
			Runtime.getRuntime().exec(command);
			System.out.println("Taking BackUp of Reports Directory");
		}
		catch(Exception e){
			
		}
		
		

	}

}
