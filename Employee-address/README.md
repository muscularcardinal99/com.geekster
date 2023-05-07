
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

The above instructions describe the creation of two entity classes, Employee and Address, along with their respective attributes. The Employee entity class contains a one-to-one mapping to the Address entity class through the use of the @OneToOne annotation.

Additionally, two controller classes, EmployeeController and AddressController, have been created to handle CRUD (Create, Read, Update, Delete) operations for the Employee and Address entities. These controller classes have been provided with specific methods to handle each of these operations, including retrieving all employees or addresses, retrieving an individual employee or address by their respective IDs, creating a new employee or address, updating an existing employee or address, and deleting an employee or address.

Overall, this implementation provides a robust and organized way to manage the data for Employee and Address entities in a system. The use of the @OneToOne annotation ensures that each Employee entity is associated with a unique Address entity, and the controller classes provide a clear and standardized way to handle CRUD operations for these entities. This system can be easily extended and customized to meet the needs of any organization that needs to manage employee and address data.




## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)


## Feedback

If you have any feedback, please reach out to us at kushwaha.abhishek1999@gmail.com
