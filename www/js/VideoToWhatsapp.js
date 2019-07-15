var exec = require('cordova/exec'),
    cordova = require('cordova');

function VideoToWhatsapp() {

}

VideoToWhatsapp.prototype.shareVideo = function(url, text, package_name, successCallback, errorCallback){
    exec(successCallback,errorCallback,"VideoToWhatsapp","shareVideo",[url,text,package_name]);
};

module.exports = new VideoToWhatsapp();