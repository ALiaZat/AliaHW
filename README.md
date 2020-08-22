I have followed the singleton way to have only one instance of the given class (SwingCalendar),
First, we shoud set the constructor to private,
then, create a private static instance of SwingCalendar,
and create the getter of the instance "getInstance", (all these steps in the SwingCalendar class)
Finally, change the method showNewCalendar (in the MainForm class) and use the method getInstance, (here the object create only one time) and that's it.
