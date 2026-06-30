FROM maven:3.9.6-eclipse-temurin-21
WORKDIR /app
CMD ["bash"]

# Build the image with the Dockerfile in the current folder, only run once
# % docker build -t se350 .   # t give the image a name

# Create the container with the build image, only run once
#   may be able to add -w option to open inside a mounted folder
# % docker run -it \      # i open stdin, t enable terminal
#   --name se350-dev \    # name created container from image   
#   -v ~/Repos/SE350Classcode:/app/SE350Classcode \    # mount local dir to : location in container
#   se350   # use image 

# % exit

# reopen docker container
# -ai is attach stdin and interactive to type into it
# % docker start -ai my-java-dev     

# list all containers, images
# docker ps -a
# docker images

# delete a container and image
# % docker rm se350-dev
# % docker rmi se350


