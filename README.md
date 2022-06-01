# Replit Java Starter

Use this repository as a template for object oriented Java labs on Replit.com.

## Overview

This repository is a template repository with the necessary replit configuration files for running Github synced Java applications on Replit. 

If you're starting a new lab or example, you can use this repo as your template and then follow the instructions below to put it on Replit.

## Instructions

Once your Repl is made, you are going to have to use the Repl Shell tab to `cd` out of your project's directory, delete the original project directory Replit generated, and then clone your Github project into a folder named after your Repl.

1. First create the Replit Team Project as you would normally on Replit.

![https://revature-af.s3.amazonaws.com/replit-github/1-make-a-project.jpg](https://revature-af.s3.amazonaws.com/replit-github/1-make-a-project.jpg)

2. From the Shell tab of the Repl console, `cd ..` to go out of your project's directory. Note the directory name. In this example it was `my-new-example-from-github`. 

![https://revature-af.s3.amazonaws.com/replit-github/2-cd-out.jpg](https://revature-af.s3.amazonaws.com/replit-github/2-cd-out.jpg)

3. From the home directory `~`,  delete the original project directory with `rm -rf`, for example: `rm -rf my-new-example-from-github`.

4. Then clone your Github project into the Repl shell in a directory named exactly what your project directory was previously, in this example, `my-new-example-from-github`. Notice how even though the repository in the example is not named the same as the project, it is cloned into a directory Replit expects based on the Replit project name, not the Github repository name. **Note: Make sure to clone with the `https` scheme not `ssh`.**

![https://revature-af.s3.amazonaws.com/replit-github/3-delete-and-clone.jpg](https://revature-af.s3.amazonaws.com/replit-github/3-delete-and-clone.jpg)

5. If you click on the version control tab on Replit, you should see that Replit now recognizes that this project is synced from github.

![https://revature-af.s3.amazonaws.com/replit-github/4-github-repl.jpg](https://revature-af.s3.amazonaws.com/replit-github/4-github-repl.jpg)

6. Whenever there is a change on Github you want to sync to Replit, you will have to go to the Shell on Replit and `git pull` (or use the "Pull" button in the Replit Version Control tab).

![https://revature-af.s3.amazonaws.com/replit-github/5-github-sync.jpg](https://revature-af.s3.amazonaws.com/replit-github/5-github-sync.jpg)
