SOFTWARE: BlueJ(IDE)
BOOK: Object First with Java | Sixth Edition | Chapter 5
PROJECT TITLE: cdLibrary
PURPOSE OF PROJECT: University weekly assignment
VERSION or DATE: October 2019
AUTHOR: Plamen Savchev 

ASSIGNMENT INSTRUCTIONS:

Individual Assessed Homework 2
October 2019

This assignment is to model part of a library service that allows CDs to be borrowed from its collection.  All parts of this assignment are based upon the material in Worksheets 1 & 2, Chapter 2 & the slides Supplementary Material 1.  The code that you write should be of a similar standard to the code given in the Barnes and Kolling book.  For each stage of this assignment, you should include in your code any checks on input that you think appropriate and take action accordingly.

Step 1: basic setting up of the CD class
The basic CD class should have
•	four fields, title, artist, noOfTracks and cost (of the CD to the library);
•	a constructor, which allows you to pass arguments to initialise these four attributes;
•	accessor methods for each field as well as a printReport() method.

Step 2: adding functionality to the CD class
•	add a field, inStock, to store whether the CD is presently in stock or whether it has been 
	borrowed;
•	add a field, borrower  to store the name of the person who has borrowed the CD;
•	write a method borrow() which allows a person to borrow a CD and which takes as a parameter the name of the borrower;
•	write a method reportInStock() to print to the terminal window whether the CD is in stock or whether it has been borrowed. If it has been borrowed, it should also report the name of the borrower;
•	add code to keep track of the number of times this CD has been borrowed;
•	write a method returnCD() which allows a person to return a borrowed CD.

Now re-consider the printReport() method in the light of your latest changes and, if you think it appropriate, make changes to this method too.

Step 3: So far, testing of the program has been quite repetitive and always starts from scratch. However, we could introduce a default constructor with the field values hard-coded. This means that when we create our object and then call this default constructor, it is as though our object has been in existence for some time. This will help particularly with your testing. Introduce a second, default constructor now.

The library now decides to charge borrowers to borrow each of its CDs. Think what extra code you will need and add code to your project which allows this. 
Then
•	write a method calculateEarnings() which calculates how much money this particular CD has earnt the library;
•	do not add an extra field to keep track of the running earnings total.
•	Now amend your printReport() method to include this new information i.e. the earnt money, again without creating any new field(s) 

Step 4: Introduce a new class, called Borrower to the project. Its purpose is to represent the borrower of the CD. It should have
•	two fields surname and libraryId;
•	a suitable constructor and accessor methods.

For this last part below, you will modify existing code by commenting out a few lines. Do not delete any code as marks are allocated to these lines of code. 

Now modify the CD class so that instead of a field for the name of a borrower, you have a field that points to a Borrower object. Revisit your methods above to take account of this latest change.

To test your code
•	create a Borrower object;
•	create a CD object, and pass to its constructor values for its fields;
•	call the method borrow() and pass to it the identifier for the Borrower object e.g. borrower1 (or, more easily, click on the Borrower object on the Object Bench);
•	inspect the CD object using the Object Inspector. If you then double click on the borrower field, a new Object Inspector window will open and you should see the fields of the Borrower object you created -- this will confirm that your code for Step 4 is working correctly.

Now amend the printReport()method of the CD class so that it also outputs the surname of the borrower. 


Hand in details

Hand in a hard copy (i.e. printed paper) of your code to Dr D E Newton at your workshop on 31st October 2019 in a plastic wallet.

Your name should be on the front page with your Java group i.e. 1, 2, 3, 4, 5, 6 or 7. 

Note that by the act of following these instructions and handing your work in, it is deemed that you have read and understand the rules on plagiarism as written in your student handbook.

