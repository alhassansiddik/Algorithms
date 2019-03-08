const request = require('request');
const signUpUrl = "https://va.idp.liveperson.net/api/account/13350576/signup";
const wsUrl = "wss://va.msg.liveperson.net/ws_api/account/13350576/messaging/consumer?v=3";
let JWT = "";
var WebSocket = require('ws');


request.post(signUpUrl, (err, res, body) =>{
        if (err) {
            console.error(err)
        }
        JWT = JSON.parse(body).jwt;
       // console.log(JWT);
} )
const auth = "jwt " + JWT;
var ws = new WebSocket(wsUrl, {headers: auth});
ws.onopen =  () => {
    ws.send(JSON.stringify({"kind":"req","id":1,"type":"cm.ConsumerRequestConversation"}));
}