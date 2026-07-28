//alert("Hello from JS");

var users = [
    {
        "image" : "/images/girl.png",
        "name" : "John Doe",
        "gender" : "Male"
    },
    {
        "image" : "/images/boy.png",
        "name" : "Jane Doe",
        "gender" : "Female"
    }
]

var id = 0;

function toggleUser(){
    id = (id + 1) % users.length;
    var userImage = document.getElementById("user-image");
    var userName = document.getElementById("user-name");
    var userGender = document.getElementById("user-gender");

    userImage.src = users[id].image;
    userName.innerHTML = users[id].name;
    userGender.innerHTML = users[id].gender;

}