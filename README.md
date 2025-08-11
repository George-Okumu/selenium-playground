# selenium-playground
A personal sandbox for learning and experimenting with Selenium WebDriver. Includes sample scripts, test cases, and automation experiments across different browsers and web applications.

##  Key Features

-  Step-by-step Selenium setup with Java and Maven
-  Cross-browser automation using WebDriver
-  Automation of a simple login flow
-  Well-structured and beginner-friendly codebase
-  Easily extensible for more advanced test scenarios

##  Technologies Used

- **Java 21+**
- **Selenium WebDriver**
- **Maven** (Project management and build)
- **TestNG** (Testing framework)
- **ChromeDriver / GeckoDrive** (Browser drivers)
- **IntelliJ IDEA**
- Optional: **WebDriverManager** for auto driver management

## Setup & Installation Instructions

### 1. Clone the Repository

```bash
git clone git@github.com:George-Okumu/selenium-playground.git
cd selenium-playground
```
### 2. Install Java
<p>Ensure you have Java 21 installed. Verify with:</p>

```bash
java --version
```
<p>If no version found, follow the tutorial below to install Java: </p>

[Installing Java V21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)

### 3. Import Project into your IDEA
<ul>
  <li>Open the project in IntelliJ IDEA</li>
  <li> Let Maven resolve dependencie</li>
</ul>

- In case of any issue, run `mvn clean install` to update the `maven` deps


### 4. Running the Program
<p>From your main Program, Run the Main.java file using the Run Command</p>
<p>After 15 seconds, a chrome tab will open, then the source code of the targeted url website will show on the terminal as shown in the pictures below</p>

<img width="400" height="400" title="Selenium's ChromeDiver" alt="Screenshot from 2025-08-11 18-12-00" src="https://github.com/user-attachments/assets/4006546a-f6e7-4488-9483-b569577d96e3" />

<img width="400" height="400" title="Source code as displayed by Selenium" alt="Screenshot from 2025-08-11 18-12-31" src="https://github.com/user-attachments/assets/83abb871-c6a8-447d-9cca-02ff5ee057dc" />




# AI Prompt Journal

---

### Prompt used:

> How do I add Selenium Maven dependencies from mvnrepository.com in IntelliJ IDEA?

**AI’s response summary:**

Provided a step-by-step guide to:  
- Search for the dependency on [mvnrepository.com](https://mvnrepository.com)  
- Copy the Maven snippet  
- Paste it into `pom.xml` inside the `<dependencies>` tag  
- Import Maven changes using IntelliJ UI

> "The AI helped me find the correct dependency on mvnrepository.com and guided me in integrating it properly into my `pom.xml` file."

---

### Prompt used:

> I am trying to connect local git with my remote repo. This is my command  
> `git remote add git@github.com:George-Okumu/selenium-playground.git`  
> And I am getting the below error…

**AI’s response summary:**

Explained that the `git remote add` command is missing the **remote name** before the URL. Suggested the correct format:

```bash
git remote add origin git@github.com:George-Okumu/selenium-playground.git
```
> "The AI pointed out that I was missing the remote name (`origin`) in my command and showed me how to verify it with `git remote -v`."

### Prompt used:
[Link to the curriculm](https://ai.moringaschool.com/ai-software/ai-use-cases/usecases-debugging/)

I need help understanding this error, I am trying to pull from main branch, and my current branch is Main; however, I am getting the below error:  
`fatal: refusing to merge unrelated histories`... I am thinking of deleting the main branch and having Main. Where could I go wrong?

---

### AI’s response summary:

Diagnosed the issue as a conflict between unrelated histories from local and remote Git repositories. Advised **not** to delete branches and instead use:

```bash
git pull origin main --allow-unrelated-histories
```

Also suggested renaming the local branch `Main` to match the remote `main`:

```bash
git branch -m Main main
git branch --set-upstream-to=origin/main main
```

##  Contributing
This project is meant for self-learning, but contributions are welcome!
<ul>
  <li>Fork the repo</li>
  <li>Create a new branch (feature/my-feature)</li>
  <li>Commit your changes</li>
  <li>Open a Pull Request</li>
</ul>

## License
This project is licensed under the **MIT License**.

##  Acknowledgments
[Tutorialspoint](https://www.tutorialspoint.com/selenium/index.htm)

[BrowserStack](https://www.browserstack.com/guide/testng-framework-with-selenium-automation)

[ChatGPT](https://chatgpt.com/)

Community tutorials and examples
