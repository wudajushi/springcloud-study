<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <script src="//cdn.bootcss.com/jquery/3.1.1/jquery.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/js/bootstrap.js"></script>
    <link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h3>${message?if_exists}</h3>
    <form role="form" action="/user/save" method="post" >
        <div class="form-group">
            <label for="name">用户姓名</label>
            <input type="text" class="form-control" name="name" placeholder="输入用户姓名">
        </div>
        <div class="form-group">
            <label for="email">邮箱</label>
            <input type="email" class="form-control" name="email" placeholder="输入邮箱">
        </div>
        <button class="btn btn-default" type="submit">提交</button>
    </form>
</div>

</body>
</html>