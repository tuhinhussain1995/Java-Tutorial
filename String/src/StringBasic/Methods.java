package StringBasic;

import java.util.*;

public class Methods {
    public static void display(){

        // charAt(index) ----------------- char =========> It returns the character at the specified index.
        // equals(obj) ------------------- boolean ======> Compares the string with the specified string and returns true if both matches else false.
        // equalsIgnoreCase(string) ------ boolean ======> It works same as equals method but it doesn’t consider the case while comparing strings. It does a case insensitive comparison.
        // compareTo(string) ------------- int ==========> If both the strings are equal then this method returns 0 else it returns positive or negative value.
        // compareToIgnoreCase(string) --- int ==========> method compares two strings lexicographically and returns 0 if they are equal.
        // startsWith(String) ------------ boolean ======> It tests whether the string is having specified prefix, if yes then it returns true else false.
        // startsWith(String, startInd) -- boolean ======> It checks whether the substring (starting from the specified offset index) is having the specified prefix or not.
        // endsWith(String) -------------- boolean ======> Checks whether the string ends with the specified suffix.
        // hashCode() -------------------- int ==========> It returns the hash code of the string.
        // indexOf(char) ----------------- int ==========> Returns the index of first occurrence of the specified character ch in the string.
        // indexOf(char, fromIndex) ------ int ==========> Same as indexOf method however it starts searching in the string from the specified fromIndex.
        // lastIndexOf(char) ------------- int ==========> It returns the last occurrence of the character ch in the string.
        // lastIndexOf(char, fromIndex) -- int ==========> Same as lastIndexOf(int ch) method, it starts search from fromIndex.
        // indexOf(String) --------------- int ==========> This method returns the index of first occurrence of specified substring str.
        // lastIndexOf(String) ----------- int ==========> Returns the index of last occurrence of string str.
        // substring(beginIndex) --------- String =======> It returns the substring of the string. The substring starts with the character at the specified index.
        // substring(beginInd, endInd) --- String =======> Returns the substring. The substring starts with character at beginIndex and ends with the character at endIndex.
        // concat(String str) ------------ String =======> Concatenates the specified string “str” at the end of the string.
        // contains(CharSequence) -------- boolean ======> It checks whether the string contains the specified sequence of char values. If yes then it returns true else false. It throws NullPointerException of ‘s’ is null.
        // toUpperCase() ----------------- String =======> Equivalent to toUpperCase(Locale.getDefault()).
        // isEmpty() --------------------- boolean ======> This method returns true if the given string has 0 length. If the length of the specified Java String is non-zero then it returns false.
        // join(joinWith, obj) ----------- String =======> This method joins the given strings using the specified delimiter and returns the concatenated Java String
        // replace(oldChar, newChar) ----- String =======> It returns the new updated string after changing all the occurrences of oldChar with the newChar.
        // replace(String, String) ------- String =======> It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.
        // replaceFirst(String, String) -- String =======> It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.
        // replaceAll(String, String) ---- String =======> It replaces all the occurrences of substrings that fits the regular expression regex with the replacement string.
        // split(String) ----------------- String[] =====> It splits the string and returns the array of substrings that matches the given regular expression.
        // toLowerCase() ----------------- String =======> It converts the string to lower case string.
        // format(%, obj) ---------------- String =======> This method returns a formatted java String
        // trim() ------------------------ String =======> Returns the substring after omitting leading and trailing white spaces from the original string.
        // toCharArray(): ---------------- char[] =======> Converts the string to a character array.
        // copyValueOf(char[]) ----------- String =======> It returns a string that contains the characters of the specified character array.
        // copyValueOf(char[], startFrom, length) ----- String =====> Same as above method with two extra arguments – initial offset of subarray and length of subarray.
        // valueOf(obj) ----------------- String ========> This method returns a string representation of passed arguments such as int, long, float, double, char and char array.
        // contentEquals(String) -------- boolean =======> It compares the string to the specified string buffer.
        // length() --------------------- int ===========> It returns the length of a String.
        // matches(String) -------------- boolean =======> It checks whether the String is matching with the specified regular expression regex.


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// charAt(index) ----------------- char =========> It returns the character at the specified index.
        String str = "Welcome to string handling tutorial";
        
        System.out.println(str.charAt(3));

        char ch1 = str.charAt(0);
        System.out.println("Character at 0 index is: "+ch1);


// equals(obj) ------------------- boolean ======> Compares the string with the specified string and returns true if both matches else false.
        String str1= new String("Hello");
        String str2= new String("Hi");
        String str3= new String("Hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals("Welcome"));
        System.out.println(str1.equals("Hello"));
        System.out.println(str1.equals("hello"));


// equalsIgnoreCase(string) ------ boolean ======> It works same as equals method but it doesn’t consider the case while comparing strings. It does a case insensitive comparison.
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase("Welcome"));
        System.out.println(str1.equalsIgnoreCase("Apple"));
        System.out.println(str2.equalsIgnoreCase("mango"));


// compareTo(string) ------------- int ==========> If both the strings are equal then this method returns 0 else it returns positive or negative value.
        String st1 = "Cow";
        String st2 = "Goat";
        String st3 = "";

        System.out.println(st1.compareTo(st2));
        System.out.println(st2.compareTo(st3));
        System.out.println(st2.compareTo("Cow"));


// compareToIgnoreCase(string) --- int ==========> method compares two strings lexicographically and returns 0 if they are equal.
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str1.compareToIgnoreCase("hEllO"));


// startsWith(String) ------------ boolean ======> It tests whether the string is having specified prefix, if yes then it returns true else false.
        System.out.println(str.startsWith("Welcome"));
        System.out.println(str.startsWith("Hello"));


// startsWith(String, startInd) -- boolean ======> It checks whether the substring (starting from the specified offset index) is having the specified prefix or not.
        System.out.println(str.startsWith("string", 11));
        System.out.println(str.startsWith("Hello", 11));


// endsWith(String) -------------- boolean ======> Checks whether the string ends with the specified suffix.
        System.out.println(str.endsWith("tutorial"));
        System.out.println(str.endsWith("Hello"));


// hashCode() -------------------- int ==========> It returns the hash code of the string.
        System.out.println(str.hashCode());


// indexOf(char) ----------------- int ==========> Returns the index of first occurrence of the specified character ch in the string.
        System.out.println(str.indexOf('B'));
        System.out.println(str.indexOf(str2));
        System.out.println(str.indexOf(str3));
        System.out.println(str.indexOf("is"));


// indexOf(char, fromIndex) ------ int ==========> Same as indexOf method however it starts searching in the string from the specified fromIndex.
        System.out.println(str.indexOf('B', 15));
        System.out.println(str.indexOf('B', 30));
        System.out.println(str.indexOf(str2, 15));
        System.out.println(str.indexOf("is", 4));


// lastIndexOf(char) ------------- int ==========> It returns the last occurrence of the character ch in the string.
        System.out.println(str.lastIndexOf('B'));
        System.out.println(str.lastIndexOf(str2));
        System.out.println(str.lastIndexOf(str3));
        System.out.println(str.lastIndexOf("is"));


// lastIndexOf(char, fromIndex) -- int ==========> Same as lastIndexOf(int ch) method, it starts search from fromIndex.
        System.out.println(str.lastIndexOf('B', 15));
        System.out.println(str.lastIndexOf('B', 30));
        System.out.println(str.lastIndexOf(str2, 15));
        System.out.println(str.lastIndexOf("is", 4));


// indexOf(String) --------------- int ==========> This method returns the index of first occurrence of specified substring str.
        System.out.println(str.indexOf(str2));
        System.out.println(str.indexOf(str3));
        System.out.println(str.indexOf("is"));


// lastIndexOf(String) ----------- int ==========> Returns the index of last occurrence of string str.
        System.out.println(str.lastIndexOf(str2));
        System.out.println(str.lastIndexOf(str3));
        System.out.println(str.lastIndexOf("is"));


// substring(beginIndex) --------- String =======> It returns the substring of the string. The substring starts with the character at the specified index.
        System.out.println(str.substring(15));


// substring(beginInd, endInd) --- String =======> Returns the substring. The substring starts with character at beginIndex and ends with the character at endIndex.
        System.out.println(str.substring(15, 20));


// concat(String str) ------------ String =======> Concatenates the specified string “str” at the end of the string.
        String sr1 = "Welcome";
        sr1 = sr1.concat(" to ");
        sr1 = sr1.concat(" String handling ");
        System.out.println(sr1);

