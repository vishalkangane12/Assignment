# Assignment
Nitya Software's Assignments

Assignment
Please write code for the following questions.
1) Write any Java program that will have the following statement as one of the lines in the code. It should not be part of a comment or String. It should be a valid Java Expression. Program does not have to read or print anything. And it should compile and run without errors.

a.b.c = c.b.a;

2) Write a program to scan a given folder and print the counts of files grouped by created month(i.e the month in which it is created, like Jan, Feb etc)
2.1) Write the example output of the above program first.
2.2) Then write the actual implementation.


Solution:
2.1)
Step 1) Find date of creation of files in a directory:
Mon Oct 02 10:03:14 IST 2017
Fri Oct 13 17:00:48 IST 2017
Thu Feb 07 22:54:19 IST 2019
Mon Oct 02 10:33:17 IST 2017
Sun Apr 07 11:03:28 IST 2019
Mon Oct 02 10:34:02 IST 2017
Sat Aug 08 07:26:31 IST 2020
Tue Feb 20 11:26:49 IST 2018
Fri Feb 16 17:55:17 IST 2018
Mon Oct 02 10:34:06 IST 2017
Mon Oct 02 10:34:29 IST 2017
Mon Oct 02 10:34:49 IST 2017
Sat Aug 08 07:27:53 IST 2020
Sat Oct 07 19:00:14 IST 2017
Tue Feb 20 11:24:36 IST 2018
Mon Aug 20 19:10:51 IST 2018
Wed Aug 08 16:04:13 IST 2018
Mon Dec 30 09:47:11 IST 2019
Thu Dec 07 10:07:26 IST 2017
Mon Oct 02 09:45:38 IST 2017
Tue Feb 20 08:21:09 IST 2018
Tue Feb 13 18:07:22 IST 2018
Thu Feb 07 22:47:11 IST 2019
Wed Mar 14 15:14:58 IST 2018

Step 2) Group them by the month of creation and show counts.

Output/Expected Result:
{Oct=9, Feb=7, Apr=1, Aug=4, Dec=2, Mar=1}
