function callAPI(){
    var pose = document.getElementById("poseList").value;
    var custom = document.getElementById("promptText").value;
    if(custom == ""){
        document.getElementById("hiddenprompt").value = "";
        document.getElementById("hiddenprompt").value = pose;
    }
    else{
        document.getElementById("hiddenprompt").value = custom;
    }
    document.formprompt.submit();
}