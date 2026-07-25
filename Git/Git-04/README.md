rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git status
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git checkout -b GitWork
fatal: a branch named 'GitWork' already exists

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git status
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git switch GitWork
Switched to branch 'GitWork'

rithi@RITHIN MINGW64 ~/GitDemo (GitWork)
$ echo "<message>Hello from GitWork</message>" > hello.xml

rithi@RITHIN MINGW64 ~/GitDemo (GitWork)
$ echo "<version>1.0</version>" >> hello.xml

rithi@RITHIN MINGW64 ~/GitDemo (GitWork)
$ git add hello.xml
git commit -m "Added hello.xml in GitWork"
warning: in the working copy of 'hello.xml', LF will be replaced by CRLF the next time Git touches it
[GitWork 7062681] Added hello.xml in GitWork
 1 file changed, 1 insertion(+)

rithi@RITHIN MINGW64 ~/GitDemo (GitWork)
$ git switch main
Switched to branch 'main'
Your branch is ahead of 'origin/main' by 1 commit.
  (use "git push" to publish your local commits)

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ echo "<message>Hello from Master</message>" > hello.xml

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ echo "<author>Admin</author>" >> hello.xml

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git add hello.xml
git commit -m "Added hello.xml in main"
warning: in the working copy of 'hello.xml', LF will be replaced by CRLF the next time Git touches it
[main e9afe1d] Added hello.xml in main
 1 file changed, 2 insertions(+)
 create mode 100644 hello.xml

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git log --oneline --graph --decorate --all
* e9afe1d (HEAD -> main) Added hello.xml in main
| * 7062681 (GitWork) Added hello.xml in GitWork
| * 4e73c07 Added file
|/
* b6ca894 (origin/GitNewBranch) Add sample.txt in GitNewBranch
* c5d1ecb (origin/main) initial commit

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git diff GitWork main
diff --git a/hello.xml b/hello.xml
index 1ba04aa..95bf4ab 100644
--- a/hello.xml
+++ b/hello.xml
@@ -1,2 +1,2 @@
-<message>Hello from GitWork</message>
-<version>1.0</version>
+<message>Hello from Master</message>
+<author>Admin</author>

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git difftool master GitWork
fatal: ambiguous argument 'master': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'

rithi@RITHIN MINGW64 ~/GitDemo (main|MERGING)
$ git difftool main GitWork

rithi@RITHIN MINGW64 ~/GitDemo (main|MERGING)
$ unch 'p4merge' [Y/n]?

rithi@RITHIN MINGW64 ~/GitDemo (main|MERGING)
$
Auto-merging hello.xml
rithi@RITHIN MINGW64 ~/GitDemo (main|MERGING)ml
$ tomatic merge failed; fix conflicts and then commit the result.

rithi@RITHIN MINGW64 ~/GitDemo (main|MERGING)
$ vi hello.xml

rithi@RITHIN MINGW64 ~/GitDemo (main|MERGING)
$ vi hello.xml

rithi@RITHIN MINGW64 ~/GitDemo (main|MERGING)
$ git add hello.xml

rithi@RITHIN MINGW64 ~/GitDemo (main|MERGING)
$ git commit -m "Resolved merge conflict"
[main 29c8582] Resolved merge conflict

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git status
On branch main
Your branch is ahead of 'origin/main' by 5 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ echo "*.bak" > .gitignore

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git add .gitignore
git commit -m "Added backup files to gitignore"
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
[main 82f8bec] Added backup files to gitignore
 1 file changed, 1 insertion(+), 1 deletion(-)

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git branch
  GitWork
* main

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git branch -d GitWork
Deleted branch GitWork (was 7062681).

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git log --oneline --graph --decorate
* 82f8bec (HEAD -> main) Added backup files to gitignore
*   29c8582 Resolved merge conflict
|\
| * 7062681 Added hello.xml in GitWork
| * 4e73c07 Added file
* | e9afe1d Added hello.xml in main
|/
* b6ca894 (origin/GitNewBranch) Add sample.txt in GitNewBranch
* c5d1ecb (origin/main) initial commit

rithi@RITHIN MINGW64 ~/GitDemo (main)
$
