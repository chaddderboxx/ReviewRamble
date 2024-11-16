
function start() {
    let theButtonUp=document.querySelector('#PgUp');
    let theButtonDwn=document.querySelector('#PgDwn');
    let theSearchInput=document.querySelector('#lookUpStr');
    
    theButtonUp.addEventListener('click', function(){PgUp();});
    theButtonDwn.addEventListener('click', function(){PgDwn();});
    theSearchInput.addEventListener('change', function(){PgReset();});
}    
function PgUp(){
    const pagNum = document.getElementById('pageN');
    pagNum.value++;
    
}
function PgDwn(){
    const pagNum = document.getElementById('pageN');
    if (pagNum.value>1){
        pagNum.value--;
    }    
}
function PgReset(){
    const pagNum =document.getElementById('pageN');
    pagNum.value=1;
    
}


window.addEventListener('load', start);
