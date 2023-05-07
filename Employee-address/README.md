
# Hi, I'm Abhishek Kushwaha! 👋


## Authors

- [@muscularcardinal99](https://www.https://github.com/muscularcardinal99)


## 🚀 About Me
I'm a Java developer...


## 🛠 Skills
Java, HTML, Springboot, MySQL...


# Employee Address

This is a software development task involving the creation of two entity classes, Employee and Address, with corresponding attributes. The Employee entity class is annotated with @OneToOne to create a one-to-one mapping with the Address class. Additionally, two controller classes, EmployeeController and AddressController, are created to handle CRUD operations for these entities. The endpoints defined include GET, POST, PUT and DELETE methods to enable data retrieval and manipulation.


## DataFlowStructure
in the following Java Program  

~~~
1.AddressController
  1.getAllAddress()
  2.getAddressById(@PathVariable Long id)
  3.addAddress(@RequestBody Address address)
  4.upDateAddressById(@PathVariable Long id,@RequestBody Address address)
  5.deleteById(@PathVariable Long id)
2.AddressServices
  1.getAllAddress()
  2.getById(Long id)
  3.addAddress(Address address)
  4.updateByAddress(Long id, Address address)
  5.deleteById(Long id)
3.IAddressRepo
  1.getAll()
  2.updateCity(String city,Long id);
  3.updateState(String state, Long id);
  4.updateStreet(String street, Long id);
  5.updateZipCode(String zipCode, Long id);
4.EmployeeController
  1.getAllEmployee()
  2.getEmployee(@PathVariable Long id)
  3.addEmployee(@RequestBody Employee employee)
  4.updateEmployee(@PathVariable Long id ,@RequestBody Employee employee)
  5.deleteEmployeeById(@PathVariable Long id)
5.EmployeeService
  1.getAllEmployee()
  2.findEmployeeById(Long id)
  3.addEmployeeData(Employee employee)
  4.updateEmployee(Long id, Employee employee) 
  5.deleteEmployee(Long id)
6.IEmployeeRepo
  1.updateFirstName(String firstName, Long id)
  2.updateLastName(String lastName, Long id)
  3.getEmployee(Long id)
  4.getAllEmployee()
7.Model/DataBase Design
  1.This class contains Address and Employee Model and its Properties
~~~


## API Reference



#### Add Employee

```http
 POST localhost:8080/employee/employees
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Request Body` | `JSON` | **Required**. a employee of type object in JSON format |

#### Update Employee

```http
 PUT localhost:8080/employee/employees/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Path Parameter` | `string` | **Required**. a id and requestbody |

#### Get All Employee

```http
GET localhost:8080/employee/employees
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `none`      | `N/A` | Returns All Employee data              |




#### Get Employee by Id

```http
GET localhost:8080/employee/employees/id
```

| Parameter | Type     | Description                                                     |
| :-------- | :------- | :-------------------------------------------------------------- |
| `Path Parameter'      | `string` | Returns employee data where userID matches with provided                             userID *Required* userID  |


#### Delete Employee by Id

```http
DELETE localhost:8080/employee/employees/id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Path Parameter      | `string` | Deletes Employee data where userID matches with provided userID *Required* userID  |

#### Add address

```http
 POST localhost:8080/address/addresses
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Request Body` | `JSON` | **Required**. a address of type object in JSON format |

#### Update address

```http
 PUT localhost:8080/address/addresses/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Path Parameter` | `string` | **Required**. a id and requestbody |

#### Get All address

```http
GET localhost:8080/address/addresses
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `none`      | `N/A` | Returns All address data              |




#### Get address by Id

```http
GET localhost:8080/address/addresses/id
```

| Parameter | Type     | Description                                                     |
| :-------- | :------- | :-------------------------------------------------------------- |
| `Path Parameter'      | `string` | Returns address data where addressID matches with provided                             addressID *Required* addressID  |


#### Delete address by Id

```http
DELETE localhost:8080/address/addresses/id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Path Parameter      | `string` | Deletes address data where addressID matches with provided addressID *Required* addressID  |




## Documentation

This Spring project is a user management system that enables CRUD operations to manage user
information. UserId, Name, UserName, Address, and Phone Number attributes are all present in the 
system. User data can be added, updated, and deleted via the programme. From small start-ups to huge 
companies, a variety of businesses can utilise the system to manage user data. The Spring framework, 
which offers a variety of features and tools to construct reliable and scalable applications, is used in this 
project. The application is secured with Spring Security, which also enables user authentication and 
authorization.

The user interface is created with the end user in mind, making it simple to utilise the system and carry 
out different tasks. It is simple to locate particular users based on specified criteria thanks to the 
interface's search and filtering options. Additionally, the programme is made to be responsive, enabling 
access from a variety of platforms, including desktops, laptops, and mobile ones.

The project is easily adaptable to meet unique corporate requirements. For instance, extra properties, 
such email addresses or dates of birth, can be added to the user model to hold more user information. 
The application can be altered to handle several user types with various levels of system access, such as 
administrators or managers.


In conclusion,
The user management system developed for this Spring project is strong and adaptable, and it can be 
applied to a variety of enterprises. This project offers a strong framework for handling user data with 
capabilities including CRUD operations, user authentication and authorisation, and a user-friendly 
interface. The project can be readily modified to meet unique business requirements and expanded to 
offer more features and capabilities.




## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)


## Feedback

If you have any feedback, please reach out to us at kushwaha.abhishek1999@gmail.com
