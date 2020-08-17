# CardManagement

Test 1 – Spring Boot

Using the information provided below (in the table) as a guide, write a program that will process the data based on the criteria provided below:
1. Validate the card data entry
2. Sort the data by expiry date into descending order
3. Obfuscate the card number, except the last four digits, with ‘x’
e.g. 5601-2345-3446-5678 becomes xxxx-xxxx-xxxx-5678

Bank details:
Bank Card number Expiry date
HSBC Canada 5601-2345-3446-5678 Nov-2017
Royal Bank of Canada 4519-4532-4524-2456 Oct-2017
American Express 3786-7334-8965-345 Dec-2018

You should wrap this code into a stand-alone web application which can be deployed / run in the following way:

• directly from Maven using Spring Boot
We will be using Java 9+ to run the code. The end user should be able to enter the card data manually, one row at a time, 
or upload a simple CSV file with the columns in the order shown above. Entered data need only be stored for the duration
of the user session and does not need database persistence. The results should be presented on a web page.

Test 2 – Algorithm

Create a simple program that can be executed from the command line, as follows:
1. takes a single numeric input that must be an integer
2. writes to the console the sum of the digits in that number
e.g. entering 17 prints “8” and entering 1234 prints “10”

NOTE:
Your code for both tests should be shared on a public Git repository such as Github or bitbucket.
It should include everything necessary to build the application, assuming the builder
already has a JDK present, and a tool such as Maven or Ant installed.
