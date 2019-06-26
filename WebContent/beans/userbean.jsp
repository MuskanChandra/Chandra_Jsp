<jsp:useBean id="userobj" class="javatpoint.User">
</jsp:useBean>
<jsp:setProperty property="*" name="userobj" />

Record:<br>  
<jsp:getProperty property="name" name="userobj"/><br>  
<jsp:getProperty property="password" name="userobj"/><br>  
<jsp:getProperty property="email" name="userobj" /><br>  

