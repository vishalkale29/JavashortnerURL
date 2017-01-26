package com.demo.service;

import com.demo.bean.*;
import java.util.*;

import java.util.ArrayList;

public class ServiceProvider {

	Set<UrlShortner> dataset = new HashSet<UrlShortner>();

	public ServiceProvider() {

		UrlShortner urlShortnerObj = new UrlShortner();
		urlShortnerObj.setShortUrl("abcd");
		urlShortnerObj.setUrl("www.yahoo.com");
		dataset.add(urlShortnerObj);
	}

	public String getShortUrl(String actualUrl) {

		for (UrlShortner urlShortner : dataset) {

			if (urlShortner.getUrl() != null) {
				if (actualUrl.equals(urlShortner.getUrl())) {
					return urlShortner.getShortUrl();
				}
			}
		}
		return null;
	}

}
