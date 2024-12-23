# External Configuration 

What is the purpose of application.properties? 
- It is a main configuration file for Spring Boot Application. It is used to defined application settings such as database connections, server ports or feature toggles. 

Where is application.properties located? 
- It is located in `src/main/resource`. 

What is .env? 
- This is also configuration of Spring boot application. It defines environment variables that can be accessed by the application. It is usually at the root of the project. 

Does the configuration order matter? 
- Yes, parameters has the highest priority. Followed by .env and then application.properties and last code. 

What are best practices? 
- Use .env to store sensitive information. Use spring-profiles for different environments. 
Keep .env from version control by including it in .gitignore. 

