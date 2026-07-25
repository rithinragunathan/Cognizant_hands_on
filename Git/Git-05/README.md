
rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git status
On branch main
Your branch is ahead of 'origin/main' by 6 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

rithi@RITHIN MINGW64 ~/GitDemo (main)
$~git branch
* main

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git pull origin main
remote: Enumerating objects: 1, done.
remote: Counting objects: 100% (1/1), done.
remote: Total 1 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (1/1), 906 bytes | 151.00 KiB/s, done.
From https://github.com/rithinragunathan/GitDemo
 * branch            main       -> FETCH_HEAD
   c5d1ecb..f67ae64  main       -> origin/main
Merge made by the 'ort' strategy.

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ ggit push origin main
bash: $'\302\226git': command not found

rithi@RITHIN MINGW64 ~/GitDemo (main)
$ git push origin main
Enumerating objects: 18, done.
Counting objects: 100% (18/18), done.
Delta compression using up to 16 threads
Compressing objects: 100% (14/14), done.
Writing objects: 100% (16/16), 1.52 KiB | 779.00 KiB/s, done.
Total 16 (delta 7), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (7/7), done.
To https://github.com/rithinragunathan/GitDemo.git
   f67ae64..2315460  main -> main

rithi@RITHIN MINGW64 ~/GitDemo (main)
$




