# HelloWorldFpay

## Create new custom cordova plugin

Create new cordova plugin
```
plugman create --name HelloWorldFpay --plugin_id cordova-plugin-helloworldfpay --plugin_version 1.0.0
```

Add android platform
```
plugman platform add --platform_name android
```

Add functions inside JS FIle
```
Modifier File JS inide /www
```

Add equivilant functions in JAVA to js Code
```
Modifier File JAVA inide /src/android
```

Add all informations about the plugin
```
npm init (Enter all Info package)
```

create repository inside Github
```
git init
git add *
git commit -m "Base Structure"
git remote add origin https://github.com/HanElmahdi/HelloWorldFpay.git
git push -u origin master
```
## Créer une application ionic V3

```
ionic start HelloWorldFpayApp blank
ionic cordova platform add android
ionic cordova platform list
ionic cordova plugin add https://github.com/HanElmahdi/HelloWorldFpay.git --save
ionic generate provider HelloWorld
ionic  cordova plugin list
```