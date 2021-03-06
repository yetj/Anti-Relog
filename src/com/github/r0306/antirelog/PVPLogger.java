package com.github.r0306.antirelog;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class PVPLogger {
	
	private antirelog plugin;
	public PVPLogger (antirelog plugin) {
		this.plugin = plugin;
	}
	
	File log = new File("PVP Bans.txt");

	public void Write () {
    	try{
    	    if(!log.exists()){
    	        System.out.println("[AntiRelog] Generating new log file.");
    	        log.createNewFile();
    	    }
    	    FileWriter fileWriter = new FileWriter(log, true);

    	    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    	    Calendar c = Calendar.getInstance();
    	    String stringdate = c.getTime().toString();
    	    bufferedWriter.write(stringdate + " " + LogPrevention.playernamelog + " logged off during combat and was temporarily banned." + System.getProperty( "line.separator" ));
    	    bufferedWriter.close();
    } catch(IOException e) {
        System.out.println("[AntiRelog] could not log PVP Ban!");
	}
}
	public void WriteUnbanned () {
    	try{
    	    if(!log.exists()){
    	        System.out.println("[AntiRelog] Generating new log file.");
    	        log.createNewFile();
    	    }
    	    FileWriter fileWriter = new FileWriter(log, true);
    	    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    	    Calendar c = Calendar.getInstance();
    	    String stringdate = c.getTime().toString();
    	    bufferedWriter.write(stringdate + " " + LogPrevention.playernamelog + " has been unbanned." + System.getProperty( "line.separator" ));
    	    bufferedWriter.close();
        } catch(IOException e) {
            System.out.println("[AntiRelog] could not log PVP Ban!");
    	}
	}
	public void WriteUnbannedShutDown () {
    	try{
    	    if(!log.exists()){
    	        System.out.println("[AntiRelog] Generating new log file.");
    	        log.createNewFile();
    	    }
    	    FileWriter fileWriter = new FileWriter(log, true);
    	    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    	    Calendar c = Calendar.getInstance();
    	    String stringdate = c.getTime().toString();
    	    bufferedWriter.write(stringdate + " " + plugin.playerLog.getName() + " has been unbanned due to server reloading or shutting down." + System.getProperty( "line.separator" ));
    	    bufferedWriter.close();
        } catch(IOException e) {
            System.out.println("[AntiRelog] could not log PVP Ban!");
    	}
	}
	public void WriteUnbannedByPlayer () {
    	try{
    	    if(!log.exists()){
    	        System.out.println("[AntiRelog] Generating new log file.");
    	        log.createNewFile();
    	    }
    	    FileWriter fileWriter = new FileWriter(log, true);
    	    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    	    Calendar c = Calendar.getInstance();
    	    String stringdate = c.getTime().toString();
    	    bufferedWriter.write(stringdate + " " + Executor.unban + " has been unbanned by " + Executor.unbanBy + "." + System.getProperty( "line.separator" ));
    	    bufferedWriter.close();
        } catch(IOException e) {
            System.out.println("[AntiRelog] could not log PVP Ban!");
    	}
	}
}