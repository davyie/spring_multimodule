What is the difference between docker and docker desktop? 
- Docker Client is the one in the terminal which interacts with Docker desktop. Docker desktop includes the 
    - docker engine
    - docker compose containers

How does docker engine work? 
- this is the underlying technology which we use to run containers. 

How does networking work with containers? 
- The container has an IP address but the docker network exists within a virtual machine, ie. docker engine. 

How does docker work under the hood? 
- Docker engine creates a virtual machine. In this virtual machine we run containers. These containers map their IP addresses to IP addresses on the virtual machine. 

How can we create docker image with Maven? 
- Spring boot has it built-in. 
Additionally we can also specify the image name by adding <build> tag in the parent pom file. We just need to create a Dockerfile in the root directory, ie, the top folder of the project. 