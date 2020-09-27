/**
 * main.js
 * Openlayers version : 6.4.3
 */

var map = null;

jQuery(window).on("load", function() {
	map = new ol.Map({
		view : new ol.View({
			//projection : ol.proj.get("EPSG:4326"),
			projection : 'EPSG:3857',
			//center :  [128.10569973339858, 36.0834712031309], : 'EPSG:4326'
			center : [14260661.262037931, 4312112.967714732],
			//extent :  [122.83226223339857, 34.21743908602923, 133.3791372333986, 37.90624373084023], // : 'EPSG:4326'
			extent : [13673624.884807779, 4058036.285694808, 14847697.639268087, 4566189.649734659],
			zoom : 8,
			minZoom : 8
		}),
		layers : [ new ol.layer.Tile({
			name : "baseLayer",
			source : new ol.source.XYZ({
				//apiKey : vworldMapKey,// Vworld Tile 변경 : BASE
				//url : 'http://xdworld.vworld.kr:8080/2d/Base/201802/{z}/{x}/{y}.png'
				url : 'http://api.vworld.kr/req/wmts/1.0.0/190B2CB8-C965-3C23-9095-F96AB8B5473A/Base/{z}/{y}/{x}.png'
				})
		}) ],
		target : 'map'
	});
	
	jQuery('#upload').change(function(){
		
		let file = jQuery(this)[0].files[0];
		let fileName = null;
		let fileext = file.name.slice(file.name.indexOf(".") + 1).toLowerCase();
			
		if(!file){
			alert("업로드할 파일을 선택해주세요");
			return;
		}else if(fileext != "zip" && fileext != "shp" ){
			alert("shp 파일이나 shp파일이 담긴  zip 파일만 업로드 가능합니다");
			return;
		}else{
			if(fileext == 'zip'){ //object file이 들어가야 한다.
				
				JSZip.loadAsync(file).then(function ( zip ) {
						// Zip파일내용이 처리되면 화면에 그리는 코드가 수행될 것이다. 
						var zipInst = zip;
						var files = zipInst.files;
						
						var check = 0;
						jQuery.each(files, function(index, file){
							var fileNameExt = file.slice(file.name.indexOf(".") +1).toLowerCase();
							
							switch (fileNameExt) {
							case "shp":
								check += 1;
								break;
							case "shp":
								check += 1;
								break;
							case "shp":
								check += 1;
								break;
							default:
								break;
							}
						});
					} 
				);
			}
		}
	});
	
	//상단 메뉴바 클릭 시
	jQuery('#menuBar').click(function(){
		jQuery(".menuBarCotainer").removeClass('noDisPlay');
	});
	
//	jQuery('BODY').click(function(){
//		var flag = jQuery(".menuBarCotainer").hasClass('noDisPlay');
//		
//		if(!flag){
//			jQuery(".menuBarCotainer").addClass('noDisPlay');
//		}
//	});
});