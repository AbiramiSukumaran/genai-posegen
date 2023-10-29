function goBack() {
    history.back();
}

function callAPIOS() {
    alert("This app is open sourced. Feel free to implement this method!");
}

function loadImage() {
    var image = new Image();
    var baseStr64 = document.getElementById("hiddenstring").value;      
    poseImage.setAttribute('src', "data:image/jpg;base64," + baseStr64);
}

function callAPIOS(){
    alert("This app is open sourced. Feel free to implement this method!");
}
