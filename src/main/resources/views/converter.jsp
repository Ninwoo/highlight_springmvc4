<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>HttpMessageConverter Demo</title>
</head>
<body>
<div id="resp"></div><input type="button" onclick="req();" value="请求"/>
<script src="assets/jquery.js" type="text/javascript"></script>
<script>
    function  req() {
        $.ajax({
            url:"convert",
            data: "1-liujianou",
            type: "POST",
            contentType: "application/x-wisely",
            success: function (data) {
                $("#resp").html(data);
            }
        });

    }
</script>
</body>
</html>