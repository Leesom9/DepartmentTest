function addUser() {

    var username = document.getElementById("usernameID").value;
    var password = document.getElementById("passwordID").value;
    //alert(username);
    //alert(password);
    $.ajax({
        url:"/admin/addUser",
        data:{"username":username,"password":password},
        type:"GET",
        dataType:"TEXT",
        success:function () {
            //var result = "${requestScope.addUserResult}";
            //alert(result);
        }
        });

}