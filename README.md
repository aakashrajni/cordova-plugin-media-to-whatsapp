# cordova-plugin-media-to-whatsapp

A simple plugin to share your image or video in whatsapp for phonegap/cordova android platform project

## Getting Started

Add the plugin to project using cordova

    cordova plugin add --save cordova-plugin-media-to-whatsapp

or else you can install using plugman (plugman always helps you)

    plugman install --platform android --project (path/of/your/project) --plugin (plugin/file/path or github link)

### Prerequisites

    * Node
    * npm
    * git
    * phonegap
    * Android studio and SDK

### Using the plugin 

SYNTAX

    ```
    cordova.plugin.media.to.whatsapp.shareMedia(FileUrl,MediaText,"com.whatsapp",successCallback,errorCallback);
    ```

    where
        FileUrl is the url of the media in your device storage(Example: /storage/emulated/0/Android/data/[your-package-name]/files/)
        MediaText is the 'String' to be shared in other social networks.
        package name of app to share,here we are using whatsapp 
        successCallback can be something like / function(){console.log("Hybrid Bridge Success")} /
        errorCallback ca be something like / function(e){console.log("Hybrid Bridge Error" + e)} /

EXAMPLE

    ```
    cordova.plugin.media.to.whatsapp.shareMedia(FileUrl,MediaText,"com.whatsapp",function(){console.log("Media To Whatsapp Success")},function(e){console.log("Media To Whatsapp Error" + e)});
    ```

## Built With

* [Phonegap](https://phonegap.com/) - The framework used
* [Plugman](https://cordova.apache.org/docs/en/latest/plugin_ref/plugman.html) - Plugin Management
* [cordova-android](https://cordova.apache.org/docs/en/latest/guide/platforms/android/) - Made for android platform


## Authors

* **Aakash Rajni** - *Initial work* - [AakashRajni](https://github.com/aakashrajni)

See also the list of [contributors](https://github.com/aakashrajni/phonegap-shareapp-plugin/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc