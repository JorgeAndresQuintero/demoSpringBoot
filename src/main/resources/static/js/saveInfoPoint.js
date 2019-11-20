function saveInfoPoint(){
    var message = prompt("What is your message?");
    axios({
        "method": "POST",
        "url": "http://localhost:8080/infoPoint",
        "data": {
            "id": 32,
            "user": {
                "name": "Bob",
                "password": "password"
            },
            "predecessor": {
                    "id": 32,
                    "user": {
                        "name": "Bob",
                        "password": "password"
                    },
                "message": "hola"
            },
            "message": message
        }
    }).then(response => {
        console.log(response.data);
    });
}

function retrieveMyInfoPoints(name){
    axios({
        "method": "GET",
        "url": "http://localhost:8080/infoPoint",
        "params": {
            "name": name
        }
    }).then(response => {
              console.log(response.data);
          });
}

