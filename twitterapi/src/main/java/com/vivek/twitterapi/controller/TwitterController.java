package com.vivek.twitterapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TwitterController.TWITTER_BASE_URI)
public class TwitterController {

	public static final String TWITTER_BASE_URI="tweets";
	
	@Autowired
	private Twitter twitter;
	
	@GetMapping(value="{hashTag}")
	public List<Tweet> getTweets(@PathVariable final String hashTag){
		return twitter.searchOperations().search(hashTag, 20).getTweets();
		// here 20 is number of twittes you want
	}

}
