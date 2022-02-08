# testcontainers-code-youtube
The testcontainers JAVA code for youtube video 

Link to the video: 
https://www.youtube.com/watch?v=c622ErfZU9M


For reference the .testcontainers.properties file 
```
#Modified by Testcontainers
#Tue Feb 08 16:27:17 CET 2022
docker.client.strategy=org.testcontainers.dockerclient.UnixSocketClientProviderStrategy

# These are added by me:
checks.disable = false
ryuk.container.privileged=true
```
