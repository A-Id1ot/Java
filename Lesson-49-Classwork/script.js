
let employees;
async function init(){
  
  let link = "https://potential-broccoli-v6rvjj9q6qpw26x65-8300.app.github.dev/";
  let route= "/employees"
  info = await fetch(link+route);
  employees = await info.json();

  let output = ""
  let build ="";

   

  


}