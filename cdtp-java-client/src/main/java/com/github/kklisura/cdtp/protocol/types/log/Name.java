package com.github.kklisura.cdtp.protocol.types.log;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Violation type.
 */
public enum Name {

	@JsonProperty("longTask")
	LONG_TASK, @JsonProperty("longLayout")
	LONG_LAYOUT, @JsonProperty("blockedEvent")
	BLOCKED_EVENT, @JsonProperty("blockedParser")
	BLOCKED_PARSER, @JsonProperty("discouragedAPIUse")
	DISCOURAGED_API_USE, @JsonProperty("handler")
	HANDLER, @JsonProperty("recurringHandler")
	RECURRING_HANDLER
}