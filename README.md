# validation-springboot

## Frameworks and Language used

Spring Boot

## Data Flow

#### Controller
  RequestMapping -- (/User/Validations/)
  List<User> getAllUsers() -- Get All Users
  addUser(User user) -- add User
  User getUser(int userId) -- Add users
  updateUser(int userId, User user) 
  deleteUser(int userId)
#### Services 
   it is autowired in Controller so that it can perform requied bussiness logic
#### Repository
  It Consists data which is posted from postman Application. It is autowired in Service application
#### model
  @NotNull
	private int userId;
	@NotEmpty
	private String userName;
	@Email
	private String userEmail;
	@Size(min=10,max=12)
	@Pattern(regexp = "^$|[0-9]{10}")
	private String phoneNumber;
	@Size(min=8,max=16)
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")
	private String createPassword;

## Summary

In this project we have validated email, phone_number and Not null varible



