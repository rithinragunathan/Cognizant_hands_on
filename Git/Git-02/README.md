
rithi@RITHIN MINGW64 ~/GitDemo (main)
$ mkdir log/

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ touch loger.log

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ echo "*.log" >> .gitignore

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ ls -al
total 34
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:48 ./
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:38 ../
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:39 .git/
-rw-r--r-- 1 rithi 197609  6 Jul 25 14:48 .gitignore
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:46 log/
-rw-r--r-- 1 rithi 197609  0 Jul 25 14:47 loger.log
-rw-r--r-- 1 rithi 197609 31 Jul 25 14:29 welcome.txt

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ mv loger.log ./loger

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ ls -al
total 34
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:49 ./
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:38 ../
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:39 .git/
-rw-r--r-- 1 rithi 197609  6 Jul 25 14:48 .gitignore
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:46 log/
-rw-r--r-- 1 rithi 197609  0 Jul 25 14:47 loger
-rw-r--r-- 1 rithi 197609 31 Jul 25 14:29 welcome.txt

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ cd log

rithi@RITHIN MINGW64 ~/GitDemo/log (main)
$ npp logger.log

rithi@RITHIN MINGW64 ~/GitDemo/log (main)
$ npp .gitignore

