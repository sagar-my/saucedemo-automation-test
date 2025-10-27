# SauceDemo Automation Test

This project automates basic test cases for the [SauceDemo](https://www.saucedemo.com/) website using **Java**, **Selenium WebDriver**, and **TestNG**.

---

## 🧰 Tech Stack
- **Language:** Java 17  
- **Build Tool:** Maven  
- **Frameworks/Libraries:** Selenium 4, TestNG, WebDriverManager

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone https://github.com/your-username/saucedemo-automation.git
cd saucedemo-automation


2️⃣ Install dependencies
mvn clean install

3️⃣ Run the test suite
mvn test

Or run a specific suite:
mvn test -DsuiteXmlFile=testng.xml

✅ Test Summary
The test script performs:
Login with valid credentials.
Add “Sauce Labs Backpack” to the shopping cart.
Verify the item name and price.

Author: Sagar Chaudhary
