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
# Instagram Backend Design
This Maven project aims to develop the basic design of the backend for an Instagram-like application. The project focuses on implementing essential functionalities such as user authentication, user management, and post management.

## Key Components of the Project :-
 #### 1 . Model : 
  The project includes the necessary model classes to represent the core entities in the application. This includes the "User" class, which holds user details such as first name, last name, age, email, and phone number. Additionally, there is a "Post" class that contains post-specific information such as post ID, creation and update timestamps, and post data.
  #### 2 . User Controller : 
  The project includes a user controller that handles user-related operations. The controller provides API endpoints for user authentication, including sign in and sign up functionalities. It also supports updating user details, allowing users to modify their profile information.
  #### 3 . Post Controller : 
  The project also features a post controller responsible for managing post-related operations. The controller includes API endpoints for saving posts, where users can submit their posts along with relevant data. Additionally, there is an endpoint for retrieving posts, which enables users to fetch and view existing posts.
  #### 4 : Authentication Token :
   The project implements an authentication token mechanism to secure user operations. The "AuthenticationToken" class stores information about the authentication token, including a token ID, the token itself, and the token's creation date. The token is associated with a user through a one-to-one relationship.

   ###

   Overall, this Maven project lays the foundation for the backend of an Instagram-like application. It focuses on user authentication and user-related functionalities, as well as post management, providing the basic structure needed for further development of the application.
## API Reference

#### Sign up User
```http
  POST /user/signup
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `@ReqestBody` | `SignUpInput` | Signups a user in the data base |

#### Sign in User

```http
   POST /user/signin
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `@RequestBody`      | `SignInInput` | Sign in the user and provide with an auth token  |

#### Update user Data

```http
  PUT /user/UpdateUser
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------------------------------ |
| `@RequestParam & @RequestBody`| `Integer & User` | Updates any user Info |

#### Get all items

```http
  GET /post/getPost
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `@RequestParam & @RequestParam` | `String & String` | receves username and token receved after sign authentication  |

#### Get all items

```http
  POST /post/savePost
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `@RequestBody ` | `Post ` | posts the post |



## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)


## Feedback

If you have any feedback, please reach out to us at kushwaha.abhishek1999@gmail.com
