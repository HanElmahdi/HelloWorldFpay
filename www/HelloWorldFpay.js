var exec = require('cordova/exec');

module.exports.add = function(arg0, success, error) {
    exec(success, error, 'HelloWorldFpay', 'add', [arg0]);
};

module.exports.substract = function(arg0, success, error) {
    exec(success, error, 'HelloWorldFpay', 'substract', [arg0]);
};

module.exports.generateJSON = function(arg0, success, error) {
    exec(success, error, 'HelloWorldFpay', 'generateJSON', [arg0]);
};