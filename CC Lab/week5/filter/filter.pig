student_details = LOAD 'Student_details.txt' USING
PigStorage(',') as (id:int, firstname:chararray, lastname:chararray, age:int, phone:chararray,city:chararray);
filter_data = FILTER student_details BY city == 'Chennai';
Dump filter_data;
