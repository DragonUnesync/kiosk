package Z5;

public enum f0 {
    SKIP_CONTROL_CHARS,
    READ_INITIAL,
    READ_HEADER,
    READ_VARIABLE_LENGTH_CONTENT,
    READ_FIXED_LENGTH_CONTENT,
    READ_CHUNK_SIZE,
    READ_CHUNKED_CONTENT,
    READ_CHUNK_DELIMITER,
    READ_CHUNK_FOOTER,
    BAD_MESSAGE,
    UPGRADED
}
