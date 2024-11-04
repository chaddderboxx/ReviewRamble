

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen">
        <title>Contact Page</title>
    </head>
    <c:import url="/Views/header.jsp"/>
    <body>
        <h1>Contact!</h1>
        <form action="Contact" method ="post">
                    <label >Name &emsp;&emsp;&emsp;</label>
                    <input type="text" name="contactName" required><br>
                    <br>
                    <label >Email &emsp;&emsp;&emsp;&nbsp;</label>
                    <input type="email" name="contactEmail" required><br>
                    <br>
                    <label >Message</label>
                    <input type="text" name="contactMessage" required><br>
                    <br>
                    <input type="hidden" name="action" value="contact" />
                    <input type="submit" class="button1" value="submit" class="margin_left">

        </form>
    </body>
    <a href="DirectPage?option=Main">Back</a><br>
    <c:import url="/Views/footer.jsp"/>
</html>
