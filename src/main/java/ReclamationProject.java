/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**Class that is an example of how to NOT write code.
 *
 */
public class ReclamationProject {

    /**Method to find and return the largest matching substring in the two strings.
     *
     * @param firstString the first string to be parsed for a matching substring
     * @param secondString the second string to be parsed for a matching substring
     * @return the largest matching section of the two strings
     */
    static String matchingSection(final String firstString, final String secondString) {
        String str1;
        String str2;
        String strResult = "";
        //ensure that firstString is shorter
        if (firstString.length() > secondString.length()) {
            str1 = secondString;
            str2 = firstString;
        } else {
            str1 = firstString;
            str2 = secondString;
        }
        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length() - i; j > 0; j--) {
                for (int k = 0; k < str2.length() - j; k++) {
                    if (j > strResult.length() && str1.regionMatches(i,  str2,  k,  j)) {
                        strResult = str1.substring(i, i + j);
                    }
                }
            }
        }
        return strResult;
    }
}
