public class StringMetods{

public static void main(String arg[]){
	String name = "Puneeth Raj";
	boolean result =name.endsWith("Raj");
	System.out.println("endswith: "+result);
	
	    //endsWith
        boolean resultEndsWith = name.endsWith("Raj");
        System.out.println("endsWith: " + resultEndsWith);

       //toUpperCase
        String upperCaseName = name.toUpperCase();
        System.out.println("toUpperCase: " + upperCaseName);

      // toLowerCase
        String lowerCaseName = name.toLowerCase();
        System.out.println("toLowerCase: " + lowerCaseName);

        //  charAt
        char charAtPosition = name.charAt(4);
        System.out.println("charAt(4): " + charAtPosition);

        //  indexOf
        int indexOfChar = name.indexOf('R');
        System.out.println("indexOf('R'): " + indexOfChar);

        //  concat
        String fullName = name.concat(" Kumar");
        System.out.println("concat: " + fullName);

        //  equals
        boolean isEqual = name.equals("Puneeth Raj");
        System.out.println("equals: " + isEqual);

        //  startsWith
        boolean resultStartsWith = name.startsWith("Pun");
        System.out.println("startsWith: " + resultStartsWith);

        //  length
        int lengthOfName = name.length();
        System.out.println("length: " + lengthOfName);
		
		//  replace
        String replacedName = name.replace("Raj", "Kumar");
        System.out.println("replace: " + replacedName);

        //  substring
        String subName = name.substring(8);
        System.out.println("substring(8): " + subName);

        //  contains
        boolean containsResult = name.contains("neeth");
        System.out.println("contains: " + containsResult);

        //  isEmpty
        boolean isEmptyResult = name.isEmpty();
        System.out.println("isEmpty: " + isEmptyResult);

}

}