======STEPS TO RUN=======

1.) Install mongoDB on your system.

2.) Run 'mongod' command to bring up the db. This will bring up the db on port 27107

3.) Run 'mongo' to open mongodb cli.

4.) Run command 'use company_registration'

5.) Git pull company-registration package from the github link.

6.) Set the appropriate values in application.properties file. Username and password of gmail account is compulsory. Other properties need not be changed.

7.) Enable access to less secure apps from here(https://myaccount.google.com/lesssecureapps) on the gmail account which you have mentioned in application.properties.
This option won't be visible if 2 step verification is turned on. You need to disable 2 step verification and then enable
access to less secure apps.

8.) Run 'gradlew bootRun' at root project level. This will start the server on port 8080.

9.) Go to http://localhost:8080 to access the registration form.

10.) Successful submission of the form will send the email.

11.) If access to less secure apps is disabled, then an error will be thrown by the service.

12.) You can view the entries in DB by sending a get request at http://localhost:8080/getAll