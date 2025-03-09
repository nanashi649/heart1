package heart.controller;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//例外処理を一括で行うためのクラス
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(IllegalStateException.class)
	public ResponseEntity<String> handleIllegalStateException(IllegalStateException e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("リクエストエラー:" + e.getMessage());
	}

	//データが見つからないときは404エラーを返す
	@ExceptionHandler(NoSuchFieldException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("データが見つかりません:" + e.getMessage());
	}
}
