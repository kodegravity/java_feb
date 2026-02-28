## Recap 
1. EC2 
2. linux commands 

cp - copy 
mv - rename a file 
rm - remove a file / delete a file 

cat file_name - to see the content of the file without opening 

mkdir - to create a directory 
cd    - to change a directory 
cd .. -- to go back to previous directory 
rmdir - to delete the directory 
rm -r - to delete directory with content inside 

                        Main                                        D
        |                 |                 |
        src               package           others                  D
        Test.java         test.py           readme.md               F


            /

## File Permissions 
examnple ---->   -rw-r--r--.
rw-    => owner permission 
r--    => group permission 
r--    => other permssion 

r - read , w - write , x - execute 

chmod 777 file_name 

0 - no permission
1 - execute permission 
2 - write permission 
3 - write and execute permission 
4 - read permission 
5 - read and execute 
6 - read and write 
7 - all permissions


Test.java -
owner all permssion and rest read only 

test.py 
all permission to owner and group , rest no permission 

readme - 
owner read and write 
and rest read only permission 



## Grep 

grep keyword file_name 
---> -v , -n, -i 

## Sort 
sort file_name
sort -r file_name


## Shell Scripting 


basically automation script using the command line to perform as specific ops. 

Shell

sh - Bourne shell 
bash - Bourne Again shell 
zsh - advanced interactive shell

#!/bin/bash
my_variable="Hello, World!!!"
echo "$my_variable"

to run ./hello.sh

lang=Java 
city=Toronto

O/P
Hello I am learning Java. I live in Toronto

















