function validatePasswordEquality() {
	
	var n1 = document.getElementById("string1");
	var n2 = document.getElementById("string2");
	
	if(n1.value != n2.value){
		alert("The passwords must be equal!");
		return false;
	}
	else
		return true;		
	
}

function validateNotEmpty(){

	var n1 = document.getElementById("string1");
	
	if(n1 != "")
		return true;
	else{
		alert("The field must not be empty");
		return false;
	}
	
}

function test(){
	alert("alert before test");
	var x = "";
	if(x == "")
		alert("string is empty");
	return 5;
}