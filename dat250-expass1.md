#### Introduction
During this exercise I've downloaded Java,
as well as the IDE IntelliJ, in addition to installing Podman.

After the installation I proceeded with the Java part of the exercise. I used the Java project to validate that the software worked
as, i could test both Java itself and Gradle (when importing Javalin).
#### Java Project
Regarding the Java Project, I've only done some
minor tweaks. The tweaks I did is as follows.

- Seperated the logic from the App.js into its own file called UnitsConverter.js
- Seperated the website string into its own file, called Website.js. I planned to make the 'html' string into a html file and import it but I did not know how to render it using Javalin, so i opted for a simpler approach.
- I have written a single unit test testing the conversion logic, this test contains two assertions. I did not feel like including more as the converter converts to meter then to the other units of measure. meaning if the conversion between in->ft is correct the conversion from in->metres should be correct as well. I did not deem it necessary to add more test for this simple program.

The only major issues i faced in this exercise was that IntelliJ refused to use the correct Java version, but this was fixed by uninstalling the old one.

#### DockerHub
Here is the link for the dockerHub repo:
https://hub.docker.com/r/mikaldr/dat250