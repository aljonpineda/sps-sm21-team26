async function showText() {
    const responseFromServer = await fetch('/hello');
    const myObject = await responseFromServer.json();
    
    const textContainer = document.getElementById('showText');
    textContainer.innerText = myObject[0];
};