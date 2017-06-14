/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.database;

import java.util.ArrayList;
/* this class functions as a hash table
 * it contains methods such as add, search, deleting from a hash table
 * this is a public class since the main program needs to access its methods
 */

public class HashTable {

    //NUMBUCKETS ??????
    public int NUMBUCKETS = 3;
    //an arraylist of arrays containing information of type employee is created
    protected ArrayList< Employee>[] hashTable;

    // Constructor
    public HashTable() {
        //this line states that hashTable is an arraylist of 2/NUMBUCKETS
        hashTable = new ArrayList[NUMBUCKETS];

        //every branch of the arraylist is assigned as an arraylist of type employee
        for (int i = 0; i < NUMBUCKETS; i++) {
            hashTable[i] = new ArrayList< Employee>();
        }

    }

    //returns the bucket the new employee should be added to
    public int determineBucketToHash(Employee itemToAdd) {
        //this is done by employeeNumber mod the NUMBUCKETS
        int hashval = itemToAdd.employeeNumber % NUMBUCKETS;
        return (hashval);
    }

    //this method is identical to the above method
    //with the exception that the parameter is an integer (employee number) instead of an employee
    public int determineBucketToHash(int num) {
        int hashval = num % NUMBUCKETS;
        return (hashval);
    }

    //this method adds the employee into the hash table
    public void add(Employee itemToAdd) {
        //after determining which bucket to hash to, the employee is added to the appropriate bucket
        int hashval = determineBucketToHash(itemToAdd);
        hashTable[hashval].add(itemToAdd);
    }

    //searches the hash table for the parameter employee number 
    public Employee search(int employeeNumber) {
        //identify the bucket to search in
        int specificBucket = determineBucketToHash(employeeNumber);

        //determine the branch size of the bucket
        //with that number as the range, create a for loop
        //every time it goes through the for loop, the program checks if the number added as a parameter 
        //is equal to the number in that branch
        for (int k = 0; k < hashTable[specificBucket].size(); k++) {
            if (hashTable[specificBucket].get(k).employeeNumber == employeeNumber) {
                //if they're equal, that employee is returned to the main program
                //if not, nothing happens
                Employee tempEmployee = hashTable[specificBucket].get(k);
                return (tempEmployee);
            }
        }
        //if after the entire for loop no employee is found, a null value is returned to indicate error
        return (null);
    }

    //this method removes the employee with that employee number from the hash table
    public Employee remove(int employeeNumber) {
        //determine the bucket the employee was stored in
        int specificBucket = determineBucketToHash(employeeNumber);

        //using a strategy similar to the search method, the location of that employee is found and removed
        for (int k = 0; k < hashTable[specificBucket].size(); k++) {
            if (hashTable[specificBucket].get(k).employeeNumber == employeeNumber) {
                Employee tempEmployee = hashTable[specificBucket].get(k);
                hashTable[specificBucket].remove(k);
                //the deleted employee's info is returned to the main program to be reprinted
                return (tempEmployee);
            }
        }
        //if after the entire for loop no such employee is found, a null value is returned to indicate error
        return (null);
    }

    //this method returns the number of buckets in the hash table
    public int returnBuckets() {
        return (NUMBUCKETS);
    }

    //this method returns the branch size of the bucket indicated through the parameter
    public int returnBranchSize(int i) {
        return (hashTable[i].size());
    }

    //returns the employee at bucket i and branch j
    public Employee printHash(int i, int j) {
        return (hashTable[i].get(j));
    }
}
