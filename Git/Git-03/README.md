## Github link : https://github.com/rithinragunathan/GitDemo
rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git branch GitNewBranch
fatal: a branch named 'GitNewBranch' already exists

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git branch -a
  GitNewBranch
* main
  remotes/origin/main

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git checkout GitNewBranch
echo "Initial content for GitNewBranch" > sample.txt
Switched to branch 'GitNewBranch'

rithi@RITHIN MINGW64 ~/GitDemo (GitNewBranch)
$ git add sample.txt
git commit -m "Add sample.txt in GitNewBranch"
warning: in the working copy of 'sample.txt', LF will be replaced by CRLF the next time Git touches it
[GitNewBranch b6ca894] Add sample.txt in GitNewBranch
 1 file changed, 1 insertion(+)
 create mode 100644 sample.txt

rithi@RITHIN MINGW64 ~/GitDemo (GitNewBranch)
$ git status
On branch GitNewBranch
nothing to commit, working tree clean

rithi@RITHIN MINGW64 ~/GitDemo (GitNewBranch)
$ git push -u origin GitNewBranch
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 16 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 393 bytes | 393.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'GitNewBranch' on GitHub by visiting:
remote:      https://github.com/rithinragunathan/GitDemo/pull/new/GitNewBranch
remote:
To https://github.com/rithinragunathan/GitDemo.git
 * [new branch]      GitNewBranch -> GitNewBranch
branch 'GitNewBranch' set up to track 'origin/GitNewBranch'.

rithi@RITHIN MINGW64 ~/GitDemo (GitNewBranch)
$ git branch -a
* GitNewBranch
  main
  remotes/origin/GitNewBranch
  remotes/origin/main

rithi@RITHIN MINGW64 ~/GitDemo (GitNewBranch)
$ git status
On branch GitNewBranch
Your branch is up to date with 'origin/GitNewBranch'.

nothing to commit, working tree clean

rithi@RITHIN MINGW64 ~/GitDemo (GitNewBranch)
$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git diff main..GitNewBranch
diff --git a/sample.txt b/sample.txt
new file mode 100644
index 0000000..ff259b0
--- /dev/null
+++ b/sample.txt
@@ -0,0 +1 @@
+Initial content for GitNewBranch

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git diff --stat main..GitNewBranch
 sample.txt | 1 +
 1 file changed, 1 insertion(+)

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git config --global diff.tool p4merge
git config --global difftool.p4merge.path "C:/Program Files/Perforce/p4merge.exe"

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git config --global diff.tool p4merge

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git config --global diff.tool p4merge

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git config --global difftool.p4merge.path "C:/Program Files/Perforce/p4merge.exe"

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git difftool main..GitNewBranch

Viewing (1/1): 'sample.txt'
Launch 'p4merge' [Y/n]? y

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git merge GitNewBranch
Updating c5d1ecb..b6ca894
Fast-forward
 sample.txt | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 sample.txt

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git log –oneline –graph –decorate
fatal: ambiguous argument '–oneline': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git log --oneline --graph --decorate --all
* b6ca894 (HEAD -> main, origin/GitNewBranch, GitNewBranch) Add sample.txt in GitNewBranch
* c5d1ecb (origin/main) initial commit

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git branch -d GitNewBranch
Deleted branch GitNewBranch (was b6ca894).

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git status
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

rithi@RITHIN MINGW64 ~/GitDemo (main)
$
