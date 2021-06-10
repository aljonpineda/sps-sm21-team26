async function showText() {
    const responseFromServer = await fetch('/hello');
    const textFromResponse = await responseFromServer.text();
    
    const textContainer = document.getElementById('showText');
    textContainer.innerText = textFromResponse;
};