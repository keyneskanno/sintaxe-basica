# sintaxe-basica

This project is only a way to practice git commands and also the basics of Java 

In order to see if there are files to add in git, type: 

git status

If you want to add all files, type: 

git add . 

If yout want to commit, remember to add a message: 

git commit -m "message"

To check how many commit you have in a single line, type: 

git log --oneline

How about insert a release with a message to remember. Type: 

git tag -a v1.0 -m "message about this release"

In order to push the release and the changes: 

git push origin master
git push -u origin v1.0



