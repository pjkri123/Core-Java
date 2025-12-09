/** @author Puja Kumari
 * @version 3.0
 * @since 2014
 */

package com.javadoc;

/**
 *
 * Class for Library Book
 */

public class Book {

    /**
     * @value 10 default value
     */
    static int val=20;

    /**
     * Parameterized Constructor
     * @param s Book Name
     */

    public Book(String s) {}

    /**
     * Issue a Book to a Student
     * @param roll roll number of a Student
     * @throws Exception if book is not available throws Exception
     */

    public void issue(int roll) throws Exception {}

    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available return true else false
     */

    public boolean available(String str) {
        return true;
    }

    /**
     * Get book name
     * @param id Book id
     * @return return book name
     */

    public String getName(int id) {
        return "";
    }
}
