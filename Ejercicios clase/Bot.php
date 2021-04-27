<?php
//Aquí el código
$token = "1714234388:AAEZ7opfBE5adBue7ERt0zBEXQO5GZUsTEA";
$website = "https://api.telegram.org/bot".$token;
$input = file_get_contents("php://input");
$update = json_decode($input, TRUE);

$chatId = $update["message"]["chat"]["id"];
$message = $update["message"]["text"];
switch($message){
	case "Hola":
		$response = "Que tal?";
		break
	case "/start":
		$response = "Hola soy el bot de prueba";
		break
	case "/info":
		$response = "Esto es información";
		break
	default:
		$response= "Que dice?";
		break
}
function sendMessage($chatId, $response) {
	$url = $GLOBALS["website"]."/sendMessage?chatId=".$GLOBALS["chatId"]."&parse_mode=HTML&text=".urlencode($response);
	file_get_contents($url);

}
?>