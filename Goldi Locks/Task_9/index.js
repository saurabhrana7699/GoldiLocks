function validateLogin() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    if (username === "saurabh" && password === "rana") {
      let lg =  document.getElementById("loginMessage")
       lg.textContent = "Login successful!";
       lg.style.color = "green";
     
    } else {
       let ng = document.getElementById("loginMessage")
       ng.textContent = "Login failed. Please check your credentials.";
      
       ng.style.color ="red"
    }
}