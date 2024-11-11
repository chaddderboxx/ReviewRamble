document.addEventListener('DOMContentLoaded', function() { 
    const form = document.getElementById('searchForm');
    form.addEventListener('submit', function(event) { 
        //event.preventDefault(); // Prevent the default form submission 
        const lookUpStr = document.getElementById('lookUpStr').value; 
        const pag = document.getElementById('pageN').value; 
        console.log('Search:', lookUpStr); 
        console.log('Page:', pag); 
    
        const xhr = new XMLHttpRequest(); 
        xhr.open('POST', 'Views/search3.jsp', true); 
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded'); 
        xhr.onreadystatechange = function() { 
            if (xhr.readyState === 4 && xhr.status === 200) { 
                //console.log(xhr.responseText); 
            } 
        }; 
    xhr.send(`lookUpStr=${lookUpStr}&pageN=${pag}`);
    
   }); 
});
  


        /*
         function start() {
         
         let theSearchB = document.getElementById('search');
         
         theSearchB.addEventListener('submit', searchShoe);
         
         }//end start
         function searchShoe() {
         
         event.preventDefault();//Prevent the form from submitting the traditional way 
         const lookUpStr = document.getElementById('lookUp').value; 
         const pag = document.getElementById('pageN').value; 
         //console.log('Name:', name); 
         //console.log('Email:', email); // You can now use the form data as needed 
         
         }//end function
         
         
         window.addEventListener('load', start);
         */