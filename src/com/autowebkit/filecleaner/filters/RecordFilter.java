package com.autowebkit.filecleaner.filters;

import java.io.FileFilter;

/**
 * Created by hui on 2/13/16.
 */
public abstract class RecordFilter implements FileFilter{
	/**
	 * filter tag 
	 * @return
	 */
	public String getTag(){
		return "record";
	}
	
}
