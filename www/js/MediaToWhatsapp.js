var exec = require('cordova/exec'),
    cordova = require('cordova');

function MediaToWhatsapp() {

}

MediaToWhatsapp.prototype.shareMedia = function(url, text, package_name, successCallback, errorCallback){
    exec(successCallback,errorCallback,"MediaToWhatsapp","shareMedia",[url,text,package_name]);
};

module.exports = new MediaToWhatsapp();