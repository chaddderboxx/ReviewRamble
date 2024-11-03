
function start() {
    let theButton=document.querySelector('#post');
    let theCloseButton=document.querySelector('#closePopUp');
    let theNewSButton=document.querySelector('#newShoe');
    let theExistSButton=document.querySelector('#existShoe');
    
    theButton.addEventListener('click', function(){popupMsg();});
    theCloseButton.addEventListener('click', function(){closepopupMsg(0);});
    theNewSButton.addEventListener('click', function(){closepopupMsg(1);});
    theExistSButton.addEventListener('click', function(){closepopupMsg(2);});
    
}
function popupMsg(){
    event.preventDefault(); // Prevent the default link behavior 
    document.getElementById("myPopup").style.display = "block";
    //
//const userDecision = confirm("Do you want to proceed to the first view?"); 
    //if (userDecision) { window.location.href = "DirectPage?option=AddShoe"; // Redirect to the first view 
    //} else { window.location.href = "Search"; // Redirect to the second view }
    //}
}    
function closepopupMsg(des){
    if (des === 1){
        window.location.href = "DirectPage?option=AddShoe"; 
    } else if (des === 2){
        window.location.href = "Search";
    } 
    document.getElementById("myPopup").style.display = "none";
}

window.addEventListener('load', start);