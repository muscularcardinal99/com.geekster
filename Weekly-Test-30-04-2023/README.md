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
# Job Search Portal :

The Job Search Portal is a Spring Boot application designed to provide a platform for job seekers and employers to connect. The portal allows users to perform CRUD operations on job entities while ensuring data integrity through validation. The project utilizes H2 Database for storage and supports various querying methods.

### Key Components of the Project :
#### 1 .Job Entity :
The project includes a Job class representing a job listing. The Job entity contains attributes such as ID, title, description, location, salary, company name, employer name, job type, and applied date. The job type attribute is defined as an enum, allowing for categorization of jobs into different fields like IT, HR, Sales, Marketing, or any other relevant categories.

#### 2 . CRUD Operations :
The project supports CRUD (Create, Read, Update, Delete) operations on job entities. It leverages the built-in methods provided by the CrudRepository interface to handle common database operations. These methods include saving a new job, retrieving a job by its ID, updating job details, and deleting a job.

#### 3 . Custom Finders :
 The project allows for custom get methods by implementing custom finders. These finders enable users to retrieve specific job entities based on custom criteria. The project fires correct queries based on method names, allowing users to find jobs based on specific attributes such as title, description, or any other relevant fields.
 
 #### 4 . Custom Queries :
 The project supports write operations, including update and delete, using custom queries. Custom queries are defined using the @Query annotation, allowing users to specify complex database queries based on their requirements. This flexibility enables efficient updates and deletions of job entities based on specific conditions.
 #### 5 . Search API :
  The Job Search Portal includes a search API that enables users to search for jobs based on specific criteria. The API supports field-based searches, such as searching for jobs by title or description. This feature helps users find relevant job listings based on their preferences and requirements.
  ###
  Overall, the Job Search Portal is a Spring Boot application that provides a robust platform for job seekers and employers. It allows for CRUD operations on job entities, supports custom finders for advanced querying, and facilitates write operations using custom queries. The search API enhances the user experience by enabling field-based searches on job listings, improving the efficiency of job discovery on the platform.
## API Reference

#### Add job
```http
  POST /job/addJob
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `@ReqestBody` | `List<Job> ` | Add jobes to Data base |

#### Sign in User

```http
   GET /job/getAllJobs
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `N/R`      | `null` | Returns all the jobs present in jobs database  |

#### Update user Data

```http
    GET /job/salary/{salary}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------------------------------ |
| `@PathVariable`| `Double` | Get all jobs abovwe provided salary |

#### Get all items

```http
  GET /job/getBySalaryAbove/{salary}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------------------------------ |
| `@PathVariable`| `Double` | Get all jobs abovwe provided salary |

#### Get all items

```http
  PUT /job/salary/{salary}/id/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `@PathVariable & @PathVariable ` | `Double & Integer ` | Updates salary of a job by provided id |


## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)


## Feedback

If you have any feedback, please reach out to us at kushwaha.abhishek1999@gmail.com



