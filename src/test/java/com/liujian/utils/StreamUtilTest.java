package com.liujian.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void test() throws FileNotFoundException, IOException {
		
		String readTextFile = StreamUtil.readTextFile(new FileInputStream("E:/Java----web//作业/sql作业.sql"));
		System.out.println(readTextFile);
	}

	@Test
	public void testReadTextFileFile() {
		String readTextFile = StreamUtil.readTextFile(new File("E:/Java----web//作业/sql作业.sql"));
		System.out.println(readTextFile);
		
	}
	
}
