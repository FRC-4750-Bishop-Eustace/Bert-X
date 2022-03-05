# Bert-X

Updating your branch with changes from Master --
--
1. Open 2022 WPILib VS Code
2. click Terminal -> New Terminal
3. type 'git status'
4. this should output your current branch for git - if this is not your branch, switch to your branch with 'git checkout <your branch name>'(EX git checkout Alex_review)
5. 'git pull' -- this updates your branch with any changes from the github - if any changes need to be committed to your local branch do them now
6. 'git checkout master' -- switches your current branch to master
7. 'git fetch' -- updates all branches from remote repository
8. 'git pull' -- updates master with any changes from the remote repository
9. 'git checkout <your branch name>' -- switches to your branch

  10.'git merge master' this will merge master into your branch

  11.'git status' -- if everything is up to date this will let you know, if there are more issues reach our to Mr. Carlin or Mr. Monari


Git Commands

1. Pull request - click "new pull requests"
2. Select base branch <your branch name>; select compare <master>
3. Click "create pull requests"
4. Create a title and a comment describing what you are doing (EX: title = merge master into my branch; comment = updating my branch with master);
5. Click "create pull requests"
6. If there are merge conficts, select "resolve conflicts"; Then in order to resolve conflicts choose the version that you would like to use and delete the spacers indecateing a merge (======= or >>>>>>> or <<<<<<<)
