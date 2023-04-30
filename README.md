# validation-springboot

## Frameworks and Language used

Spring Boot

## Data Flow

#### Controller
  RequestMapping -- (/Job/)
  List<User> getAllJob() -- Get All Jobs details
  addJobs(List<Job> job) -- add Jobs details
  Job getUser(int id) -- get Job details
 
#### Services 
   it is autowired in Controller so that it can perform requied bussiness logic
#### Repository
  It Consists data which is posted from postman Application. It is autowired in Service application

## Summary

In this project we have validated email, phone_number and Not null varible



