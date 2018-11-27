# CS 152 Project 5
***

**Please read these instructions**

## After cloning the repo
Please run these commands in your terminal everytime you clone to your local machine

    git config alias.freeze "update-index --assume-unchanged"
and

    git config alias.thaw "update-index --no-assume-unchanged"

Then run

    git freeze .vscode/settings.json

I've created project level settings for us both to use, freezing this file allows us to add any project level settings that we see fit for ourselves without conflicting with eachother

Freezing this file only matters if you're using vscode

## Things to check for
Make sure a *.settings* directory and a *.classpath* file are generated in your project. If you're using vscode with the vscode-java and gradle extensions these files should automatically be generated. Your mileage may very with other IDEs and editors.

Let Luis Gutierrez know if you have any issues

## Running your code

Gradle has many commands that you can run, you can refer to the online documentation to learn more

To run the project type

    gradle run

or 

    ./gradlew run

If you use windows be sure to add the gradle executable to your PATH if you've installed gradle then run

    gradle run

or use the *gradlew.bat* file provided in the project. I've never used gradle on windows so refer to Gradle documentation if you decide to use the bat file


I think this covers all the bases, let Luis know if you run into any issues