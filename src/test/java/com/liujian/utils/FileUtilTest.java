package com.liujian.utils;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		
		String nameString = "1706d.ddd";
		
		String extendName = FileUtil.getExtendName(nameString);
		System.out.println(extendName);
	}
	
	@Test void testGetTempDirectory() {
		File tempDirectory = FileUtil.getTempDirectory();
		System.out.println(tempDirectory);
	}
	
	@Test void testGetUserDirectory() {
		File userDirectory = FileUtil.getUserDirectory();
		System.out.println(userDirectory);
	}

}
