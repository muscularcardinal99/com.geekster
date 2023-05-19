# Hi, I'm Abhishek Kushwaha! 👋


## Authors

- [@muscularcardinal99](https://www.github.com/muscularcardinal99)


## 🚀 About Me
I'm a Java developer...


## 🛠 Skills
Java, HTML, Springboot, MySQL...
## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)

# Test3 Maven Project

This Maven project is a simple application for managing restaurants. It provides services for performing CRUD operations on restaurant data.

## Project Structure

The project has the following structure:

- `com.geekster.Weekely.Test3.Controller`: Contains the controller classes that handle HTTP requests and define the API endpoints.
- `com.geekster.Weekely.Test3.DAO`: Contains the data access object interface for restaurant data.
- `com.geekster.Weekely.Test3.Model`: Contains the model class for the restaurant entity.
- `com.geekster.Weekely.Test3.Services`: Contains the service classes that implement the business logic.
- `com.geekster.Weekely.Test3.Application`: Contains the main class to run the Spring Boot application.

## Annotations

The following annotations are used in the project:

- `@Service`: Used to indicate that a class is a service component in the business layer.
- `@Autowired`: Used to inject dependencies automatically into a class.
- `@Repository`: Used to indicate that a class is a data access object (DAO) component.
- `@Entity`: Used to mark a class as an entity that is mapped to a database table.
- `@Id`: Used to specify the primary key of an entity.
- `@GeneratedValue`: Used to specify the strategy for generating primary key values.
- `@Data`: A Lombok annotation that generates getter, setter, toString, equals, and hashCode methods for the class.
- `@NoArgsConstructor`: A Lombok annotation that generates a no-argument constructor for the class.
- `@AllArgsConstructor`: A Lombok annotation that generates a constructor with all arguments for the class.
- `@Getter`: A Lombok annotation that generates getter methods for the class.
- `@Setter`: A Lombok annotation that generates setter methods for the class.

## GET /restaurant/get

No parameters are required for this API.

### `/restaurant/add` (POST)

Add a new restaurant.
## POST /restaurant/add

| Parameter    | Type     | Description                               |
| :----------- | :------- | :---------------------------------------- |
| `Request Body` | `Restaurant` | The restaurant data to be added (JSON format) |

### `/restaurant/update/{id}` (PUT)

## Update a restaurant by ID.

| Parameter         | Type     | Description                               |
| :---------------- | :------- | :---------------------------------------- |
| `Path Parameter`  | `integer` | The ID of the restaurant to be updated     |
| `Request Body`    | `Restaurant` | The updated restaurant data (JSON format) |

### `/restaurant/delete/{id}` (DELETE)

## Delete a restaurant by ID.

| Parameter         | Type     | Description                               |
| :---------------- | :------- | :---------------------------------------- |
| `Path Parameter`  | `integer` | The ID of the restaurant to be deleted     |

## Model

The `Restaurant` model has the following properties:

| Property  | Type    | Description                |
| :-------- | :------ | :------------------------- |
| `id`      | `integer` | The ID of the restaurant   |
| `name`    | `string` | The name of the restaurant |
| `rating`  | `integer` | The rating of the restaurant |
| `location` | `string` | The location of the restaurant |





