
document.addEventListener('DOMContentLoaded', function() { 
    const ratingList = document.getElementById('ratingList');
    const items = ratingList.getElementsByTagName('li'); 
    
    Array.from(items).forEach(item => { 
        const rating = parseInt(item.getAttribute('data-rating'));
        const stars = document.createElement('span'); 
        for (let i = 1; i <= 5; i++) { 
            const star = document.createElement('span');
            star.classList.add('star2'); 
            if (i <= rating) { 
                star.textContent = '★';
            } else { 
                star.textContent = '☆';
                star.classList.add('empty');
            } 
            stars.appendChild(star); 
        } 
    item.appendChild(stars);
        });
    });