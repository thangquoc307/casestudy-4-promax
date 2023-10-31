document.addEventListener('DOMContentLoaded', function() {
    const searchInput = document.getElementById('searchInput');
    const placeholderText = 'Tìm kiếm...          ';
    let currentText = '';
    let currentIndex = 0;
    let isDeleting = false;
    function typeNextCharacter() {
        if (isDeleting && currentText !== '') {
            currentText = currentText.slice(0, -1);
        } else {
            currentText += placeholderText[currentIndex];
            currentIndex++;
        }
        searchInput.placeholder = currentText;
        if (currentIndex === placeholderText.length) {
            isDeleting = true;
        }
        if (isDeleting && currentText === '') {
            isDeleting = false;
            currentIndex = 0;
        }
        const typingSpeed = isDeleting ? 50 : Math.random() * 100 + 150;
        setTimeout(typeNextCharacter, typingSpeed);
    }
    typeNextCharacter();
});