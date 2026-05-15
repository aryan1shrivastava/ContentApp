package dev.aryan.contentapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "cc")
public record ContentAppProperties(String welcomeMessage, String about) {
}
