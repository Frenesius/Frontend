
angular.module('ui.bootstrap.demo', ['ui.bootstrap']);

angular.module('ui.bootstrap.demo').controller('JsonInputBestand', function ($scope, $http) {
	$scope.selected = "";
    $http.get("JSON/Processor.json").then(function(response){
 		$scope.componentsCPU = response.data;
    });
    $scope.master = [];
    
    $scope.update = function (selected) {
        $scope.master = angular.toJson(selected);
        
        $http({
        	method: "POST",
        	url: "/Merging/UserRequest.do",
        	data: $scope.master,
        	headers:{
        	"Content-Type" : "application/x-www-form-urlencoded"}
        	})
        	.success(function(data,status,headers,config) 
        			{
        		$scope.msg = $scope.master;
        		
        	})
         };
         
       

// Any function returning a promise object can be used to load values asynchronously
    $scope.gpuselected = "";
    $http.get("JSON/Graphicscard.json").then(function(response) {
        $scope.componentsGPU = response.data;
    });

    $scope.mobselected = "";
    $http.get("JSON/Graphicscard.json").then(function(response) {
        $scope.componentsMOB = response.data;
    })
}
)

			//function unload(){
			
				//	document.getElementById("indextxt").innerHTML = '<h1>Please wait</h1>'
				//	+ '<img src="http://www.mytreedb.com/uploads/mytreedb/loader/ajax_loader_blue_512.gif" style="width:128px;height:128px">';
							
					//	}
	
