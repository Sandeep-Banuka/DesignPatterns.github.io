package com.accolite.mini_au.proxy;

public class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void runCommand(String cmd) throws Exception {
		
		Runtime.getRuntime().exec(cmd);
		System.out.println(cmd+ " executed");
	}

	
	
	
}
