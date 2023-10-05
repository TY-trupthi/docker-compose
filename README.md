Docker compose is used if we need to run multiple images (We can also link them)
We need to write all the configuration in "docker-compose.yml" file
In the path where we have docker-compose.yml file, we need to run the command "docker-compose up" (It will pull all the images and run it)
Then we have to run the application

Example we have mongo image which is present in docker hub, we will connect it to our application
First the image of you application should be ready, write the "Dockerfile", write the "docker-compose.yml" file by linking the application image with mongo image
Create the jar file and create the image of application (With the name mentioned in "docker-compose.yml" file). Later run the command "docker-compose up". The application will be up in mentioned port

Note docker should be up to do all these
