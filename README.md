Reference: https://www.youtube.com/watch?v=31KTdfRH6nY&t=2711s&ab_channel=freeCodeCamp.org

H2 Console is available at: http://localhost:8080/h2-console

user: sa 
password: no needed
![img.png](img.png)

Command to build image:
1. aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 033197833736.dkr.ecr.ap-south-1.amazonaws.com
2. docker build -t runnerz-app .
3. docker tag runnerz-app:latest 033197833736.dkr.ecr.ap-south-1.amazonaws.com/runnerz-app:latest
4. docker push 033197833736.dkr.ecr.ap-south-1.amazonaws.com/runnerz-app:latest


![img_1.png](img_1.png)
