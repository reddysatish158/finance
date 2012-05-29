package org.mifosng.platform.exceptions;

/**
 * A {@link RuntimeException} thrown when office resources are not found.
 */
public class OfficeNotFoundException extends PlatformResourceNotFoundException {

	public OfficeNotFoundException(Long id) {
		super("error.msg.office.id.invalid", "Office with identifier " + id + " does not exist", id);
	}
}