async function showText() {
    try{
        const responseFromServer = await fetch('/hello');
        const res = await responseFromServer.json();
        
        const textContainer = document.getElementById('showText');
        
        const messages = [`My favorite song is ${res.song}`,
                        `My favorite movie is ${res.movie}`,
                        `My favorite series is ${res.series}`, 
                        `My favorite sport is ${res.sport}`, 
                        `My favorite game is ${res.game}`,                
    ];

        const randNum = Math.floor((Math.random()* (messages.length)));
        textContainer.innerText = messages[randNum];
    } catch {
        const textContainer = document.getElementById('showText');
        textContainer.innerText = "Oops.. There is an error :(";
    }
}