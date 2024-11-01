function start() {
    
    let theSearchB=document.querySelector('#search');
        
    theSearchB.addEventListener('click', searchShoe);
        
}//end start
function searchShoe() {  
    const options = {method: 'GET'};
    fetch('https://api.sneakersapi.dev/search', options)
    .then(response => response.json())
    .then(response => console.log(response))
    .catch(err => console.error(err));
    let theText=document.querySelector('#search');
    console.log('sdfs',theText.name.value);
    
}

window.addEventListener('load', start);


