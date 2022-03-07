var exec = require('cordova/exec');

module.exports.test = function(success, error) {
    exec(success, error, 'HelloWorldFpay', 'test');
};
module.exports.test1 = function(success, error) {
    exec(success, error, 'HelloWorldFpay', 'test1');
};

module.exports.add = function(arg0, success, error) {
    exec(success, error, 'HelloWorldFpay', 'add', [arg0]);
};

module.exports.substract = function(arg0, success, error) {
    exec(success, error, 'HelloWorldFpay', 'substract', [arg0]);
};

module.exports.printText = function(arg0, success, error) {
    exec(success, error, 'HelloWorldFpay', 'printText', [arg0]);
};

module.exports.generateJSON = function(arg0, success, error) {
    exec(success, error, 'HelloWorldFpay', 'generateJSON', [arg0]);
};