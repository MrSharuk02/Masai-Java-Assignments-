package com.Day11;

import java.io.File;

@SuppressWarnings("serial")
class FileSizeTooLargeException extends Exception{
	public FileSizeTooLargeException(String msg) {
		super(msg);
	}
}

public class Q3 {
	
	public static void cheakSize(File f) throws FileSizeTooLargeException{
		if((f.length()/(1024.0 * 1024.0)) > 10){
			throw new FileSizeTooLargeException("Caught the exception: File size exceeds the 10 MB limit.");
		}
		else {
			System.out.println("Valid");
		}
	}

	public static void main(String[] args) {
		File f = new File("C:\\Users\\sharf\\Downloads\\www.5MovieRulz.deals - Dune Part Two (2024) 1080p BluRay - x264 - Org Auds [Tel + Tam + Hin + Kan + Eng].mkv");
		
		try {
			cheakSize(f);
		}catch (FileSizeTooLargeException e) {
			System.out.println(e.getMessage());
		}

	}

}