        String sr2 = "This";
        sr2 = sr2.concat(" is").concat(" just a").concat(" String");
        System.out.println(sr2);


// contains(CharSequence) -------- boolean ======> It checks whether the string contains the specified sequence of char values. If yes then it returns true else false.
        str = "Do you like watching Game of Thrones";

        System.out.println(str.contains("Like"));
        System.out.println(str.contains("Game"));
        System.out.println(str.contains("Game of"));


// toUpperCase() ----------------- String =======> Equivalent to toUpperCase(Locale.getDefault()).
        System.out.println(str.toUpperCase());
        System.out.println(str1.toUpperCase());


// isEmpty() --------------------- boolean ======> This method returns true if the given string has 0 length. If the length of the specified Java String is non-zero then it returns false.
        str1="";
        str2="hello";

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());


// join(joinWith, obj) ----------- String =======> This method joins the given strings using the specified delimiter and returns the concatenated Java String
        str=String.join("^","You","are","Awesome");
        System.out.println(str);

        List <String> list= Arrays.asList("Steve", "Rick", "Peter", "Abbey");
        String names = String.join(" | ", list);
        System.out.println(names);


// replace(oldChar, newChar) ----- String =======> It returns the new updated string after changing all the occurrences of oldChar with the newChar.
        System.out.println(str.replace('o', 'p'));
        System.out.println(str.replace('i', 'K'));


