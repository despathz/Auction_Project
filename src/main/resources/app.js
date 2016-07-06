var myApp = angular.module('myApp', ['ngRoute']);

myApp.config(function ($stateProvider) {

	$stateProvider

	.state('welcome', {
		url = '/welcome'.
		templateUrl: './test.html',
		controller: 'mainController'
	})

});

myApp.controller('mainController', ['$scope', '$log', function($scope, $http) {
	$http.get("http://localhost:8080/");
}]);