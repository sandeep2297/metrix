function myFunction() {
  let name = document.getElementById("string1").value; //for storing name
  let number = document.getElementById("string2").value; //for storing number
  let email = document.getElementById("string3").value; //for storing email
  let city = document.getElementById("string4").value; //for storing city
  let pin = document.getElementById("string5").value; //for storing pincode
  let regx = /^([a-zA-Z\s]+)([a-zA-Z]+)$/; //regular expression for name
  if (!regx.test(name)) {
    document.getElementById("para1").innerHTML = "Invalid  full name";
  }
  let regx1 = /^[1-9]\d{9}$/; //regular expression for phone number
  if (!regx1.test(number)) {
    document.getElementById("para2").innerHTML = "Invalid number";
  }
  let regx2 = /^([a-zA-Z0-9\d.-]+)@([a-zA-Z]+).([a-z]{2,3})$/; //regular expression for email
  if (!regx2.test(email)) {
    document.getElementById("para3").innerHTML = "Invalid email";
  }
  let regx3 = /^([a-zA-Z\s]+)([a-zA-Z]+)$/; //regular expression for city 
  if (!regx3.test(city)) {
    document.getElementById("para4").innerHTML = "Invalid city";
  }
  let regx4 = /^[1-9]\d{5}$/; //regular expression for pincode
  if (!regx4.test(pin)) {
    document.getElementById("para5").innerHTML = "Invalid pincode";
  }

  // console.log(str1);
  // console.log(str2);
  // console.log(str3);
  // console.log(str4);
  // console.log(str5);
}
alert("Welcome to the page");
  window.onbeforeunload =function(){
  return " "; 
};