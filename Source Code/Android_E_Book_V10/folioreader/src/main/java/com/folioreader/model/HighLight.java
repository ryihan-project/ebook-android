package com.folioreader.model;

import java.util.Date;

/**
 * Interface to access Highlight data.
 *
 * @author gautam chibde on 9/10/17.
 */

public interface HighLight {

    /**
     * Highlight action
     */
    enum HighLightAction {
        NEW, DELETE, MODIFY
    }

    /**
     * <p> Returns Book id, which can be provided to intent to folio reader, if not provided id is
     * used from epub's dc:identifier field in metadata.
     * <p>for reference, look here:
     * <a href="http://www.idpf.org/epub/30/spec/epub30-publications.html#sec-package-metadata-identifiers">IDPF</a>.</p>
     * in case identifier is not found in the epub,
     * <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#hashCode()">hash code</a>
     * of book title is used also if book title is not found then
     * hash code of the book file name is used.
     * </p>
     */
    String getBookId();

    /**
     * Returns Highlighted text content text content.
     */
    String getContent();
