
rithi@RITHIN MINGW64 ~
$ git init GitDemo
Reinitialized existing Git repository in C:/Users/rithi/GitDemo/.git/

rithi@RITHIN MINGW64 ~
$ cd  C:/Users/rithi/GitDemo/

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ ls -al
total 28
drwxr-xr-x 1 rithi 197609 0 Jul 25 14:27 ./
drwxr-xr-x 1 rithi 197609 0 Jul 25 14:27 ../
drwxr-xr-x 1 rithi 197609 0 Jul 25 14:28 .git/

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ echo "Welcome to the Version control" >> welcome.txt

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ ls -al
total 29
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:29 ./
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:27 ../
drwxr-xr-x 1 rithi 197609  0 Jul 25 14:28 .git/
-rw-r--r-- 1 rithi 197609 31 Jul 25 14:29 welcome.txt

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ cat welcome.txt
Welcome to the Version control

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git status
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        welcome.txt

nothing added to commit but untracked files present (use "git add" to track)

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git add .
warning: in the working copy of 'welcome.txt', LF will be replaced by CRLF the next time Git touches it

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git commit
Aborting commit due to empty commit message.

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git commit
Aborting commit due to empty commit message.

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   welcome.txt


rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git pull https://github.com/rithinragunathan/GitDemo.git
fatal: couldn't find remote ref HEAD

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git remote add origin https://github.com/rithinragunathan/GitDemo.git

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git branch -M maingit branch -M main
fatal: too many arguments for a rename operation

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git branch -M main

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git push -u origin main
error: src refspec main does not match any
error: failed to push some refs to 'https://github.com/rithinragunathan/GitDemo.git'

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git remote add origin https://github.com/rithinragunathan/GitDemo.git
error: remote origin already exists.

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git push origin master
error: src refspec master does not match any
error: failed to push some refs to 'https://github.com/rithinragunathan/GitDemo.git'

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git pull origin master
fatal: couldn't find remote ref master

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   welcome.txt


rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git commit
Aborting commit due to empty commit message.

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git commit -m "initial commit"
[main (root-commit) 63d034f] initial commit
 1 file changed, 1 insertion(+)
 create mode 100644 welcome.txt

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git pull origin master
fatal: couldn't find remote ref master

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git push origin master
error: src refspec master does not match any
error: failed to push some refs to 'https://github.com/rithinragunathan/GitDemo.git'

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git branch
* main

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ ggit remote -v
bash: $'\302\226git': command not found

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git push -u origin main
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 246 bytes | 246.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/rithinragunathan/GitDemo.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

