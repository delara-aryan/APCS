//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private ArrayList<String> story;
	
	public MadLib()
	{
		story = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		loadNouns();
		loadVerbs();
		loadAdjectives();
		story = new ArrayList<String>();
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()) {
				story.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		nouns = new ArrayList<String>();
		try{
			Scanner file = new Scanner(new File("nouns.dat"));
			while(file.hasNext()) {
				nouns.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		verbs = new ArrayList<String>();
		try{
			Scanner file = new Scanner(new File("verbs.dat"));
			while(file.hasNext()) {
				verbs.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		adjectives = new ArrayList<String>();
		try{
			Scanner file = new Scanner(new File("adjectives.dat"));
			while(file.hasNext()) {
				adjectives.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		return verbs.get(new Random().nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		return nouns.get(new Random().nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		return adjectives.get(new Random().nextInt(adjectives.size()));
	}		

	public String toString()
	{
		String madLib = "";
		for(String s : story) {
			if (s.equals("#")) {
				madLib += getRandomNoun() + " ";
			} else if (s.equals("@")) {
				madLib += getRandomVerb() + " ";
			} else if (s.equals("&")) {
				madLib += getRandomAdjective() + " ";
			} else {
				madLib += s + " ";
			}
		}
		return madLib;
	}
}