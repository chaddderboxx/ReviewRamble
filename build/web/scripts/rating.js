
    document.addEventListener('DOMContentLoaded', function () {
        const stars = document.querySelectorAll('.star');
        stars.forEach(star => {
            star.addEventListener('click', () => {
                const rating = star.getAttribute('data-value');
                const inputField = document.getElementById('ratingField');
                inputField.value = rating;
                stars.forEach(s => {
                    s.classList.remove('filled');
                    if (s.getAttribute('data-value') <= rating) {
                        s.classList.add('filled');
                    }
                });     
            });
        });        
    });
