/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validateForm() {
    var typeEarning = document.getElementById(typeEarning);
    var year = document.getElementById(year);
    var MedAidMember = document.getElementById(MedAidMember);
    var totEarning = document.getElementById(totEarning);
    var age = document.getElementById(age);

    if (totEarning == "" || age == "" || MedAidMember == "") {
        alert = "Error";
        return false;
    } else if (totEarning < 0 || age < 0 || MedAidMember < 0) {
        swal({
            title: "Error!",
            text: "Pleae dont textbox cannat be less than 0",
            icon: "error",
            button: "Ok",
        });
        return false;
    } else if (typeEarning == "Choose..." || year == "Choose...") {
        swal({
            title: "Error!",
            text: "Please select the required information",
            icon: "error",
            button: "Ok",
        });
        return false;
    }
}

