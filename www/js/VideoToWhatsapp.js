var exec = require('cordova/exec'),
    cordova = require('cordova');

function VideoToWhatsapp() {

}

VideoToWhatsapp.prototype.shareVideo = function(url, package_name, successCallback, errorCallback){
    exec(successCallback,errorCallback,"VideoToWhatsapp","shareVideo",[url,package_name]);
};

module.exports = new VideoToWhatsapp();