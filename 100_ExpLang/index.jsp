<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>  

   <form action="nxtpg.do">
		My City Selection: 
	   <select name="city" size="3" multiple="multiple">
		 <option>Jabalpur</option>
		 <option>Raipur</option>
		 <option>Jaipur</option>
		 <option>Nagpur</option>
		 <option>Kanpur</option>
		 <option>Bhagalpur</option>
	   </select> <br />





	   City: ${mno:cities(applicationScope.cities)}
		<input type="submit" value="Send" />
   </form>
   
 </BODY>
</HTML>
