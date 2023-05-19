
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
# Stock :
This Maven project is a RESTful API implementation for a Stock Management System. It provides endpoints for performing CRUD operations on stock entities, along with additional functionalities like custom finders and custom queries. The project is built using Spring Boot and utilizes JPA for database operations.
### Key Components of the Project :
#### 1 .Stock Controlle :
The project includes a StockController class annotated with @RestController. This class defines the API endpoints for interacting with stocks. The endpoints handle HTTP requests and delegate the business logic to the StockService.
#### 2 . Stock Model : 
 The project includes a Stock class representing a stock entity. It contains attributes such as stock ID, stock name, stock price, stock owner count, stock type, stock market cap, and stock birth timestamp. The stock type is represented by the StockType enum, which includes categories like FMCG, IT, and HEALTH.
 #### 3 . Stock Service :
 The project has a StockService class that handles the business logic for stock-related operations. It interacts with the IStockRepository for data access and performs operations like retrieving stocks based on type, custom finders, custom queries, inserting stocks, updating stocks, and deleting stocks.
 #### 4 .IStockRepository :
 The project includes the IStockRepository interface that extends the CrudRepository interface. It provides methods for basic CRUD operations inherited from CrudRepository, such as saving, retrieving, updating, and deleting stocks. Additionally, it includes custom query methods defined using the @Query annotation for executing specific SQL queries.
 
 #### 5 .H2 Database :
 The project uses H2 Database, an in-memory database, for storing stock data. It allows for easy testing and development without requiring an external database setup.
 
 ###
 Overall, this Maven project provides a robust API for managing stocks. It allows for CRUD operations, custom finders, and custom queries to retrieve and manipulate stock entities. The project leverages Spring Boot, JPA, and H2 Database to ensure efficient and seamless data management in the Stock Management System.
## API Reference

#### Return Stock type
```http
  GET /stock/type/{stockType}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `@PathVariable` | `StockType ` | returns type of stock entered |

#### Return Stock type

```http
   GET /stock/abovePrice/price/{price}/lowerData/date/{date}
```
| Parameter | Type     | Description                       |
| :--------------------------- | :------- | :-------------------------------- |
| `@PathVariable & @PathVariable `      | `Double String` | Returns all the stock in custom way  |




#### Return Stock type

```http
    GET /stock//cap/{capPercentage}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------------------------------ |
| `@PathVariable`| `Double` | Get all Stocks above marketcapital |

#### Adds Stocks

```http
  PUT /stock
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------------------------------ |
| `@RequestBody `| `List<Stock>` | Adds list of Stocks |

#### Return Stock type

```http
  PUT /stock/marketCap/{marketCap}/id/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `@PathVariable & @PathVariable ` | `Double & Integer ` | Updates MarketCapital of a Stock by provided id |



## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)


## Feedback

If you have any feedback, please reach out to us at kushwaha.abhishek1999@gmail.com
