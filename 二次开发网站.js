function displaylist(){
	document.getElementById("hiddenMenu").style.display='block';

}
window.onload=function dropdownMenu(){
	var smallMenu=document.getElementsByClassName("smallMenu");
	
	if(smallMenu!=null){
		moduleJuggle();
		window.onresize = function(){
			moduleJuggle();
		}
		
	}
}

function moduleJuggle(){
	var moduleJuggle=document.getElementById("ModuleJuggle");
	var homelist=document.getElementById("homelist");
	if(homelist.getBoundingClientRect().width<350){
		moduleJuggle.style.fontSize="10px";
	}
	if(homelist.getBoundingClientRect().width<276){
		moduleJuggle.style.fontSize="5px";
	}else{
		moduleJuggle.style.fontSize="10px";
	}
	if(homelist.getBoundingClientRect().width>=350){
		moduleJuggle.style.fontSize="20px";
	}
	if(homelist.getBoundingClientRect().width>=576){
		
	}
	moduleJuggle.style.width=homelist.getBoundingClientRect().width-200;
}