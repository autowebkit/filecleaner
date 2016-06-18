package com.autowebkit.filecleaner.filters;

import java.io.File;

/**
 * Created by hui on 2/13/16.
 */
public class DirectoryFileFilter extends FileTypeFilter {
	private String TAG = "folder";
	
	public boolean accept(File file) {
		if(file!=null && file.isDirectory()){
			return true ;
		}
		return false;
	}

	public String getTag() {
		return TAG ;
	}

}
