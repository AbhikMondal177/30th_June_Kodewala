<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
    <style>
        body {
            margin: 0;
            font-family: "Segoe UI", Arial, sans-serif;
            background: linear-gradient(135deg, #ffecd2, #fcb69f);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container {
            background: #ffffff;
            padding: 40px 50px;
            border-radius: 18px;
            box-shadow: 0 8px 25px rgba(0,0,0,0.15);
            width: 350px;
            animation: fadeIn 0.8s ease;
        }
        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #2c3e50;
        }
        label {
            font-size: 15px;
            color: #444;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 12px;
            margin: 8px 0 18px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 15px;
        }
        .btn {
            width: 100%;
            padding: 12px;
            background: #e65a2f;
            border: none;
            color: white;
            font-size: 17px;
            border-radius: 8px;
            cursor: pointer;
            transition: 0.3s;
        }
        .btn:hover {
            background: #c94c27;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>User Login</h2>
        <form action="validateLogin" method="post">
            <label>User Name:</label>
            <input type="text" name="userName" required />

            <label>Password:</label>
            <input type="password" name="password" required />

            <input class="btn" type="submit" value="Login" />
        </form>
    </div>
</body>
</html>