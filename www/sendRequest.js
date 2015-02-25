var exec = require('cordova/exec');


exports.sendPersonViaPlugin = function(firstName,LastName,address1,address2,successCallback,errorCallback){
	exec(
		successCallback,
		errorCallback,
		"SendRequestPlugin", //mapped to native java class
		"passPersonInfo", // with this acttion name
		[{
			"firstName":firstName,
			"lastName":lastName,
			"address1":address1,
			"address2":address2
		}]

	);

}


exports.sendVehicleViaPlugin = function(){

}