// replace(String, String) ------- String =======> It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.
        System.out.println(str.replace("tutorial", "lecture"));
        System.out.println(str.replace("Tuhin", "Nazrul"));


// replaceFirst(String, String) -- String =======> It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.
        str = new String("My .com site is BeginnersBook.com");

        System.out.println(str.replaceFirst("com", "net"));

        System.out.println(str.replaceFirst("Beginners(.*)", "XYZ.com"));            // (.*) means all
        System.out.println(str.replaceFirst("(.*)Beginners(.*)", "Welcome"));             // (.*) means all


// replaceAll(String, String) ---- String =======> It replaces all the occurrences of substrings that fits the regular expression regex with the replacement string. difference between replaceFirst() and replaceAll() method is that the replaceFirst() replaces the first occurrence while replaceAll() replaces all the occurrences.
        String strr = new String("My .com site is BeginnersBook.com");

        System.out.println(strr.replaceAll("com", "net"));

        System.out.println(str.replaceAll("Beginners(.*)", "XYZ.com"));            // (.*) means all
        System.out.println(strr.replaceAll("(.*)Beginners(.*)", "Welcome"));             // (.*) means all


// split(String) ----------------- String[] =====> It splits the string and returns the array of substrings that matches the given regular expression.
        // First:
        String t = "My name is Chaitanya";
        String[] arr = t.split(" ");

        for (String s : arr){
            System.out.println(s);
        }

        // Second:
        String r = "helloxyzhixyzbye";
        String[] arrr = r.split("xyz");

        for (String s : arrr){
            System.out.println(s);
        }

        // Third:
        String s = " ,ab;gh,bc;pq#kk$bb";
        String[] st = s.split("[,;#$]");

        System.out.println("Number of substrings: "+st.length);

        for (int i=0; i < st.length; i++) {
            System.out.println("Str["+i+"]:"+st[i]);
        }


// toLowerCase() ----------------- String =======> It converts the string to lower case string.
        System.out.println(str.toLowerCase());


// format(%, obj) ---------------- String =======> This method returns a formatted java String
        String tr1 = String.format("%d", 15); // Integer value
        String tr2 = String.format("%s", "BeginnersBook.com"); // String
        String tr3 = String.format("%f", 16.10); // Float value
        String tr4 = String.format("%x", 189);  // Hexadecimal value
        String tr5 = String.format("%c", 'P');  // Char value

        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);
        System.out.println(tr4);
        System.out.println(tr5);


// trim() ------------------------ String =======> Returns the substring after omitting leading and trailing white spaces from the original string.
        String sttr = new String("    How are you??   ");

        System.out.println("String before trim: "+sttr);
        System.out.println("String after trim: "+sttr.trim());

// toCharArray(): ---------------- char[] =======> Converts the string to a character array.
        str = new String("Welcome to BeginnersBook.com");

        char[] array= str.toCharArray();

        for(char c: array){
            System.out.print(c);
        }


// copyValueOf(char[]) ----------- String =======> It returns a string that contains the characters of the specified character array.
        char[] data = {'a','b','c','d','e','f','g','h','i','j','k'};
        String r1 = "Text";

        r1 = r1.copyValueOf(data);                      // remove the previous value and create new one.
        System.out.println("str1 after copy: " + r1);


// copyValueOf(char[], startFrom, length) ----- String =====> Same as above method with two extra arguments – initial offset of subarray and length of subarray.
        String r2 = "";

        r2 = r2.copyValueOf(data, 5, 3 );
        System.out.println("str2 after copy: " + r2);


// valueOf(obj) ----------------- String ========> This method returns a string representation of passed arguments such as int, long, float, double, char and char array.
        int i = 10;
        float f = 10.10f;
        long l = 111L;
        double d = 2222.22;
        char ch = 'A';
        char[] array1 = {'a', 'b', 'c'};

        String v1 = String.valueOf(i);
        String v2 = String.valueOf(f);
        String v3 = String.valueOf(l);
        String v4 = String.valueOf(d);
        String v5 = String.valueOf(ch);
        String v6 = String.valueOf(array1);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);


// contentEquals(String) -------- boolean =======> It compares the string to the specified string buffer.
        String p1 = "First String";
        String p2 = "Second String";
        String p3 = new String( "Second String");
        String p4 = new String( "First String");
        System.out.println("str1 equals to str3:"+p1.contentEquals(p3));
        System.out.println("str2 equals to str3:"+p2.contentEquals(p3));
        System.out.println("str1 equals to str4:"+p1.contentEquals(p4));
        System.out.println("str2 equals to str4:"+p2.contentEquals(p4));


// length() --------------------- int ===========> It returns the length of a String.
        System.out.println(str.length());
        System.out.println(sr1.length());


// matches(String) -------------- boolean =======> It checks whether the String is matching with the specified regular expression regex.
        str = new String("Java String Methods");

        System.out.println(str.matches("(.*)String(.*)"));

        System.out.println(str.matches("(.*)Strings(.*)"));

        System.out.println(str.matches("(.*)Methods"));


    }

}
