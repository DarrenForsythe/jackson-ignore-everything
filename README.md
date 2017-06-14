# jackson-ignore-everything
How to ignore everything except what is defined as a @JsonProperty

## JacksonConfig ##

Configures the `ObjectMapper`, and statically provides it, with everything set to be ignored unless a class overrides it. Additionally ` SerializationFeature.FAIL_ON_EMPTY_BEANS` is set to false.

## MyObjectTest ##

MyObjectTest verifies that the created JSON via the `ObjectMapper` will only output the `name` field and value.


