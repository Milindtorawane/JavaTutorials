package java_basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractText {
	
	
	
	public static void main(String[] args){
	String s = "Hi there! My name is Phil. Nice to meet you.";
	
	String input = "005 & 005";
	input = input.replaceAll("\\s+","");
	System.out.println(input);
			
	
	
	
	String url="https://eapps.courts.state.va.us/gdcourts/criminalCivilCaseSearch.do?fromSidebar=true&formAction=searchLanding&searchDivision=T&searchFipsCode=005";
	
	//String str = "manchester united (with nice players)";
	System.out.println(url.replace("https://eapps.courts.state.va.us/gdcourts/criminalCivilCaseSearch.do?fromSidebar=true&formAction=searchLanding&searchDivision=T&searchFipsCode=", ""));
	Pattern p1 = Pattern.compile("https://eapps.courts.state.va.us/gdcourts/criminalCivilCaseSearch.do?fromSidebar=true&formAction=searchLanding&searchDivision=T&searchFipsCode= (\\w*)", Pattern.CASE_INSENSITIVE);
//	Pattern p = Pattern.compile("my name is (\\w*)", Pattern.CASE_INSENSITIVE);
	Matcher m1 = p1.matcher(url);
	//Matcher m = p.matcher(s);
	if (m1.find()) {
	    System.out.println(m1.group(1));
	} else {
	    System.out.println("No match to " + url);
	}
	
	}

}
