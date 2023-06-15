# PROJ002_CMDRunner

Hi there! This is my very earlier program created back in 2019 during my career in semiconductor industrial after my graduation.

The intention of creating this program (CMDRunner) is because me and my colleague are reqruied to run few specific commands frequently into terminal when doing the developments.
Initially, we save the command in notepad and copy and paste into command promt individual which very inconvenience, therefore, I have created the CMDRunner to ease everyone who needed to run commands frequently into terminal.
The program consists multiple redundant functions and files as during the time I have limited experience and time in develop this program.

Current Feature:
1) Hard coded 10 swing.jTextField on UI and allow user to click "Save" button to save the command locally.
2) User able to click "Run" beside the specific swing.jTextField to trigger the command saved earlier.
3) 2 pre-coded button to trigger Command Prompt and PowerShell
4) Program support the commands in both Windows or Linux 
5) A refresh button to update the changes on UI.

Future Update:
1) Add a new 2nd tab, introduce 1 single swing.jTextdField for user to add new command into 1 single csv file row by row.
2) Introduce a swing.jList to fetch all row in csv file and display onto the table during initialization.
3) When the specific command is selected on swing.jList, user able to trigger either Remove button or Run button to trigger its action or command.
4) The original 10 swing.jTextField will be preserved but enhanced into 1 single csv file.

How to run:
1) If your PC have a java installed (Atleast Java 8+), you may directly run the .jar file in /dist/CMDRunner.jar
2) You may run with any IDE
3) It can be run on other IDE too but the Java swing form will not shown, as the XML swing form (.form) is coded under netbean format (org.netbeans.modules.form.forminfo.JFrameFormInfo)

Thank you for the time and hope you enjoy the program!
