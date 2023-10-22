function callAPI(){
    const pose = document.getElementById("poseList").value;
    const custom = document.getElementById("promptText").value;
    if(custom == ""){
        document.getElementById("hiddenprompt").value = "";
        document.getElementById("hiddenprompt").value = pose;
    }
    else{
        document.getElementById("hiddenprompt").value = custom;
    }
    document.formprompt.submit();
}
