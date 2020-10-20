package com.example.revapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevController {

    @PostMapping("/rev")
    ResponseEntity<TextDto> reverseText(@RequestBody TextDto textDto) {
        var reversedText = new StringBuilder()
                .append(textDto.getContent())
                .reverse()
                .toString();

        return ResponseEntity.ok(
                new TextDto(reversedText)
        );
    }
}
