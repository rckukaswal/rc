<!DOCTYPE html>
<html lang="hi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java Practice - RC Kukaswal</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        
        :root {
            --primary: #6c5ce7;
            --secondary: #a29bfe;
            --accent: #fd79a8;
            --dark: #2d3436;
            --light: #dfe6e9;
            --success: #00b894;
            --warning: #fdcb6e;
            --info: #0984e3;
            --danger: #d63031;
        }
        
        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: #333;
            line-height: 1.6;
            padding: 20px;
            min-height: 100vh;
        }
        
        .container {
            max-width: 1200px;
            margin: 0 auto;
        }
        
        header {
            background: linear-gradient(135deg, var(--primary) 0%, var(--secondary) 100%);
            color: white;
            padding: 30px;
            text-align: center;
            border-radius: 20px;
            margin-bottom: 30px;
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
            animation: fadeIn 1s ease;
        }
        
        h1 {
            margin: 0;
            font-size: 2.8em;
            text-shadow: 2px 2px 4px rgba(0,0,0,0.3);
        }
        
        .author {
            font-size: 1.2em;
            margin-top: 10px;
            display: flex;
            align-items: center;
            justify-content: center;
            gap: 10px;
        }
        
        .content-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 25px;
            margin-bottom: 40px;
        }
        
        .card {
            background: linear-gradient(135deg, #ffffff 0%, #f8f9fa 100%);
            border-radius: 20px;
            overflow: hidden;
            box-shadow: 0 8px 25px rgba(0,0,0,0.15);
            transition: transform 0.3s ease;
        }
        
        .card:hover {
            transform: translateY(-5px);
        }
        
        .card-header {
            padding: 20px;
            background: linear-gradient(135deg, var(--info) 0%, #00cec9 100%);
            color: white;
            display: flex;
            align-items: center;
            gap: 10px;
        }
        
        .card-body {
            padding: 25px;
        }
        
        .code {
            background: linear-gradient(135deg, #2d3436 0%, #000000 100%);
            color: var(--light);
            padding: 20px;
            border-radius: 15px;
            overflow-x: auto;
            margin: 20px 0;
            font-family: 'Fira Code', 'Courier New', monospace;
            font-size: 15px;
            line-height: 1.5;
            border: 2px solid var(--info);
        }
        
        .copy-btn {
            background: linear-gradient(135deg, var(--success) 0%, #00a382 100%);
            color: white;
            border: none;
            padding: 12px 20px;
            border-radius: 10px;
            cursor: pointer;
            font-size: 16px;
            font-weight: bold;
            transition: all 0.3s ease;
            box-shadow: 0 5px 15px rgba(0,0,0,0.2);
            display: flex;
            align-items: center;
            gap: 8px;
            margin-top: 15px;
        }
        
        .copy-btn:hover {
            transform: scale(1.05);
            box-shadow: 0 8px 20px rgba(0,0,0,0.3);
        }
        
        .notes {
            background: linear-gradient(135deg, #fff9e6 0%, #ffeaa7 100%);
            padding: 20px;
            border-radius: 15px;
            border-left: 5px solid var(--warning);
            margin: 20px 0;
        }
        
        .image-placeholder {
            background: linear-gradient(135deg, #74b9ff 0%, #0984e3 100%);
            height: 200px;
            border-radius: 15px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: white;
            font-weight: bold;
            margin: 20px 0;
        }
        
        footer {
            text-align: center;
            margin-top: 50px;
            padding: 25px;
            background: linear-gradient(135deg, var(--dark) 0%, #636e72 100%);
            color: white;
            border-radius: 15px;
            box-shadow: 0 5px 20px rgba(0,0,0,0.2);
        }
        
        .social-links {
            display: flex;
            justify-content: center;
            gap: 20px;
            margin-top: 15px;
        }
        
        .social-links a {
            color: white;
            font-size: 24px;
            transition: transform 0.3s ease;
        }
        
        .social-links a:hover {
            transform: scale(1.2);
        }
        
        /* Animations */
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        
        /* Responsive Design */
        @media (max-width: 768px) {
            body {
                padding: 15px;
            }
            
            header {
                padding: 20px;
            }
            
            h1 {
                font-size: 2em;
            }
            
            .card-body {
                padding: 15px;
            }
            
            .code {
                padding: 15px;
                font-size: 14px;
            }
        }
        
        /* Syntax highlighting */
        .code-keyword {
            color: #ff6b6b;
        }
        
        .code-string {
            color: #feca57;
        }
        
        .code-comment {
            color: #48dbfb;
        }
        
        .code-method {
            color: #00d2d3;
        }
        
        .tabs {
            display: flex;
            gap: 10px;
            margin-bottom: 20px;
        }
        
        .tab {
            padding: 12px 25px;
            background: linear-gradient(135deg, var(--secondary) 0%, var(--primary) 100%);
            color: white;
            border-radius: 10px;
            cursor: pointer;
            font-weight: bold;
            transition: all 0.3s ease;
        }
        
        .tab.active {
            background: linear-gradient(135deg, var(--accent) 0%, #e84393 100%);
        }
    </style>
</head>
<body>
    <div class="container">
        <header>
            <h1>Java Practice Programs</h1>
            <div class="author">
                <i class="fas fa-user"></i>
                <span>by RC Kukaswal</span>
            </div>
        </header>

        <div class="tabs">
            <div class="tab active">Programs</div>
            <div class="tab">Notes</div>
            <div class="tab">Resources</div>
        </div>

        <div class="content-grid">
            <div class="card">
                <div class="card-header">
                    <i class="fas fa-code"></i>
                    <h3>Numbers 100 to 60 (Skip by 2)</h3>
                </div>
                <div class="card-body">
                    <div class="code">
<span class="code-keyword">public class</span> PrintNumbers {
    <span class="code-keyword">public static void</span> main(String[] args) {
        System.<span class="code-method">out</span>.println(<span class="code-string">"Numbers from 100 to 60 (skipping by 2):"</span>);
        <span class="code-keyword">for</span>(int i = 100; i >= 60; i -= 2) {
            System.<span class="code-method">out</span>.print(i + <span class="code-string">" "</span>);
        }
    }
}
                    </div>
                    <button class="copy-btn" onclick="copyCode(this)">
                        <i class="fas fa-copy"></i> Copy Code
                    </button>
                </div>
            </div>

            <div class="card">
                <div class="card-header">
                    <i class="fas fa-calculator"></i>
                    <h3>Average of Four Subjects</h3>
                </div>
                <div class="card-body">
                    <div class="code">
<span class="code-keyword">import</span> java.util.Scanner;

<span class="code-keyword">public class</span> AverageCalculator {
    <span class="code-keyword">public static void</span> main(String[] args) {
        Scanner scanner = <span class="code-keyword">new</span> Scanner(System.in);
        System.<span class="code-method">out</span>.println(<span class="code-string">"Enter four subject marks:"</span>);
        
        <span class="code-keyword">double</span> total = 0;
        <span class="code-keyword">for</span>(int i = 1; i <= 4; i++) {
            System.<span class="code-method">out</span>.print(<span class="code-string">"Subject "</span> + i + <span class="code-string">": "</span>);
            total += scanner.<span class="code-method">nextDouble</span>();
        }
        
        <span class="code-keyword">double</span> average = total / 4;
        System.<span class="code-method">out</span>.println(<span class="code-string">"Average marks: "</span> + average);
    }
}
                    </div>
                    <button class="copy-btn" onclick="copyCode(this)">
                        <i class="fas fa-copy"></i> Copy Code
                    </button>
                </div>
            </div>

            <div class="card">
                <div class="card-header">
                    <i class="fas fa-sticky-note"></i>
                    <h3>Java Notes</h3>
                </div>
                <div class="card-body">
                    <div class="notes">
                        <h4>Important Java Concepts:</h4>
                        <ul>
                            <li>Object-Oriented Programming (OOP)</li>
                            <li>Classes and Objects</li>
                            <li>Inheritance and Polymorphism</li>
                            <li>Exception Handling</li>
                            <li>Multithreading</li>
                        </ul>
                    </div>
                    
                    <div class="notes">
                        <h4>Tips for Java Beginners:</h4>
                        <ul>
                            <li>Practice coding daily</li>
                            <li>Understand core concepts thoroughly</li>
                            <li>Work on small projects</li>
                            <li>Learn to debug your code</li>
                            <li>Join Java communities</li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="card">
                <div class="card-header">
                    <i class="fas fa-image"></i>
                    <h3>Java Diagrams</h3>
                </div>
                <div class="card-body">
                    <div class="image-placeholder">
                        <i class="fas fa-project-diagram"></i>
                        <span>Java Class Diagram</span>
                    </div>
                    
                    <div class="image-placeholder">
                        <i class="fas fa-sitemap"></i>
                        <span>Inheritance Hierarchy</span>
                    </div>
                </div>
            </div>

            <div class="card">
                <div class="card-header">
                    <i class="fas fa-list"></i>
                    <h3>Data Structures</h3>
                </div>
                <div class="card-body">
                    <div class="code">
<span class="code-keyword">import</span> java.util.*;

<span class="code-keyword">public class</span> ArrayListExample {
    <span class="code-keyword">public static void</span> main(String[] args) {
        List&lt;String> fruits = <span class="code-keyword">new</span> ArrayList<>();
        fruits.<span class="code-method">add</span>(<span class="code-string">"Apple"</span>);
        fruits.<span class="code-method">add</span>(<span class="code-string">"Banana"</span>);
        fruits.<span class="code-method">add</span>(<span class="code-string">"Orange"</span>);
        
        <span class="code-keyword">for</span> (String fruit : fruits) {
            System.<span class="code-method">out</span>.println(fruit);
        }
    }
}
                    </div>
                    <button class="copy-btn" onclick="copyCode(this)">
                        <i class="fas fa-copy"></i> Copy Code
                    </button>
                </div>
            </div>

            <div class="card">
                <div class="card-header">
                    <i class="fas fa-database"></i>
                    <h3>JDBC Example</h3>
                </div>
                <div class="card-body">
                    <div class="code">
<span class="code-keyword">import</span> java.sql.*;

<span class="code-keyword">public class</span> JdbcExample {
    <span class="code-keyword">public static void</span> main(String[] args) {
        <span class="code-keyword">try</span> {
            Connection conn = DriverManager.<span class="code-method">getConnection</span>(
                <span class="code-string">"jdbc:mysql://localhost:3306/mydb"</span>, 
                <span class="code-string">"username"</span>, 
                <span class="code-string">"password"</span>);
            
            Statement stmt = conn.<span class="code-method">createStatement</span>();
            ResultSet rs = stmt.<span class="code-method">executeQuery</span>(<span class="code-string">"SELECT * FROM users"</span>);
            
            <span class="code-keyword">while</span> (rs.next()) {
                System.<span class="code-method">out</span>.println(rs.getString(<span class="code-string">"name"</span>));
            }
            
            conn.<span class="code-method">close</span>();
        } <span class="code-keyword">catch</span> (Exception e) {
            System.<span class="code-method">out</span>.println(e);
        }
    }
}
                    </div>
                    <button class="copy-btn" onclick="copyCode(this)">
                        <i class="fas fa-copy"></i> Copy Code
                    </button>
                </div>
            </div>
        </div>

        <footer>
            <p>© 2023 Java Practice | Created with ❤️ by RC Kukaswal</p>
            <p>📧 Email: rckukaswal@example.com | 📱 Phone: +91 9876543210</p>
            <div class="social-links">
                <a href="#"><i class="fab fa-facebook"></i></a>
                <a href="#"><i class="fab fa-twitter"></i></a>
                <a href="#"><i class="fab fa-instagram"></i></a>
                <a href="#"><i class="fab fa-github"></i></a>
                <a href="#"><i class="fab fa-linkedin"></i></a>
            </div>
        </footer>
    </div>

    <script>
        function copyCode(button) {
            const codeBlock = button.parentElement.querySelector('.code');
            const textArea = document.createElement('textarea');
            textArea.value = codeBlock.textContent;
            document.body.appendChild(textArea);
            textArea.select();
            document.execCommand('copy');
            document.body.removeChild(textArea);
            
            // Show confirmation with animation
            const originalText = button.innerHTML;
            button.innerHTML = '<i class="fas fa-check"></i> Copied!';
            button.style.background = 'linear-gradient(135deg, #00b894 0%, #008f72 100%)';
            
            setTimeout(() => {
                button.innerHTML = originalText;
                button.style.background = 'linear-gradient(135deg, #00b894 0%, #00a382 100%)';
            }, 2000);
        }
        
        // Tab functionality
        const tabs = document.querySelectorAll('.tab');
        tabs.forEach(tab => {
            tab.addEventListener('click', () => {
                tabs.forEach(t => t.classList.remove('active'));
                tab.classList.add('active');
            });
        });
    </script>
</body>
</html>
