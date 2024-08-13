<#compress>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome!</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Welcome ${user.name}!</h1>
    <h3>You are ${user.age} years old</h3>
    <p>Our latest product: <a href="${latestProduct.url}">${latestProduct.name}</a></p>
</div>
<div>
<h4>${user.location}</h4>
</div>
</body>
</html>
</#compress>
