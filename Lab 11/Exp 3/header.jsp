<%! 
   int pageCount = 0;
   void addCount() {
      pageCount++;
   }
%>

<% addCount(); %>

<html>
   <head>
      <title>Directive Example</title>
   </head>
   
   <body>
      <center>
         <h2>Called from header</h2>
         <p>This site has been visited <%= pageCount %> times.</p>
      </center>
      <br/><br/>