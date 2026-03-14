## recap 

git 
github 

how to push to github 

git add 
git commit 
git log
git push
git pull 


## branching 
git branch
git checkout branch_name   - checkout to branch_name
git checkout -b branch_name - create a new branch and checkout to that branch



## ENVIRONMENT
                                FACEBOOK
PRODUCTION  - PROD              www.facebook.com   : 1B users  - LIVE for end users
STAGING     - STAG / Pre prod   www.stag.facebook.com    internal users    , 20K users       
DEVELOPMENT - DEV / QA          www.dev.facebook.com : developers can access 500 developers

CODE ------> deploy to DEV environment and test it 


## Branching strategy

master  [5] + 3 = [8]
 |
staging[5] + 3         <-----   feature_sunny[5]    + 1 + 1 + 1  = [8]
  |
develop[5] + 3 = [8]




merge to develop ------> CI/CD [jenkins/github actions]  ---> www.dev.facebook.com


master =    1
    |
staging =   2
    |
feature =   4



Task 

1. create a branch from staging ------> feature_yourname
add one java file

merge your code to develop and if there is any issue fix it . 

and merge your code to staging 
and merge staging to master 



## create a PR  from your branch to staging branch. 

