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
