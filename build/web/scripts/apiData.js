function start() {

    let theSearchB = document.querySelector('#search');

    theSearchB.addEventListener('click', searchShoe);

}//end start
function searchShoe() {
    
    
    let Shoes=[];
    let outputs=[];
    let outputStr=['output1','output2','output3'];
    
    let sImages=[];
    let sImageStr=['sImg1','sImg2','sImg3'];
    let colorS=[];
    let colorStr=['color1','color2','color3'];
    let nameS=[];
    let nameStr=['name1','name2','name3'];
    let skuS=[];
    let skuStr=['sku1','sku2','sku3'];
    
    
    for (let i=0;i<3;i++){
        outputs[i] = document.getElementById(outputStr[i]);
        sImages[i]=document.getElementById(sImageStr[i]);
        colorS[i] = document.getElementById(colorStr[i]);
        nameS[i] = document.getElementById(nameStr[i]);
        skuS[i] = document.getElementById(skuStr[i]);
    }
    
    let lookUpT= document.getElementById('lookUp').value;
    let pageN= document.getElementById('pageN').value;
    const options = {method: 'GET'};
    const url='https://api.sneakersapi.dev/search?page='+pageN+'&query='+lookUpT;
    fetch(url , options)
            //.then(response => response.json())
            //.then(response => console.log(response))
            .then(response => response.json())
            .then (json => {
                for(let i=0;i<3;i++){
                    outputs[i].value =json.hits[i].brand;
                    sImages[i].src=json.hits[i].image;
                    colorS[i].innerHTML =json.hits[i].color;
                    nameS[i].innerHTML =json.hits[i].title;
                    skuS[i].innerHTML =json.hits[i].sku;
                    let shoe = new Shoe(json.hits[i].brand,json.hits[i].image,json.hits[i].color,json.hits[i].title,json.hits[i].sku);
                    Shoes.push(shoe);
                }
                var jsonArray = JSON.stringify(Shoes);
                /*
                $.ajax({
                    type: "POST",
                    url: "Views/search2.jsp",
                    data: { jsonArray: jsonArray },
                    success: function(response) {
                        console.log("Data sent successfully");
                    },
                    error: function(error) {
                    console.error("Error sending data", error);
                    }
                });
                */
                
                
                
                
                
                
                json.hits.forEach (item=>{
                    console.log(item);
                } );
            })
           
            
            .catch(err => console.error(err));
            //let theText = document.querySelector('#search');

    //console.log('sdfs',theText.name.value);

}


function Shoe(brand,image,color,name,sku) {
  this.brand = brand;
  this.image = image;
  this.color = color;
  this.name = name;
  this.sku=sku;
}



window.addEventListener('load', start);


