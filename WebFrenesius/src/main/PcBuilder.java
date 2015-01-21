package main;

import java.sql.SQLException;
import java.util.ArrayList;

import matcher.FindComponents;
import matcher.MatcherMain;
import matcher.MatcherMotherboardCompatibility;
import matcher.PriceComponent;
import parsing.ParseHardware;

import components.Motherboard;
import components.WebInput;

public class PcBuilder {
	

	private MatcherMain matcher = new MatcherMain();
	private ParseHardware parseHw = new ParseHardware();
	FindComponents findComponents = new FindComponents();
	MatcherMotherboardCompatibility matchMobo = matcher.matchMobo;

//	}
	/**
	   * This method is used to do a fully matching.
	   * @param componentsInput ArrayList with JSON Strings.
	   * @return ArrayList Returns the result of the checking.
	   */
	public ArrayList fullCheck(ArrayList componentsInput) throws SQLException{
		Motherboard mb = new Motherboard();
		ArrayList selectedComponents = new ArrayList();
	    ArrayList finishedComponents = new ArrayList();
	    System.out.println("[DEBUG] printing componentsInput -> fullChekc()");
	    for(int a  = 0; a<componentsInput.size();a++)
	    	System.out.println(componentsInput.get(a));
	    
	    System.out.println("=========");
	    WebInput webinput = new WebInput();
	    ArrayList bc = webinput.inputWebserverMatchToMobo();
	    System.out.println("Printing matchMobo -> MOTHERBOARD MUST BE MATCHED");
	    for(int b = 0; b<bc.size();b++)
	    	System.out.println(bc.get(b));
	     

	    
	    ArrayList matchedComponents = matcher.determineSelectedComponents(matcher.getHardwareByInput(componentsInput));	
		selectedComponents = matchedComponents;					//Copies the components the user has selected
	    String result = matcher.createQuery(matchedComponents);
	    
	    //If there is a MOBO in the list match everything from motherboard
	    if(result.equals("MOBO"))
	    	mb = findComponents.getMotherboardFromArrayList(matchedComponents);
	    else
	    	mb = matchMobo.matchMotherboard(result);
	    ArrayList g = MatcherMain.matchMobo.getPricesSelectedComponents(selectedComponents);
	    ArrayList x = matcher.matchFromMotherboard(mb);
	    finishedComponents = findComponents.mergeComponentsArrayList(g, x); //Gets prices and merges the cheapest hardware.

	    return finishedComponents;
	}


}
