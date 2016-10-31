import java.io.*;
import java.util.*;
import java.lang.Math;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(ss);
		for(int k = 0; k<ss.length; k++){
			System.out.println(ss[k]);
			
		}
	}

}
