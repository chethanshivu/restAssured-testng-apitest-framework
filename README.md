# RestAssured-TestNG-APITest-Framework

A robust API testing framework built with RestAssured, TestNG, and Spring Boot. This framework provides a structured approach to API testing with enhanced reporting, data management, and configuration capabilities.

## 🛠️ Tech Stack

- Java 11 or higher
- Spring Boot
- TestNG
- Rest Assured
- Maven
- Allure Reporting
- Lombok
- Jackson (JSON processing)

## 📁 Project Structure

```plaintext
src
├── main/java
│   ├── config/
│   │   ├── ConfigLoader.java
│   │   └── TestConfig.java
│   ├── constants/
│   │   └── EndPoints.java
│   ├── helpers/
│   │   ├── DataGenerator.java
│   │   └── RestAssuredHelper.java
│   ├── models/
│   │   └── request/
│   │   └── response/
│   ├── utils/
│   │   ├── ApiUtils.java
│   │   ├── JsonUtils.java
│   │   └── ReportUtils.java
│   └── listeners/
│       └── TestListener.java
├── test/java
│   ├── base/
│   │   └── BaseTest.java
│   └── tests/
│       ├── AuthenticationTests.java
│       └── UserApiTests.java
└── test/resources
    ├── config/
    │   ├── dev.properties
    │   ├── qa.properties
    │   └── prod.properties
    ├── testdata/
    │   └── testData.json
    └── testng.xml
```

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven 3.6 or higher
- Git

### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/RestAssured-TestNG-APITest-Framework.git
cd RestAssured-TestNG-APITest-Framework
```

2. Install dependencies:
```bash
mvn clean install
```

### Configuration

1. Update environment properties in `src/test/resources/config/`:
   - dev.properties
   - qa.properties
   - prod.properties

2. Configure test suite in `testng.xml`

### Running Tests

```bash
# Run all tests
mvn clean test

# Run specific test suite
mvn clean test -DsuiteXmlFile=testng.xml

# Run with specific environment
mvn clean test -Denv=qa
```

## 🔑 Key Features

1. **Environment Management**
   - Support for multiple environments (dev, qa, prod)
   - Environment-specific configuration files
   - Easy environment switching through properties

2. **Request/Response Handling**
   - Modular request building
   - Response validation utilities
   - POJO classes for serialization/deserialization

3. **Test Data Management**
   - External test data files
   - Data providers for test parametrization
   - Dynamic data generation utilities

4. **Reporting**
   - Allure reports integration
   - Detailed test execution logs
   - Screenshot capture on failures
   - Custom listeners for enhanced reporting

5. **Utilities**
   - API response helpers
   - JSON manipulation utilities
   - Common assertion helpers
   - Custom exceptions

## 📝 Writing Tests

### Example Test Case

```java
@Test
public class UserApiTest extends BaseTest {
    
    @Test(description = "Verify user creation")
    public void testCreateUser() {
        UserRequest userRequest = new UserRequest()
            .setName("John Doe")
            .setEmail("john@example.com");
            
        Response response = RestAssuredHelper.post(EndPoints.CREATE_USER, userRequest);
        
        Assert.assertEquals(response.getStatusCode(), 201);
        UserResponse userResponse = response.as(UserResponse.class);
        Assert.assertEquals(userResponse.getName(), userRequest.getName());
    }
}
```

## 📊 Reporting

- Allure reports are generated in `target/allure-results`
- To view reports locally:
```bash
allure serve target/allure-results
```

## 🔧 Best Practices

1. **Test Organization**
   - Group related tests in separate classes
   - Use meaningful test names
   - Follow AAA (Arrange-Act-Assert) pattern

2. **Code Maintenance**
   - Keep tests independent
   - Avoid hard-coded test data
   - Use constants for common values
   - Implement proper exception handling

3. **Configuration Management**
   - Don't commit sensitive data
   - Use configuration files for environment-specific data
   - Maintain separate config files for different environments

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📜 License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## 📫 Support

For support and queries, please create an issue in the repository or contact the maintainers.

---
Made with ❤️ by Shivaprasad KS
