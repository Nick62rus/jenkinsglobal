def send(String message) {
	def token = env.TELEGRAM_BOT_TOKEN
	def chatId = env.TELEGRAM_CHAT_ID
	def encodedMessage = URLEncoder.encode(message,'UTF 8')
	
	def telegramUrl = "https://api.telegram.org/bot${token}/sendMessage?chat_id=${chatId}&text=${encodedMessage}"
	sh "curl -s -x POST ${telegramUrl}"
}
