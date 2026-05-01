
let data,customers;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://symmetrical-orbit-g4rq9pwrggjwcwpjv-5500.app.github.dev/Lesson54Activity/index.html";
  let route= "/customers"
  customers = $.getJSON(link+route).responseJSON;

  generateCards(customers)


}

function generateCards(customers){
  let output = document.getElementById("output");
  let build ="";

  for(let i=0; i<customers.length; i++){
    let customer = customers[i]
    build += `<div class="card" >`
    build += `<h3> Customer ID : ${customer.CustomerId}</h3>`;
    build += `<div> First Name : ${customer.FirstName}</div>`;
    build += `<div> Last Name : ${customer.LastName}</div>`;
    build += `<div> Country : ${customer.Country}</div>`;
    build += `<div> City : ${customer.City  }</div>`;
    build += `<p> Email : ${customer.Email}</p>`;
    build += `<hr>`;
    build += `</div>`;
  }

  // Now inject the build content into the output container
  output.innerHTML = build;
  

}

function filter1(){
  let country = document.getElementById("country1").value;
  let city = document.getElementById("city1").value;
  console.log(country);

  let customerList = []; //create a list of songs searched for
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i] //get each sog
    //make sure the list is no
    if( customer.Country == country  || customer.City == city) {
          //add to the new list
          customerList.push(customer);
       }
  }
  console.log(`number found ${customerList.length}`)
  generateCards(customerList);
  
}



function filter2(){
  let country = document.getElementById("country2").value;
  let city = document.getElementById("city2").value;
  
  let customerList = []; //create a list of songs searched for
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i] //get each sog
    //make sure the list is no
    if( customer.Country == country  && customer.City == city) {
          //add to the new list
          customerList.push(customer);
       }
  }
  console.log(`number found ${customerList.length}`)
  generateCards(customerList);
  
}
