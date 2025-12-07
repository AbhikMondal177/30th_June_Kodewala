<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login Successful</title>
    <style>
        body {
            margin: 0;
            font-family: "Segoe UI", Arial, sans-serif;
            background: linear-gradient(135deg, #89f7fe, #66a6ff);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .card {
            background: #ffffff;
            padding: 50px 60px;
            border-radius: 18px;
            box-shadow: 0 8px 25px rgba(0,0,0,0.15);
            text-align: center;
            animation: fadeIn 0.9s ease;
        }
        h2 {
            margin-bottom: 12px;
            font-size: 32px;
            color: #2c3e50;
        }
        p {
            margin: 0;
            font-size: 18px;
            color: #555;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }
    </style>
</head>
<body>
    <div class="card">
        <h2>Login Successful</h2>
        <p>Welcome! You have successfully logged in.</p>
    </div>
</body>
</html>