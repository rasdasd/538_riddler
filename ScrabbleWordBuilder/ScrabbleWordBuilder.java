//David Hirschberg
//ScrabbleWordBuilder.java
//Lets find the word!
//javac ScrabbleWordBuilder.java
//java ScrabbleWordBuilder
//optional parameter of what dictionary you want to use
//or set here

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;

public class ScrabbleWordBuilder {

	static HashMap<Integer,HashSet<String>> dict = new HashMap<Integer, HashSet<String>>();
	public static void main(String[] args) throws Exception
	{
		String dictFile;
		if(args.length > 0)
			dictFile = args[0];
		else
			dictFile = "ospd.txt";//enable1.txt;
		FileReader input = new FileReader(dictFile);
		BufferedReader buffRead = new BufferedReader(input);
		String myLine = null;
		int maxLength = -1;
		while ( (myLine = buffRead.readLine()) != null)
		{
			if(myLine.length() <= 1)
				continue;
			if(!dict.containsKey(myLine.length()))
				dict.put(myLine.length(), new HashSet<String>());
			dict.get(myLine.length()).add(myLine);
			if(myLine.length() > maxLength)
				maxLength = myLine.length();
		}
		
		for(int len = maxLength; len > 1; len--)
		{
			HashSet<String> set = dict.get(len);
			if(set == null)
				continue;
			for(String word : set)
			{
				if(valid(word))
				{
					return;
				}
			}
		}
	}
	private static boolean valid(String str)
	{
		if(!dict.containsKey(str.length()) || !dict.get(str.length()).contains(str))
			return false;
		boolean flag = false;
		if(str.length() == 2)
		{
			flag = true;
		}
		else
		{
			flag = valid(str.substring(0, str.length()-1)) || valid(str.substring(1));
		}
		if(flag)
			System.out.println(str.length() + "\t" + str);
		return flag;
	}
}