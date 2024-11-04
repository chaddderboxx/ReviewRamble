
function start() {
    let theForm=document.querySelector('#upImg');
    
    theForm.addEventListener('change', function(){loadImg();});
    
}
function loadImg(){

    const file = event.target.files[0];
            if (file) {
                const reader = new FileReader();
                reader.onload = function(e) {
                    const img = document.getElementById('img');
                    img.src = e.target.result;
                    img.style.display = 'block';
                };
                reader.readAsDataURL(file);
            }
}

window.addEventListener('load', start);


