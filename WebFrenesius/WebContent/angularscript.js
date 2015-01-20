
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
        	url: "/WebFrenesius/UserRequest.do",
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
    $http.get("JSON/Graphicscard.json").then(function(response){
        $scope.componentsGPU = response.data;
    });

    
        $scope.ramselected = "";
    $http.get("JSON/Memory.json").then(function (response) {
        $scope.componentsRAM = response.data;
    })
    
            $scope.hddselected = "";
    $http.get("JSON/Hdd.json").then(function (response) {
        $scope.componentsHDD = response.data;
    })
    
            $scope.ssdselected = "";
    $http.get("JSON/Ssd.json").then(function (response) {
        $scope.componentsSSD = response.data;
    })
    
            $scope.psuselected = "";
    $http.get("JSON/Psu.json").then(function (response) {
        $scope.componentsPSU = response.data;
    })
    
            $scope.caseselected = "";
    $http.get("JSON/Case.json").then(function (response) {
        $scope.componentsCASE = response.data;
    })
    
    
    $scope.mobselected = "";
    $http.get("JSON/Motherboard.json").then(function (response) {
        $scope.componentsMOB = response.data;
    })
    
            $scope.optselected = "";
    $http.get("JSON/Opticaldrive.json").then(function (response) {
        $scope.componentsOPT = response.data;
    })
            $scope.soundselected = "";
    $http.get("JSON/Opticaldrive.json").then(function (response) {
        $scope.componentsSOUND = response.data;
    })
    
}
)

			//function unload(){
			
				//	document.getElementById("indextxt").innerHTML = '<h1>Please wait</h1>'
				//	+ '<img src="http://www.mytreedb.com/uploads/mytreedb/loader/ajax_loader_blue_512.gif" style="width:128px;height:128px">';
							
					//	}
	
