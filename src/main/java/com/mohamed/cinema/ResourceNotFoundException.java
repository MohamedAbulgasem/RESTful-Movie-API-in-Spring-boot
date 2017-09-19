package com.mohamed.cinema;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * @Controller
		public class SomeController {
		    @RequestMapping.....
		    public void handleCall() {
		        if (isFound()) {
		            // whatever
		        }
		        else {
		            throw new ResourceNotFoundException(); 
		        }
		    }
		}
	 */
	private static final long serialVersionUID = 1L;
	}
