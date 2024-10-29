
function start() {
    let theButton=document.querySelector('#but1');
    
    theButton.addEventListener('mouseover', function(){highLightB();});
    theButton.addEventListener('mouseout', function(){normalB();});
    
}
function highLightB(){
    let theButton=document.querySelector('#but1');
    theButton.style.backgroundColor = "blue";
}
function normalB(){
    let theButton=document.querySelector('#but1');
    theButton.style.backgroundColor = "#156082";
}
window.addEventListener('load', start);