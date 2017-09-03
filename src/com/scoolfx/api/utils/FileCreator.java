/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.api.utils;

import java.io.File;

/**
 *
 * @author Shekkar Raee
 */
public final class FileCreator {
	private final String path;
	private final String[] subFolders;
	private  String currentPath;
	
	/**
	 * 
	 * @param infos 
	 */
	public FileCreator(String infos[]) {
		this.path = infos[0];
		this.subFolders = path.split("\\/");
		this.setCurrentPath("");
	}
	
	/**
	 * Creates needed folders.
	 */
	public void create() {
		for (String subFolder : subFolders) {
			setCurrentPath(getCurrentPath() + subFolder + "/");
			File file = new File(getCurrentPath().substring(0, getCurrentPath().length() - 1));
			if(!file.exists()) {
				file.mkdir();
			}
		}
	}

	/**
	 * @return the currentPath
	 */
	public String getCurrentPath() {
		return currentPath;
	}

	/**
	 * @param currentPath the currentPath to set
	 */
	public void setCurrentPath(String currentPath) {
		this.currentPath = currentPath;
	}
}
