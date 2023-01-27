<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script type="application/javascript">
        //function onSub(){
           // const  firstName = document.getElementById('firstName').value ;
            //const  email = document.getElementById('email').value ;
             //if(firstName.length < 5  ||  email.indexOf("@") === -1){
               //  alert("verify your  email | firstName  ");
              //   return false ;
            // }
            // else
           //      return  true ;
        //}
    </script>
</head>
<body>
<h1 align="center"> Welcome Back !!
</h1>
<form action="result" , method="get"  >

    <div align="center">
        <p>
            <label for="firstName">Your First Name: </label>
            <input  id="firstName" type="text" name="firstName">
        </p>
        <p>
            <label for="lastName">Your Last  Name: </label>
            <input  id="lastName" type="text" name="lastName">
        </p>
        <p>
            <label for="email">Your Email : </label>
            <input  id="email" type="text" name="email1">
        </p>
        <p>
            <label for="age">Your Age : </label>
            <input  id="age" type="text" name="age">
        </p>

        <input type="submit" value="Submit" >

    </div>

</form>
<br/>
</body>
</html>