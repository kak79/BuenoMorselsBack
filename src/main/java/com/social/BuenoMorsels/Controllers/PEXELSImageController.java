package com.social.BuenoMorsels.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.BuenoMorsels.Utilities.PexelsApi;

@RestController
@RequestMapping(path = "/pexelsimage")
@CrossOrigin(origins = "http://localhost:4200")
public class PEXELSImageController {


	public PEXELSImageController() {
		super();
	}

	@GetMapping(path = "/{type}") //
	public ResponseEntity<String> getRestById(@PathVariable String type) {

		
		return ResponseEntity.ok(PexelsApi.RandomImage(type));

	}
}