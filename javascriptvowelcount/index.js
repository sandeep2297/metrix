function myFunction() {
  let str = document.getElementById("string1").value; //for taking the user input into string variable
  console.log(str);
  // for splitting the string into array
  let arr = str.split("");
  console.log(arr);
  let count = 1;
  let str1 = [];
  //matching process
  for (let i = 0; i < arr.length; i++) {
    count = 1;
    while (arr[i] == arr[i + 1] && arr[i] == 'a' || 'e' || 'i' || 'o' || 'u' || 'A' || 'E' || 'I' || 'O' || 'U') {
      i++;
      count++;
    }
    if (count > 1) {
      str1.push(arr[i] + count);
    } else {
      str1.push(arr[i]);
    }

  }
  //converting the array back to string
  var strfinal = str1.toString(",");
  document.getElementById("demo").innerHTML = strfinal;
  console.log(strfinal);
}
// let arr=str.split(" ");
// console.log(arr);



//   let arr = str.split("");
//   console.log(arr);
// for(let i=)
//   let count=0;

// }