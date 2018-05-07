package com.ysdevelop.pay.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016091500516286";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCXKyYy3MC/a5Kh+8qdHslGzcOWZQzAiXbou/gIRsvi8fxKRx+iquuO0Ksue+70jmPbh50FnJG88ir67RD93dROhKn1grvH0jeMOgztw1e1QhAmujreocaZo7wBL5sXx5WGnfooyb0Ou68OiKvGpl1O02YS5IF7LPZkdSrIzOU5hF8AuQFP5D5SqgyGn6t1WIzXoLLYL8l1D7mzawbj7QML+jG9lXVaulwxiLD7vXuSTRXmj9+A4p1nvqRH6yCgksWftzeJxzsrWVe1TOQxwmT6gYZmWhJQpes/LtuvgC0TdDVyDoD9qh4l/FuzVljMovrhikN9bxhFwuCIJ2WbRsgNAgMBAAECggEABNWscxP8ViLqnaOf50aEyW7rQnQY5E+BLhBU7m7VNnzmxLlhmaI9xmOGFgaArfGf3/WGYBeR0aktFrleQcBGefxkMyXrO4jNnf59S11kALgMLDDokRY7c854xNDw9OG9NoD27zcEhOQbxSs50zCe61Z3fUMxoO7fMndM1v82lZBJoW/I267vvgHNcNlvL5vCYJM3YwZOu8xDWNQRvsQGHbq+zgCdaIZfu3PnWqDcca6yDZ41w7rhrklAAMmovn488PyeicPvl35jaqob2I4pQIj1PA9pvpYBgncBH0vDV68V7wwdfKJtIqTvmdu50SRJggWEMvKnYdz1YsjZMu5yAQKBgQDNGopHxE4ATMELe6vSS60htx+80CQIKgLKPdJF9K7+Dck2jteA7GBXyGLg9cIa/wOwX1LXj4Md+dq3ag7+3bgIkOGbJA6d1uAXVZS+i9mnMMPzwRfrvkujLddtBRoSKYiyMEVP8Jn66sb5wo7103kPG5zktpYQzHTcZDV/eLDj+QKBgQC8rlCkmkS5gspK+nqvBSg+oMwzzbOZ87kCYSYeY8ogIzdEX6r5LWawKDcOvKxYcqiyMTi1oSwHGnqbhL2nmuruAfEHGTSKWKD1AjhUOTS7/jvkG+WYKNs/N2K4J9kUoVFsCN0oKmL5kuT8eDB25dpzy+izukkcaxheEJ5b5wahtQKBgQDDxj2P21UI/DqYF2gex5VuxTlKJPL/x/n5yaDYnYIbhlU1+orByN79a4zWZj7tPdXrmFGe6KGjD0cyI85EgKaVppVyXKyHBP/JxirA5wTOjcG8/eczYuUX0T38Fg6Yn4SXcXP3phWUaF2dMZT8GOtI/HZ56b68Miyp4g0eq7lNIQKBgD2mn4cJOUd8aukQ6yFhCANeuxp6LiMxtdQHNlNbu+HAYAChWdZNdW491a+lCpNj86c12hfO7/nqNwG139pyDi1yyPTO0ZIa34zvCsTKZGbA7YTdcKnFP85qJIGT06SgCWDJjKnhH7H4w4WTKBLRjA2mJQUE63qzq6SgvX2+ATa5AoGBAMsLMzwyc/ABwaf5Qy2VNDB1IBHIOcKhziH7PsaYWaPJQp27m5Ssh91fly8wmq9wPgtjW5nCBuzXvHIbmVaNXaTKi6qCo3Z6wEsLjqnMwEfJ6Kl4RHgGkW2kvWOSwuEcKlru+Wt/Hhhrmp6E8IvVQ2jwwpO7FLyEb8Vjdl4gMPzK";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	// 商户可以自定义同步跳转地址
	public static String return_url = "http://951f86fd.ngrok.io/yuansheng-firuits-mall-shop/order/returnState";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxxk4uudmVK8RRfw+sUwwetsWZx5VJNSCWEG3yOgkdUCtHWA6xYNAW/q6C3JiMFljz78E0JPmny6wsNFTZO98466iziSAZeFpYbTko61FboDDacXgXBSBN8gKXdGKq6eSCHGQPKTtzt4Quq9dcJl4D/b/VJgcCpdS1c6sc2R6V6VgDZJ4mBNiX4fdGgfI+V4FYCQPDqam9IHguuKrkeivZDK4F92W0elf6Z9BFbaQAOoYTRPiYaVqP3b5MkIuObiwvtz8bFlqmMjHH0NYHB98SaE7oqmKUHBbb6Nlb9YrLOZVsdudSaHw3e57v1Q93i/dERsx5Jyi9J2xxaqGfbuqAQIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
